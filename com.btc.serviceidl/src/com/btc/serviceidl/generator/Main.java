/*********************************************************************
 * \author see AUTHORS file
 * \copyright 2015-2018 BTC Business Technology Consulting AG and others
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 **********************************************************************/
/*
 * generated by Xtext 2.13.0
 */
package com.btc.serviceidl.generator;

import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.btc.serviceidl.IdlStandaloneSetup;
import com.btc.serviceidl.generator.common.ProjectType;
import com.btc.serviceidl.generator.cpp.cmake.CMakeProjectSetFactory;
import com.btc.serviceidl.generator.cpp.prins.VSSolutionFactory;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class Main {

    private static final String OPTION_OUTPUT_PATH                            = "outputPath";
    private static final String OPTION_CPP_PROJECT_SYSTEM                     = "cppProjectSystem";
    private static final String OPTION_VALUE_CPP_PROJECT_SYSTEM_CMAKE         = "cmake";
    private static final String OPTION_VALUE_CPP_PROJECT_SYSTEM_PRINS_VCXPROJ = "prins-vcxproj";
    private static final String OPTION_VALUE_CPP_PROJECT_SYSTEM_DEFAULT       = OPTION_VALUE_CPP_PROJECT_SYSTEM_PRINS_VCXPROJ;

    public static void main(String[] args) {
        System.exit(mainBackend(args));
    }

    public static int mainBackend(String[] args) {
        assert (args != null);
        if (args.length == 0) {
            new HelpFormatter().printHelp("Generator", createOptions());
            System.err.println("Aborting: no path to EMF resource provided!");
            return 2;
        }
        Injector injector = new IdlStandaloneSetup().createInjectorAndDoEMFRegistration();
        Main main = injector.getInstance(Main.class);

        CommandLine commandLine = parseCommandLine(args);
        boolean res = main.runGenerator(commandLine.getArgs(),
                commandLine.hasOption(OPTION_OUTPUT_PATH) ? commandLine.getOptionValue(OPTION_OUTPUT_PATH)
                        : System.getProperty("user.dir"),
                commandLine.hasOption(OPTION_CPP_PROJECT_SYSTEM) ? commandLine.getOptionValue(OPTION_CPP_PROJECT_SYSTEM)
                        : OPTION_VALUE_CPP_PROJECT_SYSTEM_DEFAULT);

        return res ? 0 : 1;
    }

    private static Options createOptions() {
        Options options = new Options();
        options.addOption(OPTION_OUTPUT_PATH, true, "base path for generated output files");
        options.addOption(OPTION_CPP_PROJECT_SYSTEM, true, "C++ project system ("
                + OPTION_VALUE_CPP_PROJECT_SYSTEM_CMAKE + "," + OPTION_VALUE_CPP_PROJECT_SYSTEM_PRINS_VCXPROJ + ")");
        return options;
    }

    private static CommandLine parseCommandLine(String[] args) {
        CommandLineParser parser = new GnuParser();
        try {
            return parser.parse(createOptions(), args);
        } catch (ParseException exp) {
            System.err.println("Parsing command line failed.  Reason: " + exp.getMessage());
            System.exit(1);
            return null;
        }
    }

    @Inject
    private Provider<ResourceSet> resourceSetProvider;

    @Inject
    private IResourceValidator validator;

    @Inject
    private GeneratorDelegate generator;

    @Inject
    private JavaIoFileSystemAccess fileAccess;

    @Inject
    private IGenerationSettingsProvider generationSettingsProvider;

    private boolean runGenerator(String[] inputFiles, String outputPath, String projectSystem) {
        // Load the resource
        ResourceSet set = resourceSetProvider.get();
        for (String inputFile : inputFiles) {
            set.getResource(URI.createFileURI(inputFile), true);
        }

        for (Resource resource : set.getResources()) {

            // Validate the resources
            List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
            if (!list.isEmpty()) {
                boolean hasError = false;
                for (Issue issue : list) {
                    System.err.println(issue);
                    hasError |= issue.getSeverity() == Severity.ERROR;
                }
                if (hasError) {
                    System.out.println("Errors in IDL input, terminating.");
                    return false;
                }
            }
        }

        DefaultGenerationSettingsProvider defaultGenerationSettingsProvider = (DefaultGenerationSettingsProvider) generationSettingsProvider;

        switch (projectSystem) {
        case OPTION_VALUE_CPP_PROJECT_SYSTEM_CMAKE:
            defaultGenerationSettingsProvider.projectSetFactory = new CMakeProjectSetFactory();

            System.out.println("Disabling ODB generation, this is unsupported with CMake project system");
            defaultGenerationSettingsProvider.projectTypes.remove(ProjectType.EXTERNAL_DB_IMPL);

            break;
        case OPTION_VALUE_CPP_PROJECT_SYSTEM_PRINS_VCXPROJ:
            defaultGenerationSettingsProvider.projectSetFactory = new VSSolutionFactory();
            break;
        default:
            System.out.println("Unknown project system: " + projectSystem);
            return false;
        }

        // Configure and start the generator
        fileAccess.setOutputPath(outputPath);
        GeneratorContext context = new GeneratorContext();
        context.setCancelIndicator(CancelIndicator.NullImpl);

        for (Resource resource : set.getResources()) {
            generator.generate(resource, fileAccess, context);
        }

        System.out.println("Code generation finished.");
        return true;
    }
}
