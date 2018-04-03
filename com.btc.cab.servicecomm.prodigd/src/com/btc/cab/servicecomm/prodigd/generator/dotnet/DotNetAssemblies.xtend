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
/**
 * \file       DotNetAssemblies.xtend
 * 
 * \brief      Version-dependent resolution of Microsoft .NET framework 
 *             assemblies corresponding to a given namespace
 */

package com.btc.cab.servicecomm.prodigd.generator.dotnet

final class DotNetAssemblies
{
   def static String getAssemblyForNamespace(String namespace, DotNetFrameworkVersion framework_version)
   {
      switch(framework_version)
      {
      case NET40:
         return getNet40AssemblyForNamespace(namespace)
      case NET45:
         return getNet45AssemblyForNamespace(namespace)
      }
      
      throw new IllegalArgumentException("Unknown .NET framework version: " + framework_version)
   }
   
   /**
    * \brief For a given namespace, try to retrieve the responsible .NET 4.0 assembly.
    * If nothing is found, the default value "System" is returned.
    * 
    * \remark The assembly list belongs to the .NET 4.0 framework originating from
    * %PROGRAMFILES(X86)%\Reference Assemblies\Microsoft\Framework\.NETFramework\v4.0\RedistList\FrameworkList.xml
    */
   def private static String getNet40AssemblyForNamespace(String namespace)
   {
      val dotnet_assemblies = 
      #[
         "Accessibility",
         "CustomMarshalers",
         "ISymWrapper",
         "Microsoft.Build",
         "Microsoft.Build.Conversion.v4.0",
         "Microsoft.Build.Engine",
         "Microsoft.Build.Framework",
         "Microsoft.Build.Tasks.v4.0",
         "Microsoft.Build.Utilities.v4.0",
         "Microsoft.CSharp",
         "Microsoft.JScript",
         "Microsoft.VisualBasic",
         "Microsoft.VisualBasic.Compatibility",
         "Microsoft.VisualBasic.Compatibility.Data",
         "Microsoft.VisualC",
         "Microsoft.VisualC.STLCLR",
         "mscorlib",
         "PresentationBuildTasks",
         "PresentationCore",
         "PresentationFramework.Aero",
         "PresentationFramework.Classic",
         "PresentationFramework",
         "PresentationFramework.Luna",
         "PresentationFramework.Royale",
         "ReachFramework",
         "sysglobl",
         "System.Activities",
         "System.Activities.Core.Presentation",
         "System.Activities.DurableInstancing",
         "System.Activities.Presentation",
         "System.AddIn.Contract",
         "System.AddIn",
         "System.ComponentModel.Composition",
         "System.ComponentModel.DataAnnotations",
         "System.Configuration",
         "System.Configuration.Install",
         "System.Core",
         "System.Data.DataSetExtensions",
         "System.Data",
         "System.Data.Entity.Design",
         "System.Data.Entity",
         "System.Data.Linq",
         "System.Data.OracleClient",
         "System.Data.Services.Client",
         "System.Data.Services.Design",
         "System.Data.Services",
         "System.Data.SqlXml",
         "System.Deployment",
         "System.Design",
         "System.Device",
         "System.DirectoryServices.AccountManagement",
         "System.DirectoryServices",
         "System.DirectoryServices.Protocols",
         "System",
         "System.Drawing.Design",
         "System.Drawing",
         "System.Dynamic",
         "System.EnterpriseServices",
         "System.IdentityModel",
         "System.IdentityModel.Selectors",
         "System.IO.Log",
         "System.Management",
         "System.Management.Instrumentation",
         "System.Messaging",
         "System.Net",
         "System.Numerics",
         "System.Printing",
         "System.Runtime.DurableInstancing",
         "System.Runtime.Caching",
         "System.Runtime.Remoting",
         "System.Runtime.Serialization",
         "System.Runtime.Serialization.Formatters.Soap",
         "System.Security",
         "System.ServiceModel.Activation",
         "System.ServiceModel.Activities",
         "System.ServiceModel.Channels",
         "System.ServiceModel.Discovery",
         "System.ServiceModel",
         "System.ServiceModel.Routing",
         "System.ServiceModel.Web",
         "System.ServiceProcess",
         "System.Speech",
         "System.Transactions",
         "System.Web.Abstractions",
         "System.Web.ApplicationServices",
         "System.Web",
         "System.Web.DataVisualization.Design",
         "System.Web.DataVisualization",
         "System.Web.DynamicData.Design",
         "System.Web.DynamicData",
         "System.Web.Entity.Design",
         "System.Web.Entity",
         "System.Web.Extensions.Design",
         "System.Web.Extensions",
         "System.Web.Mobile",
         "System.Web.RegularExpressions",
         "System.Web.Routing",
         "System.Web.Services",
         "System.Windows.Forms.DataVisualization.Design",
         "System.Windows.Forms.DataVisualization",
         "System.Windows.Forms",
         "System.Windows.Input.Manipulations",
         "System.Windows.Presentation",
         "System.Workflow.Activities",
         "System.Workflow.ComponentModel",
         "System.Workflow.Runtime",
         "System.WorkflowServices",
         "System.Xaml",
         "System.Xml",
         "System.Xml.Linq",
         "UIAutomationClient",
         "UIAutomationClientsideProviders",
         "UIAutomationProvider",
         "UIAutomationTypes",
         "WindowsBase",
         "WindowsFormsIntegration",
         "XamlBuildTask"
      ]
      return dotnet_assemblies.findFirst[equals(namespace)] ?: "System"
   }
   
   
   /**
    * \brief For a given namespace, try to retrieve the responsible .NET 4.5 assembly.
    * If nothing is found, the default value "System" is returned.
    * 
    * \remark The assembly list belongs to the .NET 4.5 framework originating from
    * %PROGRAMFILES(X86)%\Reference Assemblies\Microsoft\Framework\.NETFramework\v4.5\RedistList\FrameworkList.xml
    */
   def private static String getNet45AssemblyForNamespace(String namespace)
   {
      val dotnet_assemblies = 
      #[
         "Accessibility",
         "CustomMarshalers",
         "ISymWrapper",
         "Microsoft.Activities.Build",
         "Microsoft.Build",
         "Microsoft.Build.Conversion.v4.0",
         "Microsoft.Build.Engine",
         "Microsoft.Build.Framework",
         "Microsoft.Build.Tasks.v4.0",
         "Microsoft.Build.Utilities.v4.0",
         "Microsoft.CSharp",
         "Microsoft.JScript",
         "Microsoft.VisualBasic",
         "Microsoft.VisualBasic.Compatibility",
         "Microsoft.VisualBasic.Compatibility.Data",
         "Microsoft.VisualC",
         "Microsoft.VisualC.STLCLR",
         "PresentationBuildTasks",
         "PresentationCore",
         "PresentationFramework",
         "PresentationFramework.Aero",
         "PresentationFramework.Aero2",
         "PresentationFramework.AeroLite",
         "PresentationFramework.Classic",
         "PresentationFramework.Luna",
         "PresentationFramework.Royale",
         "ReachFramework",
         "System",
         "System.Activities",
         "System.Activities.Core.Presentation",
         "System.Activities.DurableInstancing",
         "System.Activities.Presentation",
         "System.Activities.Statements",
         "System.AddIn",
         "System.AddIn.Contract",
         "System.Collections",
         "System.Collections.Concurrent",
         "System.ComponentModel",
         "System.ComponentModel.Annotations",
         "System.ComponentModel.Composition",
         "System.ComponentModel.Composition.Registration",
         "System.ComponentModel.DataAnnotations",
         "System.ComponentModel.EventBasedAsync",
         "System.Configuration",
         "System.Configuration.Install",
         "System.Core",
         "System.Data",
         "System.Data.DataSetExtensions",
         "System.Data.Entity",
         "System.Data.Entity.Design",
         "System.Data.Linq",
         "System.Data.OracleClient",
         "System.Data.Services",
         "System.Data.Services.Client",
         "System.Data.Services.Design",
         "System.Data.SqlXml",
         "System.Deployment",
         "System.Design",
         "System.Device",
         "System.Diagnostics.Contracts",
         "System.Diagnostics.Debug",
         "System.Diagnostics.Tools",
         "System.Diagnostics.Tracing",
         "System.DirectoryServices",
         "System.DirectoryServices.AccountManagement",
         "System.DirectoryServices.Protocols",
         "System.Drawing",
         "System.Drawing.Design",
         "System.Dynamic",
         "System.Dynamic.Runtime",
         "System.EnterpriseServices",
         "System.Globalization",
         "System.IO",
         "System.IO.Compression",
         "System.IO.Compression.FileSystem",
         "System.IO.Log",
         "System.IdentityModel",
         "System.IdentityModel.Selectors",
         "System.IdentityModel.Services",
         "System.Linq",
         "System.Linq.Expressions",
         "System.Linq.Parallel",
         "System.Linq.Queryable",
         "System.Management",
         "System.Management.Instrumentation",
         "System.Messaging",
         "System.Net",
         "System.Net.Http",
         "System.Net.Http.WebRequest",
         "System.Net.NetworkInformation",
         "System.Net.Primitives",
         "System.Net.Requests",
         "System.Numerics",
         "System.ObjectModel",
         "System.Printing",
         "System.Reflection",
         "System.Reflection.Context",
         "System.Reflection.Emit",
         "System.Reflection.Emit.ILGeneration",
         "System.Reflection.Emit.Lightweight",
         "System.Reflection.Extensions",
         "System.Reflection.Primitives",
         "System.Resources.ResourceManager",
         "System.Runtime",
         "System.Runtime.Caching",
         "System.Runtime.DurableInstancing",
         "System.Runtime.Extensions",
         "System.Runtime.InteropServices",
         "System.Runtime.InteropServices.WindowsRuntime",
         "System.Runtime.Numerics",
         "System.Runtime.Remoting",
         "System.Runtime.Serialization",
         "System.Runtime.Serialization.Formatters.Soap",
         "System.Runtime.Serialization.Json",
         "System.Runtime.Serialization.Primitives",
         "System.Runtime.Serialization.Xml",
         "System.Security",
         "System.Security.Principal",
         "System.ServiceModel",
         "System.ServiceModel.Activation",
         "System.ServiceModel.Activities",
         "System.ServiceModel.Channels",
         "System.ServiceModel.Discovery",
         "System.ServiceModel.Duplex",
         "System.ServiceModel.Http",
         "System.ServiceModel.NetTcp",
         "System.ServiceModel.Primitives",
         "System.ServiceModel.Routing",
         "System.ServiceModel.Security",
         "System.ServiceModel.Web",
         "System.ServiceProcess",
         "System.Speech",
         "System.Text.Encoding",
         "System.Text.Encoding.Extensions",
         "System.Text.RegularExpressions",
         "System.Threading",
         "System.Threading.Tasks",
         "System.Threading.Tasks.Parallel",
         "System.Transactions",
         "System.Web",
         "System.Web.Abstractions",
         "System.Web.ApplicationServices",
         "System.Web.DataVisualization",
         "System.Web.DataVisualization.Design",
         "System.Web.DynamicData",
         "System.Web.DynamicData.Design",
         "System.Web.Entity",
         "System.Web.Entity.Design",
         "System.Web.Extensions",
         "System.Web.Extensions.Design",
         "System.Web.Mobile",
         "System.Web.RegularExpressions",
         "System.Web.Routing",
         "System.Web.Services",
         "System.Windows",
         "System.Windows.Controls.Ribbon",
         "System.Windows.Forms",
         "System.Windows.Forms.DataVisualization",
         "System.Windows.Forms.DataVisualization.Design",
         "System.Windows.Input.Manipulations",
         "System.Windows.Presentation",
         "System.Workflow.Activities",
         "System.Workflow.ComponentModel",
         "System.Workflow.Runtime",
         "System.WorkflowServices",
         "System.Xaml",
         "System.Xml",
         "System.Xml.Linq",
         "System.Xml.ReaderWriter",
         "System.Xml.Serialization",
         "System.Xml.XDocument",
         "System.Xml.XmlSerializer",
         "UIAutomationClient",
         "UIAutomationClientsideProviders",
         "UIAutomationProvider",
         "UIAutomationTypes",
         "WindowsBase",
         "WindowsFormsIntegration",
         "XamlBuildTask",
         "mscorlib",
         "sysglobl"
      ]
      return dotnet_assemblies.findFirst[equals(namespace)] ?: "System"
   }
}