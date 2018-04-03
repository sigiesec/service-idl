package com.btc.serviceidl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.btc.serviceidl.services.IdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIdlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_DOC_COMMENT", "RULE_ML_DOC_COMMENT", "RULE_BYTE", "RULE_INT16", "RULE_INT32", "RULE_INT64", "RULE_FLOAT", "RULE_DOUBLE", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_VERSION", "RULE_UUID_LITERAL", "RULE_STRINGTYPE", "RULE_CHAR", "RULE_UUID", "RULE_BOOLEAN", "RULE_HEX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'in'", "'out'", "'import'", "'module'", "'{'", "'}'", "';'", "'exception'", "'ref'", "':'", "'typedef'", "'enum'", "','", "'sequence'", "'<'", "'>'", "'raises'", "'['", "']'", "'typical'", "'length'", "'='", "'element'", "'size'", "'tuple'", "'struct'", "'interface'", "'version'", "'guid'", "'('", "')'", "'returns'", "'event'", "'subscribe'", "'with'", "'.'", "'.*'", "'virtual'", "'main'", "'failable'", "'optional'", "'abstract'", "'sync'", "'query'", "'injectable'", "'void'"
    };
    public static final int RULE_HEX=21;
    public static final int T__50=50;
    public static final int RULE_INT32=8;
    public static final int RULE_BOOLEAN=20;
    public static final int RULE_ML_DOC_COMMENT=5;
    public static final int RULE_VERSION=15;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int RULE_CHAR=18;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=12;
    public static final int RULE_INT64=9;
    public static final int RULE_STRINGTYPE=17;
    public static final int T__26=26;
    public static final int RULE_UUID=19;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=14;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=22;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_UUID_LITERAL=16;
    public static final int RULE_BYTE=6;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=23;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_INT16=7;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=24;
    public static final int RULE_SL_DOC_COMMENT=4;
    public static final int RULE_ANY_OTHER=25;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=10;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalIdlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIdlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIdlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIdl.g"; }


    	private IdlGrammarAccess grammarAccess;

    	public void setGrammarAccess(IdlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleIDLSpecification"
    // InternalIdl.g:53:1: entryRuleIDLSpecification : ruleIDLSpecification EOF ;
    public final void entryRuleIDLSpecification() throws RecognitionException {
        try {
            // InternalIdl.g:54:1: ( ruleIDLSpecification EOF )
            // InternalIdl.g:55:1: ruleIDLSpecification EOF
            {
             before(grammarAccess.getIDLSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleIDLSpecification();

            state._fsp--;

             after(grammarAccess.getIDLSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIDLSpecification"


    // $ANTLR start "ruleIDLSpecification"
    // InternalIdl.g:62:1: ruleIDLSpecification : ( ( rule__IDLSpecification__Group__0 ) ) ;
    public final void ruleIDLSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:66:2: ( ( ( rule__IDLSpecification__Group__0 ) ) )
            // InternalIdl.g:67:2: ( ( rule__IDLSpecification__Group__0 ) )
            {
            // InternalIdl.g:67:2: ( ( rule__IDLSpecification__Group__0 ) )
            // InternalIdl.g:68:3: ( rule__IDLSpecification__Group__0 )
            {
             before(grammarAccess.getIDLSpecificationAccess().getGroup()); 
            // InternalIdl.g:69:3: ( rule__IDLSpecification__Group__0 )
            // InternalIdl.g:69:4: rule__IDLSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IDLSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIDLSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIDLSpecification"


    // $ANTLR start "entryRuleImportDeclaration"
    // InternalIdl.g:78:1: entryRuleImportDeclaration : ruleImportDeclaration EOF ;
    public final void entryRuleImportDeclaration() throws RecognitionException {
        try {
            // InternalIdl.g:79:1: ( ruleImportDeclaration EOF )
            // InternalIdl.g:80:1: ruleImportDeclaration EOF
            {
             before(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getImportDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // InternalIdl.g:87:1: ruleImportDeclaration : ( ( rule__ImportDeclaration__Group__0 ) ) ;
    public final void ruleImportDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:91:2: ( ( ( rule__ImportDeclaration__Group__0 ) ) )
            // InternalIdl.g:92:2: ( ( rule__ImportDeclaration__Group__0 ) )
            {
            // InternalIdl.g:92:2: ( ( rule__ImportDeclaration__Group__0 ) )
            // InternalIdl.g:93:3: ( rule__ImportDeclaration__Group__0 )
            {
             before(grammarAccess.getImportDeclarationAccess().getGroup()); 
            // InternalIdl.g:94:3: ( rule__ImportDeclaration__Group__0 )
            // InternalIdl.g:94:4: rule__ImportDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleModuleDeclaration"
    // InternalIdl.g:103:1: entryRuleModuleDeclaration : ruleModuleDeclaration EOF ;
    public final void entryRuleModuleDeclaration() throws RecognitionException {
        try {
            // InternalIdl.g:104:1: ( ruleModuleDeclaration EOF )
            // InternalIdl.g:105:1: ruleModuleDeclaration EOF
            {
             before(grammarAccess.getModuleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleModuleDeclaration();

            state._fsp--;

             after(grammarAccess.getModuleDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModuleDeclaration"


    // $ANTLR start "ruleModuleDeclaration"
    // InternalIdl.g:112:1: ruleModuleDeclaration : ( ( rule__ModuleDeclaration__Group__0 ) ) ;
    public final void ruleModuleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:116:2: ( ( ( rule__ModuleDeclaration__Group__0 ) ) )
            // InternalIdl.g:117:2: ( ( rule__ModuleDeclaration__Group__0 ) )
            {
            // InternalIdl.g:117:2: ( ( rule__ModuleDeclaration__Group__0 ) )
            // InternalIdl.g:118:3: ( rule__ModuleDeclaration__Group__0 )
            {
             before(grammarAccess.getModuleDeclarationAccess().getGroup()); 
            // InternalIdl.g:119:3: ( rule__ModuleDeclaration__Group__0 )
            // InternalIdl.g:119:4: rule__ModuleDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleDeclaration"


    // $ANTLR start "entryRuleAbstractModuleComponent"
    // InternalIdl.g:128:1: entryRuleAbstractModuleComponent : ruleAbstractModuleComponent EOF ;
    public final void entryRuleAbstractModuleComponent() throws RecognitionException {
        try {
            // InternalIdl.g:129:1: ( ruleAbstractModuleComponent EOF )
            // InternalIdl.g:130:1: ruleAbstractModuleComponent EOF
            {
             before(grammarAccess.getAbstractModuleComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractModuleComponent();

            state._fsp--;

             after(grammarAccess.getAbstractModuleComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractModuleComponent"


    // $ANTLR start "ruleAbstractModuleComponent"
    // InternalIdl.g:137:1: ruleAbstractModuleComponent : ( ( rule__AbstractModuleComponent__Alternatives ) ) ;
    public final void ruleAbstractModuleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:141:2: ( ( ( rule__AbstractModuleComponent__Alternatives ) ) )
            // InternalIdl.g:142:2: ( ( rule__AbstractModuleComponent__Alternatives ) )
            {
            // InternalIdl.g:142:2: ( ( rule__AbstractModuleComponent__Alternatives ) )
            // InternalIdl.g:143:3: ( rule__AbstractModuleComponent__Alternatives )
            {
             before(grammarAccess.getAbstractModuleComponentAccess().getAlternatives()); 
            // InternalIdl.g:144:3: ( rule__AbstractModuleComponent__Alternatives )
            // InternalIdl.g:144:4: rule__AbstractModuleComponent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModuleComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractModuleComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractModuleComponent"


    // $ANTLR start "entryRuleAbstractException"
    // InternalIdl.g:153:1: entryRuleAbstractException : ruleAbstractException EOF ;
    public final void entryRuleAbstractException() throws RecognitionException {
        try {
            // InternalIdl.g:154:1: ( ruleAbstractException EOF )
            // InternalIdl.g:155:1: ruleAbstractException EOF
            {
             before(grammarAccess.getAbstractExceptionRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractException();

            state._fsp--;

             after(grammarAccess.getAbstractExceptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractException"


    // $ANTLR start "ruleAbstractException"
    // InternalIdl.g:162:1: ruleAbstractException : ( ( rule__AbstractException__Alternatives ) ) ;
    public final void ruleAbstractException() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:166:2: ( ( ( rule__AbstractException__Alternatives ) ) )
            // InternalIdl.g:167:2: ( ( rule__AbstractException__Alternatives ) )
            {
            // InternalIdl.g:167:2: ( ( rule__AbstractException__Alternatives ) )
            // InternalIdl.g:168:3: ( rule__AbstractException__Alternatives )
            {
             before(grammarAccess.getAbstractExceptionAccess().getAlternatives()); 
            // InternalIdl.g:169:3: ( rule__AbstractException__Alternatives )
            // InternalIdl.g:169:4: rule__AbstractException__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractException__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractExceptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractException"


    // $ANTLR start "entryRuleExceptionReferenceDeclaration"
    // InternalIdl.g:178:1: entryRuleExceptionReferenceDeclaration : ruleExceptionReferenceDeclaration EOF ;
    public final void entryRuleExceptionReferenceDeclaration() throws RecognitionException {
        try {
            // InternalIdl.g:179:1: ( ruleExceptionReferenceDeclaration EOF )
            // InternalIdl.g:180:1: ruleExceptionReferenceDeclaration EOF
            {
             before(grammarAccess.getExceptionReferenceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleExceptionReferenceDeclaration();

            state._fsp--;

             after(grammarAccess.getExceptionReferenceDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExceptionReferenceDeclaration"


    // $ANTLR start "ruleExceptionReferenceDeclaration"
    // InternalIdl.g:187:1: ruleExceptionReferenceDeclaration : ( ( rule__ExceptionReferenceDeclaration__Group__0 ) ) ;
    public final void ruleExceptionReferenceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:191:2: ( ( ( rule__ExceptionReferenceDeclaration__Group__0 ) ) )
            // InternalIdl.g:192:2: ( ( rule__ExceptionReferenceDeclaration__Group__0 ) )
            {
            // InternalIdl.g:192:2: ( ( rule__ExceptionReferenceDeclaration__Group__0 ) )
            // InternalIdl.g:193:3: ( rule__ExceptionReferenceDeclaration__Group__0 )
            {
             before(grammarAccess.getExceptionReferenceDeclarationAccess().getGroup()); 
            // InternalIdl.g:194:3: ( rule__ExceptionReferenceDeclaration__Group__0 )
            // InternalIdl.g:194:4: rule__ExceptionReferenceDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionReferenceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExceptionReferenceDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExceptionReferenceDeclaration"


    // $ANTLR start "entryRuleExceptionDeclaration"
    // InternalIdl.g:203:1: entryRuleExceptionDeclaration : ruleExceptionDeclaration EOF ;
    public final void entryRuleExceptionDeclaration() throws RecognitionException {
        try {
            // InternalIdl.g:204:1: ( ruleExceptionDeclaration EOF )
            // InternalIdl.g:205:1: ruleExceptionDeclaration EOF
            {
             before(grammarAccess.getExceptionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleExceptionDeclaration();

            state._fsp--;

             after(grammarAccess.getExceptionDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExceptionDeclaration"


    // $ANTLR start "ruleExceptionDeclaration"
    // InternalIdl.g:212:1: ruleExceptionDeclaration : ( ( rule__ExceptionDeclaration__Group__0 ) ) ;
    public final void ruleExceptionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:216:2: ( ( ( rule__ExceptionDeclaration__Group__0 ) ) )
            // InternalIdl.g:217:2: ( ( rule__ExceptionDeclaration__Group__0 ) )
            {
            // InternalIdl.g:217:2: ( ( rule__ExceptionDeclaration__Group__0 ) )
            // InternalIdl.g:218:3: ( rule__ExceptionDeclaration__Group__0 )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getGroup()); 
            // InternalIdl.g:219:3: ( rule__ExceptionDeclaration__Group__0 )
            // InternalIdl.g:219:4: rule__ExceptionDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExceptionDeclaration"


    // $ANTLR start "entryRuleAbstractTypeDeclaration"
    // InternalIdl.g:228:1: entryRuleAbstractTypeDeclaration : ruleAbstractTypeDeclaration EOF ;
    public final void entryRuleAbstractTypeDeclaration() throws RecognitionException {
        try {
            // InternalIdl.g:229:1: ( ruleAbstractTypeDeclaration EOF )
            // InternalIdl.g:230:1: ruleAbstractTypeDeclaration EOF
            {
             before(grammarAccess.getAbstractTypeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getAbstractTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractTypeDeclaration"


    // $ANTLR start "ruleAbstractTypeDeclaration"
    // InternalIdl.g:237:1: ruleAbstractTypeDeclaration : ( ( rule__AbstractTypeDeclaration__Alternatives ) ) ;
    public final void ruleAbstractTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:241:2: ( ( ( rule__AbstractTypeDeclaration__Alternatives ) ) )
            // InternalIdl.g:242:2: ( ( rule__AbstractTypeDeclaration__Alternatives ) )
            {
            // InternalIdl.g:242:2: ( ( rule__AbstractTypeDeclaration__Alternatives ) )
            // InternalIdl.g:243:3: ( rule__AbstractTypeDeclaration__Alternatives )
            {
             before(grammarAccess.getAbstractTypeDeclarationAccess().getAlternatives()); 
            // InternalIdl.g:244:3: ( rule__AbstractTypeDeclaration__Alternatives )
            // InternalIdl.g:244:4: rule__AbstractTypeDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractTypeDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTypeDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractTypeDeclaration"


    // $ANTLR start "entryRuleAbstractType"
    // InternalIdl.g:253:1: entryRuleAbstractType : ruleAbstractType EOF ;
    public final void entryRuleAbstractType() throws RecognitionException {
        try {
            // InternalIdl.g:254:1: ( ruleAbstractType EOF )
            // InternalIdl.g:255:1: ruleAbstractType EOF
            {
             before(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getAbstractTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalIdl.g:262:1: ruleAbstractType : ( ( rule__AbstractType__Alternatives ) ) ;
    public final void ruleAbstractType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:266:2: ( ( ( rule__AbstractType__Alternatives ) ) )
            // InternalIdl.g:267:2: ( ( rule__AbstractType__Alternatives ) )
            {
            // InternalIdl.g:267:2: ( ( rule__AbstractType__Alternatives ) )
            // InternalIdl.g:268:3: ( rule__AbstractType__Alternatives )
            {
             before(grammarAccess.getAbstractTypeAccess().getAlternatives()); 
            // InternalIdl.g:269:3: ( rule__AbstractType__Alternatives )
            // InternalIdl.g:269:4: rule__AbstractType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRuleAliasDeclaration"
    // InternalIdl.g:278:1: entryRuleAliasDeclaration : ruleAliasDeclaration EOF ;
    public final void entryRuleAliasDeclaration() throws RecognitionException {
        try {
            // InternalIdl.g:279:1: ( ruleAliasDeclaration EOF )
            // InternalIdl.g:280:1: ruleAliasDeclaration EOF
            {
             before(grammarAccess.getAliasDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleAliasDeclaration();

            state._fsp--;

             after(grammarAccess.getAliasDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAliasDeclaration"


    // $ANTLR start "ruleAliasDeclaration"
    // InternalIdl.g:287:1: ruleAliasDeclaration : ( ( rule__AliasDeclaration__Group__0 ) ) ;
    public final void ruleAliasDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:291:2: ( ( ( rule__AliasDeclaration__Group__0 ) ) )
            // InternalIdl.g:292:2: ( ( rule__AliasDeclaration__Group__0 ) )
            {
            // InternalIdl.g:292:2: ( ( rule__AliasDeclaration__Group__0 ) )
            // InternalIdl.g:293:3: ( rule__AliasDeclaration__Group__0 )
            {
             before(grammarAccess.getAliasDeclarationAccess().getGroup()); 
            // InternalIdl.g:294:3: ( rule__AliasDeclaration__Group__0 )
            // InternalIdl.g:294:4: rule__AliasDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AliasDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAliasDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAliasDeclaration"


    // $ANTLR start "entryRuleEnumDeclaration"
    // InternalIdl.g:303:1: entryRuleEnumDeclaration : ruleEnumDeclaration EOF ;
    public final void entryRuleEnumDeclaration() throws RecognitionException {
        try {
            // InternalIdl.g:304:1: ( ruleEnumDeclaration EOF )
            // InternalIdl.g:305:1: ruleEnumDeclaration EOF
            {
             before(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // InternalIdl.g:312:1: ruleEnumDeclaration : ( ( rule__EnumDeclaration__Group__0 ) ) ;
    public final void ruleEnumDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:316:2: ( ( ( rule__EnumDeclaration__Group__0 ) ) )
            // InternalIdl.g:317:2: ( ( rule__EnumDeclaration__Group__0 ) )
            {
            // InternalIdl.g:317:2: ( ( rule__EnumDeclaration__Group__0 ) )
            // InternalIdl.g:318:3: ( rule__EnumDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup()); 
            // InternalIdl.g:319:3: ( rule__EnumDeclaration__Group__0 )
            // InternalIdl.g:319:4: rule__EnumDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleAbstractCollection"
    // InternalIdl.g:328:1: entryRuleAbstractCollection : ruleAbstractCollection EOF ;
    public final void entryRuleAbstractCollection() throws RecognitionException {
        try {
            // InternalIdl.g:329:1: ( ruleAbstractCollection EOF )
            // InternalIdl.g:330:1: ruleAbstractCollection EOF
            {
             before(grammarAccess.getAbstractCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractCollection();

            state._fsp--;

             after(grammarAccess.getAbstractCollectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractCollection"


    // $ANTLR start "ruleAbstractCollection"
    // InternalIdl.g:337:1: ruleAbstractCollection : ( ( rule__AbstractCollection__Alternatives ) ) ;
    public final void ruleAbstractCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:341:2: ( ( ( rule__AbstractCollection__Alternatives ) ) )
            // InternalIdl.g:342:2: ( ( rule__AbstractCollection__Alternatives ) )
            {
            // InternalIdl.g:342:2: ( ( rule__AbstractCollection__Alternatives ) )
            // InternalIdl.g:343:3: ( rule__AbstractCollection__Alternatives )
            {
             before(grammarAccess.getAbstractCollectionAccess().getAlternatives()); 
            // InternalIdl.g:344:3: ( rule__AbstractCollection__Alternatives )
            // InternalIdl.g:344:4: rule__AbstractCollection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCollection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractCollectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractCollection"


    // $ANTLR start "entryRuleSequenceDeclaration"
    // InternalIdl.g:353:1: entryRuleSequenceDeclaration : ruleSequenceDeclaration EOF ;
    public final void entryRuleSequenceDeclaration() throws RecognitionException {
        try {
            // InternalIdl.g:354:1: ( ruleSequenceDeclaration EOF )
            // InternalIdl.g:355:1: ruleSequenceDeclaration EOF
            {
             before(grammarAccess.getSequenceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleSequenceDeclaration();

            state._fsp--;

             after(grammarAccess.getSequenceDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequenceDeclaration"


    // $ANTLR start "ruleSequenceDeclaration"
    // InternalIdl.g:362:1: ruleSequenceDeclaration : ( ( rule__SequenceDeclaration__Group__0 ) ) ;
    public final void ruleSequenceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:366:2: ( ( ( rule__SequenceDeclaration__Group__0 ) ) )
            // InternalIdl.g:367:2: ( ( rule__SequenceDeclaration__Group__0 ) )
            {
            // InternalIdl.g:367:2: ( ( rule__SequenceDeclaration__Group__0 ) )
            // InternalIdl.g:368:3: ( rule__SequenceDeclaration__Group__0 )
            {
             before(grammarAccess.getSequenceDeclarationAccess().getGroup()); 
            // InternalIdl.g:369:3: ( rule__SequenceDeclaration__Group__0 )
            // InternalIdl.g:369:4: rule__SequenceDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceDeclaration"


    // $ANTLR start "entryRuleAbstractSequenceHint"
    // InternalIdl.g:378:1: entryRuleAbstractSequenceHint : ruleAbstractSequenceHint EOF ;
    public final void entryRuleAbstractSequenceHint() throws RecognitionException {
        try {
            // InternalIdl.g:379:1: ( ruleAbstractSequenceHint EOF )
            // InternalIdl.g:380:1: ruleAbstractSequenceHint EOF
            {
             before(grammarAccess.getAbstractSequenceHintRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractSequenceHint();

            state._fsp--;

             after(grammarAccess.getAbstractSequenceHintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractSequenceHint"


    // $ANTLR start "ruleAbstractSequenceHint"
    // InternalIdl.g:387:1: ruleAbstractSequenceHint : ( ( rule__AbstractSequenceHint__Alternatives ) ) ;
    public final void ruleAbstractSequenceHint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:391:2: ( ( ( rule__AbstractSequenceHint__Alternatives ) ) )
            // InternalIdl.g:392:2: ( ( rule__AbstractSequenceHint__Alternatives ) )
            {
            // InternalIdl.g:392:2: ( ( rule__AbstractSequenceHint__Alternatives ) )
            // InternalIdl.g:393:3: ( rule__AbstractSequenceHint__Alternatives )
            {
             before(grammarAccess.getAbstractSequenceHintAccess().getAlternatives()); 
            // InternalIdl.g:394:3: ( rule__AbstractSequenceHint__Alternatives )
            // InternalIdl.g:394:4: rule__AbstractSequenceHint__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractSequenceHint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractSequenceHintAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractSequenceHint"


    // $ANTLR start "entryRuleTypicalLengthHint"
    // InternalIdl.g:403:1: entryRuleTypicalLengthHint : ruleTypicalLengthHint EOF ;
    public final void entryRuleTypicalLengthHint() throws RecognitionException {
        try {
            // InternalIdl.g:404:1: ( ruleTypicalLengthHint EOF )
            // InternalIdl.g:405:1: ruleTypicalLengthHint EOF
            {
             before(grammarAccess.getTypicalLengthHintRule()); 
            pushFollow(FOLLOW_1);
            ruleTypicalLengthHint();

            state._fsp--;

             after(grammarAccess.getTypicalLengthHintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypicalLengthHint"


    // $ANTLR start "ruleTypicalLengthHint"
    // InternalIdl.g:412:1: ruleTypicalLengthHint : ( ( rule__TypicalLengthHint__Group__0 ) ) ;
    public final void ruleTypicalLengthHint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:416:2: ( ( ( rule__TypicalLengthHint__Group__0 ) ) )
            // InternalIdl.g:417:2: ( ( rule__TypicalLengthHint__Group__0 ) )
            {
            // InternalIdl.g:417:2: ( ( rule__TypicalLengthHint__Group__0 ) )
            // InternalIdl.g:418:3: ( rule__TypicalLengthHint__Group__0 )
            {
             before(grammarAccess.getTypicalLengthHintAccess().getGroup()); 
            // InternalIdl.g:419:3: ( rule__TypicalLengthHint__Group__0 )
            // InternalIdl.g:419:4: rule__TypicalLengthHint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypicalLengthHint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypicalLengthHintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypicalLengthHint"


    // $ANTLR start "entryRuleTypicalSizeHint"
    // InternalIdl.g:428:1: entryRuleTypicalSizeHint : ruleTypicalSizeHint EOF ;
    public final void entryRuleTypicalSizeHint() throws RecognitionException {
        try {
            // InternalIdl.g:429:1: ( ruleTypicalSizeHint EOF )
            // InternalIdl.g:430:1: ruleTypicalSizeHint EOF
            {
             before(grammarAccess.getTypicalSizeHintRule()); 
            pushFollow(FOLLOW_1);
            ruleTypicalSizeHint();

            state._fsp--;

             after(grammarAccess.getTypicalSizeHintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypicalSizeHint"


    // $ANTLR start "ruleTypicalSizeHint"
    // InternalIdl.g:437:1: ruleTypicalSizeHint : ( ( rule__TypicalSizeHint__Group__0 ) ) ;
    public final void ruleTypicalSizeHint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:441:2: ( ( ( rule__TypicalSizeHint__Group__0 ) ) )
            // InternalIdl.g:442:2: ( ( rule__TypicalSizeHint__Group__0 ) )
            {
            // InternalIdl.g:442:2: ( ( rule__TypicalSizeHint__Group__0 ) )
            // InternalIdl.g:443:3: ( rule__TypicalSizeHint__Group__0 )
            {
             before(grammarAccess.getTypicalSizeHintAccess().getGroup()); 
            // InternalIdl.g:444:3: ( rule__TypicalSizeHint__Group__0 )
            // InternalIdl.g:444:4: rule__TypicalSizeHint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypicalSizeHint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypicalSizeHintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypicalSizeHint"


    // $ANTLR start "entryRuleTupleDeclaration"
    // InternalIdl.g:453:1: entryRuleTupleDeclaration : ruleTupleDeclaration EOF ;
    public final void entryRuleTupleDeclaration() throws RecognitionException {
        try {
            // InternalIdl.g:454:1: ( ruleTupleDeclaration EOF )
            // InternalIdl.g:455:1: ruleTupleDeclaration EOF
            {
             before(grammarAccess.getTupleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleTupleDeclaration();

            state._fsp--;

             after(grammarAccess.getTupleDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTupleDeclaration"


    // $ANTLR start "ruleTupleDeclaration"
    // InternalIdl.g:462:1: ruleTupleDeclaration : ( ( rule__TupleDeclaration__Group__0 ) ) ;
    public final void ruleTupleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:466:2: ( ( ( rule__TupleDeclaration__Group__0 ) ) )
            // InternalIdl.g:467:2: ( ( rule__TupleDeclaration__Group__0 ) )
            {
            // InternalIdl.g:467:2: ( ( rule__TupleDeclaration__Group__0 ) )
            // InternalIdl.g:468:3: ( rule__TupleDeclaration__Group__0 )
            {
             before(grammarAccess.getTupleDeclarationAccess().getGroup()); 
            // InternalIdl.g:469:3: ( rule__TupleDeclaration__Group__0 )
            // InternalIdl.g:469:4: rule__TupleDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TupleDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTupleDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTupleDeclaration"


    // $ANTLR start "entryRuleStructDeclaration"
    // InternalIdl.g:478:1: entryRuleStructDeclaration : ruleStructDeclaration EOF ;
    public final void entryRuleStructDeclaration() throws RecognitionException {
        try {
            // InternalIdl.g:479:1: ( ruleStructDeclaration EOF )
            // InternalIdl.g:480:1: ruleStructDeclaration EOF
            {
             before(grammarAccess.getStructDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleStructDeclaration();

            state._fsp--;

             after(grammarAccess.getStructDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructDeclaration"


    // $ANTLR start "ruleStructDeclaration"
    // InternalIdl.g:487:1: ruleStructDeclaration : ( ( rule__StructDeclaration__Group__0 ) ) ;
    public final void ruleStructDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:491:2: ( ( ( rule__StructDeclaration__Group__0 ) ) )
            // InternalIdl.g:492:2: ( ( rule__StructDeclaration__Group__0 ) )
            {
            // InternalIdl.g:492:2: ( ( rule__StructDeclaration__Group__0 ) )
            // InternalIdl.g:493:3: ( rule__StructDeclaration__Group__0 )
            {
             before(grammarAccess.getStructDeclarationAccess().getGroup()); 
            // InternalIdl.g:494:3: ( rule__StructDeclaration__Group__0 )
            // InternalIdl.g:494:4: rule__StructDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructDeclaration"


    // $ANTLR start "entryRuleMemberElement"
    // InternalIdl.g:503:1: entryRuleMemberElement : ruleMemberElement EOF ;
    public final void entryRuleMemberElement() throws RecognitionException {
        try {
            // InternalIdl.g:504:1: ( ruleMemberElement EOF )
            // InternalIdl.g:505:1: ruleMemberElement EOF
            {
             before(grammarAccess.getMemberElementRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberElement();

            state._fsp--;

             after(grammarAccess.getMemberElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemberElement"


    // $ANTLR start "ruleMemberElement"
    // InternalIdl.g:512:1: ruleMemberElement : ( ( rule__MemberElement__Group__0 ) ) ;
    public final void ruleMemberElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:516:2: ( ( ( rule__MemberElement__Group__0 ) ) )
            // InternalIdl.g:517:2: ( ( rule__MemberElement__Group__0 ) )
            {
            // InternalIdl.g:517:2: ( ( rule__MemberElement__Group__0 ) )
            // InternalIdl.g:518:3: ( rule__MemberElement__Group__0 )
            {
             before(grammarAccess.getMemberElementAccess().getGroup()); 
            // InternalIdl.g:519:3: ( rule__MemberElement__Group__0 )
            // InternalIdl.g:519:4: rule__MemberElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberElement"


    // $ANTLR start "entryRuleKeyElement"
    // InternalIdl.g:528:1: entryRuleKeyElement : ruleKeyElement EOF ;
    public final void entryRuleKeyElement() throws RecognitionException {
        try {
            // InternalIdl.g:529:1: ( ruleKeyElement EOF )
            // InternalIdl.g:530:1: ruleKeyElement EOF
            {
             before(grammarAccess.getKeyElementRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyElement();

            state._fsp--;

             after(grammarAccess.getKeyElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyElement"


    // $ANTLR start "ruleKeyElement"
    // InternalIdl.g:537:1: ruleKeyElement : ( ( rule__KeyElement__Group__0 ) ) ;
    public final void ruleKeyElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:541:2: ( ( ( rule__KeyElement__Group__0 ) ) )
            // InternalIdl.g:542:2: ( ( rule__KeyElement__Group__0 ) )
            {
            // InternalIdl.g:542:2: ( ( rule__KeyElement__Group__0 ) )
            // InternalIdl.g:543:3: ( rule__KeyElement__Group__0 )
            {
             before(grammarAccess.getKeyElementAccess().getGroup()); 
            // InternalIdl.g:544:3: ( rule__KeyElement__Group__0 )
            // InternalIdl.g:544:4: rule__KeyElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyElement"


    // $ANTLR start "entryRuleInterfaceDeclaration"
    // InternalIdl.g:553:1: entryRuleInterfaceDeclaration : ruleInterfaceDeclaration EOF ;
    public final void entryRuleInterfaceDeclaration() throws RecognitionException {
        try {
            // InternalIdl.g:554:1: ( ruleInterfaceDeclaration EOF )
            // InternalIdl.g:555:1: ruleInterfaceDeclaration EOF
            {
             before(grammarAccess.getInterfaceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfaceDeclaration();

            state._fsp--;

             after(grammarAccess.getInterfaceDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfaceDeclaration"


    // $ANTLR start "ruleInterfaceDeclaration"
    // InternalIdl.g:562:1: ruleInterfaceDeclaration : ( ( rule__InterfaceDeclaration__Group__0 ) ) ;
    public final void ruleInterfaceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:566:2: ( ( ( rule__InterfaceDeclaration__Group__0 ) ) )
            // InternalIdl.g:567:2: ( ( rule__InterfaceDeclaration__Group__0 ) )
            {
            // InternalIdl.g:567:2: ( ( rule__InterfaceDeclaration__Group__0 ) )
            // InternalIdl.g:568:3: ( rule__InterfaceDeclaration__Group__0 )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getGroup()); 
            // InternalIdl.g:569:3: ( rule__InterfaceDeclaration__Group__0 )
            // InternalIdl.g:569:4: rule__InterfaceDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceDeclaration"


    // $ANTLR start "entryRuleAbstractInterfaceComponent"
    // InternalIdl.g:578:1: entryRuleAbstractInterfaceComponent : ruleAbstractInterfaceComponent EOF ;
    public final void entryRuleAbstractInterfaceComponent() throws RecognitionException {
        try {
            // InternalIdl.g:579:1: ( ruleAbstractInterfaceComponent EOF )
            // InternalIdl.g:580:1: ruleAbstractInterfaceComponent EOF
            {
             before(grammarAccess.getAbstractInterfaceComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractInterfaceComponent();

            state._fsp--;

             after(grammarAccess.getAbstractInterfaceComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractInterfaceComponent"


    // $ANTLR start "ruleAbstractInterfaceComponent"
    // InternalIdl.g:587:1: ruleAbstractInterfaceComponent : ( ( rule__AbstractInterfaceComponent__Alternatives ) ) ;
    public final void ruleAbstractInterfaceComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:591:2: ( ( ( rule__AbstractInterfaceComponent__Alternatives ) ) )
            // InternalIdl.g:592:2: ( ( rule__AbstractInterfaceComponent__Alternatives ) )
            {
            // InternalIdl.g:592:2: ( ( rule__AbstractInterfaceComponent__Alternatives ) )
            // InternalIdl.g:593:3: ( rule__AbstractInterfaceComponent__Alternatives )
            {
             before(grammarAccess.getAbstractInterfaceComponentAccess().getAlternatives()); 
            // InternalIdl.g:594:3: ( rule__AbstractInterfaceComponent__Alternatives )
            // InternalIdl.g:594:4: rule__AbstractInterfaceComponent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractInterfaceComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractInterfaceComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractInterfaceComponent"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalIdl.g:603:1: entryRuleFunctionDeclaration : ruleFunctionDeclaration EOF ;
    public final void entryRuleFunctionDeclaration() throws RecognitionException {
        try {
            // InternalIdl.g:604:1: ( ruleFunctionDeclaration EOF )
            // InternalIdl.g:605:1: ruleFunctionDeclaration EOF
            {
             before(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionDeclaration();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalIdl.g:612:1: ruleFunctionDeclaration : ( ( rule__FunctionDeclaration__Group__0 ) ) ;
    public final void ruleFunctionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:616:2: ( ( ( rule__FunctionDeclaration__Group__0 ) ) )
            // InternalIdl.g:617:2: ( ( rule__FunctionDeclaration__Group__0 ) )
            {
            // InternalIdl.g:617:2: ( ( rule__FunctionDeclaration__Group__0 ) )
            // InternalIdl.g:618:3: ( rule__FunctionDeclaration__Group__0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup()); 
            // InternalIdl.g:619:3: ( rule__FunctionDeclaration__Group__0 )
            // InternalIdl.g:619:4: rule__FunctionDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleEventDeclaration"
    // InternalIdl.g:628:1: entryRuleEventDeclaration : ruleEventDeclaration EOF ;
    public final void entryRuleEventDeclaration() throws RecognitionException {
        try {
            // InternalIdl.g:629:1: ( ruleEventDeclaration EOF )
            // InternalIdl.g:630:1: ruleEventDeclaration EOF
            {
             before(grammarAccess.getEventDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleEventDeclaration();

            state._fsp--;

             after(grammarAccess.getEventDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventDeclaration"


    // $ANTLR start "ruleEventDeclaration"
    // InternalIdl.g:637:1: ruleEventDeclaration : ( ( rule__EventDeclaration__Group__0 ) ) ;
    public final void ruleEventDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:641:2: ( ( ( rule__EventDeclaration__Group__0 ) ) )
            // InternalIdl.g:642:2: ( ( rule__EventDeclaration__Group__0 ) )
            {
            // InternalIdl.g:642:2: ( ( rule__EventDeclaration__Group__0 ) )
            // InternalIdl.g:643:3: ( rule__EventDeclaration__Group__0 )
            {
             before(grammarAccess.getEventDeclarationAccess().getGroup()); 
            // InternalIdl.g:644:3: ( rule__EventDeclaration__Group__0 )
            // InternalIdl.g:644:4: rule__EventDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventDeclaration"


    // $ANTLR start "entryRuleReturnTypeElement"
    // InternalIdl.g:653:1: entryRuleReturnTypeElement : ruleReturnTypeElement EOF ;
    public final void entryRuleReturnTypeElement() throws RecognitionException {
        try {
            // InternalIdl.g:654:1: ( ruleReturnTypeElement EOF )
            // InternalIdl.g:655:1: ruleReturnTypeElement EOF
            {
             before(grammarAccess.getReturnTypeElementRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnTypeElement();

            state._fsp--;

             after(grammarAccess.getReturnTypeElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnTypeElement"


    // $ANTLR start "ruleReturnTypeElement"
    // InternalIdl.g:662:1: ruleReturnTypeElement : ( ( rule__ReturnTypeElement__Alternatives ) ) ;
    public final void ruleReturnTypeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:666:2: ( ( ( rule__ReturnTypeElement__Alternatives ) ) )
            // InternalIdl.g:667:2: ( ( rule__ReturnTypeElement__Alternatives ) )
            {
            // InternalIdl.g:667:2: ( ( rule__ReturnTypeElement__Alternatives ) )
            // InternalIdl.g:668:3: ( rule__ReturnTypeElement__Alternatives )
            {
             before(grammarAccess.getReturnTypeElementAccess().getAlternatives()); 
            // InternalIdl.g:669:3: ( rule__ReturnTypeElement__Alternatives )
            // InternalIdl.g:669:4: rule__ReturnTypeElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReturnTypeElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReturnTypeElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnTypeElement"


    // $ANTLR start "entryRuleParameterElement"
    // InternalIdl.g:678:1: entryRuleParameterElement : ruleParameterElement EOF ;
    public final void entryRuleParameterElement() throws RecognitionException {
        try {
            // InternalIdl.g:679:1: ( ruleParameterElement EOF )
            // InternalIdl.g:680:1: ruleParameterElement EOF
            {
             before(grammarAccess.getParameterElementRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterElement();

            state._fsp--;

             after(grammarAccess.getParameterElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterElement"


    // $ANTLR start "ruleParameterElement"
    // InternalIdl.g:687:1: ruleParameterElement : ( ( rule__ParameterElement__Group__0 ) ) ;
    public final void ruleParameterElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:691:2: ( ( ( rule__ParameterElement__Group__0 ) ) )
            // InternalIdl.g:692:2: ( ( rule__ParameterElement__Group__0 ) )
            {
            // InternalIdl.g:692:2: ( ( rule__ParameterElement__Group__0 ) )
            // InternalIdl.g:693:3: ( rule__ParameterElement__Group__0 )
            {
             before(grammarAccess.getParameterElementAccess().getGroup()); 
            // InternalIdl.g:694:3: ( rule__ParameterElement__Group__0 )
            // InternalIdl.g:694:4: rule__ParameterElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterElement"


    // $ANTLR start "entryRuleDocCommentElement"
    // InternalIdl.g:703:1: entryRuleDocCommentElement : ruleDocCommentElement EOF ;
    public final void entryRuleDocCommentElement() throws RecognitionException {
        try {
            // InternalIdl.g:704:1: ( ruleDocCommentElement EOF )
            // InternalIdl.g:705:1: ruleDocCommentElement EOF
            {
             before(grammarAccess.getDocCommentElementRule()); 
            pushFollow(FOLLOW_1);
            ruleDocCommentElement();

            state._fsp--;

             after(grammarAccess.getDocCommentElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocCommentElement"


    // $ANTLR start "ruleDocCommentElement"
    // InternalIdl.g:712:1: ruleDocCommentElement : ( ( rule__DocCommentElement__TextAssignment ) ) ;
    public final void ruleDocCommentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:716:2: ( ( ( rule__DocCommentElement__TextAssignment ) ) )
            // InternalIdl.g:717:2: ( ( rule__DocCommentElement__TextAssignment ) )
            {
            // InternalIdl.g:717:2: ( ( rule__DocCommentElement__TextAssignment ) )
            // InternalIdl.g:718:3: ( rule__DocCommentElement__TextAssignment )
            {
             before(grammarAccess.getDocCommentElementAccess().getTextAssignment()); 
            // InternalIdl.g:719:3: ( rule__DocCommentElement__TextAssignment )
            // InternalIdl.g:719:4: rule__DocCommentElement__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DocCommentElement__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDocCommentElementAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocCommentElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalIdl.g:728:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalIdl.g:729:1: ( ruleQualifiedName EOF )
            // InternalIdl.g:730:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalIdl.g:737:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:741:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalIdl.g:742:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalIdl.g:742:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalIdl.g:743:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalIdl.g:744:3: ( rule__QualifiedName__Group__0 )
            // InternalIdl.g:744:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalIdl.g:753:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalIdl.g:754:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalIdl.g:755:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalIdl.g:762:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:766:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalIdl.g:767:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalIdl.g:767:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalIdl.g:768:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalIdl.g:769:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalIdl.g:769:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalIdl.g:778:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalIdl.g:779:1: ( rulePrimitiveType EOF )
            // InternalIdl.g:780:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalIdl.g:787:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:791:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalIdl.g:792:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalIdl.g:792:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalIdl.g:793:3: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalIdl.g:794:3: ( rule__PrimitiveType__Alternatives )
            // InternalIdl.g:794:4: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalIdl.g:803:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalIdl.g:804:1: ( ruleIntegerType EOF )
            // InternalIdl.g:805:1: ruleIntegerType EOF
            {
             before(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getIntegerTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalIdl.g:812:1: ruleIntegerType : ( ( rule__IntegerType__Alternatives ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:816:2: ( ( ( rule__IntegerType__Alternatives ) ) )
            // InternalIdl.g:817:2: ( ( rule__IntegerType__Alternatives ) )
            {
            // InternalIdl.g:817:2: ( ( rule__IntegerType__Alternatives ) )
            // InternalIdl.g:818:3: ( rule__IntegerType__Alternatives )
            {
             before(grammarAccess.getIntegerTypeAccess().getAlternatives()); 
            // InternalIdl.g:819:3: ( rule__IntegerType__Alternatives )
            // InternalIdl.g:819:4: rule__IntegerType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IntegerType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntegerTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleFloatingPointType"
    // InternalIdl.g:828:1: entryRuleFloatingPointType : ruleFloatingPointType EOF ;
    public final void entryRuleFloatingPointType() throws RecognitionException {
        try {
            // InternalIdl.g:829:1: ( ruleFloatingPointType EOF )
            // InternalIdl.g:830:1: ruleFloatingPointType EOF
            {
             before(grammarAccess.getFloatingPointTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatingPointType();

            state._fsp--;

             after(grammarAccess.getFloatingPointTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatingPointType"


    // $ANTLR start "ruleFloatingPointType"
    // InternalIdl.g:837:1: ruleFloatingPointType : ( ( rule__FloatingPointType__Alternatives ) ) ;
    public final void ruleFloatingPointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:841:2: ( ( ( rule__FloatingPointType__Alternatives ) ) )
            // InternalIdl.g:842:2: ( ( rule__FloatingPointType__Alternatives ) )
            {
            // InternalIdl.g:842:2: ( ( rule__FloatingPointType__Alternatives ) )
            // InternalIdl.g:843:3: ( rule__FloatingPointType__Alternatives )
            {
             before(grammarAccess.getFloatingPointTypeAccess().getAlternatives()); 
            // InternalIdl.g:844:3: ( rule__FloatingPointType__Alternatives )
            // InternalIdl.g:844:4: rule__FloatingPointType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FloatingPointType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFloatingPointTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatingPointType"


    // $ANTLR start "ruleParameterDirection"
    // InternalIdl.g:853:1: ruleParameterDirection : ( ( rule__ParameterDirection__Alternatives ) ) ;
    public final void ruleParameterDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:857:1: ( ( ( rule__ParameterDirection__Alternatives ) ) )
            // InternalIdl.g:858:2: ( ( rule__ParameterDirection__Alternatives ) )
            {
            // InternalIdl.g:858:2: ( ( rule__ParameterDirection__Alternatives ) )
            // InternalIdl.g:859:3: ( rule__ParameterDirection__Alternatives )
            {
             before(grammarAccess.getParameterDirectionAccess().getAlternatives()); 
            // InternalIdl.g:860:3: ( rule__ParameterDirection__Alternatives )
            // InternalIdl.g:860:4: rule__ParameterDirection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDirection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDirection"


    // $ANTLR start "rule__AbstractModuleComponent__Alternatives"
    // InternalIdl.g:868:1: rule__AbstractModuleComponent__Alternatives : ( ( ( rule__AbstractModuleComponent__Group_0__0 ) ) | ( ( rule__AbstractModuleComponent__Group_1__0 ) ) | ( ( rule__AbstractModuleComponent__Group_2__0 ) ) | ( ( rule__AbstractModuleComponent__Group_3__0 ) ) | ( ( rule__AbstractModuleComponent__Group_4__0 ) ) );
    public final void rule__AbstractModuleComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:872:1: ( ( ( rule__AbstractModuleComponent__Group_0__0 ) ) | ( ( rule__AbstractModuleComponent__Group_1__0 ) ) | ( ( rule__AbstractModuleComponent__Group_2__0 ) ) | ( ( rule__AbstractModuleComponent__Group_3__0 ) ) | ( ( rule__AbstractModuleComponent__Group_4__0 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt1=1;
                }
                break;
            case 51:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            case RULE_SL_DOC_COMMENT:
            case RULE_ML_DOC_COMMENT:
            case 52:
            case 67:
                {
                alt1=4;
                }
                break;
            case 36:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalIdl.g:873:2: ( ( rule__AbstractModuleComponent__Group_0__0 ) )
                    {
                    // InternalIdl.g:873:2: ( ( rule__AbstractModuleComponent__Group_0__0 ) )
                    // InternalIdl.g:874:3: ( rule__AbstractModuleComponent__Group_0__0 )
                    {
                     before(grammarAccess.getAbstractModuleComponentAccess().getGroup_0()); 
                    // InternalIdl.g:875:3: ( rule__AbstractModuleComponent__Group_0__0 )
                    // InternalIdl.g:875:4: rule__AbstractModuleComponent__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractModuleComponent__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractModuleComponentAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:879:2: ( ( rule__AbstractModuleComponent__Group_1__0 ) )
                    {
                    // InternalIdl.g:879:2: ( ( rule__AbstractModuleComponent__Group_1__0 ) )
                    // InternalIdl.g:880:3: ( rule__AbstractModuleComponent__Group_1__0 )
                    {
                     before(grammarAccess.getAbstractModuleComponentAccess().getGroup_1()); 
                    // InternalIdl.g:881:3: ( rule__AbstractModuleComponent__Group_1__0 )
                    // InternalIdl.g:881:4: rule__AbstractModuleComponent__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractModuleComponent__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractModuleComponentAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIdl.g:885:2: ( ( rule__AbstractModuleComponent__Group_2__0 ) )
                    {
                    // InternalIdl.g:885:2: ( ( rule__AbstractModuleComponent__Group_2__0 ) )
                    // InternalIdl.g:886:3: ( rule__AbstractModuleComponent__Group_2__0 )
                    {
                     before(grammarAccess.getAbstractModuleComponentAccess().getGroup_2()); 
                    // InternalIdl.g:887:3: ( rule__AbstractModuleComponent__Group_2__0 )
                    // InternalIdl.g:887:4: rule__AbstractModuleComponent__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractModuleComponent__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractModuleComponentAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIdl.g:891:2: ( ( rule__AbstractModuleComponent__Group_3__0 ) )
                    {
                    // InternalIdl.g:891:2: ( ( rule__AbstractModuleComponent__Group_3__0 ) )
                    // InternalIdl.g:892:3: ( rule__AbstractModuleComponent__Group_3__0 )
                    {
                     before(grammarAccess.getAbstractModuleComponentAccess().getGroup_3()); 
                    // InternalIdl.g:893:3: ( rule__AbstractModuleComponent__Group_3__0 )
                    // InternalIdl.g:893:4: rule__AbstractModuleComponent__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractModuleComponent__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractModuleComponentAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIdl.g:897:2: ( ( rule__AbstractModuleComponent__Group_4__0 ) )
                    {
                    // InternalIdl.g:897:2: ( ( rule__AbstractModuleComponent__Group_4__0 ) )
                    // InternalIdl.g:898:3: ( rule__AbstractModuleComponent__Group_4__0 )
                    {
                     before(grammarAccess.getAbstractModuleComponentAccess().getGroup_4()); 
                    // InternalIdl.g:899:3: ( rule__AbstractModuleComponent__Group_4__0 )
                    // InternalIdl.g:899:4: rule__AbstractModuleComponent__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractModuleComponent__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractModuleComponentAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Alternatives"


    // $ANTLR start "rule__AbstractException__Alternatives"
    // InternalIdl.g:907:1: rule__AbstractException__Alternatives : ( ( ruleExceptionReferenceDeclaration ) | ( ruleExceptionDeclaration ) );
    public final void rule__AbstractException__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:911:1: ( ( ruleExceptionReferenceDeclaration ) | ( ruleExceptionDeclaration ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==34) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==30||LA2_2==35) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalIdl.g:912:2: ( ruleExceptionReferenceDeclaration )
                    {
                    // InternalIdl.g:912:2: ( ruleExceptionReferenceDeclaration )
                    // InternalIdl.g:913:3: ruleExceptionReferenceDeclaration
                    {
                     before(grammarAccess.getAbstractExceptionAccess().getExceptionReferenceDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExceptionReferenceDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractExceptionAccess().getExceptionReferenceDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:918:2: ( ruleExceptionDeclaration )
                    {
                    // InternalIdl.g:918:2: ( ruleExceptionDeclaration )
                    // InternalIdl.g:919:3: ruleExceptionDeclaration
                    {
                     before(grammarAccess.getAbstractExceptionAccess().getExceptionDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExceptionDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractExceptionAccess().getExceptionDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractException__Alternatives"


    // $ANTLR start "rule__AbstractTypeDeclaration__Alternatives"
    // InternalIdl.g:928:1: rule__AbstractTypeDeclaration__Alternatives : ( ( ruleAliasDeclaration ) | ( ruleEnumDeclaration ) | ( ruleStructDeclaration ) | ( ruleAbstractException ) );
    public final void rule__AbstractTypeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:932:1: ( ( ruleAliasDeclaration ) | ( ruleEnumDeclaration ) | ( ruleStructDeclaration ) | ( ruleAbstractException ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 51:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalIdl.g:933:2: ( ruleAliasDeclaration )
                    {
                    // InternalIdl.g:933:2: ( ruleAliasDeclaration )
                    // InternalIdl.g:934:3: ruleAliasDeclaration
                    {
                     before(grammarAccess.getAbstractTypeDeclarationAccess().getAliasDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAliasDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeDeclarationAccess().getAliasDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:939:2: ( ruleEnumDeclaration )
                    {
                    // InternalIdl.g:939:2: ( ruleEnumDeclaration )
                    // InternalIdl.g:940:3: ruleEnumDeclaration
                    {
                     before(grammarAccess.getAbstractTypeDeclarationAccess().getEnumDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeDeclarationAccess().getEnumDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIdl.g:945:2: ( ruleStructDeclaration )
                    {
                    // InternalIdl.g:945:2: ( ruleStructDeclaration )
                    // InternalIdl.g:946:3: ruleStructDeclaration
                    {
                     before(grammarAccess.getAbstractTypeDeclarationAccess().getStructDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStructDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeDeclarationAccess().getStructDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIdl.g:951:2: ( ruleAbstractException )
                    {
                    // InternalIdl.g:951:2: ( ruleAbstractException )
                    // InternalIdl.g:952:3: ruleAbstractException
                    {
                     before(grammarAccess.getAbstractTypeDeclarationAccess().getAbstractExceptionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractException();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeDeclarationAccess().getAbstractExceptionParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTypeDeclaration__Alternatives"


    // $ANTLR start "rule__AbstractType__Alternatives"
    // InternalIdl.g:961:1: rule__AbstractType__Alternatives : ( ( ( rule__AbstractType__PrimitiveTypeAssignment_0 ) ) | ( ( rule__AbstractType__ReferenceTypeAssignment_1 ) ) | ( ( rule__AbstractType__CollectionTypeAssignment_2 ) ) );
    public final void rule__AbstractType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:965:1: ( ( ( rule__AbstractType__PrimitiveTypeAssignment_0 ) ) | ( ( rule__AbstractType__ReferenceTypeAssignment_1 ) ) | ( ( rule__AbstractType__CollectionTypeAssignment_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_BYTE:
            case RULE_INT16:
            case RULE_INT32:
            case RULE_INT64:
            case RULE_FLOAT:
            case RULE_DOUBLE:
            case RULE_STRINGTYPE:
            case RULE_CHAR:
            case RULE_UUID:
            case RULE_BOOLEAN:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 39:
            case 50:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalIdl.g:966:2: ( ( rule__AbstractType__PrimitiveTypeAssignment_0 ) )
                    {
                    // InternalIdl.g:966:2: ( ( rule__AbstractType__PrimitiveTypeAssignment_0 ) )
                    // InternalIdl.g:967:3: ( rule__AbstractType__PrimitiveTypeAssignment_0 )
                    {
                     before(grammarAccess.getAbstractTypeAccess().getPrimitiveTypeAssignment_0()); 
                    // InternalIdl.g:968:3: ( rule__AbstractType__PrimitiveTypeAssignment_0 )
                    // InternalIdl.g:968:4: rule__AbstractType__PrimitiveTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractType__PrimitiveTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractTypeAccess().getPrimitiveTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:972:2: ( ( rule__AbstractType__ReferenceTypeAssignment_1 ) )
                    {
                    // InternalIdl.g:972:2: ( ( rule__AbstractType__ReferenceTypeAssignment_1 ) )
                    // InternalIdl.g:973:3: ( rule__AbstractType__ReferenceTypeAssignment_1 )
                    {
                     before(grammarAccess.getAbstractTypeAccess().getReferenceTypeAssignment_1()); 
                    // InternalIdl.g:974:3: ( rule__AbstractType__ReferenceTypeAssignment_1 )
                    // InternalIdl.g:974:4: rule__AbstractType__ReferenceTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractType__ReferenceTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractTypeAccess().getReferenceTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIdl.g:978:2: ( ( rule__AbstractType__CollectionTypeAssignment_2 ) )
                    {
                    // InternalIdl.g:978:2: ( ( rule__AbstractType__CollectionTypeAssignment_2 ) )
                    // InternalIdl.g:979:3: ( rule__AbstractType__CollectionTypeAssignment_2 )
                    {
                     before(grammarAccess.getAbstractTypeAccess().getCollectionTypeAssignment_2()); 
                    // InternalIdl.g:980:3: ( rule__AbstractType__CollectionTypeAssignment_2 )
                    // InternalIdl.g:980:4: rule__AbstractType__CollectionTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractType__CollectionTypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractTypeAccess().getCollectionTypeAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractType__Alternatives"


    // $ANTLR start "rule__AbstractCollection__Alternatives"
    // InternalIdl.g:988:1: rule__AbstractCollection__Alternatives : ( ( ruleSequenceDeclaration ) | ( ruleTupleDeclaration ) );
    public final void rule__AbstractCollection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:992:1: ( ( ruleSequenceDeclaration ) | ( ruleTupleDeclaration ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==39) ) {
                alt5=1;
            }
            else if ( (LA5_0==50) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalIdl.g:993:2: ( ruleSequenceDeclaration )
                    {
                    // InternalIdl.g:993:2: ( ruleSequenceDeclaration )
                    // InternalIdl.g:994:3: ruleSequenceDeclaration
                    {
                     before(grammarAccess.getAbstractCollectionAccess().getSequenceDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSequenceDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractCollectionAccess().getSequenceDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:999:2: ( ruleTupleDeclaration )
                    {
                    // InternalIdl.g:999:2: ( ruleTupleDeclaration )
                    // InternalIdl.g:1000:3: ruleTupleDeclaration
                    {
                     before(grammarAccess.getAbstractCollectionAccess().getTupleDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTupleDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractCollectionAccess().getTupleDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCollection__Alternatives"


    // $ANTLR start "rule__SequenceDeclaration__Alternatives_2"
    // InternalIdl.g:1009:1: rule__SequenceDeclaration__Alternatives_2 : ( ( ( rule__SequenceDeclaration__TypeAssignment_2_0 ) ) | ( ( rule__SequenceDeclaration__Group_2_1__0 ) ) );
    public final void rule__SequenceDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1013:1: ( ( ( rule__SequenceDeclaration__TypeAssignment_2_0 ) ) | ( ( rule__SequenceDeclaration__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_BYTE && LA6_0<=RULE_ID)||(LA6_0>=RULE_STRINGTYPE && LA6_0<=RULE_BOOLEAN)||LA6_0==39||LA6_0==50) ) {
                alt6=1;
            }
            else if ( (LA6_0==65) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalIdl.g:1014:2: ( ( rule__SequenceDeclaration__TypeAssignment_2_0 ) )
                    {
                    // InternalIdl.g:1014:2: ( ( rule__SequenceDeclaration__TypeAssignment_2_0 ) )
                    // InternalIdl.g:1015:3: ( rule__SequenceDeclaration__TypeAssignment_2_0 )
                    {
                     before(grammarAccess.getSequenceDeclarationAccess().getTypeAssignment_2_0()); 
                    // InternalIdl.g:1016:3: ( rule__SequenceDeclaration__TypeAssignment_2_0 )
                    // InternalIdl.g:1016:4: rule__SequenceDeclaration__TypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceDeclaration__TypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceDeclarationAccess().getTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:1020:2: ( ( rule__SequenceDeclaration__Group_2_1__0 ) )
                    {
                    // InternalIdl.g:1020:2: ( ( rule__SequenceDeclaration__Group_2_1__0 ) )
                    // InternalIdl.g:1021:3: ( rule__SequenceDeclaration__Group_2_1__0 )
                    {
                     before(grammarAccess.getSequenceDeclarationAccess().getGroup_2_1()); 
                    // InternalIdl.g:1022:3: ( rule__SequenceDeclaration__Group_2_1__0 )
                    // InternalIdl.g:1022:4: rule__SequenceDeclaration__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceDeclaration__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceDeclarationAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Alternatives_2"


    // $ANTLR start "rule__AbstractSequenceHint__Alternatives"
    // InternalIdl.g:1030:1: rule__AbstractSequenceHint__Alternatives : ( ( ruleTypicalLengthHint ) | ( ruleTypicalSizeHint ) );
    public final void rule__AbstractSequenceHint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1034:1: ( ( ruleTypicalLengthHint ) | ( ruleTypicalSizeHint ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==45) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==48) ) {
                    alt7=2;
                }
                else if ( (LA7_1==39) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalIdl.g:1035:2: ( ruleTypicalLengthHint )
                    {
                    // InternalIdl.g:1035:2: ( ruleTypicalLengthHint )
                    // InternalIdl.g:1036:3: ruleTypicalLengthHint
                    {
                     before(grammarAccess.getAbstractSequenceHintAccess().getTypicalLengthHintParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTypicalLengthHint();

                    state._fsp--;

                     after(grammarAccess.getAbstractSequenceHintAccess().getTypicalLengthHintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:1041:2: ( ruleTypicalSizeHint )
                    {
                    // InternalIdl.g:1041:2: ( ruleTypicalSizeHint )
                    // InternalIdl.g:1042:3: ruleTypicalSizeHint
                    {
                     before(grammarAccess.getAbstractSequenceHintAccess().getTypicalSizeHintParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTypicalSizeHint();

                    state._fsp--;

                     after(grammarAccess.getAbstractSequenceHintAccess().getTypicalSizeHintParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractSequenceHint__Alternatives"


    // $ANTLR start "rule__StructDeclaration__Alternatives_4_0"
    // InternalIdl.g:1051:1: rule__StructDeclaration__Alternatives_4_0 : ( ( ( rule__StructDeclaration__MembersAssignment_4_0_0 ) ) | ( ( rule__StructDeclaration__TypeDeclsAssignment_4_0_1 ) ) );
    public final void rule__StructDeclaration__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1055:1: ( ( ( rule__StructDeclaration__MembersAssignment_4_0_0 ) ) | ( ( rule__StructDeclaration__TypeDeclsAssignment_4_0_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_BYTE && LA8_0<=RULE_ID)||(LA8_0>=RULE_STRINGTYPE && LA8_0<=RULE_BOOLEAN)||LA8_0==39||LA8_0==50||LA8_0==66) ) {
                alt8=1;
            }
            else if ( (LA8_0==33||(LA8_0>=36 && LA8_0<=37)||LA8_0==51) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalIdl.g:1056:2: ( ( rule__StructDeclaration__MembersAssignment_4_0_0 ) )
                    {
                    // InternalIdl.g:1056:2: ( ( rule__StructDeclaration__MembersAssignment_4_0_0 ) )
                    // InternalIdl.g:1057:3: ( rule__StructDeclaration__MembersAssignment_4_0_0 )
                    {
                     before(grammarAccess.getStructDeclarationAccess().getMembersAssignment_4_0_0()); 
                    // InternalIdl.g:1058:3: ( rule__StructDeclaration__MembersAssignment_4_0_0 )
                    // InternalIdl.g:1058:4: rule__StructDeclaration__MembersAssignment_4_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StructDeclaration__MembersAssignment_4_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStructDeclarationAccess().getMembersAssignment_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:1062:2: ( ( rule__StructDeclaration__TypeDeclsAssignment_4_0_1 ) )
                    {
                    // InternalIdl.g:1062:2: ( ( rule__StructDeclaration__TypeDeclsAssignment_4_0_1 ) )
                    // InternalIdl.g:1063:3: ( rule__StructDeclaration__TypeDeclsAssignment_4_0_1 )
                    {
                     before(grammarAccess.getStructDeclarationAccess().getTypeDeclsAssignment_4_0_1()); 
                    // InternalIdl.g:1064:3: ( rule__StructDeclaration__TypeDeclsAssignment_4_0_1 )
                    // InternalIdl.g:1064:4: rule__StructDeclaration__TypeDeclsAssignment_4_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StructDeclaration__TypeDeclsAssignment_4_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStructDeclarationAccess().getTypeDeclsAssignment_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Alternatives_4_0"


    // $ANTLR start "rule__AbstractInterfaceComponent__Alternatives"
    // InternalIdl.g:1072:1: rule__AbstractInterfaceComponent__Alternatives : ( ( ( rule__AbstractInterfaceComponent__Group_0__0 ) ) | ( ( rule__AbstractInterfaceComponent__Group_1__0 ) ) | ( ( rule__AbstractInterfaceComponent__Group_2__0 ) ) );
    public final void rule__AbstractInterfaceComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1076:1: ( ( ( rule__AbstractInterfaceComponent__Group_0__0 ) ) | ( ( rule__AbstractInterfaceComponent__Group_1__0 ) ) | ( ( rule__AbstractInterfaceComponent__Group_2__0 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 33:
            case 36:
            case 37:
            case 51:
                {
                alt9=1;
                }
                break;
            case RULE_SL_DOC_COMMENT:
            case RULE_ML_DOC_COMMENT:
            case RULE_ID:
            case 68:
            case 69:
                {
                alt9=2;
                }
                break;
            case 58:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalIdl.g:1077:2: ( ( rule__AbstractInterfaceComponent__Group_0__0 ) )
                    {
                    // InternalIdl.g:1077:2: ( ( rule__AbstractInterfaceComponent__Group_0__0 ) )
                    // InternalIdl.g:1078:3: ( rule__AbstractInterfaceComponent__Group_0__0 )
                    {
                     before(grammarAccess.getAbstractInterfaceComponentAccess().getGroup_0()); 
                    // InternalIdl.g:1079:3: ( rule__AbstractInterfaceComponent__Group_0__0 )
                    // InternalIdl.g:1079:4: rule__AbstractInterfaceComponent__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractInterfaceComponent__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractInterfaceComponentAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:1083:2: ( ( rule__AbstractInterfaceComponent__Group_1__0 ) )
                    {
                    // InternalIdl.g:1083:2: ( ( rule__AbstractInterfaceComponent__Group_1__0 ) )
                    // InternalIdl.g:1084:3: ( rule__AbstractInterfaceComponent__Group_1__0 )
                    {
                     before(grammarAccess.getAbstractInterfaceComponentAccess().getGroup_1()); 
                    // InternalIdl.g:1085:3: ( rule__AbstractInterfaceComponent__Group_1__0 )
                    // InternalIdl.g:1085:4: rule__AbstractInterfaceComponent__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractInterfaceComponent__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractInterfaceComponentAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIdl.g:1089:2: ( ( rule__AbstractInterfaceComponent__Group_2__0 ) )
                    {
                    // InternalIdl.g:1089:2: ( ( rule__AbstractInterfaceComponent__Group_2__0 ) )
                    // InternalIdl.g:1090:3: ( rule__AbstractInterfaceComponent__Group_2__0 )
                    {
                     before(grammarAccess.getAbstractInterfaceComponentAccess().getGroup_2()); 
                    // InternalIdl.g:1091:3: ( rule__AbstractInterfaceComponent__Group_2__0 )
                    // InternalIdl.g:1091:4: rule__AbstractInterfaceComponent__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractInterfaceComponent__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractInterfaceComponentAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInterfaceComponent__Alternatives"


    // $ANTLR start "rule__ReturnTypeElement__Alternatives"
    // InternalIdl.g:1099:1: rule__ReturnTypeElement__Alternatives : ( ( ruleAbstractType ) | ( ( rule__ReturnTypeElement__VoidAssignment_1 ) ) );
    public final void rule__ReturnTypeElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1103:1: ( ( ruleAbstractType ) | ( ( rule__ReturnTypeElement__VoidAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_BYTE && LA10_0<=RULE_ID)||(LA10_0>=RULE_STRINGTYPE && LA10_0<=RULE_BOOLEAN)||LA10_0==39||LA10_0==50) ) {
                alt10=1;
            }
            else if ( (LA10_0==71) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalIdl.g:1104:2: ( ruleAbstractType )
                    {
                    // InternalIdl.g:1104:2: ( ruleAbstractType )
                    // InternalIdl.g:1105:3: ruleAbstractType
                    {
                     before(grammarAccess.getReturnTypeElementAccess().getAbstractTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractType();

                    state._fsp--;

                     after(grammarAccess.getReturnTypeElementAccess().getAbstractTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:1110:2: ( ( rule__ReturnTypeElement__VoidAssignment_1 ) )
                    {
                    // InternalIdl.g:1110:2: ( ( rule__ReturnTypeElement__VoidAssignment_1 ) )
                    // InternalIdl.g:1111:3: ( rule__ReturnTypeElement__VoidAssignment_1 )
                    {
                     before(grammarAccess.getReturnTypeElementAccess().getVoidAssignment_1()); 
                    // InternalIdl.g:1112:3: ( rule__ReturnTypeElement__VoidAssignment_1 )
                    // InternalIdl.g:1112:4: rule__ReturnTypeElement__VoidAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReturnTypeElement__VoidAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getReturnTypeElementAccess().getVoidAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeElement__Alternatives"


    // $ANTLR start "rule__DocCommentElement__TextAlternatives_0"
    // InternalIdl.g:1120:1: rule__DocCommentElement__TextAlternatives_0 : ( ( RULE_SL_DOC_COMMENT ) | ( RULE_ML_DOC_COMMENT ) );
    public final void rule__DocCommentElement__TextAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1124:1: ( ( RULE_SL_DOC_COMMENT ) | ( RULE_ML_DOC_COMMENT ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SL_DOC_COMMENT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ML_DOC_COMMENT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalIdl.g:1125:2: ( RULE_SL_DOC_COMMENT )
                    {
                    // InternalIdl.g:1125:2: ( RULE_SL_DOC_COMMENT )
                    // InternalIdl.g:1126:3: RULE_SL_DOC_COMMENT
                    {
                     before(grammarAccess.getDocCommentElementAccess().getTextSL_DOC_COMMENTTerminalRuleCall_0_0()); 
                    match(input,RULE_SL_DOC_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getDocCommentElementAccess().getTextSL_DOC_COMMENTTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:1131:2: ( RULE_ML_DOC_COMMENT )
                    {
                    // InternalIdl.g:1131:2: ( RULE_ML_DOC_COMMENT )
                    // InternalIdl.g:1132:3: RULE_ML_DOC_COMMENT
                    {
                     before(grammarAccess.getDocCommentElementAccess().getTextML_DOC_COMMENTTerminalRuleCall_0_1()); 
                    match(input,RULE_ML_DOC_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getDocCommentElementAccess().getTextML_DOC_COMMENTTerminalRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocCommentElement__TextAlternatives_0"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // InternalIdl.g:1141:1: rule__PrimitiveType__Alternatives : ( ( ( rule__PrimitiveType__IntegerTypeAssignment_0 ) ) | ( ( rule__PrimitiveType__StringTypeAssignment_1 ) ) | ( ( rule__PrimitiveType__CharTypeAssignment_2 ) ) | ( ( rule__PrimitiveType__FloatingPointTypeAssignment_3 ) ) | ( ( rule__PrimitiveType__UuidTypeAssignment_4 ) ) | ( ( rule__PrimitiveType__BooleanTypeAssignment_5 ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1145:1: ( ( ( rule__PrimitiveType__IntegerTypeAssignment_0 ) ) | ( ( rule__PrimitiveType__StringTypeAssignment_1 ) ) | ( ( rule__PrimitiveType__CharTypeAssignment_2 ) ) | ( ( rule__PrimitiveType__FloatingPointTypeAssignment_3 ) ) | ( ( rule__PrimitiveType__UuidTypeAssignment_4 ) ) | ( ( rule__PrimitiveType__BooleanTypeAssignment_5 ) ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case RULE_BYTE:
            case RULE_INT16:
            case RULE_INT32:
            case RULE_INT64:
                {
                alt12=1;
                }
                break;
            case RULE_STRINGTYPE:
                {
                alt12=2;
                }
                break;
            case RULE_CHAR:
                {
                alt12=3;
                }
                break;
            case RULE_FLOAT:
            case RULE_DOUBLE:
                {
                alt12=4;
                }
                break;
            case RULE_UUID:
                {
                alt12=5;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalIdl.g:1146:2: ( ( rule__PrimitiveType__IntegerTypeAssignment_0 ) )
                    {
                    // InternalIdl.g:1146:2: ( ( rule__PrimitiveType__IntegerTypeAssignment_0 ) )
                    // InternalIdl.g:1147:3: ( rule__PrimitiveType__IntegerTypeAssignment_0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntegerTypeAssignment_0()); 
                    // InternalIdl.g:1148:3: ( rule__PrimitiveType__IntegerTypeAssignment_0 )
                    // InternalIdl.g:1148:4: rule__PrimitiveType__IntegerTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__IntegerTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getIntegerTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:1152:2: ( ( rule__PrimitiveType__StringTypeAssignment_1 ) )
                    {
                    // InternalIdl.g:1152:2: ( ( rule__PrimitiveType__StringTypeAssignment_1 ) )
                    // InternalIdl.g:1153:3: ( rule__PrimitiveType__StringTypeAssignment_1 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getStringTypeAssignment_1()); 
                    // InternalIdl.g:1154:3: ( rule__PrimitiveType__StringTypeAssignment_1 )
                    // InternalIdl.g:1154:4: rule__PrimitiveType__StringTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__StringTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getStringTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIdl.g:1158:2: ( ( rule__PrimitiveType__CharTypeAssignment_2 ) )
                    {
                    // InternalIdl.g:1158:2: ( ( rule__PrimitiveType__CharTypeAssignment_2 ) )
                    // InternalIdl.g:1159:3: ( rule__PrimitiveType__CharTypeAssignment_2 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getCharTypeAssignment_2()); 
                    // InternalIdl.g:1160:3: ( rule__PrimitiveType__CharTypeAssignment_2 )
                    // InternalIdl.g:1160:4: rule__PrimitiveType__CharTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__CharTypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getCharTypeAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIdl.g:1164:2: ( ( rule__PrimitiveType__FloatingPointTypeAssignment_3 ) )
                    {
                    // InternalIdl.g:1164:2: ( ( rule__PrimitiveType__FloatingPointTypeAssignment_3 ) )
                    // InternalIdl.g:1165:3: ( rule__PrimitiveType__FloatingPointTypeAssignment_3 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFloatingPointTypeAssignment_3()); 
                    // InternalIdl.g:1166:3: ( rule__PrimitiveType__FloatingPointTypeAssignment_3 )
                    // InternalIdl.g:1166:4: rule__PrimitiveType__FloatingPointTypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__FloatingPointTypeAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getFloatingPointTypeAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIdl.g:1170:2: ( ( rule__PrimitiveType__UuidTypeAssignment_4 ) )
                    {
                    // InternalIdl.g:1170:2: ( ( rule__PrimitiveType__UuidTypeAssignment_4 ) )
                    // InternalIdl.g:1171:3: ( rule__PrimitiveType__UuidTypeAssignment_4 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getUuidTypeAssignment_4()); 
                    // InternalIdl.g:1172:3: ( rule__PrimitiveType__UuidTypeAssignment_4 )
                    // InternalIdl.g:1172:4: rule__PrimitiveType__UuidTypeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__UuidTypeAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getUuidTypeAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIdl.g:1176:2: ( ( rule__PrimitiveType__BooleanTypeAssignment_5 ) )
                    {
                    // InternalIdl.g:1176:2: ( ( rule__PrimitiveType__BooleanTypeAssignment_5 ) )
                    // InternalIdl.g:1177:3: ( rule__PrimitiveType__BooleanTypeAssignment_5 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanTypeAssignment_5()); 
                    // InternalIdl.g:1178:3: ( rule__PrimitiveType__BooleanTypeAssignment_5 )
                    // InternalIdl.g:1178:4: rule__PrimitiveType__BooleanTypeAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__BooleanTypeAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBooleanTypeAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__IntegerType__Alternatives"
    // InternalIdl.g:1186:1: rule__IntegerType__Alternatives : ( ( RULE_BYTE ) | ( RULE_INT16 ) | ( RULE_INT32 ) | ( RULE_INT64 ) );
    public final void rule__IntegerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1190:1: ( ( RULE_BYTE ) | ( RULE_INT16 ) | ( RULE_INT32 ) | ( RULE_INT64 ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_BYTE:
                {
                alt13=1;
                }
                break;
            case RULE_INT16:
                {
                alt13=2;
                }
                break;
            case RULE_INT32:
                {
                alt13=3;
                }
                break;
            case RULE_INT64:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalIdl.g:1191:2: ( RULE_BYTE )
                    {
                    // InternalIdl.g:1191:2: ( RULE_BYTE )
                    // InternalIdl.g:1192:3: RULE_BYTE
                    {
                     before(grammarAccess.getIntegerTypeAccess().getBYTETerminalRuleCall_0()); 
                    match(input,RULE_BYTE,FOLLOW_2); 
                     after(grammarAccess.getIntegerTypeAccess().getBYTETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:1197:2: ( RULE_INT16 )
                    {
                    // InternalIdl.g:1197:2: ( RULE_INT16 )
                    // InternalIdl.g:1198:3: RULE_INT16
                    {
                     before(grammarAccess.getIntegerTypeAccess().getINT16TerminalRuleCall_1()); 
                    match(input,RULE_INT16,FOLLOW_2); 
                     after(grammarAccess.getIntegerTypeAccess().getINT16TerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIdl.g:1203:2: ( RULE_INT32 )
                    {
                    // InternalIdl.g:1203:2: ( RULE_INT32 )
                    // InternalIdl.g:1204:3: RULE_INT32
                    {
                     before(grammarAccess.getIntegerTypeAccess().getINT32TerminalRuleCall_2()); 
                    match(input,RULE_INT32,FOLLOW_2); 
                     after(grammarAccess.getIntegerTypeAccess().getINT32TerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIdl.g:1209:2: ( RULE_INT64 )
                    {
                    // InternalIdl.g:1209:2: ( RULE_INT64 )
                    // InternalIdl.g:1210:3: RULE_INT64
                    {
                     before(grammarAccess.getIntegerTypeAccess().getINT64TerminalRuleCall_3()); 
                    match(input,RULE_INT64,FOLLOW_2); 
                     after(grammarAccess.getIntegerTypeAccess().getINT64TerminalRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Alternatives"


    // $ANTLR start "rule__FloatingPointType__Alternatives"
    // InternalIdl.g:1219:1: rule__FloatingPointType__Alternatives : ( ( RULE_FLOAT ) | ( RULE_DOUBLE ) );
    public final void rule__FloatingPointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1223:1: ( ( RULE_FLOAT ) | ( RULE_DOUBLE ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_FLOAT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_DOUBLE) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalIdl.g:1224:2: ( RULE_FLOAT )
                    {
                    // InternalIdl.g:1224:2: ( RULE_FLOAT )
                    // InternalIdl.g:1225:3: RULE_FLOAT
                    {
                     before(grammarAccess.getFloatingPointTypeAccess().getFLOATTerminalRuleCall_0()); 
                    match(input,RULE_FLOAT,FOLLOW_2); 
                     after(grammarAccess.getFloatingPointTypeAccess().getFLOATTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:1230:2: ( RULE_DOUBLE )
                    {
                    // InternalIdl.g:1230:2: ( RULE_DOUBLE )
                    // InternalIdl.g:1231:3: RULE_DOUBLE
                    {
                     before(grammarAccess.getFloatingPointTypeAccess().getDOUBLETerminalRuleCall_1()); 
                    match(input,RULE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getFloatingPointTypeAccess().getDOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingPointType__Alternatives"


    // $ANTLR start "rule__ParameterDirection__Alternatives"
    // InternalIdl.g:1240:1: rule__ParameterDirection__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__ParameterDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1244:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            else if ( (LA15_0==27) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalIdl.g:1245:2: ( ( 'in' ) )
                    {
                    // InternalIdl.g:1245:2: ( ( 'in' ) )
                    // InternalIdl.g:1246:3: ( 'in' )
                    {
                     before(grammarAccess.getParameterDirectionAccess().getPARAM_INEnumLiteralDeclaration_0()); 
                    // InternalIdl.g:1247:3: ( 'in' )
                    // InternalIdl.g:1247:4: 'in'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterDirectionAccess().getPARAM_INEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:1251:2: ( ( 'out' ) )
                    {
                    // InternalIdl.g:1251:2: ( ( 'out' ) )
                    // InternalIdl.g:1252:3: ( 'out' )
                    {
                     before(grammarAccess.getParameterDirectionAccess().getPARAM_OUTEnumLiteralDeclaration_1()); 
                    // InternalIdl.g:1253:3: ( 'out' )
                    // InternalIdl.g:1253:4: 'out'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterDirectionAccess().getPARAM_OUTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDirection__Alternatives"


    // $ANTLR start "rule__IDLSpecification__Group__0"
    // InternalIdl.g:1261:1: rule__IDLSpecification__Group__0 : rule__IDLSpecification__Group__0__Impl rule__IDLSpecification__Group__1 ;
    public final void rule__IDLSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1265:1: ( rule__IDLSpecification__Group__0__Impl rule__IDLSpecification__Group__1 )
            // InternalIdl.g:1266:2: rule__IDLSpecification__Group__0__Impl rule__IDLSpecification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__IDLSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IDLSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDLSpecification__Group__0"


    // $ANTLR start "rule__IDLSpecification__Group__0__Impl"
    // InternalIdl.g:1273:1: rule__IDLSpecification__Group__0__Impl : ( ( rule__IDLSpecification__ImportedEntitiesAssignment_0 )* ) ;
    public final void rule__IDLSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1277:1: ( ( ( rule__IDLSpecification__ImportedEntitiesAssignment_0 )* ) )
            // InternalIdl.g:1278:1: ( ( rule__IDLSpecification__ImportedEntitiesAssignment_0 )* )
            {
            // InternalIdl.g:1278:1: ( ( rule__IDLSpecification__ImportedEntitiesAssignment_0 )* )
            // InternalIdl.g:1279:2: ( rule__IDLSpecification__ImportedEntitiesAssignment_0 )*
            {
             before(grammarAccess.getIDLSpecificationAccess().getImportedEntitiesAssignment_0()); 
            // InternalIdl.g:1280:2: ( rule__IDLSpecification__ImportedEntitiesAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIdl.g:1280:3: rule__IDLSpecification__ImportedEntitiesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__IDLSpecification__ImportedEntitiesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getIDLSpecificationAccess().getImportedEntitiesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDLSpecification__Group__0__Impl"


    // $ANTLR start "rule__IDLSpecification__Group__1"
    // InternalIdl.g:1288:1: rule__IDLSpecification__Group__1 : rule__IDLSpecification__Group__1__Impl ;
    public final void rule__IDLSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1292:1: ( rule__IDLSpecification__Group__1__Impl )
            // InternalIdl.g:1293:2: rule__IDLSpecification__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IDLSpecification__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDLSpecification__Group__1"


    // $ANTLR start "rule__IDLSpecification__Group__1__Impl"
    // InternalIdl.g:1299:1: rule__IDLSpecification__Group__1__Impl : ( ( rule__IDLSpecification__ModulesAssignment_1 )* ) ;
    public final void rule__IDLSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1303:1: ( ( ( rule__IDLSpecification__ModulesAssignment_1 )* ) )
            // InternalIdl.g:1304:1: ( ( rule__IDLSpecification__ModulesAssignment_1 )* )
            {
            // InternalIdl.g:1304:1: ( ( rule__IDLSpecification__ModulesAssignment_1 )* )
            // InternalIdl.g:1305:2: ( rule__IDLSpecification__ModulesAssignment_1 )*
            {
             before(grammarAccess.getIDLSpecificationAccess().getModulesAssignment_1()); 
            // InternalIdl.g:1306:2: ( rule__IDLSpecification__ModulesAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29||(LA17_0>=63 && LA17_0<=64)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIdl.g:1306:3: rule__IDLSpecification__ModulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__IDLSpecification__ModulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getIDLSpecificationAccess().getModulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDLSpecification__Group__1__Impl"


    // $ANTLR start "rule__ImportDeclaration__Group__0"
    // InternalIdl.g:1315:1: rule__ImportDeclaration__Group__0 : rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 ;
    public final void rule__ImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1319:1: ( rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 )
            // InternalIdl.g:1320:2: rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ImportDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__0"


    // $ANTLR start "rule__ImportDeclaration__Group__0__Impl"
    // InternalIdl.g:1327:1: rule__ImportDeclaration__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1331:1: ( ( 'import' ) )
            // InternalIdl.g:1332:1: ( 'import' )
            {
            // InternalIdl.g:1332:1: ( 'import' )
            // InternalIdl.g:1333:2: 'import'
            {
             before(grammarAccess.getImportDeclarationAccess().getImportKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getImportDeclarationAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ImportDeclaration__Group__1"
    // InternalIdl.g:1342:1: rule__ImportDeclaration__Group__1 : rule__ImportDeclaration__Group__1__Impl ;
    public final void rule__ImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1346:1: ( rule__ImportDeclaration__Group__1__Impl )
            // InternalIdl.g:1347:2: rule__ImportDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__1"


    // $ANTLR start "rule__ImportDeclaration__Group__1__Impl"
    // InternalIdl.g:1353:1: rule__ImportDeclaration__Group__1__Impl : ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__ImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1357:1: ( ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) ) )
            // InternalIdl.g:1358:1: ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) )
            {
            // InternalIdl.g:1358:1: ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) )
            // InternalIdl.g:1359:2: ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportDeclarationAccess().getImportedNamespaceAssignment_1()); 
            // InternalIdl.g:1360:2: ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 )
            // InternalIdl.g:1360:3: rule__ImportDeclaration__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclarationAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__0"
    // InternalIdl.g:1369:1: rule__ModuleDeclaration__Group__0 : rule__ModuleDeclaration__Group__0__Impl rule__ModuleDeclaration__Group__1 ;
    public final void rule__ModuleDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1373:1: ( rule__ModuleDeclaration__Group__0__Impl rule__ModuleDeclaration__Group__1 )
            // InternalIdl.g:1374:2: rule__ModuleDeclaration__Group__0__Impl rule__ModuleDeclaration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ModuleDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__0"


    // $ANTLR start "rule__ModuleDeclaration__Group__0__Impl"
    // InternalIdl.g:1381:1: rule__ModuleDeclaration__Group__0__Impl : ( ( rule__ModuleDeclaration__VirtualAssignment_0 )? ) ;
    public final void rule__ModuleDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1385:1: ( ( ( rule__ModuleDeclaration__VirtualAssignment_0 )? ) )
            // InternalIdl.g:1386:1: ( ( rule__ModuleDeclaration__VirtualAssignment_0 )? )
            {
            // InternalIdl.g:1386:1: ( ( rule__ModuleDeclaration__VirtualAssignment_0 )? )
            // InternalIdl.g:1387:2: ( rule__ModuleDeclaration__VirtualAssignment_0 )?
            {
             before(grammarAccess.getModuleDeclarationAccess().getVirtualAssignment_0()); 
            // InternalIdl.g:1388:2: ( rule__ModuleDeclaration__VirtualAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==63) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIdl.g:1388:3: rule__ModuleDeclaration__VirtualAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModuleDeclaration__VirtualAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleDeclarationAccess().getVirtualAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__1"
    // InternalIdl.g:1396:1: rule__ModuleDeclaration__Group__1 : rule__ModuleDeclaration__Group__1__Impl rule__ModuleDeclaration__Group__2 ;
    public final void rule__ModuleDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1400:1: ( rule__ModuleDeclaration__Group__1__Impl rule__ModuleDeclaration__Group__2 )
            // InternalIdl.g:1401:2: rule__ModuleDeclaration__Group__1__Impl rule__ModuleDeclaration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ModuleDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__1"


    // $ANTLR start "rule__ModuleDeclaration__Group__1__Impl"
    // InternalIdl.g:1408:1: rule__ModuleDeclaration__Group__1__Impl : ( ( rule__ModuleDeclaration__MainAssignment_1 )? ) ;
    public final void rule__ModuleDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1412:1: ( ( ( rule__ModuleDeclaration__MainAssignment_1 )? ) )
            // InternalIdl.g:1413:1: ( ( rule__ModuleDeclaration__MainAssignment_1 )? )
            {
            // InternalIdl.g:1413:1: ( ( rule__ModuleDeclaration__MainAssignment_1 )? )
            // InternalIdl.g:1414:2: ( rule__ModuleDeclaration__MainAssignment_1 )?
            {
             before(grammarAccess.getModuleDeclarationAccess().getMainAssignment_1()); 
            // InternalIdl.g:1415:2: ( rule__ModuleDeclaration__MainAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==64) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIdl.g:1415:3: rule__ModuleDeclaration__MainAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModuleDeclaration__MainAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleDeclarationAccess().getMainAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__2"
    // InternalIdl.g:1423:1: rule__ModuleDeclaration__Group__2 : rule__ModuleDeclaration__Group__2__Impl rule__ModuleDeclaration__Group__3 ;
    public final void rule__ModuleDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1427:1: ( rule__ModuleDeclaration__Group__2__Impl rule__ModuleDeclaration__Group__3 )
            // InternalIdl.g:1428:2: rule__ModuleDeclaration__Group__2__Impl rule__ModuleDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ModuleDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__2"


    // $ANTLR start "rule__ModuleDeclaration__Group__2__Impl"
    // InternalIdl.g:1435:1: rule__ModuleDeclaration__Group__2__Impl : ( 'module' ) ;
    public final void rule__ModuleDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1439:1: ( ( 'module' ) )
            // InternalIdl.g:1440:1: ( 'module' )
            {
            // InternalIdl.g:1440:1: ( 'module' )
            // InternalIdl.g:1441:2: 'module'
            {
             before(grammarAccess.getModuleDeclarationAccess().getModuleKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getModuleDeclarationAccess().getModuleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__3"
    // InternalIdl.g:1450:1: rule__ModuleDeclaration__Group__3 : rule__ModuleDeclaration__Group__3__Impl rule__ModuleDeclaration__Group__4 ;
    public final void rule__ModuleDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1454:1: ( rule__ModuleDeclaration__Group__3__Impl rule__ModuleDeclaration__Group__4 )
            // InternalIdl.g:1455:2: rule__ModuleDeclaration__Group__3__Impl rule__ModuleDeclaration__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ModuleDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__3"


    // $ANTLR start "rule__ModuleDeclaration__Group__3__Impl"
    // InternalIdl.g:1462:1: rule__ModuleDeclaration__Group__3__Impl : ( ( rule__ModuleDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ModuleDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1466:1: ( ( ( rule__ModuleDeclaration__NameAssignment_3 ) ) )
            // InternalIdl.g:1467:1: ( ( rule__ModuleDeclaration__NameAssignment_3 ) )
            {
            // InternalIdl.g:1467:1: ( ( rule__ModuleDeclaration__NameAssignment_3 ) )
            // InternalIdl.g:1468:2: ( rule__ModuleDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getModuleDeclarationAccess().getNameAssignment_3()); 
            // InternalIdl.g:1469:2: ( rule__ModuleDeclaration__NameAssignment_3 )
            // InternalIdl.g:1469:3: rule__ModuleDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModuleDeclarationAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__4"
    // InternalIdl.g:1477:1: rule__ModuleDeclaration__Group__4 : rule__ModuleDeclaration__Group__4__Impl rule__ModuleDeclaration__Group__5 ;
    public final void rule__ModuleDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1481:1: ( rule__ModuleDeclaration__Group__4__Impl rule__ModuleDeclaration__Group__5 )
            // InternalIdl.g:1482:2: rule__ModuleDeclaration__Group__4__Impl rule__ModuleDeclaration__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ModuleDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__4"


    // $ANTLR start "rule__ModuleDeclaration__Group__4__Impl"
    // InternalIdl.g:1489:1: rule__ModuleDeclaration__Group__4__Impl : ( '{' ) ;
    public final void rule__ModuleDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1493:1: ( ( '{' ) )
            // InternalIdl.g:1494:1: ( '{' )
            {
            // InternalIdl.g:1494:1: ( '{' )
            // InternalIdl.g:1495:2: '{'
            {
             before(grammarAccess.getModuleDeclarationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getModuleDeclarationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__5"
    // InternalIdl.g:1504:1: rule__ModuleDeclaration__Group__5 : rule__ModuleDeclaration__Group__5__Impl rule__ModuleDeclaration__Group__6 ;
    public final void rule__ModuleDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1508:1: ( rule__ModuleDeclaration__Group__5__Impl rule__ModuleDeclaration__Group__6 )
            // InternalIdl.g:1509:2: rule__ModuleDeclaration__Group__5__Impl rule__ModuleDeclaration__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__ModuleDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__5"


    // $ANTLR start "rule__ModuleDeclaration__Group__5__Impl"
    // InternalIdl.g:1516:1: rule__ModuleDeclaration__Group__5__Impl : ( ( rule__ModuleDeclaration__ModuleComponentsAssignment_5 )* ) ;
    public final void rule__ModuleDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1520:1: ( ( ( rule__ModuleDeclaration__ModuleComponentsAssignment_5 )* ) )
            // InternalIdl.g:1521:1: ( ( rule__ModuleDeclaration__ModuleComponentsAssignment_5 )* )
            {
            // InternalIdl.g:1521:1: ( ( rule__ModuleDeclaration__ModuleComponentsAssignment_5 )* )
            // InternalIdl.g:1522:2: ( rule__ModuleDeclaration__ModuleComponentsAssignment_5 )*
            {
             before(grammarAccess.getModuleDeclarationAccess().getModuleComponentsAssignment_5()); 
            // InternalIdl.g:1523:2: ( rule__ModuleDeclaration__ModuleComponentsAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_SL_DOC_COMMENT && LA20_0<=RULE_ML_DOC_COMMENT)||LA20_0==33||(LA20_0>=36 && LA20_0<=37)||(LA20_0>=51 && LA20_0<=52)||LA20_0==67) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIdl.g:1523:3: rule__ModuleDeclaration__ModuleComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ModuleDeclaration__ModuleComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getModuleDeclarationAccess().getModuleComponentsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__6"
    // InternalIdl.g:1531:1: rule__ModuleDeclaration__Group__6 : rule__ModuleDeclaration__Group__6__Impl rule__ModuleDeclaration__Group__7 ;
    public final void rule__ModuleDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1535:1: ( rule__ModuleDeclaration__Group__6__Impl rule__ModuleDeclaration__Group__7 )
            // InternalIdl.g:1536:2: rule__ModuleDeclaration__Group__6__Impl rule__ModuleDeclaration__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__ModuleDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__6"


    // $ANTLR start "rule__ModuleDeclaration__Group__6__Impl"
    // InternalIdl.g:1543:1: rule__ModuleDeclaration__Group__6__Impl : ( ( rule__ModuleDeclaration__NestedModulesAssignment_6 )* ) ;
    public final void rule__ModuleDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1547:1: ( ( ( rule__ModuleDeclaration__NestedModulesAssignment_6 )* ) )
            // InternalIdl.g:1548:1: ( ( rule__ModuleDeclaration__NestedModulesAssignment_6 )* )
            {
            // InternalIdl.g:1548:1: ( ( rule__ModuleDeclaration__NestedModulesAssignment_6 )* )
            // InternalIdl.g:1549:2: ( rule__ModuleDeclaration__NestedModulesAssignment_6 )*
            {
             before(grammarAccess.getModuleDeclarationAccess().getNestedModulesAssignment_6()); 
            // InternalIdl.g:1550:2: ( rule__ModuleDeclaration__NestedModulesAssignment_6 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29||(LA21_0>=63 && LA21_0<=64)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIdl.g:1550:3: rule__ModuleDeclaration__NestedModulesAssignment_6
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ModuleDeclaration__NestedModulesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getModuleDeclarationAccess().getNestedModulesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__7"
    // InternalIdl.g:1558:1: rule__ModuleDeclaration__Group__7 : rule__ModuleDeclaration__Group__7__Impl ;
    public final void rule__ModuleDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1562:1: ( rule__ModuleDeclaration__Group__7__Impl )
            // InternalIdl.g:1563:2: rule__ModuleDeclaration__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleDeclaration__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__7"


    // $ANTLR start "rule__ModuleDeclaration__Group__7__Impl"
    // InternalIdl.g:1569:1: rule__ModuleDeclaration__Group__7__Impl : ( '}' ) ;
    public final void rule__ModuleDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1573:1: ( ( '}' ) )
            // InternalIdl.g:1574:1: ( '}' )
            {
            // InternalIdl.g:1574:1: ( '}' )
            // InternalIdl.g:1575:2: '}'
            {
             before(grammarAccess.getModuleDeclarationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getModuleDeclarationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__Group__7__Impl"


    // $ANTLR start "rule__AbstractModuleComponent__Group_0__0"
    // InternalIdl.g:1585:1: rule__AbstractModuleComponent__Group_0__0 : rule__AbstractModuleComponent__Group_0__0__Impl rule__AbstractModuleComponent__Group_0__1 ;
    public final void rule__AbstractModuleComponent__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1589:1: ( rule__AbstractModuleComponent__Group_0__0__Impl rule__AbstractModuleComponent__Group_0__1 )
            // InternalIdl.g:1590:2: rule__AbstractModuleComponent__Group_0__0__Impl rule__AbstractModuleComponent__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__AbstractModuleComponent__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractModuleComponent__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_0__0"


    // $ANTLR start "rule__AbstractModuleComponent__Group_0__0__Impl"
    // InternalIdl.g:1597:1: rule__AbstractModuleComponent__Group_0__0__Impl : ( ruleEnumDeclaration ) ;
    public final void rule__AbstractModuleComponent__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1601:1: ( ( ruleEnumDeclaration ) )
            // InternalIdl.g:1602:1: ( ruleEnumDeclaration )
            {
            // InternalIdl.g:1602:1: ( ruleEnumDeclaration )
            // InternalIdl.g:1603:2: ruleEnumDeclaration
            {
             before(grammarAccess.getAbstractModuleComponentAccess().getEnumDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumDeclaration();

            state._fsp--;

             after(grammarAccess.getAbstractModuleComponentAccess().getEnumDeclarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_0__0__Impl"


    // $ANTLR start "rule__AbstractModuleComponent__Group_0__1"
    // InternalIdl.g:1612:1: rule__AbstractModuleComponent__Group_0__1 : rule__AbstractModuleComponent__Group_0__1__Impl ;
    public final void rule__AbstractModuleComponent__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1616:1: ( rule__AbstractModuleComponent__Group_0__1__Impl )
            // InternalIdl.g:1617:2: rule__AbstractModuleComponent__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModuleComponent__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_0__1"


    // $ANTLR start "rule__AbstractModuleComponent__Group_0__1__Impl"
    // InternalIdl.g:1623:1: rule__AbstractModuleComponent__Group_0__1__Impl : ( ';' ) ;
    public final void rule__AbstractModuleComponent__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1627:1: ( ( ';' ) )
            // InternalIdl.g:1628:1: ( ';' )
            {
            // InternalIdl.g:1628:1: ( ';' )
            // InternalIdl.g:1629:2: ';'
            {
             before(grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_0_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_0__1__Impl"


    // $ANTLR start "rule__AbstractModuleComponent__Group_1__0"
    // InternalIdl.g:1639:1: rule__AbstractModuleComponent__Group_1__0 : rule__AbstractModuleComponent__Group_1__0__Impl rule__AbstractModuleComponent__Group_1__1 ;
    public final void rule__AbstractModuleComponent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1643:1: ( rule__AbstractModuleComponent__Group_1__0__Impl rule__AbstractModuleComponent__Group_1__1 )
            // InternalIdl.g:1644:2: rule__AbstractModuleComponent__Group_1__0__Impl rule__AbstractModuleComponent__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__AbstractModuleComponent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractModuleComponent__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_1__0"


    // $ANTLR start "rule__AbstractModuleComponent__Group_1__0__Impl"
    // InternalIdl.g:1651:1: rule__AbstractModuleComponent__Group_1__0__Impl : ( ruleStructDeclaration ) ;
    public final void rule__AbstractModuleComponent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1655:1: ( ( ruleStructDeclaration ) )
            // InternalIdl.g:1656:1: ( ruleStructDeclaration )
            {
            // InternalIdl.g:1656:1: ( ruleStructDeclaration )
            // InternalIdl.g:1657:2: ruleStructDeclaration
            {
             before(grammarAccess.getAbstractModuleComponentAccess().getStructDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStructDeclaration();

            state._fsp--;

             after(grammarAccess.getAbstractModuleComponentAccess().getStructDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_1__0__Impl"


    // $ANTLR start "rule__AbstractModuleComponent__Group_1__1"
    // InternalIdl.g:1666:1: rule__AbstractModuleComponent__Group_1__1 : rule__AbstractModuleComponent__Group_1__1__Impl ;
    public final void rule__AbstractModuleComponent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1670:1: ( rule__AbstractModuleComponent__Group_1__1__Impl )
            // InternalIdl.g:1671:2: rule__AbstractModuleComponent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModuleComponent__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_1__1"


    // $ANTLR start "rule__AbstractModuleComponent__Group_1__1__Impl"
    // InternalIdl.g:1677:1: rule__AbstractModuleComponent__Group_1__1__Impl : ( ';' ) ;
    public final void rule__AbstractModuleComponent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1681:1: ( ( ';' ) )
            // InternalIdl.g:1682:1: ( ';' )
            {
            // InternalIdl.g:1682:1: ( ';' )
            // InternalIdl.g:1683:2: ';'
            {
             before(grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_1__1__Impl"


    // $ANTLR start "rule__AbstractModuleComponent__Group_2__0"
    // InternalIdl.g:1693:1: rule__AbstractModuleComponent__Group_2__0 : rule__AbstractModuleComponent__Group_2__0__Impl rule__AbstractModuleComponent__Group_2__1 ;
    public final void rule__AbstractModuleComponent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1697:1: ( rule__AbstractModuleComponent__Group_2__0__Impl rule__AbstractModuleComponent__Group_2__1 )
            // InternalIdl.g:1698:2: rule__AbstractModuleComponent__Group_2__0__Impl rule__AbstractModuleComponent__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__AbstractModuleComponent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractModuleComponent__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_2__0"


    // $ANTLR start "rule__AbstractModuleComponent__Group_2__0__Impl"
    // InternalIdl.g:1705:1: rule__AbstractModuleComponent__Group_2__0__Impl : ( ruleAbstractException ) ;
    public final void rule__AbstractModuleComponent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1709:1: ( ( ruleAbstractException ) )
            // InternalIdl.g:1710:1: ( ruleAbstractException )
            {
            // InternalIdl.g:1710:1: ( ruleAbstractException )
            // InternalIdl.g:1711:2: ruleAbstractException
            {
             before(grammarAccess.getAbstractModuleComponentAccess().getAbstractExceptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractException();

            state._fsp--;

             after(grammarAccess.getAbstractModuleComponentAccess().getAbstractExceptionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_2__0__Impl"


    // $ANTLR start "rule__AbstractModuleComponent__Group_2__1"
    // InternalIdl.g:1720:1: rule__AbstractModuleComponent__Group_2__1 : rule__AbstractModuleComponent__Group_2__1__Impl ;
    public final void rule__AbstractModuleComponent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1724:1: ( rule__AbstractModuleComponent__Group_2__1__Impl )
            // InternalIdl.g:1725:2: rule__AbstractModuleComponent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModuleComponent__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_2__1"


    // $ANTLR start "rule__AbstractModuleComponent__Group_2__1__Impl"
    // InternalIdl.g:1731:1: rule__AbstractModuleComponent__Group_2__1__Impl : ( ';' ) ;
    public final void rule__AbstractModuleComponent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1735:1: ( ( ';' ) )
            // InternalIdl.g:1736:1: ( ';' )
            {
            // InternalIdl.g:1736:1: ( ';' )
            // InternalIdl.g:1737:2: ';'
            {
             before(grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_2_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_2__1__Impl"


    // $ANTLR start "rule__AbstractModuleComponent__Group_3__0"
    // InternalIdl.g:1747:1: rule__AbstractModuleComponent__Group_3__0 : rule__AbstractModuleComponent__Group_3__0__Impl rule__AbstractModuleComponent__Group_3__1 ;
    public final void rule__AbstractModuleComponent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1751:1: ( rule__AbstractModuleComponent__Group_3__0__Impl rule__AbstractModuleComponent__Group_3__1 )
            // InternalIdl.g:1752:2: rule__AbstractModuleComponent__Group_3__0__Impl rule__AbstractModuleComponent__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__AbstractModuleComponent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractModuleComponent__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_3__0"


    // $ANTLR start "rule__AbstractModuleComponent__Group_3__0__Impl"
    // InternalIdl.g:1759:1: rule__AbstractModuleComponent__Group_3__0__Impl : ( ruleInterfaceDeclaration ) ;
    public final void rule__AbstractModuleComponent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1763:1: ( ( ruleInterfaceDeclaration ) )
            // InternalIdl.g:1764:1: ( ruleInterfaceDeclaration )
            {
            // InternalIdl.g:1764:1: ( ruleInterfaceDeclaration )
            // InternalIdl.g:1765:2: ruleInterfaceDeclaration
            {
             before(grammarAccess.getAbstractModuleComponentAccess().getInterfaceDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInterfaceDeclaration();

            state._fsp--;

             after(grammarAccess.getAbstractModuleComponentAccess().getInterfaceDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_3__0__Impl"


    // $ANTLR start "rule__AbstractModuleComponent__Group_3__1"
    // InternalIdl.g:1774:1: rule__AbstractModuleComponent__Group_3__1 : rule__AbstractModuleComponent__Group_3__1__Impl ;
    public final void rule__AbstractModuleComponent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1778:1: ( rule__AbstractModuleComponent__Group_3__1__Impl )
            // InternalIdl.g:1779:2: rule__AbstractModuleComponent__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModuleComponent__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_3__1"


    // $ANTLR start "rule__AbstractModuleComponent__Group_3__1__Impl"
    // InternalIdl.g:1785:1: rule__AbstractModuleComponent__Group_3__1__Impl : ( ';' ) ;
    public final void rule__AbstractModuleComponent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1789:1: ( ( ';' ) )
            // InternalIdl.g:1790:1: ( ';' )
            {
            // InternalIdl.g:1790:1: ( ';' )
            // InternalIdl.g:1791:2: ';'
            {
             before(grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_3_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_3__1__Impl"


    // $ANTLR start "rule__AbstractModuleComponent__Group_4__0"
    // InternalIdl.g:1801:1: rule__AbstractModuleComponent__Group_4__0 : rule__AbstractModuleComponent__Group_4__0__Impl rule__AbstractModuleComponent__Group_4__1 ;
    public final void rule__AbstractModuleComponent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1805:1: ( rule__AbstractModuleComponent__Group_4__0__Impl rule__AbstractModuleComponent__Group_4__1 )
            // InternalIdl.g:1806:2: rule__AbstractModuleComponent__Group_4__0__Impl rule__AbstractModuleComponent__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__AbstractModuleComponent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractModuleComponent__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_4__0"


    // $ANTLR start "rule__AbstractModuleComponent__Group_4__0__Impl"
    // InternalIdl.g:1813:1: rule__AbstractModuleComponent__Group_4__0__Impl : ( ruleAliasDeclaration ) ;
    public final void rule__AbstractModuleComponent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1817:1: ( ( ruleAliasDeclaration ) )
            // InternalIdl.g:1818:1: ( ruleAliasDeclaration )
            {
            // InternalIdl.g:1818:1: ( ruleAliasDeclaration )
            // InternalIdl.g:1819:2: ruleAliasDeclaration
            {
             before(grammarAccess.getAbstractModuleComponentAccess().getAliasDeclarationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAliasDeclaration();

            state._fsp--;

             after(grammarAccess.getAbstractModuleComponentAccess().getAliasDeclarationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_4__0__Impl"


    // $ANTLR start "rule__AbstractModuleComponent__Group_4__1"
    // InternalIdl.g:1828:1: rule__AbstractModuleComponent__Group_4__1 : rule__AbstractModuleComponent__Group_4__1__Impl ;
    public final void rule__AbstractModuleComponent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1832:1: ( rule__AbstractModuleComponent__Group_4__1__Impl )
            // InternalIdl.g:1833:2: rule__AbstractModuleComponent__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModuleComponent__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_4__1"


    // $ANTLR start "rule__AbstractModuleComponent__Group_4__1__Impl"
    // InternalIdl.g:1839:1: rule__AbstractModuleComponent__Group_4__1__Impl : ( ';' ) ;
    public final void rule__AbstractModuleComponent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1843:1: ( ( ';' ) )
            // InternalIdl.g:1844:1: ( ';' )
            {
            // InternalIdl.g:1844:1: ( ';' )
            // InternalIdl.g:1845:2: ';'
            {
             before(grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_4_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModuleComponent__Group_4__1__Impl"


    // $ANTLR start "rule__ExceptionReferenceDeclaration__Group__0"
    // InternalIdl.g:1855:1: rule__ExceptionReferenceDeclaration__Group__0 : rule__ExceptionReferenceDeclaration__Group__0__Impl rule__ExceptionReferenceDeclaration__Group__1 ;
    public final void rule__ExceptionReferenceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1859:1: ( rule__ExceptionReferenceDeclaration__Group__0__Impl rule__ExceptionReferenceDeclaration__Group__1 )
            // InternalIdl.g:1860:2: rule__ExceptionReferenceDeclaration__Group__0__Impl rule__ExceptionReferenceDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ExceptionReferenceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionReferenceDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionReferenceDeclaration__Group__0"


    // $ANTLR start "rule__ExceptionReferenceDeclaration__Group__0__Impl"
    // InternalIdl.g:1867:1: rule__ExceptionReferenceDeclaration__Group__0__Impl : ( 'exception' ) ;
    public final void rule__ExceptionReferenceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1871:1: ( ( 'exception' ) )
            // InternalIdl.g:1872:1: ( 'exception' )
            {
            // InternalIdl.g:1872:1: ( 'exception' )
            // InternalIdl.g:1873:2: 'exception'
            {
             before(grammarAccess.getExceptionReferenceDeclarationAccess().getExceptionKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExceptionReferenceDeclarationAccess().getExceptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionReferenceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ExceptionReferenceDeclaration__Group__1"
    // InternalIdl.g:1882:1: rule__ExceptionReferenceDeclaration__Group__1 : rule__ExceptionReferenceDeclaration__Group__1__Impl rule__ExceptionReferenceDeclaration__Group__2 ;
    public final void rule__ExceptionReferenceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1886:1: ( rule__ExceptionReferenceDeclaration__Group__1__Impl rule__ExceptionReferenceDeclaration__Group__2 )
            // InternalIdl.g:1887:2: rule__ExceptionReferenceDeclaration__Group__1__Impl rule__ExceptionReferenceDeclaration__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ExceptionReferenceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionReferenceDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionReferenceDeclaration__Group__1"


    // $ANTLR start "rule__ExceptionReferenceDeclaration__Group__1__Impl"
    // InternalIdl.g:1894:1: rule__ExceptionReferenceDeclaration__Group__1__Impl : ( ( rule__ExceptionReferenceDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ExceptionReferenceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1898:1: ( ( ( rule__ExceptionReferenceDeclaration__NameAssignment_1 ) ) )
            // InternalIdl.g:1899:1: ( ( rule__ExceptionReferenceDeclaration__NameAssignment_1 ) )
            {
            // InternalIdl.g:1899:1: ( ( rule__ExceptionReferenceDeclaration__NameAssignment_1 ) )
            // InternalIdl.g:1900:2: ( rule__ExceptionReferenceDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionReferenceDeclarationAccess().getNameAssignment_1()); 
            // InternalIdl.g:1901:2: ( rule__ExceptionReferenceDeclaration__NameAssignment_1 )
            // InternalIdl.g:1901:3: rule__ExceptionReferenceDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionReferenceDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExceptionReferenceDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionReferenceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ExceptionReferenceDeclaration__Group__2"
    // InternalIdl.g:1909:1: rule__ExceptionReferenceDeclaration__Group__2 : rule__ExceptionReferenceDeclaration__Group__2__Impl rule__ExceptionReferenceDeclaration__Group__3 ;
    public final void rule__ExceptionReferenceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1913:1: ( rule__ExceptionReferenceDeclaration__Group__2__Impl rule__ExceptionReferenceDeclaration__Group__3 )
            // InternalIdl.g:1914:2: rule__ExceptionReferenceDeclaration__Group__2__Impl rule__ExceptionReferenceDeclaration__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ExceptionReferenceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionReferenceDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionReferenceDeclaration__Group__2"


    // $ANTLR start "rule__ExceptionReferenceDeclaration__Group__2__Impl"
    // InternalIdl.g:1921:1: rule__ExceptionReferenceDeclaration__Group__2__Impl : ( 'ref' ) ;
    public final void rule__ExceptionReferenceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1925:1: ( ( 'ref' ) )
            // InternalIdl.g:1926:1: ( 'ref' )
            {
            // InternalIdl.g:1926:1: ( 'ref' )
            // InternalIdl.g:1927:2: 'ref'
            {
             before(grammarAccess.getExceptionReferenceDeclarationAccess().getRefKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExceptionReferenceDeclarationAccess().getRefKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionReferenceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ExceptionReferenceDeclaration__Group__3"
    // InternalIdl.g:1936:1: rule__ExceptionReferenceDeclaration__Group__3 : rule__ExceptionReferenceDeclaration__Group__3__Impl ;
    public final void rule__ExceptionReferenceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1940:1: ( rule__ExceptionReferenceDeclaration__Group__3__Impl )
            // InternalIdl.g:1941:2: rule__ExceptionReferenceDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionReferenceDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionReferenceDeclaration__Group__3"


    // $ANTLR start "rule__ExceptionReferenceDeclaration__Group__3__Impl"
    // InternalIdl.g:1947:1: rule__ExceptionReferenceDeclaration__Group__3__Impl : ( ( rule__ExceptionReferenceDeclaration__LocationAssignment_3 ) ) ;
    public final void rule__ExceptionReferenceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1951:1: ( ( ( rule__ExceptionReferenceDeclaration__LocationAssignment_3 ) ) )
            // InternalIdl.g:1952:1: ( ( rule__ExceptionReferenceDeclaration__LocationAssignment_3 ) )
            {
            // InternalIdl.g:1952:1: ( ( rule__ExceptionReferenceDeclaration__LocationAssignment_3 ) )
            // InternalIdl.g:1953:2: ( rule__ExceptionReferenceDeclaration__LocationAssignment_3 )
            {
             before(grammarAccess.getExceptionReferenceDeclarationAccess().getLocationAssignment_3()); 
            // InternalIdl.g:1954:2: ( rule__ExceptionReferenceDeclaration__LocationAssignment_3 )
            // InternalIdl.g:1954:3: rule__ExceptionReferenceDeclaration__LocationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionReferenceDeclaration__LocationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExceptionReferenceDeclarationAccess().getLocationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionReferenceDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group__0"
    // InternalIdl.g:1963:1: rule__ExceptionDeclaration__Group__0 : rule__ExceptionDeclaration__Group__0__Impl rule__ExceptionDeclaration__Group__1 ;
    public final void rule__ExceptionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1967:1: ( rule__ExceptionDeclaration__Group__0__Impl rule__ExceptionDeclaration__Group__1 )
            // InternalIdl.g:1968:2: rule__ExceptionDeclaration__Group__0__Impl rule__ExceptionDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ExceptionDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__0"


    // $ANTLR start "rule__ExceptionDeclaration__Group__0__Impl"
    // InternalIdl.g:1975:1: rule__ExceptionDeclaration__Group__0__Impl : ( 'exception' ) ;
    public final void rule__ExceptionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1979:1: ( ( 'exception' ) )
            // InternalIdl.g:1980:1: ( 'exception' )
            {
            // InternalIdl.g:1980:1: ( 'exception' )
            // InternalIdl.g:1981:2: 'exception'
            {
             before(grammarAccess.getExceptionDeclarationAccess().getExceptionKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclarationAccess().getExceptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group__1"
    // InternalIdl.g:1990:1: rule__ExceptionDeclaration__Group__1 : rule__ExceptionDeclaration__Group__1__Impl rule__ExceptionDeclaration__Group__2 ;
    public final void rule__ExceptionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:1994:1: ( rule__ExceptionDeclaration__Group__1__Impl rule__ExceptionDeclaration__Group__2 )
            // InternalIdl.g:1995:2: rule__ExceptionDeclaration__Group__1__Impl rule__ExceptionDeclaration__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ExceptionDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__1"


    // $ANTLR start "rule__ExceptionDeclaration__Group__1__Impl"
    // InternalIdl.g:2002:1: rule__ExceptionDeclaration__Group__1__Impl : ( ( rule__ExceptionDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ExceptionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2006:1: ( ( ( rule__ExceptionDeclaration__NameAssignment_1 ) ) )
            // InternalIdl.g:2007:1: ( ( rule__ExceptionDeclaration__NameAssignment_1 ) )
            {
            // InternalIdl.g:2007:1: ( ( rule__ExceptionDeclaration__NameAssignment_1 ) )
            // InternalIdl.g:2008:2: ( rule__ExceptionDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getNameAssignment_1()); 
            // InternalIdl.g:2009:2: ( rule__ExceptionDeclaration__NameAssignment_1 )
            // InternalIdl.g:2009:3: rule__ExceptionDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group__2"
    // InternalIdl.g:2017:1: rule__ExceptionDeclaration__Group__2 : rule__ExceptionDeclaration__Group__2__Impl rule__ExceptionDeclaration__Group__3 ;
    public final void rule__ExceptionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2021:1: ( rule__ExceptionDeclaration__Group__2__Impl rule__ExceptionDeclaration__Group__3 )
            // InternalIdl.g:2022:2: rule__ExceptionDeclaration__Group__2__Impl rule__ExceptionDeclaration__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ExceptionDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__2"


    // $ANTLR start "rule__ExceptionDeclaration__Group__2__Impl"
    // InternalIdl.g:2029:1: rule__ExceptionDeclaration__Group__2__Impl : ( ( rule__ExceptionDeclaration__Group_2__0 )? ) ;
    public final void rule__ExceptionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2033:1: ( ( ( rule__ExceptionDeclaration__Group_2__0 )? ) )
            // InternalIdl.g:2034:1: ( ( rule__ExceptionDeclaration__Group_2__0 )? )
            {
            // InternalIdl.g:2034:1: ( ( rule__ExceptionDeclaration__Group_2__0 )? )
            // InternalIdl.g:2035:2: ( rule__ExceptionDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getExceptionDeclarationAccess().getGroup_2()); 
            // InternalIdl.g:2036:2: ( rule__ExceptionDeclaration__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalIdl.g:2036:3: rule__ExceptionDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExceptionDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExceptionDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group__3"
    // InternalIdl.g:2044:1: rule__ExceptionDeclaration__Group__3 : rule__ExceptionDeclaration__Group__3__Impl rule__ExceptionDeclaration__Group__4 ;
    public final void rule__ExceptionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2048:1: ( rule__ExceptionDeclaration__Group__3__Impl rule__ExceptionDeclaration__Group__4 )
            // InternalIdl.g:2049:2: rule__ExceptionDeclaration__Group__3__Impl rule__ExceptionDeclaration__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ExceptionDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__3"


    // $ANTLR start "rule__ExceptionDeclaration__Group__3__Impl"
    // InternalIdl.g:2056:1: rule__ExceptionDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__ExceptionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2060:1: ( ( '{' ) )
            // InternalIdl.g:2061:1: ( '{' )
            {
            // InternalIdl.g:2061:1: ( '{' )
            // InternalIdl.g:2062:2: '{'
            {
             before(grammarAccess.getExceptionDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group__4"
    // InternalIdl.g:2071:1: rule__ExceptionDeclaration__Group__4 : rule__ExceptionDeclaration__Group__4__Impl rule__ExceptionDeclaration__Group__5 ;
    public final void rule__ExceptionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2075:1: ( rule__ExceptionDeclaration__Group__4__Impl rule__ExceptionDeclaration__Group__5 )
            // InternalIdl.g:2076:2: rule__ExceptionDeclaration__Group__4__Impl rule__ExceptionDeclaration__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ExceptionDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__4"


    // $ANTLR start "rule__ExceptionDeclaration__Group__4__Impl"
    // InternalIdl.g:2083:1: rule__ExceptionDeclaration__Group__4__Impl : ( ( rule__ExceptionDeclaration__Group_4__0 )* ) ;
    public final void rule__ExceptionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2087:1: ( ( ( rule__ExceptionDeclaration__Group_4__0 )* ) )
            // InternalIdl.g:2088:1: ( ( rule__ExceptionDeclaration__Group_4__0 )* )
            {
            // InternalIdl.g:2088:1: ( ( rule__ExceptionDeclaration__Group_4__0 )* )
            // InternalIdl.g:2089:2: ( rule__ExceptionDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getExceptionDeclarationAccess().getGroup_4()); 
            // InternalIdl.g:2090:2: ( rule__ExceptionDeclaration__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_BYTE && LA23_0<=RULE_ID)||(LA23_0>=RULE_STRINGTYPE && LA23_0<=RULE_BOOLEAN)||LA23_0==39||LA23_0==50||LA23_0==66) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalIdl.g:2090:3: rule__ExceptionDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ExceptionDeclaration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getExceptionDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group__5"
    // InternalIdl.g:2098:1: rule__ExceptionDeclaration__Group__5 : rule__ExceptionDeclaration__Group__5__Impl ;
    public final void rule__ExceptionDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2102:1: ( rule__ExceptionDeclaration__Group__5__Impl )
            // InternalIdl.g:2103:2: rule__ExceptionDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__5"


    // $ANTLR start "rule__ExceptionDeclaration__Group__5__Impl"
    // InternalIdl.g:2109:1: rule__ExceptionDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__ExceptionDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2113:1: ( ( '}' ) )
            // InternalIdl.g:2114:1: ( '}' )
            {
            // InternalIdl.g:2114:1: ( '}' )
            // InternalIdl.g:2115:2: '}'
            {
             before(grammarAccess.getExceptionDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group_2__0"
    // InternalIdl.g:2125:1: rule__ExceptionDeclaration__Group_2__0 : rule__ExceptionDeclaration__Group_2__0__Impl rule__ExceptionDeclaration__Group_2__1 ;
    public final void rule__ExceptionDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2129:1: ( rule__ExceptionDeclaration__Group_2__0__Impl rule__ExceptionDeclaration__Group_2__1 )
            // InternalIdl.g:2130:2: rule__ExceptionDeclaration__Group_2__0__Impl rule__ExceptionDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ExceptionDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group_2__0"


    // $ANTLR start "rule__ExceptionDeclaration__Group_2__0__Impl"
    // InternalIdl.g:2137:1: rule__ExceptionDeclaration__Group_2__0__Impl : ( ':' ) ;
    public final void rule__ExceptionDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2141:1: ( ( ':' ) )
            // InternalIdl.g:2142:1: ( ':' )
            {
            // InternalIdl.g:2142:1: ( ':' )
            // InternalIdl.g:2143:2: ':'
            {
             before(grammarAccess.getExceptionDeclarationAccess().getColonKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclarationAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group_2__1"
    // InternalIdl.g:2152:1: rule__ExceptionDeclaration__Group_2__1 : rule__ExceptionDeclaration__Group_2__1__Impl ;
    public final void rule__ExceptionDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2156:1: ( rule__ExceptionDeclaration__Group_2__1__Impl )
            // InternalIdl.g:2157:2: rule__ExceptionDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group_2__1"


    // $ANTLR start "rule__ExceptionDeclaration__Group_2__1__Impl"
    // InternalIdl.g:2163:1: rule__ExceptionDeclaration__Group_2__1__Impl : ( ( rule__ExceptionDeclaration__SupertypeAssignment_2_1 ) ) ;
    public final void rule__ExceptionDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2167:1: ( ( ( rule__ExceptionDeclaration__SupertypeAssignment_2_1 ) ) )
            // InternalIdl.g:2168:1: ( ( rule__ExceptionDeclaration__SupertypeAssignment_2_1 ) )
            {
            // InternalIdl.g:2168:1: ( ( rule__ExceptionDeclaration__SupertypeAssignment_2_1 ) )
            // InternalIdl.g:2169:2: ( rule__ExceptionDeclaration__SupertypeAssignment_2_1 )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getSupertypeAssignment_2_1()); 
            // InternalIdl.g:2170:2: ( rule__ExceptionDeclaration__SupertypeAssignment_2_1 )
            // InternalIdl.g:2170:3: rule__ExceptionDeclaration__SupertypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__SupertypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclarationAccess().getSupertypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group_4__0"
    // InternalIdl.g:2179:1: rule__ExceptionDeclaration__Group_4__0 : rule__ExceptionDeclaration__Group_4__0__Impl rule__ExceptionDeclaration__Group_4__1 ;
    public final void rule__ExceptionDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2183:1: ( rule__ExceptionDeclaration__Group_4__0__Impl rule__ExceptionDeclaration__Group_4__1 )
            // InternalIdl.g:2184:2: rule__ExceptionDeclaration__Group_4__0__Impl rule__ExceptionDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__ExceptionDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group_4__0"


    // $ANTLR start "rule__ExceptionDeclaration__Group_4__0__Impl"
    // InternalIdl.g:2191:1: rule__ExceptionDeclaration__Group_4__0__Impl : ( ( rule__ExceptionDeclaration__MembersAssignment_4_0 ) ) ;
    public final void rule__ExceptionDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2195:1: ( ( ( rule__ExceptionDeclaration__MembersAssignment_4_0 ) ) )
            // InternalIdl.g:2196:1: ( ( rule__ExceptionDeclaration__MembersAssignment_4_0 ) )
            {
            // InternalIdl.g:2196:1: ( ( rule__ExceptionDeclaration__MembersAssignment_4_0 ) )
            // InternalIdl.g:2197:2: ( rule__ExceptionDeclaration__MembersAssignment_4_0 )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getMembersAssignment_4_0()); 
            // InternalIdl.g:2198:2: ( rule__ExceptionDeclaration__MembersAssignment_4_0 )
            // InternalIdl.g:2198:3: rule__ExceptionDeclaration__MembersAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__MembersAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclarationAccess().getMembersAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group_4__1"
    // InternalIdl.g:2206:1: rule__ExceptionDeclaration__Group_4__1 : rule__ExceptionDeclaration__Group_4__1__Impl ;
    public final void rule__ExceptionDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2210:1: ( rule__ExceptionDeclaration__Group_4__1__Impl )
            // InternalIdl.g:2211:2: rule__ExceptionDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDeclaration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group_4__1"


    // $ANTLR start "rule__ExceptionDeclaration__Group_4__1__Impl"
    // InternalIdl.g:2217:1: rule__ExceptionDeclaration__Group_4__1__Impl : ( ';' ) ;
    public final void rule__ExceptionDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2221:1: ( ( ';' ) )
            // InternalIdl.g:2222:1: ( ';' )
            {
            // InternalIdl.g:2222:1: ( ';' )
            // InternalIdl.g:2223:2: ';'
            {
             before(grammarAccess.getExceptionDeclarationAccess().getSemicolonKeyword_4_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclarationAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__AliasDeclaration__Group__0"
    // InternalIdl.g:2233:1: rule__AliasDeclaration__Group__0 : rule__AliasDeclaration__Group__0__Impl rule__AliasDeclaration__Group__1 ;
    public final void rule__AliasDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2237:1: ( rule__AliasDeclaration__Group__0__Impl rule__AliasDeclaration__Group__1 )
            // InternalIdl.g:2238:2: rule__AliasDeclaration__Group__0__Impl rule__AliasDeclaration__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AliasDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDeclaration__Group__0"


    // $ANTLR start "rule__AliasDeclaration__Group__0__Impl"
    // InternalIdl.g:2245:1: rule__AliasDeclaration__Group__0__Impl : ( 'typedef' ) ;
    public final void rule__AliasDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2249:1: ( ( 'typedef' ) )
            // InternalIdl.g:2250:1: ( 'typedef' )
            {
            // InternalIdl.g:2250:1: ( 'typedef' )
            // InternalIdl.g:2251:2: 'typedef'
            {
             before(grammarAccess.getAliasDeclarationAccess().getTypedefKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAliasDeclarationAccess().getTypedefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDeclaration__Group__0__Impl"


    // $ANTLR start "rule__AliasDeclaration__Group__1"
    // InternalIdl.g:2260:1: rule__AliasDeclaration__Group__1 : rule__AliasDeclaration__Group__1__Impl rule__AliasDeclaration__Group__2 ;
    public final void rule__AliasDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2264:1: ( rule__AliasDeclaration__Group__1__Impl rule__AliasDeclaration__Group__2 )
            // InternalIdl.g:2265:2: rule__AliasDeclaration__Group__1__Impl rule__AliasDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AliasDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDeclaration__Group__1"


    // $ANTLR start "rule__AliasDeclaration__Group__1__Impl"
    // InternalIdl.g:2272:1: rule__AliasDeclaration__Group__1__Impl : ( ( rule__AliasDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__AliasDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2276:1: ( ( ( rule__AliasDeclaration__TypeAssignment_1 ) ) )
            // InternalIdl.g:2277:1: ( ( rule__AliasDeclaration__TypeAssignment_1 ) )
            {
            // InternalIdl.g:2277:1: ( ( rule__AliasDeclaration__TypeAssignment_1 ) )
            // InternalIdl.g:2278:2: ( rule__AliasDeclaration__TypeAssignment_1 )
            {
             before(grammarAccess.getAliasDeclarationAccess().getTypeAssignment_1()); 
            // InternalIdl.g:2279:2: ( rule__AliasDeclaration__TypeAssignment_1 )
            // InternalIdl.g:2279:3: rule__AliasDeclaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AliasDeclaration__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAliasDeclarationAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDeclaration__Group__1__Impl"


    // $ANTLR start "rule__AliasDeclaration__Group__2"
    // InternalIdl.g:2287:1: rule__AliasDeclaration__Group__2 : rule__AliasDeclaration__Group__2__Impl ;
    public final void rule__AliasDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2291:1: ( rule__AliasDeclaration__Group__2__Impl )
            // InternalIdl.g:2292:2: rule__AliasDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AliasDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDeclaration__Group__2"


    // $ANTLR start "rule__AliasDeclaration__Group__2__Impl"
    // InternalIdl.g:2298:1: rule__AliasDeclaration__Group__2__Impl : ( ( rule__AliasDeclaration__NameAssignment_2 ) ) ;
    public final void rule__AliasDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2302:1: ( ( ( rule__AliasDeclaration__NameAssignment_2 ) ) )
            // InternalIdl.g:2303:1: ( ( rule__AliasDeclaration__NameAssignment_2 ) )
            {
            // InternalIdl.g:2303:1: ( ( rule__AliasDeclaration__NameAssignment_2 ) )
            // InternalIdl.g:2304:2: ( rule__AliasDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getAliasDeclarationAccess().getNameAssignment_2()); 
            // InternalIdl.g:2305:2: ( rule__AliasDeclaration__NameAssignment_2 )
            // InternalIdl.g:2305:3: rule__AliasDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AliasDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAliasDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__0"
    // InternalIdl.g:2314:1: rule__EnumDeclaration__Group__0 : rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 ;
    public final void rule__EnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2318:1: ( rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 )
            // InternalIdl.g:2319:2: rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__EnumDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__0"


    // $ANTLR start "rule__EnumDeclaration__Group__0__Impl"
    // InternalIdl.g:2326:1: rule__EnumDeclaration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2330:1: ( ( 'enum' ) )
            // InternalIdl.g:2331:1: ( 'enum' )
            {
            // InternalIdl.g:2331:1: ( 'enum' )
            // InternalIdl.g:2332:2: 'enum'
            {
             before(grammarAccess.getEnumDeclarationAccess().getEnumKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__1"
    // InternalIdl.g:2341:1: rule__EnumDeclaration__Group__1 : rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 ;
    public final void rule__EnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2345:1: ( rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 )
            // InternalIdl.g:2346:2: rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__EnumDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__1"


    // $ANTLR start "rule__EnumDeclaration__Group__1__Impl"
    // InternalIdl.g:2353:1: rule__EnumDeclaration__Group__1__Impl : ( ( rule__EnumDeclaration__NameAssignment_1 ) ) ;
    public final void rule__EnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2357:1: ( ( ( rule__EnumDeclaration__NameAssignment_1 ) ) )
            // InternalIdl.g:2358:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            {
            // InternalIdl.g:2358:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            // InternalIdl.g:2359:2: ( rule__EnumDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 
            // InternalIdl.g:2360:2: ( rule__EnumDeclaration__NameAssignment_1 )
            // InternalIdl.g:2360:3: rule__EnumDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__2"
    // InternalIdl.g:2368:1: rule__EnumDeclaration__Group__2 : rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 ;
    public final void rule__EnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2372:1: ( rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 )
            // InternalIdl.g:2373:2: rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__EnumDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__2"


    // $ANTLR start "rule__EnumDeclaration__Group__2__Impl"
    // InternalIdl.g:2380:1: rule__EnumDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2384:1: ( ( '{' ) )
            // InternalIdl.g:2385:1: ( '{' )
            {
            // InternalIdl.g:2385:1: ( '{' )
            // InternalIdl.g:2386:2: '{'
            {
             before(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__3"
    // InternalIdl.g:2395:1: rule__EnumDeclaration__Group__3 : rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 ;
    public final void rule__EnumDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2399:1: ( rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 )
            // InternalIdl.g:2400:2: rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__EnumDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__3"


    // $ANTLR start "rule__EnumDeclaration__Group__3__Impl"
    // InternalIdl.g:2407:1: rule__EnumDeclaration__Group__3__Impl : ( ( rule__EnumDeclaration__ContainedIdentifiersAssignment_3 ) ) ;
    public final void rule__EnumDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2411:1: ( ( ( rule__EnumDeclaration__ContainedIdentifiersAssignment_3 ) ) )
            // InternalIdl.g:2412:1: ( ( rule__EnumDeclaration__ContainedIdentifiersAssignment_3 ) )
            {
            // InternalIdl.g:2412:1: ( ( rule__EnumDeclaration__ContainedIdentifiersAssignment_3 ) )
            // InternalIdl.g:2413:2: ( rule__EnumDeclaration__ContainedIdentifiersAssignment_3 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getContainedIdentifiersAssignment_3()); 
            // InternalIdl.g:2414:2: ( rule__EnumDeclaration__ContainedIdentifiersAssignment_3 )
            // InternalIdl.g:2414:3: rule__EnumDeclaration__ContainedIdentifiersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__ContainedIdentifiersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getContainedIdentifiersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__4"
    // InternalIdl.g:2422:1: rule__EnumDeclaration__Group__4 : rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 ;
    public final void rule__EnumDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2426:1: ( rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 )
            // InternalIdl.g:2427:2: rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__EnumDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__4"


    // $ANTLR start "rule__EnumDeclaration__Group__4__Impl"
    // InternalIdl.g:2434:1: rule__EnumDeclaration__Group__4__Impl : ( ( rule__EnumDeclaration__Group_4__0 )* ) ;
    public final void rule__EnumDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2438:1: ( ( ( rule__EnumDeclaration__Group_4__0 )* ) )
            // InternalIdl.g:2439:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            {
            // InternalIdl.g:2439:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            // InternalIdl.g:2440:2: ( rule__EnumDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_4()); 
            // InternalIdl.g:2441:2: ( rule__EnumDeclaration__Group_4__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalIdl.g:2441:3: rule__EnumDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__EnumDeclaration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getEnumDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__4__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__5"
    // InternalIdl.g:2449:1: rule__EnumDeclaration__Group__5 : rule__EnumDeclaration__Group__5__Impl rule__EnumDeclaration__Group__6 ;
    public final void rule__EnumDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2453:1: ( rule__EnumDeclaration__Group__5__Impl rule__EnumDeclaration__Group__6 )
            // InternalIdl.g:2454:2: rule__EnumDeclaration__Group__5__Impl rule__EnumDeclaration__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__EnumDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__5"


    // $ANTLR start "rule__EnumDeclaration__Group__5__Impl"
    // InternalIdl.g:2461:1: rule__EnumDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2465:1: ( ( '}' ) )
            // InternalIdl.g:2466:1: ( '}' )
            {
            // InternalIdl.g:2466:1: ( '}' )
            // InternalIdl.g:2467:2: '}'
            {
             before(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__5__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__6"
    // InternalIdl.g:2476:1: rule__EnumDeclaration__Group__6 : rule__EnumDeclaration__Group__6__Impl ;
    public final void rule__EnumDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2480:1: ( rule__EnumDeclaration__Group__6__Impl )
            // InternalIdl.g:2481:2: rule__EnumDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__6"


    // $ANTLR start "rule__EnumDeclaration__Group__6__Impl"
    // InternalIdl.g:2487:1: rule__EnumDeclaration__Group__6__Impl : ( ( rule__EnumDeclaration__DeclaratorAssignment_6 )? ) ;
    public final void rule__EnumDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2491:1: ( ( ( rule__EnumDeclaration__DeclaratorAssignment_6 )? ) )
            // InternalIdl.g:2492:1: ( ( rule__EnumDeclaration__DeclaratorAssignment_6 )? )
            {
            // InternalIdl.g:2492:1: ( ( rule__EnumDeclaration__DeclaratorAssignment_6 )? )
            // InternalIdl.g:2493:2: ( rule__EnumDeclaration__DeclaratorAssignment_6 )?
            {
             before(grammarAccess.getEnumDeclarationAccess().getDeclaratorAssignment_6()); 
            // InternalIdl.g:2494:2: ( rule__EnumDeclaration__DeclaratorAssignment_6 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalIdl.g:2494:3: rule__EnumDeclaration__DeclaratorAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumDeclaration__DeclaratorAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumDeclarationAccess().getDeclaratorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__6__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_4__0"
    // InternalIdl.g:2503:1: rule__EnumDeclaration__Group_4__0 : rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 ;
    public final void rule__EnumDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2507:1: ( rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 )
            // InternalIdl.g:2508:2: rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__EnumDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_4__0"


    // $ANTLR start "rule__EnumDeclaration__Group_4__0__Impl"
    // InternalIdl.g:2515:1: rule__EnumDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2519:1: ( ( ',' ) )
            // InternalIdl.g:2520:1: ( ',' )
            {
            // InternalIdl.g:2520:1: ( ',' )
            // InternalIdl.g:2521:2: ','
            {
             before(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_4__1"
    // InternalIdl.g:2530:1: rule__EnumDeclaration__Group_4__1 : rule__EnumDeclaration__Group_4__1__Impl ;
    public final void rule__EnumDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2534:1: ( rule__EnumDeclaration__Group_4__1__Impl )
            // InternalIdl.g:2535:2: rule__EnumDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_4__1"


    // $ANTLR start "rule__EnumDeclaration__Group_4__1__Impl"
    // InternalIdl.g:2541:1: rule__EnumDeclaration__Group_4__1__Impl : ( ( rule__EnumDeclaration__ContainedIdentifiersAssignment_4_1 ) ) ;
    public final void rule__EnumDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2545:1: ( ( ( rule__EnumDeclaration__ContainedIdentifiersAssignment_4_1 ) ) )
            // InternalIdl.g:2546:1: ( ( rule__EnumDeclaration__ContainedIdentifiersAssignment_4_1 ) )
            {
            // InternalIdl.g:2546:1: ( ( rule__EnumDeclaration__ContainedIdentifiersAssignment_4_1 ) )
            // InternalIdl.g:2547:2: ( rule__EnumDeclaration__ContainedIdentifiersAssignment_4_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getContainedIdentifiersAssignment_4_1()); 
            // InternalIdl.g:2548:2: ( rule__EnumDeclaration__ContainedIdentifiersAssignment_4_1 )
            // InternalIdl.g:2548:3: rule__EnumDeclaration__ContainedIdentifiersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__ContainedIdentifiersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getContainedIdentifiersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group__0"
    // InternalIdl.g:2557:1: rule__SequenceDeclaration__Group__0 : rule__SequenceDeclaration__Group__0__Impl rule__SequenceDeclaration__Group__1 ;
    public final void rule__SequenceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2561:1: ( rule__SequenceDeclaration__Group__0__Impl rule__SequenceDeclaration__Group__1 )
            // InternalIdl.g:2562:2: rule__SequenceDeclaration__Group__0__Impl rule__SequenceDeclaration__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__SequenceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group__0"


    // $ANTLR start "rule__SequenceDeclaration__Group__0__Impl"
    // InternalIdl.g:2569:1: rule__SequenceDeclaration__Group__0__Impl : ( 'sequence' ) ;
    public final void rule__SequenceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2573:1: ( ( 'sequence' ) )
            // InternalIdl.g:2574:1: ( 'sequence' )
            {
            // InternalIdl.g:2574:1: ( 'sequence' )
            // InternalIdl.g:2575:2: 'sequence'
            {
             before(grammarAccess.getSequenceDeclarationAccess().getSequenceKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSequenceDeclarationAccess().getSequenceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group__1"
    // InternalIdl.g:2584:1: rule__SequenceDeclaration__Group__1 : rule__SequenceDeclaration__Group__1__Impl rule__SequenceDeclaration__Group__2 ;
    public final void rule__SequenceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2588:1: ( rule__SequenceDeclaration__Group__1__Impl rule__SequenceDeclaration__Group__2 )
            // InternalIdl.g:2589:2: rule__SequenceDeclaration__Group__1__Impl rule__SequenceDeclaration__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__SequenceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group__1"


    // $ANTLR start "rule__SequenceDeclaration__Group__1__Impl"
    // InternalIdl.g:2596:1: rule__SequenceDeclaration__Group__1__Impl : ( '<' ) ;
    public final void rule__SequenceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2600:1: ( ( '<' ) )
            // InternalIdl.g:2601:1: ( '<' )
            {
            // InternalIdl.g:2601:1: ( '<' )
            // InternalIdl.g:2602:2: '<'
            {
             before(grammarAccess.getSequenceDeclarationAccess().getLessThanSignKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSequenceDeclarationAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group__2"
    // InternalIdl.g:2611:1: rule__SequenceDeclaration__Group__2 : rule__SequenceDeclaration__Group__2__Impl rule__SequenceDeclaration__Group__3 ;
    public final void rule__SequenceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2615:1: ( rule__SequenceDeclaration__Group__2__Impl rule__SequenceDeclaration__Group__3 )
            // InternalIdl.g:2616:2: rule__SequenceDeclaration__Group__2__Impl rule__SequenceDeclaration__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__SequenceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group__2"


    // $ANTLR start "rule__SequenceDeclaration__Group__2__Impl"
    // InternalIdl.g:2623:1: rule__SequenceDeclaration__Group__2__Impl : ( ( rule__SequenceDeclaration__Alternatives_2 ) ) ;
    public final void rule__SequenceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2627:1: ( ( ( rule__SequenceDeclaration__Alternatives_2 ) ) )
            // InternalIdl.g:2628:1: ( ( rule__SequenceDeclaration__Alternatives_2 ) )
            {
            // InternalIdl.g:2628:1: ( ( rule__SequenceDeclaration__Alternatives_2 ) )
            // InternalIdl.g:2629:2: ( rule__SequenceDeclaration__Alternatives_2 )
            {
             before(grammarAccess.getSequenceDeclarationAccess().getAlternatives_2()); 
            // InternalIdl.g:2630:2: ( rule__SequenceDeclaration__Alternatives_2 )
            // InternalIdl.g:2630:3: rule__SequenceDeclaration__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDeclarationAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group__3"
    // InternalIdl.g:2638:1: rule__SequenceDeclaration__Group__3 : rule__SequenceDeclaration__Group__3__Impl rule__SequenceDeclaration__Group__4 ;
    public final void rule__SequenceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2642:1: ( rule__SequenceDeclaration__Group__3__Impl rule__SequenceDeclaration__Group__4 )
            // InternalIdl.g:2643:2: rule__SequenceDeclaration__Group__3__Impl rule__SequenceDeclaration__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__SequenceDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group__3"


    // $ANTLR start "rule__SequenceDeclaration__Group__3__Impl"
    // InternalIdl.g:2650:1: rule__SequenceDeclaration__Group__3__Impl : ( '>' ) ;
    public final void rule__SequenceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2654:1: ( ( '>' ) )
            // InternalIdl.g:2655:1: ( '>' )
            {
            // InternalIdl.g:2655:1: ( '>' )
            // InternalIdl.g:2656:2: '>'
            {
             before(grammarAccess.getSequenceDeclarationAccess().getGreaterThanSignKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSequenceDeclarationAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group__4"
    // InternalIdl.g:2665:1: rule__SequenceDeclaration__Group__4 : rule__SequenceDeclaration__Group__4__Impl ;
    public final void rule__SequenceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2669:1: ( rule__SequenceDeclaration__Group__4__Impl )
            // InternalIdl.g:2670:2: rule__SequenceDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group__4"


    // $ANTLR start "rule__SequenceDeclaration__Group__4__Impl"
    // InternalIdl.g:2676:1: rule__SequenceDeclaration__Group__4__Impl : ( ( rule__SequenceDeclaration__Group_4__0 )? ) ;
    public final void rule__SequenceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2680:1: ( ( ( rule__SequenceDeclaration__Group_4__0 )? ) )
            // InternalIdl.g:2681:1: ( ( rule__SequenceDeclaration__Group_4__0 )? )
            {
            // InternalIdl.g:2681:1: ( ( rule__SequenceDeclaration__Group_4__0 )? )
            // InternalIdl.g:2682:2: ( rule__SequenceDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getSequenceDeclarationAccess().getGroup_4()); 
            // InternalIdl.g:2683:2: ( rule__SequenceDeclaration__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalIdl.g:2683:3: rule__SequenceDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceDeclaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group__4__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1__0"
    // InternalIdl.g:2692:1: rule__SequenceDeclaration__Group_2_1__0 : rule__SequenceDeclaration__Group_2_1__0__Impl rule__SequenceDeclaration__Group_2_1__1 ;
    public final void rule__SequenceDeclaration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2696:1: ( rule__SequenceDeclaration__Group_2_1__0__Impl rule__SequenceDeclaration__Group_2_1__1 )
            // InternalIdl.g:2697:2: rule__SequenceDeclaration__Group_2_1__0__Impl rule__SequenceDeclaration__Group_2_1__1
            {
            pushFollow(FOLLOW_16);
            rule__SequenceDeclaration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1__0"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1__0__Impl"
    // InternalIdl.g:2704:1: rule__SequenceDeclaration__Group_2_1__0__Impl : ( ( rule__SequenceDeclaration__FailableAssignment_2_1_0 ) ) ;
    public final void rule__SequenceDeclaration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2708:1: ( ( ( rule__SequenceDeclaration__FailableAssignment_2_1_0 ) ) )
            // InternalIdl.g:2709:1: ( ( rule__SequenceDeclaration__FailableAssignment_2_1_0 ) )
            {
            // InternalIdl.g:2709:1: ( ( rule__SequenceDeclaration__FailableAssignment_2_1_0 ) )
            // InternalIdl.g:2710:2: ( rule__SequenceDeclaration__FailableAssignment_2_1_0 )
            {
             before(grammarAccess.getSequenceDeclarationAccess().getFailableAssignment_2_1_0()); 
            // InternalIdl.g:2711:2: ( rule__SequenceDeclaration__FailableAssignment_2_1_0 )
            // InternalIdl.g:2711:3: rule__SequenceDeclaration__FailableAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__FailableAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDeclarationAccess().getFailableAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1__0__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1__1"
    // InternalIdl.g:2719:1: rule__SequenceDeclaration__Group_2_1__1 : rule__SequenceDeclaration__Group_2_1__1__Impl rule__SequenceDeclaration__Group_2_1__2 ;
    public final void rule__SequenceDeclaration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2723:1: ( rule__SequenceDeclaration__Group_2_1__1__Impl rule__SequenceDeclaration__Group_2_1__2 )
            // InternalIdl.g:2724:2: rule__SequenceDeclaration__Group_2_1__1__Impl rule__SequenceDeclaration__Group_2_1__2
            {
            pushFollow(FOLLOW_23);
            rule__SequenceDeclaration__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1__1"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1__1__Impl"
    // InternalIdl.g:2731:1: rule__SequenceDeclaration__Group_2_1__1__Impl : ( ( rule__SequenceDeclaration__TypeAssignment_2_1_1 ) ) ;
    public final void rule__SequenceDeclaration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2735:1: ( ( ( rule__SequenceDeclaration__TypeAssignment_2_1_1 ) ) )
            // InternalIdl.g:2736:1: ( ( rule__SequenceDeclaration__TypeAssignment_2_1_1 ) )
            {
            // InternalIdl.g:2736:1: ( ( rule__SequenceDeclaration__TypeAssignment_2_1_1 ) )
            // InternalIdl.g:2737:2: ( rule__SequenceDeclaration__TypeAssignment_2_1_1 )
            {
             before(grammarAccess.getSequenceDeclarationAccess().getTypeAssignment_2_1_1()); 
            // InternalIdl.g:2738:2: ( rule__SequenceDeclaration__TypeAssignment_2_1_1 )
            // InternalIdl.g:2738:3: rule__SequenceDeclaration__TypeAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__TypeAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDeclarationAccess().getTypeAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1__1__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1__2"
    // InternalIdl.g:2746:1: rule__SequenceDeclaration__Group_2_1__2 : rule__SequenceDeclaration__Group_2_1__2__Impl ;
    public final void rule__SequenceDeclaration__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2750:1: ( rule__SequenceDeclaration__Group_2_1__2__Impl )
            // InternalIdl.g:2751:2: rule__SequenceDeclaration__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1__2"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1__2__Impl"
    // InternalIdl.g:2757:1: rule__SequenceDeclaration__Group_2_1__2__Impl : ( ( rule__SequenceDeclaration__Group_2_1_2__0 )? ) ;
    public final void rule__SequenceDeclaration__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2761:1: ( ( ( rule__SequenceDeclaration__Group_2_1_2__0 )? ) )
            // InternalIdl.g:2762:1: ( ( rule__SequenceDeclaration__Group_2_1_2__0 )? )
            {
            // InternalIdl.g:2762:1: ( ( rule__SequenceDeclaration__Group_2_1_2__0 )? )
            // InternalIdl.g:2763:2: ( rule__SequenceDeclaration__Group_2_1_2__0 )?
            {
             before(grammarAccess.getSequenceDeclarationAccess().getGroup_2_1_2()); 
            // InternalIdl.g:2764:2: ( rule__SequenceDeclaration__Group_2_1_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalIdl.g:2764:3: rule__SequenceDeclaration__Group_2_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SequenceDeclaration__Group_2_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceDeclarationAccess().getGroup_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1__2__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1_2__0"
    // InternalIdl.g:2773:1: rule__SequenceDeclaration__Group_2_1_2__0 : rule__SequenceDeclaration__Group_2_1_2__0__Impl rule__SequenceDeclaration__Group_2_1_2__1 ;
    public final void rule__SequenceDeclaration__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2777:1: ( rule__SequenceDeclaration__Group_2_1_2__0__Impl rule__SequenceDeclaration__Group_2_1_2__1 )
            // InternalIdl.g:2778:2: rule__SequenceDeclaration__Group_2_1_2__0__Impl rule__SequenceDeclaration__Group_2_1_2__1
            {
            pushFollow(FOLLOW_6);
            rule__SequenceDeclaration__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_2_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1_2__0"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1_2__0__Impl"
    // InternalIdl.g:2785:1: rule__SequenceDeclaration__Group_2_1_2__0__Impl : ( 'raises' ) ;
    public final void rule__SequenceDeclaration__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2789:1: ( ( 'raises' ) )
            // InternalIdl.g:2790:1: ( 'raises' )
            {
            // InternalIdl.g:2790:1: ( 'raises' )
            // InternalIdl.g:2791:2: 'raises'
            {
             before(grammarAccess.getSequenceDeclarationAccess().getRaisesKeyword_2_1_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSequenceDeclarationAccess().getRaisesKeyword_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1_2__1"
    // InternalIdl.g:2800:1: rule__SequenceDeclaration__Group_2_1_2__1 : rule__SequenceDeclaration__Group_2_1_2__1__Impl rule__SequenceDeclaration__Group_2_1_2__2 ;
    public final void rule__SequenceDeclaration__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2804:1: ( rule__SequenceDeclaration__Group_2_1_2__1__Impl rule__SequenceDeclaration__Group_2_1_2__2 )
            // InternalIdl.g:2805:2: rule__SequenceDeclaration__Group_2_1_2__1__Impl rule__SequenceDeclaration__Group_2_1_2__2
            {
            pushFollow(FOLLOW_24);
            rule__SequenceDeclaration__Group_2_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_2_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1_2__1"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1_2__1__Impl"
    // InternalIdl.g:2812:1: rule__SequenceDeclaration__Group_2_1_2__1__Impl : ( ( rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_1 ) ) ;
    public final void rule__SequenceDeclaration__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2816:1: ( ( ( rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_1 ) ) )
            // InternalIdl.g:2817:1: ( ( rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_1 ) )
            {
            // InternalIdl.g:2817:1: ( ( rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_1 ) )
            // InternalIdl.g:2818:2: ( rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_1 )
            {
             before(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAssignment_2_1_2_1()); 
            // InternalIdl.g:2819:2: ( rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_1 )
            // InternalIdl.g:2819:3: rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAssignment_2_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1_2__2"
    // InternalIdl.g:2827:1: rule__SequenceDeclaration__Group_2_1_2__2 : rule__SequenceDeclaration__Group_2_1_2__2__Impl ;
    public final void rule__SequenceDeclaration__Group_2_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2831:1: ( rule__SequenceDeclaration__Group_2_1_2__2__Impl )
            // InternalIdl.g:2832:2: rule__SequenceDeclaration__Group_2_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_2_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1_2__2"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1_2__2__Impl"
    // InternalIdl.g:2838:1: rule__SequenceDeclaration__Group_2_1_2__2__Impl : ( ( rule__SequenceDeclaration__Group_2_1_2_2__0 )* ) ;
    public final void rule__SequenceDeclaration__Group_2_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2842:1: ( ( ( rule__SequenceDeclaration__Group_2_1_2_2__0 )* ) )
            // InternalIdl.g:2843:1: ( ( rule__SequenceDeclaration__Group_2_1_2_2__0 )* )
            {
            // InternalIdl.g:2843:1: ( ( rule__SequenceDeclaration__Group_2_1_2_2__0 )* )
            // InternalIdl.g:2844:2: ( rule__SequenceDeclaration__Group_2_1_2_2__0 )*
            {
             before(grammarAccess.getSequenceDeclarationAccess().getGroup_2_1_2_2()); 
            // InternalIdl.g:2845:2: ( rule__SequenceDeclaration__Group_2_1_2_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==38) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalIdl.g:2845:3: rule__SequenceDeclaration__Group_2_1_2_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__SequenceDeclaration__Group_2_1_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSequenceDeclarationAccess().getGroup_2_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1_2__2__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1_2_2__0"
    // InternalIdl.g:2854:1: rule__SequenceDeclaration__Group_2_1_2_2__0 : rule__SequenceDeclaration__Group_2_1_2_2__0__Impl rule__SequenceDeclaration__Group_2_1_2_2__1 ;
    public final void rule__SequenceDeclaration__Group_2_1_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2858:1: ( rule__SequenceDeclaration__Group_2_1_2_2__0__Impl rule__SequenceDeclaration__Group_2_1_2_2__1 )
            // InternalIdl.g:2859:2: rule__SequenceDeclaration__Group_2_1_2_2__0__Impl rule__SequenceDeclaration__Group_2_1_2_2__1
            {
            pushFollow(FOLLOW_6);
            rule__SequenceDeclaration__Group_2_1_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_2_1_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1_2_2__0"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1_2_2__0__Impl"
    // InternalIdl.g:2866:1: rule__SequenceDeclaration__Group_2_1_2_2__0__Impl : ( ',' ) ;
    public final void rule__SequenceDeclaration__Group_2_1_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2870:1: ( ( ',' ) )
            // InternalIdl.g:2871:1: ( ',' )
            {
            // InternalIdl.g:2871:1: ( ',' )
            // InternalIdl.g:2872:2: ','
            {
             before(grammarAccess.getSequenceDeclarationAccess().getCommaKeyword_2_1_2_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSequenceDeclarationAccess().getCommaKeyword_2_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1_2_2__0__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1_2_2__1"
    // InternalIdl.g:2881:1: rule__SequenceDeclaration__Group_2_1_2_2__1 : rule__SequenceDeclaration__Group_2_1_2_2__1__Impl ;
    public final void rule__SequenceDeclaration__Group_2_1_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2885:1: ( rule__SequenceDeclaration__Group_2_1_2_2__1__Impl )
            // InternalIdl.g:2886:2: rule__SequenceDeclaration__Group_2_1_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_2_1_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1_2_2__1"


    // $ANTLR start "rule__SequenceDeclaration__Group_2_1_2_2__1__Impl"
    // InternalIdl.g:2892:1: rule__SequenceDeclaration__Group_2_1_2_2__1__Impl : ( ( rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_2_1 ) ) ;
    public final void rule__SequenceDeclaration__Group_2_1_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2896:1: ( ( ( rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_2_1 ) ) )
            // InternalIdl.g:2897:1: ( ( rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_2_1 ) )
            {
            // InternalIdl.g:2897:1: ( ( rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_2_1 ) )
            // InternalIdl.g:2898:2: ( rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_2_1 )
            {
             before(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAssignment_2_1_2_2_1()); 
            // InternalIdl.g:2899:2: ( rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_2_1 )
            // InternalIdl.g:2899:3: rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAssignment_2_1_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_2_1_2_2__1__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_4__0"
    // InternalIdl.g:2908:1: rule__SequenceDeclaration__Group_4__0 : rule__SequenceDeclaration__Group_4__0__Impl rule__SequenceDeclaration__Group_4__1 ;
    public final void rule__SequenceDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2912:1: ( rule__SequenceDeclaration__Group_4__0__Impl rule__SequenceDeclaration__Group_4__1 )
            // InternalIdl.g:2913:2: rule__SequenceDeclaration__Group_4__0__Impl rule__SequenceDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__SequenceDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_4__0"


    // $ANTLR start "rule__SequenceDeclaration__Group_4__0__Impl"
    // InternalIdl.g:2920:1: rule__SequenceDeclaration__Group_4__0__Impl : ( '[' ) ;
    public final void rule__SequenceDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2924:1: ( ( '[' ) )
            // InternalIdl.g:2925:1: ( '[' )
            {
            // InternalIdl.g:2925:1: ( '[' )
            // InternalIdl.g:2926:2: '['
            {
             before(grammarAccess.getSequenceDeclarationAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSequenceDeclarationAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_4__1"
    // InternalIdl.g:2935:1: rule__SequenceDeclaration__Group_4__1 : rule__SequenceDeclaration__Group_4__1__Impl rule__SequenceDeclaration__Group_4__2 ;
    public final void rule__SequenceDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2939:1: ( rule__SequenceDeclaration__Group_4__1__Impl rule__SequenceDeclaration__Group_4__2 )
            // InternalIdl.g:2940:2: rule__SequenceDeclaration__Group_4__1__Impl rule__SequenceDeclaration__Group_4__2
            {
            pushFollow(FOLLOW_26);
            rule__SequenceDeclaration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_4__1"


    // $ANTLR start "rule__SequenceDeclaration__Group_4__1__Impl"
    // InternalIdl.g:2947:1: rule__SequenceDeclaration__Group_4__1__Impl : ( ( rule__SequenceDeclaration__SequenceHintsAssignment_4_1 ) ) ;
    public final void rule__SequenceDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2951:1: ( ( ( rule__SequenceDeclaration__SequenceHintsAssignment_4_1 ) ) )
            // InternalIdl.g:2952:1: ( ( rule__SequenceDeclaration__SequenceHintsAssignment_4_1 ) )
            {
            // InternalIdl.g:2952:1: ( ( rule__SequenceDeclaration__SequenceHintsAssignment_4_1 ) )
            // InternalIdl.g:2953:2: ( rule__SequenceDeclaration__SequenceHintsAssignment_4_1 )
            {
             before(grammarAccess.getSequenceDeclarationAccess().getSequenceHintsAssignment_4_1()); 
            // InternalIdl.g:2954:2: ( rule__SequenceDeclaration__SequenceHintsAssignment_4_1 )
            // InternalIdl.g:2954:3: rule__SequenceDeclaration__SequenceHintsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__SequenceHintsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDeclarationAccess().getSequenceHintsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_4__2"
    // InternalIdl.g:2962:1: rule__SequenceDeclaration__Group_4__2 : rule__SequenceDeclaration__Group_4__2__Impl rule__SequenceDeclaration__Group_4__3 ;
    public final void rule__SequenceDeclaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2966:1: ( rule__SequenceDeclaration__Group_4__2__Impl rule__SequenceDeclaration__Group_4__3 )
            // InternalIdl.g:2967:2: rule__SequenceDeclaration__Group_4__2__Impl rule__SequenceDeclaration__Group_4__3
            {
            pushFollow(FOLLOW_26);
            rule__SequenceDeclaration__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_4__2"


    // $ANTLR start "rule__SequenceDeclaration__Group_4__2__Impl"
    // InternalIdl.g:2974:1: rule__SequenceDeclaration__Group_4__2__Impl : ( ( rule__SequenceDeclaration__Group_4_2__0 )* ) ;
    public final void rule__SequenceDeclaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2978:1: ( ( ( rule__SequenceDeclaration__Group_4_2__0 )* ) )
            // InternalIdl.g:2979:1: ( ( rule__SequenceDeclaration__Group_4_2__0 )* )
            {
            // InternalIdl.g:2979:1: ( ( rule__SequenceDeclaration__Group_4_2__0 )* )
            // InternalIdl.g:2980:2: ( rule__SequenceDeclaration__Group_4_2__0 )*
            {
             before(grammarAccess.getSequenceDeclarationAccess().getGroup_4_2()); 
            // InternalIdl.g:2981:2: ( rule__SequenceDeclaration__Group_4_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==38) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalIdl.g:2981:3: rule__SequenceDeclaration__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__SequenceDeclaration__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSequenceDeclarationAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_4__2__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_4__3"
    // InternalIdl.g:2989:1: rule__SequenceDeclaration__Group_4__3 : rule__SequenceDeclaration__Group_4__3__Impl ;
    public final void rule__SequenceDeclaration__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:2993:1: ( rule__SequenceDeclaration__Group_4__3__Impl )
            // InternalIdl.g:2994:2: rule__SequenceDeclaration__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_4__3"


    // $ANTLR start "rule__SequenceDeclaration__Group_4__3__Impl"
    // InternalIdl.g:3000:1: rule__SequenceDeclaration__Group_4__3__Impl : ( ']' ) ;
    public final void rule__SequenceDeclaration__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3004:1: ( ( ']' ) )
            // InternalIdl.g:3005:1: ( ']' )
            {
            // InternalIdl.g:3005:1: ( ']' )
            // InternalIdl.g:3006:2: ']'
            {
             before(grammarAccess.getSequenceDeclarationAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSequenceDeclarationAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_4__3__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_4_2__0"
    // InternalIdl.g:3016:1: rule__SequenceDeclaration__Group_4_2__0 : rule__SequenceDeclaration__Group_4_2__0__Impl rule__SequenceDeclaration__Group_4_2__1 ;
    public final void rule__SequenceDeclaration__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3020:1: ( rule__SequenceDeclaration__Group_4_2__0__Impl rule__SequenceDeclaration__Group_4_2__1 )
            // InternalIdl.g:3021:2: rule__SequenceDeclaration__Group_4_2__0__Impl rule__SequenceDeclaration__Group_4_2__1
            {
            pushFollow(FOLLOW_25);
            rule__SequenceDeclaration__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_4_2__0"


    // $ANTLR start "rule__SequenceDeclaration__Group_4_2__0__Impl"
    // InternalIdl.g:3028:1: rule__SequenceDeclaration__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__SequenceDeclaration__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3032:1: ( ( ',' ) )
            // InternalIdl.g:3033:1: ( ',' )
            {
            // InternalIdl.g:3033:1: ( ',' )
            // InternalIdl.g:3034:2: ','
            {
             before(grammarAccess.getSequenceDeclarationAccess().getCommaKeyword_4_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSequenceDeclarationAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_4_2__0__Impl"


    // $ANTLR start "rule__SequenceDeclaration__Group_4_2__1"
    // InternalIdl.g:3043:1: rule__SequenceDeclaration__Group_4_2__1 : rule__SequenceDeclaration__Group_4_2__1__Impl ;
    public final void rule__SequenceDeclaration__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3047:1: ( rule__SequenceDeclaration__Group_4_2__1__Impl )
            // InternalIdl.g:3048:2: rule__SequenceDeclaration__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_4_2__1"


    // $ANTLR start "rule__SequenceDeclaration__Group_4_2__1__Impl"
    // InternalIdl.g:3054:1: rule__SequenceDeclaration__Group_4_2__1__Impl : ( ( rule__SequenceDeclaration__SequenceHintsAssignment_4_2_1 ) ) ;
    public final void rule__SequenceDeclaration__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3058:1: ( ( ( rule__SequenceDeclaration__SequenceHintsAssignment_4_2_1 ) ) )
            // InternalIdl.g:3059:1: ( ( rule__SequenceDeclaration__SequenceHintsAssignment_4_2_1 ) )
            {
            // InternalIdl.g:3059:1: ( ( rule__SequenceDeclaration__SequenceHintsAssignment_4_2_1 ) )
            // InternalIdl.g:3060:2: ( rule__SequenceDeclaration__SequenceHintsAssignment_4_2_1 )
            {
             before(grammarAccess.getSequenceDeclarationAccess().getSequenceHintsAssignment_4_2_1()); 
            // InternalIdl.g:3061:2: ( rule__SequenceDeclaration__SequenceHintsAssignment_4_2_1 )
            // InternalIdl.g:3061:3: rule__SequenceDeclaration__SequenceHintsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDeclaration__SequenceHintsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDeclarationAccess().getSequenceHintsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__Group_4_2__1__Impl"


    // $ANTLR start "rule__TypicalLengthHint__Group__0"
    // InternalIdl.g:3070:1: rule__TypicalLengthHint__Group__0 : rule__TypicalLengthHint__Group__0__Impl rule__TypicalLengthHint__Group__1 ;
    public final void rule__TypicalLengthHint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3074:1: ( rule__TypicalLengthHint__Group__0__Impl rule__TypicalLengthHint__Group__1 )
            // InternalIdl.g:3075:2: rule__TypicalLengthHint__Group__0__Impl rule__TypicalLengthHint__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__TypicalLengthHint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypicalLengthHint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalLengthHint__Group__0"


    // $ANTLR start "rule__TypicalLengthHint__Group__0__Impl"
    // InternalIdl.g:3082:1: rule__TypicalLengthHint__Group__0__Impl : ( 'typical' ) ;
    public final void rule__TypicalLengthHint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3086:1: ( ( 'typical' ) )
            // InternalIdl.g:3087:1: ( 'typical' )
            {
            // InternalIdl.g:3087:1: ( 'typical' )
            // InternalIdl.g:3088:2: 'typical'
            {
             before(grammarAccess.getTypicalLengthHintAccess().getTypicalKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTypicalLengthHintAccess().getTypicalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalLengthHint__Group__0__Impl"


    // $ANTLR start "rule__TypicalLengthHint__Group__1"
    // InternalIdl.g:3097:1: rule__TypicalLengthHint__Group__1 : rule__TypicalLengthHint__Group__1__Impl rule__TypicalLengthHint__Group__2 ;
    public final void rule__TypicalLengthHint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3101:1: ( rule__TypicalLengthHint__Group__1__Impl rule__TypicalLengthHint__Group__2 )
            // InternalIdl.g:3102:2: rule__TypicalLengthHint__Group__1__Impl rule__TypicalLengthHint__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__TypicalLengthHint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypicalLengthHint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalLengthHint__Group__1"


    // $ANTLR start "rule__TypicalLengthHint__Group__1__Impl"
    // InternalIdl.g:3109:1: rule__TypicalLengthHint__Group__1__Impl : ( 'sequence' ) ;
    public final void rule__TypicalLengthHint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3113:1: ( ( 'sequence' ) )
            // InternalIdl.g:3114:1: ( 'sequence' )
            {
            // InternalIdl.g:3114:1: ( 'sequence' )
            // InternalIdl.g:3115:2: 'sequence'
            {
             before(grammarAccess.getTypicalLengthHintAccess().getSequenceKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypicalLengthHintAccess().getSequenceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalLengthHint__Group__1__Impl"


    // $ANTLR start "rule__TypicalLengthHint__Group__2"
    // InternalIdl.g:3124:1: rule__TypicalLengthHint__Group__2 : rule__TypicalLengthHint__Group__2__Impl rule__TypicalLengthHint__Group__3 ;
    public final void rule__TypicalLengthHint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3128:1: ( rule__TypicalLengthHint__Group__2__Impl rule__TypicalLengthHint__Group__3 )
            // InternalIdl.g:3129:2: rule__TypicalLengthHint__Group__2__Impl rule__TypicalLengthHint__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__TypicalLengthHint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypicalLengthHint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalLengthHint__Group__2"


    // $ANTLR start "rule__TypicalLengthHint__Group__2__Impl"
    // InternalIdl.g:3136:1: rule__TypicalLengthHint__Group__2__Impl : ( 'length' ) ;
    public final void rule__TypicalLengthHint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3140:1: ( ( 'length' ) )
            // InternalIdl.g:3141:1: ( 'length' )
            {
            // InternalIdl.g:3141:1: ( 'length' )
            // InternalIdl.g:3142:2: 'length'
            {
             before(grammarAccess.getTypicalLengthHintAccess().getLengthKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTypicalLengthHintAccess().getLengthKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalLengthHint__Group__2__Impl"


    // $ANTLR start "rule__TypicalLengthHint__Group__3"
    // InternalIdl.g:3151:1: rule__TypicalLengthHint__Group__3 : rule__TypicalLengthHint__Group__3__Impl rule__TypicalLengthHint__Group__4 ;
    public final void rule__TypicalLengthHint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3155:1: ( rule__TypicalLengthHint__Group__3__Impl rule__TypicalLengthHint__Group__4 )
            // InternalIdl.g:3156:2: rule__TypicalLengthHint__Group__3__Impl rule__TypicalLengthHint__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__TypicalLengthHint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypicalLengthHint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalLengthHint__Group__3"


    // $ANTLR start "rule__TypicalLengthHint__Group__3__Impl"
    // InternalIdl.g:3163:1: rule__TypicalLengthHint__Group__3__Impl : ( '=' ) ;
    public final void rule__TypicalLengthHint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3167:1: ( ( '=' ) )
            // InternalIdl.g:3168:1: ( '=' )
            {
            // InternalIdl.g:3168:1: ( '=' )
            // InternalIdl.g:3169:2: '='
            {
             before(grammarAccess.getTypicalLengthHintAccess().getEqualsSignKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTypicalLengthHintAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalLengthHint__Group__3__Impl"


    // $ANTLR start "rule__TypicalLengthHint__Group__4"
    // InternalIdl.g:3178:1: rule__TypicalLengthHint__Group__4 : rule__TypicalLengthHint__Group__4__Impl ;
    public final void rule__TypicalLengthHint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3182:1: ( rule__TypicalLengthHint__Group__4__Impl )
            // InternalIdl.g:3183:2: rule__TypicalLengthHint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypicalLengthHint__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalLengthHint__Group__4"


    // $ANTLR start "rule__TypicalLengthHint__Group__4__Impl"
    // InternalIdl.g:3189:1: rule__TypicalLengthHint__Group__4__Impl : ( ( rule__TypicalLengthHint__LengthAssignment_4 ) ) ;
    public final void rule__TypicalLengthHint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3193:1: ( ( ( rule__TypicalLengthHint__LengthAssignment_4 ) ) )
            // InternalIdl.g:3194:1: ( ( rule__TypicalLengthHint__LengthAssignment_4 ) )
            {
            // InternalIdl.g:3194:1: ( ( rule__TypicalLengthHint__LengthAssignment_4 ) )
            // InternalIdl.g:3195:2: ( rule__TypicalLengthHint__LengthAssignment_4 )
            {
             before(grammarAccess.getTypicalLengthHintAccess().getLengthAssignment_4()); 
            // InternalIdl.g:3196:2: ( rule__TypicalLengthHint__LengthAssignment_4 )
            // InternalIdl.g:3196:3: rule__TypicalLengthHint__LengthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TypicalLengthHint__LengthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTypicalLengthHintAccess().getLengthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalLengthHint__Group__4__Impl"


    // $ANTLR start "rule__TypicalSizeHint__Group__0"
    // InternalIdl.g:3205:1: rule__TypicalSizeHint__Group__0 : rule__TypicalSizeHint__Group__0__Impl rule__TypicalSizeHint__Group__1 ;
    public final void rule__TypicalSizeHint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3209:1: ( rule__TypicalSizeHint__Group__0__Impl rule__TypicalSizeHint__Group__1 )
            // InternalIdl.g:3210:2: rule__TypicalSizeHint__Group__0__Impl rule__TypicalSizeHint__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__TypicalSizeHint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypicalSizeHint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalSizeHint__Group__0"


    // $ANTLR start "rule__TypicalSizeHint__Group__0__Impl"
    // InternalIdl.g:3217:1: rule__TypicalSizeHint__Group__0__Impl : ( 'typical' ) ;
    public final void rule__TypicalSizeHint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3221:1: ( ( 'typical' ) )
            // InternalIdl.g:3222:1: ( 'typical' )
            {
            // InternalIdl.g:3222:1: ( 'typical' )
            // InternalIdl.g:3223:2: 'typical'
            {
             before(grammarAccess.getTypicalSizeHintAccess().getTypicalKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTypicalSizeHintAccess().getTypicalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalSizeHint__Group__0__Impl"


    // $ANTLR start "rule__TypicalSizeHint__Group__1"
    // InternalIdl.g:3232:1: rule__TypicalSizeHint__Group__1 : rule__TypicalSizeHint__Group__1__Impl rule__TypicalSizeHint__Group__2 ;
    public final void rule__TypicalSizeHint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3236:1: ( rule__TypicalSizeHint__Group__1__Impl rule__TypicalSizeHint__Group__2 )
            // InternalIdl.g:3237:2: rule__TypicalSizeHint__Group__1__Impl rule__TypicalSizeHint__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__TypicalSizeHint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypicalSizeHint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalSizeHint__Group__1"


    // $ANTLR start "rule__TypicalSizeHint__Group__1__Impl"
    // InternalIdl.g:3244:1: rule__TypicalSizeHint__Group__1__Impl : ( 'element' ) ;
    public final void rule__TypicalSizeHint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3248:1: ( ( 'element' ) )
            // InternalIdl.g:3249:1: ( 'element' )
            {
            // InternalIdl.g:3249:1: ( 'element' )
            // InternalIdl.g:3250:2: 'element'
            {
             before(grammarAccess.getTypicalSizeHintAccess().getElementKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTypicalSizeHintAccess().getElementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalSizeHint__Group__1__Impl"


    // $ANTLR start "rule__TypicalSizeHint__Group__2"
    // InternalIdl.g:3259:1: rule__TypicalSizeHint__Group__2 : rule__TypicalSizeHint__Group__2__Impl rule__TypicalSizeHint__Group__3 ;
    public final void rule__TypicalSizeHint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3263:1: ( rule__TypicalSizeHint__Group__2__Impl rule__TypicalSizeHint__Group__3 )
            // InternalIdl.g:3264:2: rule__TypicalSizeHint__Group__2__Impl rule__TypicalSizeHint__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__TypicalSizeHint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypicalSizeHint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalSizeHint__Group__2"


    // $ANTLR start "rule__TypicalSizeHint__Group__2__Impl"
    // InternalIdl.g:3271:1: rule__TypicalSizeHint__Group__2__Impl : ( 'size' ) ;
    public final void rule__TypicalSizeHint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3275:1: ( ( 'size' ) )
            // InternalIdl.g:3276:1: ( 'size' )
            {
            // InternalIdl.g:3276:1: ( 'size' )
            // InternalIdl.g:3277:2: 'size'
            {
             before(grammarAccess.getTypicalSizeHintAccess().getSizeKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTypicalSizeHintAccess().getSizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalSizeHint__Group__2__Impl"


    // $ANTLR start "rule__TypicalSizeHint__Group__3"
    // InternalIdl.g:3286:1: rule__TypicalSizeHint__Group__3 : rule__TypicalSizeHint__Group__3__Impl rule__TypicalSizeHint__Group__4 ;
    public final void rule__TypicalSizeHint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3290:1: ( rule__TypicalSizeHint__Group__3__Impl rule__TypicalSizeHint__Group__4 )
            // InternalIdl.g:3291:2: rule__TypicalSizeHint__Group__3__Impl rule__TypicalSizeHint__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__TypicalSizeHint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypicalSizeHint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalSizeHint__Group__3"


    // $ANTLR start "rule__TypicalSizeHint__Group__3__Impl"
    // InternalIdl.g:3298:1: rule__TypicalSizeHint__Group__3__Impl : ( '=' ) ;
    public final void rule__TypicalSizeHint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3302:1: ( ( '=' ) )
            // InternalIdl.g:3303:1: ( '=' )
            {
            // InternalIdl.g:3303:1: ( '=' )
            // InternalIdl.g:3304:2: '='
            {
             before(grammarAccess.getTypicalSizeHintAccess().getEqualsSignKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTypicalSizeHintAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalSizeHint__Group__3__Impl"


    // $ANTLR start "rule__TypicalSizeHint__Group__4"
    // InternalIdl.g:3313:1: rule__TypicalSizeHint__Group__4 : rule__TypicalSizeHint__Group__4__Impl ;
    public final void rule__TypicalSizeHint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3317:1: ( rule__TypicalSizeHint__Group__4__Impl )
            // InternalIdl.g:3318:2: rule__TypicalSizeHint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypicalSizeHint__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalSizeHint__Group__4"


    // $ANTLR start "rule__TypicalSizeHint__Group__4__Impl"
    // InternalIdl.g:3324:1: rule__TypicalSizeHint__Group__4__Impl : ( ( rule__TypicalSizeHint__SizeAssignment_4 ) ) ;
    public final void rule__TypicalSizeHint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3328:1: ( ( ( rule__TypicalSizeHint__SizeAssignment_4 ) ) )
            // InternalIdl.g:3329:1: ( ( rule__TypicalSizeHint__SizeAssignment_4 ) )
            {
            // InternalIdl.g:3329:1: ( ( rule__TypicalSizeHint__SizeAssignment_4 ) )
            // InternalIdl.g:3330:2: ( rule__TypicalSizeHint__SizeAssignment_4 )
            {
             before(grammarAccess.getTypicalSizeHintAccess().getSizeAssignment_4()); 
            // InternalIdl.g:3331:2: ( rule__TypicalSizeHint__SizeAssignment_4 )
            // InternalIdl.g:3331:3: rule__TypicalSizeHint__SizeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TypicalSizeHint__SizeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTypicalSizeHintAccess().getSizeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalSizeHint__Group__4__Impl"


    // $ANTLR start "rule__TupleDeclaration__Group__0"
    // InternalIdl.g:3340:1: rule__TupleDeclaration__Group__0 : rule__TupleDeclaration__Group__0__Impl rule__TupleDeclaration__Group__1 ;
    public final void rule__TupleDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3344:1: ( rule__TupleDeclaration__Group__0__Impl rule__TupleDeclaration__Group__1 )
            // InternalIdl.g:3345:2: rule__TupleDeclaration__Group__0__Impl rule__TupleDeclaration__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__TupleDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group__0"


    // $ANTLR start "rule__TupleDeclaration__Group__0__Impl"
    // InternalIdl.g:3352:1: rule__TupleDeclaration__Group__0__Impl : ( 'tuple' ) ;
    public final void rule__TupleDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3356:1: ( ( 'tuple' ) )
            // InternalIdl.g:3357:1: ( 'tuple' )
            {
            // InternalIdl.g:3357:1: ( 'tuple' )
            // InternalIdl.g:3358:2: 'tuple'
            {
             before(grammarAccess.getTupleDeclarationAccess().getTupleKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTupleDeclarationAccess().getTupleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group__0__Impl"


    // $ANTLR start "rule__TupleDeclaration__Group__1"
    // InternalIdl.g:3367:1: rule__TupleDeclaration__Group__1 : rule__TupleDeclaration__Group__1__Impl rule__TupleDeclaration__Group__2 ;
    public final void rule__TupleDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3371:1: ( rule__TupleDeclaration__Group__1__Impl rule__TupleDeclaration__Group__2 )
            // InternalIdl.g:3372:2: rule__TupleDeclaration__Group__1__Impl rule__TupleDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__TupleDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group__1"


    // $ANTLR start "rule__TupleDeclaration__Group__1__Impl"
    // InternalIdl.g:3379:1: rule__TupleDeclaration__Group__1__Impl : ( '<' ) ;
    public final void rule__TupleDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3383:1: ( ( '<' ) )
            // InternalIdl.g:3384:1: ( '<' )
            {
            // InternalIdl.g:3384:1: ( '<' )
            // InternalIdl.g:3385:2: '<'
            {
             before(grammarAccess.getTupleDeclarationAccess().getLessThanSignKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTupleDeclarationAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group__1__Impl"


    // $ANTLR start "rule__TupleDeclaration__Group__2"
    // InternalIdl.g:3394:1: rule__TupleDeclaration__Group__2 : rule__TupleDeclaration__Group__2__Impl rule__TupleDeclaration__Group__3 ;
    public final void rule__TupleDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3398:1: ( rule__TupleDeclaration__Group__2__Impl rule__TupleDeclaration__Group__3 )
            // InternalIdl.g:3399:2: rule__TupleDeclaration__Group__2__Impl rule__TupleDeclaration__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__TupleDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group__2"


    // $ANTLR start "rule__TupleDeclaration__Group__2__Impl"
    // InternalIdl.g:3406:1: rule__TupleDeclaration__Group__2__Impl : ( ( rule__TupleDeclaration__TypesAssignment_2 ) ) ;
    public final void rule__TupleDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3410:1: ( ( ( rule__TupleDeclaration__TypesAssignment_2 ) ) )
            // InternalIdl.g:3411:1: ( ( rule__TupleDeclaration__TypesAssignment_2 ) )
            {
            // InternalIdl.g:3411:1: ( ( rule__TupleDeclaration__TypesAssignment_2 ) )
            // InternalIdl.g:3412:2: ( rule__TupleDeclaration__TypesAssignment_2 )
            {
             before(grammarAccess.getTupleDeclarationAccess().getTypesAssignment_2()); 
            // InternalIdl.g:3413:2: ( rule__TupleDeclaration__TypesAssignment_2 )
            // InternalIdl.g:3413:3: rule__TupleDeclaration__TypesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TupleDeclaration__TypesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTupleDeclarationAccess().getTypesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group__2__Impl"


    // $ANTLR start "rule__TupleDeclaration__Group__3"
    // InternalIdl.g:3421:1: rule__TupleDeclaration__Group__3 : rule__TupleDeclaration__Group__3__Impl rule__TupleDeclaration__Group__4 ;
    public final void rule__TupleDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3425:1: ( rule__TupleDeclaration__Group__3__Impl rule__TupleDeclaration__Group__4 )
            // InternalIdl.g:3426:2: rule__TupleDeclaration__Group__3__Impl rule__TupleDeclaration__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__TupleDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group__3"


    // $ANTLR start "rule__TupleDeclaration__Group__3__Impl"
    // InternalIdl.g:3433:1: rule__TupleDeclaration__Group__3__Impl : ( ( rule__TupleDeclaration__Group_3__0 )* ) ;
    public final void rule__TupleDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3437:1: ( ( ( rule__TupleDeclaration__Group_3__0 )* ) )
            // InternalIdl.g:3438:1: ( ( rule__TupleDeclaration__Group_3__0 )* )
            {
            // InternalIdl.g:3438:1: ( ( rule__TupleDeclaration__Group_3__0 )* )
            // InternalIdl.g:3439:2: ( rule__TupleDeclaration__Group_3__0 )*
            {
             before(grammarAccess.getTupleDeclarationAccess().getGroup_3()); 
            // InternalIdl.g:3440:2: ( rule__TupleDeclaration__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==38) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalIdl.g:3440:3: rule__TupleDeclaration__Group_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__TupleDeclaration__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getTupleDeclarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group__3__Impl"


    // $ANTLR start "rule__TupleDeclaration__Group__4"
    // InternalIdl.g:3448:1: rule__TupleDeclaration__Group__4 : rule__TupleDeclaration__Group__4__Impl ;
    public final void rule__TupleDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3452:1: ( rule__TupleDeclaration__Group__4__Impl )
            // InternalIdl.g:3453:2: rule__TupleDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TupleDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group__4"


    // $ANTLR start "rule__TupleDeclaration__Group__4__Impl"
    // InternalIdl.g:3459:1: rule__TupleDeclaration__Group__4__Impl : ( '>' ) ;
    public final void rule__TupleDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3463:1: ( ( '>' ) )
            // InternalIdl.g:3464:1: ( '>' )
            {
            // InternalIdl.g:3464:1: ( '>' )
            // InternalIdl.g:3465:2: '>'
            {
             before(grammarAccess.getTupleDeclarationAccess().getGreaterThanSignKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTupleDeclarationAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group__4__Impl"


    // $ANTLR start "rule__TupleDeclaration__Group_3__0"
    // InternalIdl.g:3475:1: rule__TupleDeclaration__Group_3__0 : rule__TupleDeclaration__Group_3__0__Impl rule__TupleDeclaration__Group_3__1 ;
    public final void rule__TupleDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3479:1: ( rule__TupleDeclaration__Group_3__0__Impl rule__TupleDeclaration__Group_3__1 )
            // InternalIdl.g:3480:2: rule__TupleDeclaration__Group_3__0__Impl rule__TupleDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__TupleDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleDeclaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group_3__0"


    // $ANTLR start "rule__TupleDeclaration__Group_3__0__Impl"
    // InternalIdl.g:3487:1: rule__TupleDeclaration__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TupleDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3491:1: ( ( ',' ) )
            // InternalIdl.g:3492:1: ( ',' )
            {
            // InternalIdl.g:3492:1: ( ',' )
            // InternalIdl.g:3493:2: ','
            {
             before(grammarAccess.getTupleDeclarationAccess().getCommaKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTupleDeclarationAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__TupleDeclaration__Group_3__1"
    // InternalIdl.g:3502:1: rule__TupleDeclaration__Group_3__1 : rule__TupleDeclaration__Group_3__1__Impl ;
    public final void rule__TupleDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3506:1: ( rule__TupleDeclaration__Group_3__1__Impl )
            // InternalIdl.g:3507:2: rule__TupleDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TupleDeclaration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group_3__1"


    // $ANTLR start "rule__TupleDeclaration__Group_3__1__Impl"
    // InternalIdl.g:3513:1: rule__TupleDeclaration__Group_3__1__Impl : ( ( rule__TupleDeclaration__TypesAssignment_3_1 ) ) ;
    public final void rule__TupleDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3517:1: ( ( ( rule__TupleDeclaration__TypesAssignment_3_1 ) ) )
            // InternalIdl.g:3518:1: ( ( rule__TupleDeclaration__TypesAssignment_3_1 ) )
            {
            // InternalIdl.g:3518:1: ( ( rule__TupleDeclaration__TypesAssignment_3_1 ) )
            // InternalIdl.g:3519:2: ( rule__TupleDeclaration__TypesAssignment_3_1 )
            {
             before(grammarAccess.getTupleDeclarationAccess().getTypesAssignment_3_1()); 
            // InternalIdl.g:3520:2: ( rule__TupleDeclaration__TypesAssignment_3_1 )
            // InternalIdl.g:3520:3: rule__TupleDeclaration__TypesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TupleDeclaration__TypesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTupleDeclarationAccess().getTypesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__StructDeclaration__Group__0"
    // InternalIdl.g:3529:1: rule__StructDeclaration__Group__0 : rule__StructDeclaration__Group__0__Impl rule__StructDeclaration__Group__1 ;
    public final void rule__StructDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3533:1: ( rule__StructDeclaration__Group__0__Impl rule__StructDeclaration__Group__1 )
            // InternalIdl.g:3534:2: rule__StructDeclaration__Group__0__Impl rule__StructDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__StructDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__0"


    // $ANTLR start "rule__StructDeclaration__Group__0__Impl"
    // InternalIdl.g:3541:1: rule__StructDeclaration__Group__0__Impl : ( 'struct' ) ;
    public final void rule__StructDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3545:1: ( ( 'struct' ) )
            // InternalIdl.g:3546:1: ( 'struct' )
            {
            // InternalIdl.g:3546:1: ( 'struct' )
            // InternalIdl.g:3547:2: 'struct'
            {
             before(grammarAccess.getStructDeclarationAccess().getStructKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getStructDeclarationAccess().getStructKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__0__Impl"


    // $ANTLR start "rule__StructDeclaration__Group__1"
    // InternalIdl.g:3556:1: rule__StructDeclaration__Group__1 : rule__StructDeclaration__Group__1__Impl rule__StructDeclaration__Group__2 ;
    public final void rule__StructDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3560:1: ( rule__StructDeclaration__Group__1__Impl rule__StructDeclaration__Group__2 )
            // InternalIdl.g:3561:2: rule__StructDeclaration__Group__1__Impl rule__StructDeclaration__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__StructDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__1"


    // $ANTLR start "rule__StructDeclaration__Group__1__Impl"
    // InternalIdl.g:3568:1: rule__StructDeclaration__Group__1__Impl : ( ( rule__StructDeclaration__NameAssignment_1 ) ) ;
    public final void rule__StructDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3572:1: ( ( ( rule__StructDeclaration__NameAssignment_1 ) ) )
            // InternalIdl.g:3573:1: ( ( rule__StructDeclaration__NameAssignment_1 ) )
            {
            // InternalIdl.g:3573:1: ( ( rule__StructDeclaration__NameAssignment_1 ) )
            // InternalIdl.g:3574:2: ( rule__StructDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getStructDeclarationAccess().getNameAssignment_1()); 
            // InternalIdl.g:3575:2: ( rule__StructDeclaration__NameAssignment_1 )
            // InternalIdl.g:3575:3: rule__StructDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StructDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__1__Impl"


    // $ANTLR start "rule__StructDeclaration__Group__2"
    // InternalIdl.g:3583:1: rule__StructDeclaration__Group__2 : rule__StructDeclaration__Group__2__Impl rule__StructDeclaration__Group__3 ;
    public final void rule__StructDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3587:1: ( rule__StructDeclaration__Group__2__Impl rule__StructDeclaration__Group__3 )
            // InternalIdl.g:3588:2: rule__StructDeclaration__Group__2__Impl rule__StructDeclaration__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__StructDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__2"


    // $ANTLR start "rule__StructDeclaration__Group__2__Impl"
    // InternalIdl.g:3595:1: rule__StructDeclaration__Group__2__Impl : ( ( rule__StructDeclaration__Group_2__0 )? ) ;
    public final void rule__StructDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3599:1: ( ( ( rule__StructDeclaration__Group_2__0 )? ) )
            // InternalIdl.g:3600:1: ( ( rule__StructDeclaration__Group_2__0 )? )
            {
            // InternalIdl.g:3600:1: ( ( rule__StructDeclaration__Group_2__0 )? )
            // InternalIdl.g:3601:2: ( rule__StructDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getStructDeclarationAccess().getGroup_2()); 
            // InternalIdl.g:3602:2: ( rule__StructDeclaration__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalIdl.g:3602:3: rule__StructDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StructDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__2__Impl"


    // $ANTLR start "rule__StructDeclaration__Group__3"
    // InternalIdl.g:3610:1: rule__StructDeclaration__Group__3 : rule__StructDeclaration__Group__3__Impl rule__StructDeclaration__Group__4 ;
    public final void rule__StructDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3614:1: ( rule__StructDeclaration__Group__3__Impl rule__StructDeclaration__Group__4 )
            // InternalIdl.g:3615:2: rule__StructDeclaration__Group__3__Impl rule__StructDeclaration__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__StructDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__3"


    // $ANTLR start "rule__StructDeclaration__Group__3__Impl"
    // InternalIdl.g:3622:1: rule__StructDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__StructDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3626:1: ( ( '{' ) )
            // InternalIdl.g:3627:1: ( '{' )
            {
            // InternalIdl.g:3627:1: ( '{' )
            // InternalIdl.g:3628:2: '{'
            {
             before(grammarAccess.getStructDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStructDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__3__Impl"


    // $ANTLR start "rule__StructDeclaration__Group__4"
    // InternalIdl.g:3637:1: rule__StructDeclaration__Group__4 : rule__StructDeclaration__Group__4__Impl rule__StructDeclaration__Group__5 ;
    public final void rule__StructDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3641:1: ( rule__StructDeclaration__Group__4__Impl rule__StructDeclaration__Group__5 )
            // InternalIdl.g:3642:2: rule__StructDeclaration__Group__4__Impl rule__StructDeclaration__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__StructDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__4"


    // $ANTLR start "rule__StructDeclaration__Group__4__Impl"
    // InternalIdl.g:3649:1: rule__StructDeclaration__Group__4__Impl : ( ( rule__StructDeclaration__Group_4__0 )* ) ;
    public final void rule__StructDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3653:1: ( ( ( rule__StructDeclaration__Group_4__0 )* ) )
            // InternalIdl.g:3654:1: ( ( rule__StructDeclaration__Group_4__0 )* )
            {
            // InternalIdl.g:3654:1: ( ( rule__StructDeclaration__Group_4__0 )* )
            // InternalIdl.g:3655:2: ( rule__StructDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getStructDeclarationAccess().getGroup_4()); 
            // InternalIdl.g:3656:2: ( rule__StructDeclaration__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_BYTE && LA32_0<=RULE_ID)||(LA32_0>=RULE_STRINGTYPE && LA32_0<=RULE_BOOLEAN)||LA32_0==33||(LA32_0>=36 && LA32_0<=37)||LA32_0==39||(LA32_0>=50 && LA32_0<=51)||LA32_0==66) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalIdl.g:3656:3: rule__StructDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__StructDeclaration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getStructDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__4__Impl"


    // $ANTLR start "rule__StructDeclaration__Group__5"
    // InternalIdl.g:3664:1: rule__StructDeclaration__Group__5 : rule__StructDeclaration__Group__5__Impl rule__StructDeclaration__Group__6 ;
    public final void rule__StructDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3668:1: ( rule__StructDeclaration__Group__5__Impl rule__StructDeclaration__Group__6 )
            // InternalIdl.g:3669:2: rule__StructDeclaration__Group__5__Impl rule__StructDeclaration__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__StructDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__5"


    // $ANTLR start "rule__StructDeclaration__Group__5__Impl"
    // InternalIdl.g:3676:1: rule__StructDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__StructDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3680:1: ( ( '}' ) )
            // InternalIdl.g:3681:1: ( '}' )
            {
            // InternalIdl.g:3681:1: ( '}' )
            // InternalIdl.g:3682:2: '}'
            {
             before(grammarAccess.getStructDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStructDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__5__Impl"


    // $ANTLR start "rule__StructDeclaration__Group__6"
    // InternalIdl.g:3691:1: rule__StructDeclaration__Group__6 : rule__StructDeclaration__Group__6__Impl ;
    public final void rule__StructDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3695:1: ( rule__StructDeclaration__Group__6__Impl )
            // InternalIdl.g:3696:2: rule__StructDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__6"


    // $ANTLR start "rule__StructDeclaration__Group__6__Impl"
    // InternalIdl.g:3702:1: rule__StructDeclaration__Group__6__Impl : ( ( rule__StructDeclaration__DeclaratorAssignment_6 )? ) ;
    public final void rule__StructDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3706:1: ( ( ( rule__StructDeclaration__DeclaratorAssignment_6 )? ) )
            // InternalIdl.g:3707:1: ( ( rule__StructDeclaration__DeclaratorAssignment_6 )? )
            {
            // InternalIdl.g:3707:1: ( ( rule__StructDeclaration__DeclaratorAssignment_6 )? )
            // InternalIdl.g:3708:2: ( rule__StructDeclaration__DeclaratorAssignment_6 )?
            {
             before(grammarAccess.getStructDeclarationAccess().getDeclaratorAssignment_6()); 
            // InternalIdl.g:3709:2: ( rule__StructDeclaration__DeclaratorAssignment_6 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalIdl.g:3709:3: rule__StructDeclaration__DeclaratorAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__StructDeclaration__DeclaratorAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructDeclarationAccess().getDeclaratorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__6__Impl"


    // $ANTLR start "rule__StructDeclaration__Group_2__0"
    // InternalIdl.g:3718:1: rule__StructDeclaration__Group_2__0 : rule__StructDeclaration__Group_2__0__Impl rule__StructDeclaration__Group_2__1 ;
    public final void rule__StructDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3722:1: ( rule__StructDeclaration__Group_2__0__Impl rule__StructDeclaration__Group_2__1 )
            // InternalIdl.g:3723:2: rule__StructDeclaration__Group_2__0__Impl rule__StructDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__StructDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group_2__0"


    // $ANTLR start "rule__StructDeclaration__Group_2__0__Impl"
    // InternalIdl.g:3730:1: rule__StructDeclaration__Group_2__0__Impl : ( ':' ) ;
    public final void rule__StructDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3734:1: ( ( ':' ) )
            // InternalIdl.g:3735:1: ( ':' )
            {
            // InternalIdl.g:3735:1: ( ':' )
            // InternalIdl.g:3736:2: ':'
            {
             before(grammarAccess.getStructDeclarationAccess().getColonKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStructDeclarationAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__StructDeclaration__Group_2__1"
    // InternalIdl.g:3745:1: rule__StructDeclaration__Group_2__1 : rule__StructDeclaration__Group_2__1__Impl ;
    public final void rule__StructDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3749:1: ( rule__StructDeclaration__Group_2__1__Impl )
            // InternalIdl.g:3750:2: rule__StructDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group_2__1"


    // $ANTLR start "rule__StructDeclaration__Group_2__1__Impl"
    // InternalIdl.g:3756:1: rule__StructDeclaration__Group_2__1__Impl : ( ( rule__StructDeclaration__SupertypeAssignment_2_1 ) ) ;
    public final void rule__StructDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3760:1: ( ( ( rule__StructDeclaration__SupertypeAssignment_2_1 ) ) )
            // InternalIdl.g:3761:1: ( ( rule__StructDeclaration__SupertypeAssignment_2_1 ) )
            {
            // InternalIdl.g:3761:1: ( ( rule__StructDeclaration__SupertypeAssignment_2_1 ) )
            // InternalIdl.g:3762:2: ( rule__StructDeclaration__SupertypeAssignment_2_1 )
            {
             before(grammarAccess.getStructDeclarationAccess().getSupertypeAssignment_2_1()); 
            // InternalIdl.g:3763:2: ( rule__StructDeclaration__SupertypeAssignment_2_1 )
            // InternalIdl.g:3763:3: rule__StructDeclaration__SupertypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StructDeclaration__SupertypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStructDeclarationAccess().getSupertypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__StructDeclaration__Group_4__0"
    // InternalIdl.g:3772:1: rule__StructDeclaration__Group_4__0 : rule__StructDeclaration__Group_4__0__Impl rule__StructDeclaration__Group_4__1 ;
    public final void rule__StructDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3776:1: ( rule__StructDeclaration__Group_4__0__Impl rule__StructDeclaration__Group_4__1 )
            // InternalIdl.g:3777:2: rule__StructDeclaration__Group_4__0__Impl rule__StructDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__StructDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group_4__0"


    // $ANTLR start "rule__StructDeclaration__Group_4__0__Impl"
    // InternalIdl.g:3784:1: rule__StructDeclaration__Group_4__0__Impl : ( ( rule__StructDeclaration__Alternatives_4_0 ) ) ;
    public final void rule__StructDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3788:1: ( ( ( rule__StructDeclaration__Alternatives_4_0 ) ) )
            // InternalIdl.g:3789:1: ( ( rule__StructDeclaration__Alternatives_4_0 ) )
            {
            // InternalIdl.g:3789:1: ( ( rule__StructDeclaration__Alternatives_4_0 ) )
            // InternalIdl.g:3790:2: ( rule__StructDeclaration__Alternatives_4_0 )
            {
             before(grammarAccess.getStructDeclarationAccess().getAlternatives_4_0()); 
            // InternalIdl.g:3791:2: ( rule__StructDeclaration__Alternatives_4_0 )
            // InternalIdl.g:3791:3: rule__StructDeclaration__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getStructDeclarationAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__StructDeclaration__Group_4__1"
    // InternalIdl.g:3799:1: rule__StructDeclaration__Group_4__1 : rule__StructDeclaration__Group_4__1__Impl ;
    public final void rule__StructDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3803:1: ( rule__StructDeclaration__Group_4__1__Impl )
            // InternalIdl.g:3804:2: rule__StructDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group_4__1"


    // $ANTLR start "rule__StructDeclaration__Group_4__1__Impl"
    // InternalIdl.g:3810:1: rule__StructDeclaration__Group_4__1__Impl : ( ';' ) ;
    public final void rule__StructDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3814:1: ( ( ';' ) )
            // InternalIdl.g:3815:1: ( ';' )
            {
            // InternalIdl.g:3815:1: ( ';' )
            // InternalIdl.g:3816:2: ';'
            {
             before(grammarAccess.getStructDeclarationAccess().getSemicolonKeyword_4_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStructDeclarationAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__MemberElement__Group__0"
    // InternalIdl.g:3826:1: rule__MemberElement__Group__0 : rule__MemberElement__Group__0__Impl rule__MemberElement__Group__1 ;
    public final void rule__MemberElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3830:1: ( rule__MemberElement__Group__0__Impl rule__MemberElement__Group__1 )
            // InternalIdl.g:3831:2: rule__MemberElement__Group__0__Impl rule__MemberElement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__MemberElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberElement__Group__0"


    // $ANTLR start "rule__MemberElement__Group__0__Impl"
    // InternalIdl.g:3838:1: rule__MemberElement__Group__0__Impl : ( ( rule__MemberElement__OptionalAssignment_0 )? ) ;
    public final void rule__MemberElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3842:1: ( ( ( rule__MemberElement__OptionalAssignment_0 )? ) )
            // InternalIdl.g:3843:1: ( ( rule__MemberElement__OptionalAssignment_0 )? )
            {
            // InternalIdl.g:3843:1: ( ( rule__MemberElement__OptionalAssignment_0 )? )
            // InternalIdl.g:3844:2: ( rule__MemberElement__OptionalAssignment_0 )?
            {
             before(grammarAccess.getMemberElementAccess().getOptionalAssignment_0()); 
            // InternalIdl.g:3845:2: ( rule__MemberElement__OptionalAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==66) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalIdl.g:3845:3: rule__MemberElement__OptionalAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberElement__OptionalAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberElementAccess().getOptionalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberElement__Group__0__Impl"


    // $ANTLR start "rule__MemberElement__Group__1"
    // InternalIdl.g:3853:1: rule__MemberElement__Group__1 : rule__MemberElement__Group__1__Impl rule__MemberElement__Group__2 ;
    public final void rule__MemberElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3857:1: ( rule__MemberElement__Group__1__Impl rule__MemberElement__Group__2 )
            // InternalIdl.g:3858:2: rule__MemberElement__Group__1__Impl rule__MemberElement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__MemberElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberElement__Group__1"


    // $ANTLR start "rule__MemberElement__Group__1__Impl"
    // InternalIdl.g:3865:1: rule__MemberElement__Group__1__Impl : ( ( rule__MemberElement__TypeAssignment_1 ) ) ;
    public final void rule__MemberElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3869:1: ( ( ( rule__MemberElement__TypeAssignment_1 ) ) )
            // InternalIdl.g:3870:1: ( ( rule__MemberElement__TypeAssignment_1 ) )
            {
            // InternalIdl.g:3870:1: ( ( rule__MemberElement__TypeAssignment_1 ) )
            // InternalIdl.g:3871:2: ( rule__MemberElement__TypeAssignment_1 )
            {
             before(grammarAccess.getMemberElementAccess().getTypeAssignment_1()); 
            // InternalIdl.g:3872:2: ( rule__MemberElement__TypeAssignment_1 )
            // InternalIdl.g:3872:3: rule__MemberElement__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MemberElement__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberElementAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberElement__Group__1__Impl"


    // $ANTLR start "rule__MemberElement__Group__2"
    // InternalIdl.g:3880:1: rule__MemberElement__Group__2 : rule__MemberElement__Group__2__Impl ;
    public final void rule__MemberElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3884:1: ( rule__MemberElement__Group__2__Impl )
            // InternalIdl.g:3885:2: rule__MemberElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberElement__Group__2"


    // $ANTLR start "rule__MemberElement__Group__2__Impl"
    // InternalIdl.g:3891:1: rule__MemberElement__Group__2__Impl : ( ( rule__MemberElement__NameAssignment_2 ) ) ;
    public final void rule__MemberElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3895:1: ( ( ( rule__MemberElement__NameAssignment_2 ) ) )
            // InternalIdl.g:3896:1: ( ( rule__MemberElement__NameAssignment_2 ) )
            {
            // InternalIdl.g:3896:1: ( ( rule__MemberElement__NameAssignment_2 ) )
            // InternalIdl.g:3897:2: ( rule__MemberElement__NameAssignment_2 )
            {
             before(grammarAccess.getMemberElementAccess().getNameAssignment_2()); 
            // InternalIdl.g:3898:2: ( rule__MemberElement__NameAssignment_2 )
            // InternalIdl.g:3898:3: rule__MemberElement__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MemberElement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMemberElementAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberElement__Group__2__Impl"


    // $ANTLR start "rule__KeyElement__Group__0"
    // InternalIdl.g:3907:1: rule__KeyElement__Group__0 : rule__KeyElement__Group__0__Impl rule__KeyElement__Group__1 ;
    public final void rule__KeyElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3911:1: ( rule__KeyElement__Group__0__Impl rule__KeyElement__Group__1 )
            // InternalIdl.g:3912:2: rule__KeyElement__Group__0__Impl rule__KeyElement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__KeyElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyElement__Group__0"


    // $ANTLR start "rule__KeyElement__Group__0__Impl"
    // InternalIdl.g:3919:1: rule__KeyElement__Group__0__Impl : ( ( rule__KeyElement__TypeAssignment_0 ) ) ;
    public final void rule__KeyElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3923:1: ( ( ( rule__KeyElement__TypeAssignment_0 ) ) )
            // InternalIdl.g:3924:1: ( ( rule__KeyElement__TypeAssignment_0 ) )
            {
            // InternalIdl.g:3924:1: ( ( rule__KeyElement__TypeAssignment_0 ) )
            // InternalIdl.g:3925:2: ( rule__KeyElement__TypeAssignment_0 )
            {
             before(grammarAccess.getKeyElementAccess().getTypeAssignment_0()); 
            // InternalIdl.g:3926:2: ( rule__KeyElement__TypeAssignment_0 )
            // InternalIdl.g:3926:3: rule__KeyElement__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__KeyElement__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKeyElementAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyElement__Group__0__Impl"


    // $ANTLR start "rule__KeyElement__Group__1"
    // InternalIdl.g:3934:1: rule__KeyElement__Group__1 : rule__KeyElement__Group__1__Impl ;
    public final void rule__KeyElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3938:1: ( rule__KeyElement__Group__1__Impl )
            // InternalIdl.g:3939:2: rule__KeyElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyElement__Group__1"


    // $ANTLR start "rule__KeyElement__Group__1__Impl"
    // InternalIdl.g:3945:1: rule__KeyElement__Group__1__Impl : ( ( rule__KeyElement__KeyNameAssignment_1 ) ) ;
    public final void rule__KeyElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3949:1: ( ( ( rule__KeyElement__KeyNameAssignment_1 ) ) )
            // InternalIdl.g:3950:1: ( ( rule__KeyElement__KeyNameAssignment_1 ) )
            {
            // InternalIdl.g:3950:1: ( ( rule__KeyElement__KeyNameAssignment_1 ) )
            // InternalIdl.g:3951:2: ( rule__KeyElement__KeyNameAssignment_1 )
            {
             before(grammarAccess.getKeyElementAccess().getKeyNameAssignment_1()); 
            // InternalIdl.g:3952:2: ( rule__KeyElement__KeyNameAssignment_1 )
            // InternalIdl.g:3952:3: rule__KeyElement__KeyNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__KeyElement__KeyNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyElementAccess().getKeyNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyElement__Group__1__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__0"
    // InternalIdl.g:3961:1: rule__InterfaceDeclaration__Group__0 : rule__InterfaceDeclaration__Group__0__Impl rule__InterfaceDeclaration__Group__1 ;
    public final void rule__InterfaceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3965:1: ( rule__InterfaceDeclaration__Group__0__Impl rule__InterfaceDeclaration__Group__1 )
            // InternalIdl.g:3966:2: rule__InterfaceDeclaration__Group__0__Impl rule__InterfaceDeclaration__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__InterfaceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__0"


    // $ANTLR start "rule__InterfaceDeclaration__Group__0__Impl"
    // InternalIdl.g:3973:1: rule__InterfaceDeclaration__Group__0__Impl : ( ( rule__InterfaceDeclaration__DocCommentsAssignment_0 )* ) ;
    public final void rule__InterfaceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3977:1: ( ( ( rule__InterfaceDeclaration__DocCommentsAssignment_0 )* ) )
            // InternalIdl.g:3978:1: ( ( rule__InterfaceDeclaration__DocCommentsAssignment_0 )* )
            {
            // InternalIdl.g:3978:1: ( ( rule__InterfaceDeclaration__DocCommentsAssignment_0 )* )
            // InternalIdl.g:3979:2: ( rule__InterfaceDeclaration__DocCommentsAssignment_0 )*
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getDocCommentsAssignment_0()); 
            // InternalIdl.g:3980:2: ( rule__InterfaceDeclaration__DocCommentsAssignment_0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_SL_DOC_COMMENT && LA35_0<=RULE_ML_DOC_COMMENT)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalIdl.g:3980:3: rule__InterfaceDeclaration__DocCommentsAssignment_0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__InterfaceDeclaration__DocCommentsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getInterfaceDeclarationAccess().getDocCommentsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__1"
    // InternalIdl.g:3988:1: rule__InterfaceDeclaration__Group__1 : rule__InterfaceDeclaration__Group__1__Impl rule__InterfaceDeclaration__Group__2 ;
    public final void rule__InterfaceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:3992:1: ( rule__InterfaceDeclaration__Group__1__Impl rule__InterfaceDeclaration__Group__2 )
            // InternalIdl.g:3993:2: rule__InterfaceDeclaration__Group__1__Impl rule__InterfaceDeclaration__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__InterfaceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__1"


    // $ANTLR start "rule__InterfaceDeclaration__Group__1__Impl"
    // InternalIdl.g:4000:1: rule__InterfaceDeclaration__Group__1__Impl : ( ( rule__InterfaceDeclaration__AbstractAssignment_1 )? ) ;
    public final void rule__InterfaceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4004:1: ( ( ( rule__InterfaceDeclaration__AbstractAssignment_1 )? ) )
            // InternalIdl.g:4005:1: ( ( rule__InterfaceDeclaration__AbstractAssignment_1 )? )
            {
            // InternalIdl.g:4005:1: ( ( rule__InterfaceDeclaration__AbstractAssignment_1 )? )
            // InternalIdl.g:4006:2: ( rule__InterfaceDeclaration__AbstractAssignment_1 )?
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getAbstractAssignment_1()); 
            // InternalIdl.g:4007:2: ( rule__InterfaceDeclaration__AbstractAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==67) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalIdl.g:4007:3: rule__InterfaceDeclaration__AbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceDeclaration__AbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceDeclarationAccess().getAbstractAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__2"
    // InternalIdl.g:4015:1: rule__InterfaceDeclaration__Group__2 : rule__InterfaceDeclaration__Group__2__Impl rule__InterfaceDeclaration__Group__3 ;
    public final void rule__InterfaceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4019:1: ( rule__InterfaceDeclaration__Group__2__Impl rule__InterfaceDeclaration__Group__3 )
            // InternalIdl.g:4020:2: rule__InterfaceDeclaration__Group__2__Impl rule__InterfaceDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__InterfaceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__2"


    // $ANTLR start "rule__InterfaceDeclaration__Group__2__Impl"
    // InternalIdl.g:4027:1: rule__InterfaceDeclaration__Group__2__Impl : ( 'interface' ) ;
    public final void rule__InterfaceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4031:1: ( ( 'interface' ) )
            // InternalIdl.g:4032:1: ( 'interface' )
            {
            // InternalIdl.g:4032:1: ( 'interface' )
            // InternalIdl.g:4033:2: 'interface'
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getInterfaceKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getInterfaceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__3"
    // InternalIdl.g:4042:1: rule__InterfaceDeclaration__Group__3 : rule__InterfaceDeclaration__Group__3__Impl rule__InterfaceDeclaration__Group__4 ;
    public final void rule__InterfaceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4046:1: ( rule__InterfaceDeclaration__Group__3__Impl rule__InterfaceDeclaration__Group__4 )
            // InternalIdl.g:4047:2: rule__InterfaceDeclaration__Group__3__Impl rule__InterfaceDeclaration__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__InterfaceDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__3"


    // $ANTLR start "rule__InterfaceDeclaration__Group__3__Impl"
    // InternalIdl.g:4054:1: rule__InterfaceDeclaration__Group__3__Impl : ( ( rule__InterfaceDeclaration__NameAssignment_3 ) ) ;
    public final void rule__InterfaceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4058:1: ( ( ( rule__InterfaceDeclaration__NameAssignment_3 ) ) )
            // InternalIdl.g:4059:1: ( ( rule__InterfaceDeclaration__NameAssignment_3 ) )
            {
            // InternalIdl.g:4059:1: ( ( rule__InterfaceDeclaration__NameAssignment_3 ) )
            // InternalIdl.g:4060:2: ( rule__InterfaceDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getNameAssignment_3()); 
            // InternalIdl.g:4061:2: ( rule__InterfaceDeclaration__NameAssignment_3 )
            // InternalIdl.g:4061:3: rule__InterfaceDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDeclarationAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__3__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__4"
    // InternalIdl.g:4069:1: rule__InterfaceDeclaration__Group__4 : rule__InterfaceDeclaration__Group__4__Impl rule__InterfaceDeclaration__Group__5 ;
    public final void rule__InterfaceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4073:1: ( rule__InterfaceDeclaration__Group__4__Impl rule__InterfaceDeclaration__Group__5 )
            // InternalIdl.g:4074:2: rule__InterfaceDeclaration__Group__4__Impl rule__InterfaceDeclaration__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__InterfaceDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__4"


    // $ANTLR start "rule__InterfaceDeclaration__Group__4__Impl"
    // InternalIdl.g:4081:1: rule__InterfaceDeclaration__Group__4__Impl : ( ( rule__InterfaceDeclaration__Group_4__0 )? ) ;
    public final void rule__InterfaceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4085:1: ( ( ( rule__InterfaceDeclaration__Group_4__0 )? ) )
            // InternalIdl.g:4086:1: ( ( rule__InterfaceDeclaration__Group_4__0 )? )
            {
            // InternalIdl.g:4086:1: ( ( rule__InterfaceDeclaration__Group_4__0 )? )
            // InternalIdl.g:4087:2: ( rule__InterfaceDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getGroup_4()); 
            // InternalIdl.g:4088:2: ( rule__InterfaceDeclaration__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalIdl.g:4088:3: rule__InterfaceDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceDeclaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__4__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__5"
    // InternalIdl.g:4096:1: rule__InterfaceDeclaration__Group__5 : rule__InterfaceDeclaration__Group__5__Impl rule__InterfaceDeclaration__Group__6 ;
    public final void rule__InterfaceDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4100:1: ( rule__InterfaceDeclaration__Group__5__Impl rule__InterfaceDeclaration__Group__6 )
            // InternalIdl.g:4101:2: rule__InterfaceDeclaration__Group__5__Impl rule__InterfaceDeclaration__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__InterfaceDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__5"


    // $ANTLR start "rule__InterfaceDeclaration__Group__5__Impl"
    // InternalIdl.g:4108:1: rule__InterfaceDeclaration__Group__5__Impl : ( ( rule__InterfaceDeclaration__Group_5__0 )? ) ;
    public final void rule__InterfaceDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4112:1: ( ( ( rule__InterfaceDeclaration__Group_5__0 )? ) )
            // InternalIdl.g:4113:1: ( ( rule__InterfaceDeclaration__Group_5__0 )? )
            {
            // InternalIdl.g:4113:1: ( ( rule__InterfaceDeclaration__Group_5__0 )? )
            // InternalIdl.g:4114:2: ( rule__InterfaceDeclaration__Group_5__0 )?
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getGroup_5()); 
            // InternalIdl.g:4115:2: ( rule__InterfaceDeclaration__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==35) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalIdl.g:4115:3: rule__InterfaceDeclaration__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceDeclaration__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceDeclarationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__5__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__6"
    // InternalIdl.g:4123:1: rule__InterfaceDeclaration__Group__6 : rule__InterfaceDeclaration__Group__6__Impl rule__InterfaceDeclaration__Group__7 ;
    public final void rule__InterfaceDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4127:1: ( rule__InterfaceDeclaration__Group__6__Impl rule__InterfaceDeclaration__Group__7 )
            // InternalIdl.g:4128:2: rule__InterfaceDeclaration__Group__6__Impl rule__InterfaceDeclaration__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__InterfaceDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__6"


    // $ANTLR start "rule__InterfaceDeclaration__Group__6__Impl"
    // InternalIdl.g:4135:1: rule__InterfaceDeclaration__Group__6__Impl : ( '{' ) ;
    public final void rule__InterfaceDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4139:1: ( ( '{' ) )
            // InternalIdl.g:4140:1: ( '{' )
            {
            // InternalIdl.g:4140:1: ( '{' )
            // InternalIdl.g:4141:2: '{'
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__6__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__7"
    // InternalIdl.g:4150:1: rule__InterfaceDeclaration__Group__7 : rule__InterfaceDeclaration__Group__7__Impl rule__InterfaceDeclaration__Group__8 ;
    public final void rule__InterfaceDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4154:1: ( rule__InterfaceDeclaration__Group__7__Impl rule__InterfaceDeclaration__Group__8 )
            // InternalIdl.g:4155:2: rule__InterfaceDeclaration__Group__7__Impl rule__InterfaceDeclaration__Group__8
            {
            pushFollow(FOLLOW_39);
            rule__InterfaceDeclaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__7"


    // $ANTLR start "rule__InterfaceDeclaration__Group__7__Impl"
    // InternalIdl.g:4162:1: rule__InterfaceDeclaration__Group__7__Impl : ( ( rule__InterfaceDeclaration__ContainsAssignment_7 )* ) ;
    public final void rule__InterfaceDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4166:1: ( ( ( rule__InterfaceDeclaration__ContainsAssignment_7 )* ) )
            // InternalIdl.g:4167:1: ( ( rule__InterfaceDeclaration__ContainsAssignment_7 )* )
            {
            // InternalIdl.g:4167:1: ( ( rule__InterfaceDeclaration__ContainsAssignment_7 )* )
            // InternalIdl.g:4168:2: ( rule__InterfaceDeclaration__ContainsAssignment_7 )*
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getContainsAssignment_7()); 
            // InternalIdl.g:4169:2: ( rule__InterfaceDeclaration__ContainsAssignment_7 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_SL_DOC_COMMENT && LA39_0<=RULE_ML_DOC_COMMENT)||LA39_0==RULE_ID||LA39_0==33||(LA39_0>=36 && LA39_0<=37)||LA39_0==51||LA39_0==58||(LA39_0>=68 && LA39_0<=69)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalIdl.g:4169:3: rule__InterfaceDeclaration__ContainsAssignment_7
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__InterfaceDeclaration__ContainsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getInterfaceDeclarationAccess().getContainsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__7__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__8"
    // InternalIdl.g:4177:1: rule__InterfaceDeclaration__Group__8 : rule__InterfaceDeclaration__Group__8__Impl ;
    public final void rule__InterfaceDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4181:1: ( rule__InterfaceDeclaration__Group__8__Impl )
            // InternalIdl.g:4182:2: rule__InterfaceDeclaration__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__8"


    // $ANTLR start "rule__InterfaceDeclaration__Group__8__Impl"
    // InternalIdl.g:4188:1: rule__InterfaceDeclaration__Group__8__Impl : ( '}' ) ;
    public final void rule__InterfaceDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4192:1: ( ( '}' ) )
            // InternalIdl.g:4193:1: ( '}' )
            {
            // InternalIdl.g:4193:1: ( '}' )
            // InternalIdl.g:4194:2: '}'
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__8__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4__0"
    // InternalIdl.g:4204:1: rule__InterfaceDeclaration__Group_4__0 : rule__InterfaceDeclaration__Group_4__0__Impl rule__InterfaceDeclaration__Group_4__1 ;
    public final void rule__InterfaceDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4208:1: ( rule__InterfaceDeclaration__Group_4__0__Impl rule__InterfaceDeclaration__Group_4__1 )
            // InternalIdl.g:4209:2: rule__InterfaceDeclaration__Group_4__0__Impl rule__InterfaceDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_41);
            rule__InterfaceDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4__0"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4__0__Impl"
    // InternalIdl.g:4216:1: rule__InterfaceDeclaration__Group_4__0__Impl : ( '[' ) ;
    public final void rule__InterfaceDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4220:1: ( ( '[' ) )
            // InternalIdl.g:4221:1: ( '[' )
            {
            // InternalIdl.g:4221:1: ( '[' )
            // InternalIdl.g:4222:2: '['
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4__1"
    // InternalIdl.g:4231:1: rule__InterfaceDeclaration__Group_4__1 : rule__InterfaceDeclaration__Group_4__1__Impl rule__InterfaceDeclaration__Group_4__2 ;
    public final void rule__InterfaceDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4235:1: ( rule__InterfaceDeclaration__Group_4__1__Impl rule__InterfaceDeclaration__Group_4__2 )
            // InternalIdl.g:4236:2: rule__InterfaceDeclaration__Group_4__1__Impl rule__InterfaceDeclaration__Group_4__2
            {
            pushFollow(FOLLOW_42);
            rule__InterfaceDeclaration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4__1"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4__1__Impl"
    // InternalIdl.g:4243:1: rule__InterfaceDeclaration__Group_4__1__Impl : ( ( rule__InterfaceDeclaration__UnorderedGroup_4_1 ) ) ;
    public final void rule__InterfaceDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4247:1: ( ( ( rule__InterfaceDeclaration__UnorderedGroup_4_1 ) ) )
            // InternalIdl.g:4248:1: ( ( rule__InterfaceDeclaration__UnorderedGroup_4_1 ) )
            {
            // InternalIdl.g:4248:1: ( ( rule__InterfaceDeclaration__UnorderedGroup_4_1 ) )
            // InternalIdl.g:4249:2: ( rule__InterfaceDeclaration__UnorderedGroup_4_1 )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1()); 
            // InternalIdl.g:4250:2: ( rule__InterfaceDeclaration__UnorderedGroup_4_1 )
            // InternalIdl.g:4250:3: rule__InterfaceDeclaration__UnorderedGroup_4_1
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__UnorderedGroup_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4__2"
    // InternalIdl.g:4258:1: rule__InterfaceDeclaration__Group_4__2 : rule__InterfaceDeclaration__Group_4__2__Impl ;
    public final void rule__InterfaceDeclaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4262:1: ( rule__InterfaceDeclaration__Group_4__2__Impl )
            // InternalIdl.g:4263:2: rule__InterfaceDeclaration__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4__2"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4__2__Impl"
    // InternalIdl.g:4269:1: rule__InterfaceDeclaration__Group_4__2__Impl : ( ']' ) ;
    public final void rule__InterfaceDeclaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4273:1: ( ( ']' ) )
            // InternalIdl.g:4274:1: ( ']' )
            {
            // InternalIdl.g:4274:1: ( ']' )
            // InternalIdl.g:4275:2: ']'
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getRightSquareBracketKeyword_4_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getRightSquareBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4__2__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4_1_0__0"
    // InternalIdl.g:4285:1: rule__InterfaceDeclaration__Group_4_1_0__0 : rule__InterfaceDeclaration__Group_4_1_0__0__Impl rule__InterfaceDeclaration__Group_4_1_0__1 ;
    public final void rule__InterfaceDeclaration__Group_4_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4289:1: ( rule__InterfaceDeclaration__Group_4_1_0__0__Impl rule__InterfaceDeclaration__Group_4_1_0__1 )
            // InternalIdl.g:4290:2: rule__InterfaceDeclaration__Group_4_1_0__0__Impl rule__InterfaceDeclaration__Group_4_1_0__1
            {
            pushFollow(FOLLOW_29);
            rule__InterfaceDeclaration__Group_4_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_4_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4_1_0__0"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4_1_0__0__Impl"
    // InternalIdl.g:4297:1: rule__InterfaceDeclaration__Group_4_1_0__0__Impl : ( 'version' ) ;
    public final void rule__InterfaceDeclaration__Group_4_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4301:1: ( ( 'version' ) )
            // InternalIdl.g:4302:1: ( 'version' )
            {
            // InternalIdl.g:4302:1: ( 'version' )
            // InternalIdl.g:4303:2: 'version'
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getVersionKeyword_4_1_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getVersionKeyword_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4_1_0__0__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4_1_0__1"
    // InternalIdl.g:4312:1: rule__InterfaceDeclaration__Group_4_1_0__1 : rule__InterfaceDeclaration__Group_4_1_0__1__Impl rule__InterfaceDeclaration__Group_4_1_0__2 ;
    public final void rule__InterfaceDeclaration__Group_4_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4316:1: ( rule__InterfaceDeclaration__Group_4_1_0__1__Impl rule__InterfaceDeclaration__Group_4_1_0__2 )
            // InternalIdl.g:4317:2: rule__InterfaceDeclaration__Group_4_1_0__1__Impl rule__InterfaceDeclaration__Group_4_1_0__2
            {
            pushFollow(FOLLOW_43);
            rule__InterfaceDeclaration__Group_4_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_4_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4_1_0__1"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4_1_0__1__Impl"
    // InternalIdl.g:4324:1: rule__InterfaceDeclaration__Group_4_1_0__1__Impl : ( '=' ) ;
    public final void rule__InterfaceDeclaration__Group_4_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4328:1: ( ( '=' ) )
            // InternalIdl.g:4329:1: ( '=' )
            {
            // InternalIdl.g:4329:1: ( '=' )
            // InternalIdl.g:4330:2: '='
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getEqualsSignKeyword_4_1_0_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getEqualsSignKeyword_4_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4_1_0__1__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4_1_0__2"
    // InternalIdl.g:4339:1: rule__InterfaceDeclaration__Group_4_1_0__2 : rule__InterfaceDeclaration__Group_4_1_0__2__Impl ;
    public final void rule__InterfaceDeclaration__Group_4_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4343:1: ( rule__InterfaceDeclaration__Group_4_1_0__2__Impl )
            // InternalIdl.g:4344:2: rule__InterfaceDeclaration__Group_4_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_4_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4_1_0__2"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4_1_0__2__Impl"
    // InternalIdl.g:4350:1: rule__InterfaceDeclaration__Group_4_1_0__2__Impl : ( ( rule__InterfaceDeclaration__VersionAssignment_4_1_0_2 ) ) ;
    public final void rule__InterfaceDeclaration__Group_4_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4354:1: ( ( ( rule__InterfaceDeclaration__VersionAssignment_4_1_0_2 ) ) )
            // InternalIdl.g:4355:1: ( ( rule__InterfaceDeclaration__VersionAssignment_4_1_0_2 ) )
            {
            // InternalIdl.g:4355:1: ( ( rule__InterfaceDeclaration__VersionAssignment_4_1_0_2 ) )
            // InternalIdl.g:4356:2: ( rule__InterfaceDeclaration__VersionAssignment_4_1_0_2 )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getVersionAssignment_4_1_0_2()); 
            // InternalIdl.g:4357:2: ( rule__InterfaceDeclaration__VersionAssignment_4_1_0_2 )
            // InternalIdl.g:4357:3: rule__InterfaceDeclaration__VersionAssignment_4_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__VersionAssignment_4_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDeclarationAccess().getVersionAssignment_4_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4_1_0__2__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4_1_1__0"
    // InternalIdl.g:4366:1: rule__InterfaceDeclaration__Group_4_1_1__0 : rule__InterfaceDeclaration__Group_4_1_1__0__Impl rule__InterfaceDeclaration__Group_4_1_1__1 ;
    public final void rule__InterfaceDeclaration__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4370:1: ( rule__InterfaceDeclaration__Group_4_1_1__0__Impl rule__InterfaceDeclaration__Group_4_1_1__1 )
            // InternalIdl.g:4371:2: rule__InterfaceDeclaration__Group_4_1_1__0__Impl rule__InterfaceDeclaration__Group_4_1_1__1
            {
            pushFollow(FOLLOW_29);
            rule__InterfaceDeclaration__Group_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_4_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4_1_1__0"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4_1_1__0__Impl"
    // InternalIdl.g:4378:1: rule__InterfaceDeclaration__Group_4_1_1__0__Impl : ( 'guid' ) ;
    public final void rule__InterfaceDeclaration__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4382:1: ( ( 'guid' ) )
            // InternalIdl.g:4383:1: ( 'guid' )
            {
            // InternalIdl.g:4383:1: ( 'guid' )
            // InternalIdl.g:4384:2: 'guid'
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getGuidKeyword_4_1_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getGuidKeyword_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4_1_1__1"
    // InternalIdl.g:4393:1: rule__InterfaceDeclaration__Group_4_1_1__1 : rule__InterfaceDeclaration__Group_4_1_1__1__Impl rule__InterfaceDeclaration__Group_4_1_1__2 ;
    public final void rule__InterfaceDeclaration__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4397:1: ( rule__InterfaceDeclaration__Group_4_1_1__1__Impl rule__InterfaceDeclaration__Group_4_1_1__2 )
            // InternalIdl.g:4398:2: rule__InterfaceDeclaration__Group_4_1_1__1__Impl rule__InterfaceDeclaration__Group_4_1_1__2
            {
            pushFollow(FOLLOW_44);
            rule__InterfaceDeclaration__Group_4_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_4_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4_1_1__1"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4_1_1__1__Impl"
    // InternalIdl.g:4405:1: rule__InterfaceDeclaration__Group_4_1_1__1__Impl : ( '=' ) ;
    public final void rule__InterfaceDeclaration__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4409:1: ( ( '=' ) )
            // InternalIdl.g:4410:1: ( '=' )
            {
            // InternalIdl.g:4410:1: ( '=' )
            // InternalIdl.g:4411:2: '='
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getEqualsSignKeyword_4_1_1_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getEqualsSignKeyword_4_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4_1_1__2"
    // InternalIdl.g:4420:1: rule__InterfaceDeclaration__Group_4_1_1__2 : rule__InterfaceDeclaration__Group_4_1_1__2__Impl ;
    public final void rule__InterfaceDeclaration__Group_4_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4424:1: ( rule__InterfaceDeclaration__Group_4_1_1__2__Impl )
            // InternalIdl.g:4425:2: rule__InterfaceDeclaration__Group_4_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_4_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4_1_1__2"


    // $ANTLR start "rule__InterfaceDeclaration__Group_4_1_1__2__Impl"
    // InternalIdl.g:4431:1: rule__InterfaceDeclaration__Group_4_1_1__2__Impl : ( ( rule__InterfaceDeclaration__GuidAssignment_4_1_1_2 ) ) ;
    public final void rule__InterfaceDeclaration__Group_4_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4435:1: ( ( ( rule__InterfaceDeclaration__GuidAssignment_4_1_1_2 ) ) )
            // InternalIdl.g:4436:1: ( ( rule__InterfaceDeclaration__GuidAssignment_4_1_1_2 ) )
            {
            // InternalIdl.g:4436:1: ( ( rule__InterfaceDeclaration__GuidAssignment_4_1_1_2 ) )
            // InternalIdl.g:4437:2: ( rule__InterfaceDeclaration__GuidAssignment_4_1_1_2 )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getGuidAssignment_4_1_1_2()); 
            // InternalIdl.g:4438:2: ( rule__InterfaceDeclaration__GuidAssignment_4_1_1_2 )
            // InternalIdl.g:4438:3: rule__InterfaceDeclaration__GuidAssignment_4_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__GuidAssignment_4_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDeclarationAccess().getGuidAssignment_4_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_4_1_1__2__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_5__0"
    // InternalIdl.g:4447:1: rule__InterfaceDeclaration__Group_5__0 : rule__InterfaceDeclaration__Group_5__0__Impl rule__InterfaceDeclaration__Group_5__1 ;
    public final void rule__InterfaceDeclaration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4451:1: ( rule__InterfaceDeclaration__Group_5__0__Impl rule__InterfaceDeclaration__Group_5__1 )
            // InternalIdl.g:4452:2: rule__InterfaceDeclaration__Group_5__0__Impl rule__InterfaceDeclaration__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__InterfaceDeclaration__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_5__0"


    // $ANTLR start "rule__InterfaceDeclaration__Group_5__0__Impl"
    // InternalIdl.g:4459:1: rule__InterfaceDeclaration__Group_5__0__Impl : ( ':' ) ;
    public final void rule__InterfaceDeclaration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4463:1: ( ( ':' ) )
            // InternalIdl.g:4464:1: ( ':' )
            {
            // InternalIdl.g:4464:1: ( ':' )
            // InternalIdl.g:4465:2: ':'
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getColonKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getColonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_5__0__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_5__1"
    // InternalIdl.g:4474:1: rule__InterfaceDeclaration__Group_5__1 : rule__InterfaceDeclaration__Group_5__1__Impl rule__InterfaceDeclaration__Group_5__2 ;
    public final void rule__InterfaceDeclaration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4478:1: ( rule__InterfaceDeclaration__Group_5__1__Impl rule__InterfaceDeclaration__Group_5__2 )
            // InternalIdl.g:4479:2: rule__InterfaceDeclaration__Group_5__1__Impl rule__InterfaceDeclaration__Group_5__2
            {
            pushFollow(FOLLOW_24);
            rule__InterfaceDeclaration__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_5__1"


    // $ANTLR start "rule__InterfaceDeclaration__Group_5__1__Impl"
    // InternalIdl.g:4486:1: rule__InterfaceDeclaration__Group_5__1__Impl : ( ( rule__InterfaceDeclaration__DerivesFromAssignment_5_1 ) ) ;
    public final void rule__InterfaceDeclaration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4490:1: ( ( ( rule__InterfaceDeclaration__DerivesFromAssignment_5_1 ) ) )
            // InternalIdl.g:4491:1: ( ( rule__InterfaceDeclaration__DerivesFromAssignment_5_1 ) )
            {
            // InternalIdl.g:4491:1: ( ( rule__InterfaceDeclaration__DerivesFromAssignment_5_1 ) )
            // InternalIdl.g:4492:2: ( rule__InterfaceDeclaration__DerivesFromAssignment_5_1 )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromAssignment_5_1()); 
            // InternalIdl.g:4493:2: ( rule__InterfaceDeclaration__DerivesFromAssignment_5_1 )
            // InternalIdl.g:4493:3: rule__InterfaceDeclaration__DerivesFromAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__DerivesFromAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_5__1__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_5__2"
    // InternalIdl.g:4501:1: rule__InterfaceDeclaration__Group_5__2 : rule__InterfaceDeclaration__Group_5__2__Impl ;
    public final void rule__InterfaceDeclaration__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4505:1: ( rule__InterfaceDeclaration__Group_5__2__Impl )
            // InternalIdl.g:4506:2: rule__InterfaceDeclaration__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_5__2"


    // $ANTLR start "rule__InterfaceDeclaration__Group_5__2__Impl"
    // InternalIdl.g:4512:1: rule__InterfaceDeclaration__Group_5__2__Impl : ( ( rule__InterfaceDeclaration__Group_5_2__0 )* ) ;
    public final void rule__InterfaceDeclaration__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4516:1: ( ( ( rule__InterfaceDeclaration__Group_5_2__0 )* ) )
            // InternalIdl.g:4517:1: ( ( rule__InterfaceDeclaration__Group_5_2__0 )* )
            {
            // InternalIdl.g:4517:1: ( ( rule__InterfaceDeclaration__Group_5_2__0 )* )
            // InternalIdl.g:4518:2: ( rule__InterfaceDeclaration__Group_5_2__0 )*
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getGroup_5_2()); 
            // InternalIdl.g:4519:2: ( rule__InterfaceDeclaration__Group_5_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==38) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalIdl.g:4519:3: rule__InterfaceDeclaration__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__InterfaceDeclaration__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getInterfaceDeclarationAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_5__2__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_5_2__0"
    // InternalIdl.g:4528:1: rule__InterfaceDeclaration__Group_5_2__0 : rule__InterfaceDeclaration__Group_5_2__0__Impl rule__InterfaceDeclaration__Group_5_2__1 ;
    public final void rule__InterfaceDeclaration__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4532:1: ( rule__InterfaceDeclaration__Group_5_2__0__Impl rule__InterfaceDeclaration__Group_5_2__1 )
            // InternalIdl.g:4533:2: rule__InterfaceDeclaration__Group_5_2__0__Impl rule__InterfaceDeclaration__Group_5_2__1
            {
            pushFollow(FOLLOW_6);
            rule__InterfaceDeclaration__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_5_2__0"


    // $ANTLR start "rule__InterfaceDeclaration__Group_5_2__0__Impl"
    // InternalIdl.g:4540:1: rule__InterfaceDeclaration__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__InterfaceDeclaration__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4544:1: ( ( ',' ) )
            // InternalIdl.g:4545:1: ( ',' )
            {
            // InternalIdl.g:4545:1: ( ',' )
            // InternalIdl.g:4546:2: ','
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getCommaKeyword_5_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_5_2__0__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group_5_2__1"
    // InternalIdl.g:4555:1: rule__InterfaceDeclaration__Group_5_2__1 : rule__InterfaceDeclaration__Group_5_2__1__Impl ;
    public final void rule__InterfaceDeclaration__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4559:1: ( rule__InterfaceDeclaration__Group_5_2__1__Impl )
            // InternalIdl.g:4560:2: rule__InterfaceDeclaration__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_5_2__1"


    // $ANTLR start "rule__InterfaceDeclaration__Group_5_2__1__Impl"
    // InternalIdl.g:4566:1: rule__InterfaceDeclaration__Group_5_2__1__Impl : ( ( rule__InterfaceDeclaration__DerivesFromAssignment_5_2_1 ) ) ;
    public final void rule__InterfaceDeclaration__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4570:1: ( ( ( rule__InterfaceDeclaration__DerivesFromAssignment_5_2_1 ) ) )
            // InternalIdl.g:4571:1: ( ( rule__InterfaceDeclaration__DerivesFromAssignment_5_2_1 ) )
            {
            // InternalIdl.g:4571:1: ( ( rule__InterfaceDeclaration__DerivesFromAssignment_5_2_1 ) )
            // InternalIdl.g:4572:2: ( rule__InterfaceDeclaration__DerivesFromAssignment_5_2_1 )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromAssignment_5_2_1()); 
            // InternalIdl.g:4573:2: ( rule__InterfaceDeclaration__DerivesFromAssignment_5_2_1 )
            // InternalIdl.g:4573:3: rule__InterfaceDeclaration__DerivesFromAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__DerivesFromAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group_5_2__1__Impl"


    // $ANTLR start "rule__AbstractInterfaceComponent__Group_0__0"
    // InternalIdl.g:4582:1: rule__AbstractInterfaceComponent__Group_0__0 : rule__AbstractInterfaceComponent__Group_0__0__Impl rule__AbstractInterfaceComponent__Group_0__1 ;
    public final void rule__AbstractInterfaceComponent__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4586:1: ( rule__AbstractInterfaceComponent__Group_0__0__Impl rule__AbstractInterfaceComponent__Group_0__1 )
            // InternalIdl.g:4587:2: rule__AbstractInterfaceComponent__Group_0__0__Impl rule__AbstractInterfaceComponent__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__AbstractInterfaceComponent__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractInterfaceComponent__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInterfaceComponent__Group_0__0"


    // $ANTLR start "rule__AbstractInterfaceComponent__Group_0__0__Impl"
    // InternalIdl.g:4594:1: rule__AbstractInterfaceComponent__Group_0__0__Impl : ( ruleAbstractTypeDeclaration ) ;
    public final void rule__AbstractInterfaceComponent__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4598:1: ( ( ruleAbstractTypeDeclaration ) )
            // InternalIdl.g:4599:1: ( ruleAbstractTypeDeclaration )
            {
            // InternalIdl.g:4599:1: ( ruleAbstractTypeDeclaration )
            // InternalIdl.g:4600:2: ruleAbstractTypeDeclaration
            {
             before(grammarAccess.getAbstractInterfaceComponentAccess().getAbstractTypeDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getAbstractInterfaceComponentAccess().getAbstractTypeDeclarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInterfaceComponent__Group_0__0__Impl"


    // $ANTLR start "rule__AbstractInterfaceComponent__Group_0__1"
    // InternalIdl.g:4609:1: rule__AbstractInterfaceComponent__Group_0__1 : rule__AbstractInterfaceComponent__Group_0__1__Impl ;
    public final void rule__AbstractInterfaceComponent__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4613:1: ( rule__AbstractInterfaceComponent__Group_0__1__Impl )
            // InternalIdl.g:4614:2: rule__AbstractInterfaceComponent__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractInterfaceComponent__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInterfaceComponent__Group_0__1"


    // $ANTLR start "rule__AbstractInterfaceComponent__Group_0__1__Impl"
    // InternalIdl.g:4620:1: rule__AbstractInterfaceComponent__Group_0__1__Impl : ( ';' ) ;
    public final void rule__AbstractInterfaceComponent__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4624:1: ( ( ';' ) )
            // InternalIdl.g:4625:1: ( ';' )
            {
            // InternalIdl.g:4625:1: ( ';' )
            // InternalIdl.g:4626:2: ';'
            {
             before(grammarAccess.getAbstractInterfaceComponentAccess().getSemicolonKeyword_0_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAbstractInterfaceComponentAccess().getSemicolonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInterfaceComponent__Group_0__1__Impl"


    // $ANTLR start "rule__AbstractInterfaceComponent__Group_1__0"
    // InternalIdl.g:4636:1: rule__AbstractInterfaceComponent__Group_1__0 : rule__AbstractInterfaceComponent__Group_1__0__Impl rule__AbstractInterfaceComponent__Group_1__1 ;
    public final void rule__AbstractInterfaceComponent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4640:1: ( rule__AbstractInterfaceComponent__Group_1__0__Impl rule__AbstractInterfaceComponent__Group_1__1 )
            // InternalIdl.g:4641:2: rule__AbstractInterfaceComponent__Group_1__0__Impl rule__AbstractInterfaceComponent__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__AbstractInterfaceComponent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractInterfaceComponent__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInterfaceComponent__Group_1__0"


    // $ANTLR start "rule__AbstractInterfaceComponent__Group_1__0__Impl"
    // InternalIdl.g:4648:1: rule__AbstractInterfaceComponent__Group_1__0__Impl : ( ruleFunctionDeclaration ) ;
    public final void rule__AbstractInterfaceComponent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4652:1: ( ( ruleFunctionDeclaration ) )
            // InternalIdl.g:4653:1: ( ruleFunctionDeclaration )
            {
            // InternalIdl.g:4653:1: ( ruleFunctionDeclaration )
            // InternalIdl.g:4654:2: ruleFunctionDeclaration
            {
             before(grammarAccess.getAbstractInterfaceComponentAccess().getFunctionDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionDeclaration();

            state._fsp--;

             after(grammarAccess.getAbstractInterfaceComponentAccess().getFunctionDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInterfaceComponent__Group_1__0__Impl"


    // $ANTLR start "rule__AbstractInterfaceComponent__Group_1__1"
    // InternalIdl.g:4663:1: rule__AbstractInterfaceComponent__Group_1__1 : rule__AbstractInterfaceComponent__Group_1__1__Impl ;
    public final void rule__AbstractInterfaceComponent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4667:1: ( rule__AbstractInterfaceComponent__Group_1__1__Impl )
            // InternalIdl.g:4668:2: rule__AbstractInterfaceComponent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractInterfaceComponent__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInterfaceComponent__Group_1__1"


    // $ANTLR start "rule__AbstractInterfaceComponent__Group_1__1__Impl"
    // InternalIdl.g:4674:1: rule__AbstractInterfaceComponent__Group_1__1__Impl : ( ';' ) ;
    public final void rule__AbstractInterfaceComponent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4678:1: ( ( ';' ) )
            // InternalIdl.g:4679:1: ( ';' )
            {
            // InternalIdl.g:4679:1: ( ';' )
            // InternalIdl.g:4680:2: ';'
            {
             before(grammarAccess.getAbstractInterfaceComponentAccess().getSemicolonKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAbstractInterfaceComponentAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInterfaceComponent__Group_1__1__Impl"


    // $ANTLR start "rule__AbstractInterfaceComponent__Group_2__0"
    // InternalIdl.g:4690:1: rule__AbstractInterfaceComponent__Group_2__0 : rule__AbstractInterfaceComponent__Group_2__0__Impl rule__AbstractInterfaceComponent__Group_2__1 ;
    public final void rule__AbstractInterfaceComponent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4694:1: ( rule__AbstractInterfaceComponent__Group_2__0__Impl rule__AbstractInterfaceComponent__Group_2__1 )
            // InternalIdl.g:4695:2: rule__AbstractInterfaceComponent__Group_2__0__Impl rule__AbstractInterfaceComponent__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__AbstractInterfaceComponent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractInterfaceComponent__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInterfaceComponent__Group_2__0"


    // $ANTLR start "rule__AbstractInterfaceComponent__Group_2__0__Impl"
    // InternalIdl.g:4702:1: rule__AbstractInterfaceComponent__Group_2__0__Impl : ( ruleEventDeclaration ) ;
    public final void rule__AbstractInterfaceComponent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4706:1: ( ( ruleEventDeclaration ) )
            // InternalIdl.g:4707:1: ( ruleEventDeclaration )
            {
            // InternalIdl.g:4707:1: ( ruleEventDeclaration )
            // InternalIdl.g:4708:2: ruleEventDeclaration
            {
             before(grammarAccess.getAbstractInterfaceComponentAccess().getEventDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEventDeclaration();

            state._fsp--;

             after(grammarAccess.getAbstractInterfaceComponentAccess().getEventDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInterfaceComponent__Group_2__0__Impl"


    // $ANTLR start "rule__AbstractInterfaceComponent__Group_2__1"
    // InternalIdl.g:4717:1: rule__AbstractInterfaceComponent__Group_2__1 : rule__AbstractInterfaceComponent__Group_2__1__Impl ;
    public final void rule__AbstractInterfaceComponent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4721:1: ( rule__AbstractInterfaceComponent__Group_2__1__Impl )
            // InternalIdl.g:4722:2: rule__AbstractInterfaceComponent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractInterfaceComponent__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInterfaceComponent__Group_2__1"


    // $ANTLR start "rule__AbstractInterfaceComponent__Group_2__1__Impl"
    // InternalIdl.g:4728:1: rule__AbstractInterfaceComponent__Group_2__1__Impl : ( ';' ) ;
    public final void rule__AbstractInterfaceComponent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4732:1: ( ( ';' ) )
            // InternalIdl.g:4733:1: ( ';' )
            {
            // InternalIdl.g:4733:1: ( ';' )
            // InternalIdl.g:4734:2: ';'
            {
             before(grammarAccess.getAbstractInterfaceComponentAccess().getSemicolonKeyword_2_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAbstractInterfaceComponentAccess().getSemicolonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractInterfaceComponent__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__0"
    // InternalIdl.g:4744:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4748:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // InternalIdl.g:4749:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__FunctionDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__0"


    // $ANTLR start "rule__FunctionDeclaration__Group__0__Impl"
    // InternalIdl.g:4756:1: rule__FunctionDeclaration__Group__0__Impl : ( ( rule__FunctionDeclaration__DocCommentsAssignment_0 )* ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4760:1: ( ( ( rule__FunctionDeclaration__DocCommentsAssignment_0 )* ) )
            // InternalIdl.g:4761:1: ( ( rule__FunctionDeclaration__DocCommentsAssignment_0 )* )
            {
            // InternalIdl.g:4761:1: ( ( rule__FunctionDeclaration__DocCommentsAssignment_0 )* )
            // InternalIdl.g:4762:2: ( rule__FunctionDeclaration__DocCommentsAssignment_0 )*
            {
             before(grammarAccess.getFunctionDeclarationAccess().getDocCommentsAssignment_0()); 
            // InternalIdl.g:4763:2: ( rule__FunctionDeclaration__DocCommentsAssignment_0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_SL_DOC_COMMENT && LA41_0<=RULE_ML_DOC_COMMENT)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalIdl.g:4763:3: rule__FunctionDeclaration__DocCommentsAssignment_0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__FunctionDeclaration__DocCommentsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getFunctionDeclarationAccess().getDocCommentsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__1"
    // InternalIdl.g:4771:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4775:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // InternalIdl.g:4776:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__FunctionDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__1"


    // $ANTLR start "rule__FunctionDeclaration__Group__1__Impl"
    // InternalIdl.g:4783:1: rule__FunctionDeclaration__Group__1__Impl : ( ( rule__FunctionDeclaration__SyncAssignment_1 )? ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4787:1: ( ( ( rule__FunctionDeclaration__SyncAssignment_1 )? ) )
            // InternalIdl.g:4788:1: ( ( rule__FunctionDeclaration__SyncAssignment_1 )? )
            {
            // InternalIdl.g:4788:1: ( ( rule__FunctionDeclaration__SyncAssignment_1 )? )
            // InternalIdl.g:4789:2: ( rule__FunctionDeclaration__SyncAssignment_1 )?
            {
             before(grammarAccess.getFunctionDeclarationAccess().getSyncAssignment_1()); 
            // InternalIdl.g:4790:2: ( rule__FunctionDeclaration__SyncAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==68) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalIdl.g:4790:3: rule__FunctionDeclaration__SyncAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDeclaration__SyncAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclarationAccess().getSyncAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__2"
    // InternalIdl.g:4798:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4802:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // InternalIdl.g:4803:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__FunctionDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__2"


    // $ANTLR start "rule__FunctionDeclaration__Group__2__Impl"
    // InternalIdl.g:4810:1: rule__FunctionDeclaration__Group__2__Impl : ( ( rule__FunctionDeclaration__QueryAssignment_2 )? ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4814:1: ( ( ( rule__FunctionDeclaration__QueryAssignment_2 )? ) )
            // InternalIdl.g:4815:1: ( ( rule__FunctionDeclaration__QueryAssignment_2 )? )
            {
            // InternalIdl.g:4815:1: ( ( rule__FunctionDeclaration__QueryAssignment_2 )? )
            // InternalIdl.g:4816:2: ( rule__FunctionDeclaration__QueryAssignment_2 )?
            {
             before(grammarAccess.getFunctionDeclarationAccess().getQueryAssignment_2()); 
            // InternalIdl.g:4817:2: ( rule__FunctionDeclaration__QueryAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==69) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalIdl.g:4817:3: rule__FunctionDeclaration__QueryAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDeclaration__QueryAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclarationAccess().getQueryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__3"
    // InternalIdl.g:4825:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4829:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // InternalIdl.g:4830:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__FunctionDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__3"


    // $ANTLR start "rule__FunctionDeclaration__Group__3__Impl"
    // InternalIdl.g:4837:1: rule__FunctionDeclaration__Group__3__Impl : ( ( rule__FunctionDeclaration__NameAssignment_3 ) ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4841:1: ( ( ( rule__FunctionDeclaration__NameAssignment_3 ) ) )
            // InternalIdl.g:4842:1: ( ( rule__FunctionDeclaration__NameAssignment_3 ) )
            {
            // InternalIdl.g:4842:1: ( ( rule__FunctionDeclaration__NameAssignment_3 ) )
            // InternalIdl.g:4843:2: ( rule__FunctionDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_3()); 
            // InternalIdl.g:4844:2: ( rule__FunctionDeclaration__NameAssignment_3 )
            // InternalIdl.g:4844:3: rule__FunctionDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__3__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__4"
    // InternalIdl.g:4852:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5 ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4856:1: ( rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5 )
            // InternalIdl.g:4857:2: rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5
            {
            pushFollow(FOLLOW_47);
            rule__FunctionDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__4"


    // $ANTLR start "rule__FunctionDeclaration__Group__4__Impl"
    // InternalIdl.g:4864:1: rule__FunctionDeclaration__Group__4__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4868:1: ( ( '(' ) )
            // InternalIdl.g:4869:1: ( '(' )
            {
            // InternalIdl.g:4869:1: ( '(' )
            // InternalIdl.g:4870:2: '('
            {
             before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_4()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__4__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__5"
    // InternalIdl.g:4879:1: rule__FunctionDeclaration__Group__5 : rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6 ;
    public final void rule__FunctionDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4883:1: ( rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6 )
            // InternalIdl.g:4884:2: rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6
            {
            pushFollow(FOLLOW_47);
            rule__FunctionDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__5"


    // $ANTLR start "rule__FunctionDeclaration__Group__5__Impl"
    // InternalIdl.g:4891:1: rule__FunctionDeclaration__Group__5__Impl : ( ( rule__FunctionDeclaration__Group_5__0 )? ) ;
    public final void rule__FunctionDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4895:1: ( ( ( rule__FunctionDeclaration__Group_5__0 )? ) )
            // InternalIdl.g:4896:1: ( ( rule__FunctionDeclaration__Group_5__0 )? )
            {
            // InternalIdl.g:4896:1: ( ( rule__FunctionDeclaration__Group_5__0 )? )
            // InternalIdl.g:4897:2: ( rule__FunctionDeclaration__Group_5__0 )?
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_5()); 
            // InternalIdl.g:4898:2: ( rule__FunctionDeclaration__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=26 && LA44_0<=27)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalIdl.g:4898:3: rule__FunctionDeclaration__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDeclaration__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__5__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__6"
    // InternalIdl.g:4906:1: rule__FunctionDeclaration__Group__6 : rule__FunctionDeclaration__Group__6__Impl rule__FunctionDeclaration__Group__7 ;
    public final void rule__FunctionDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4910:1: ( rule__FunctionDeclaration__Group__6__Impl rule__FunctionDeclaration__Group__7 )
            // InternalIdl.g:4911:2: rule__FunctionDeclaration__Group__6__Impl rule__FunctionDeclaration__Group__7
            {
            pushFollow(FOLLOW_48);
            rule__FunctionDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__6"


    // $ANTLR start "rule__FunctionDeclaration__Group__6__Impl"
    // InternalIdl.g:4918:1: rule__FunctionDeclaration__Group__6__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4922:1: ( ( ')' ) )
            // InternalIdl.g:4923:1: ( ')' )
            {
            // InternalIdl.g:4923:1: ( ')' )
            // InternalIdl.g:4924:2: ')'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_6()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__6__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__7"
    // InternalIdl.g:4933:1: rule__FunctionDeclaration__Group__7 : rule__FunctionDeclaration__Group__7__Impl ;
    public final void rule__FunctionDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4937:1: ( rule__FunctionDeclaration__Group__7__Impl )
            // InternalIdl.g:4938:2: rule__FunctionDeclaration__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__7"


    // $ANTLR start "rule__FunctionDeclaration__Group__7__Impl"
    // InternalIdl.g:4944:1: rule__FunctionDeclaration__Group__7__Impl : ( ( rule__FunctionDeclaration__Group_7__0 ) ) ;
    public final void rule__FunctionDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4948:1: ( ( ( rule__FunctionDeclaration__Group_7__0 ) ) )
            // InternalIdl.g:4949:1: ( ( rule__FunctionDeclaration__Group_7__0 ) )
            {
            // InternalIdl.g:4949:1: ( ( rule__FunctionDeclaration__Group_7__0 ) )
            // InternalIdl.g:4950:2: ( rule__FunctionDeclaration__Group_7__0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_7()); 
            // InternalIdl.g:4951:2: ( rule__FunctionDeclaration__Group_7__0 )
            // InternalIdl.g:4951:3: rule__FunctionDeclaration__Group_7__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__7__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_5__0"
    // InternalIdl.g:4960:1: rule__FunctionDeclaration__Group_5__0 : rule__FunctionDeclaration__Group_5__0__Impl rule__FunctionDeclaration__Group_5__1 ;
    public final void rule__FunctionDeclaration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4964:1: ( rule__FunctionDeclaration__Group_5__0__Impl rule__FunctionDeclaration__Group_5__1 )
            // InternalIdl.g:4965:2: rule__FunctionDeclaration__Group_5__0__Impl rule__FunctionDeclaration__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__FunctionDeclaration__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_5__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_5__0__Impl"
    // InternalIdl.g:4972:1: rule__FunctionDeclaration__Group_5__0__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_5_0 ) ) ;
    public final void rule__FunctionDeclaration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4976:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_5_0 ) ) )
            // InternalIdl.g:4977:1: ( ( rule__FunctionDeclaration__ParametersAssignment_5_0 ) )
            {
            // InternalIdl.g:4977:1: ( ( rule__FunctionDeclaration__ParametersAssignment_5_0 ) )
            // InternalIdl.g:4978:2: ( rule__FunctionDeclaration__ParametersAssignment_5_0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_5_0()); 
            // InternalIdl.g:4979:2: ( rule__FunctionDeclaration__ParametersAssignment_5_0 )
            // InternalIdl.g:4979:3: rule__FunctionDeclaration__ParametersAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__ParametersAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_5__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_5__1"
    // InternalIdl.g:4987:1: rule__FunctionDeclaration__Group_5__1 : rule__FunctionDeclaration__Group_5__1__Impl ;
    public final void rule__FunctionDeclaration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:4991:1: ( rule__FunctionDeclaration__Group_5__1__Impl )
            // InternalIdl.g:4992:2: rule__FunctionDeclaration__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_5__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_5__1__Impl"
    // InternalIdl.g:4998:1: rule__FunctionDeclaration__Group_5__1__Impl : ( ( rule__FunctionDeclaration__Group_5_1__0 )* ) ;
    public final void rule__FunctionDeclaration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5002:1: ( ( ( rule__FunctionDeclaration__Group_5_1__0 )* ) )
            // InternalIdl.g:5003:1: ( ( rule__FunctionDeclaration__Group_5_1__0 )* )
            {
            // InternalIdl.g:5003:1: ( ( rule__FunctionDeclaration__Group_5_1__0 )* )
            // InternalIdl.g:5004:2: ( rule__FunctionDeclaration__Group_5_1__0 )*
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_5_1()); 
            // InternalIdl.g:5005:2: ( rule__FunctionDeclaration__Group_5_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==38) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalIdl.g:5005:3: rule__FunctionDeclaration__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__FunctionDeclaration__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_5__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_5_1__0"
    // InternalIdl.g:5014:1: rule__FunctionDeclaration__Group_5_1__0 : rule__FunctionDeclaration__Group_5_1__0__Impl rule__FunctionDeclaration__Group_5_1__1 ;
    public final void rule__FunctionDeclaration__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5018:1: ( rule__FunctionDeclaration__Group_5_1__0__Impl rule__FunctionDeclaration__Group_5_1__1 )
            // InternalIdl.g:5019:2: rule__FunctionDeclaration__Group_5_1__0__Impl rule__FunctionDeclaration__Group_5_1__1
            {
            pushFollow(FOLLOW_49);
            rule__FunctionDeclaration__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_5_1__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_5_1__0__Impl"
    // InternalIdl.g:5026:1: rule__FunctionDeclaration__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionDeclaration__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5030:1: ( ( ',' ) )
            // InternalIdl.g:5031:1: ( ',' )
            {
            // InternalIdl.g:5031:1: ( ',' )
            // InternalIdl.g:5032:2: ','
            {
             before(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_5_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_5_1__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_5_1__1"
    // InternalIdl.g:5041:1: rule__FunctionDeclaration__Group_5_1__1 : rule__FunctionDeclaration__Group_5_1__1__Impl ;
    public final void rule__FunctionDeclaration__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5045:1: ( rule__FunctionDeclaration__Group_5_1__1__Impl )
            // InternalIdl.g:5046:2: rule__FunctionDeclaration__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_5_1__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_5_1__1__Impl"
    // InternalIdl.g:5052:1: rule__FunctionDeclaration__Group_5_1__1__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_5_1_1 ) ) ;
    public final void rule__FunctionDeclaration__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5056:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_5_1_1 ) ) )
            // InternalIdl.g:5057:1: ( ( rule__FunctionDeclaration__ParametersAssignment_5_1_1 ) )
            {
            // InternalIdl.g:5057:1: ( ( rule__FunctionDeclaration__ParametersAssignment_5_1_1 ) )
            // InternalIdl.g:5058:2: ( rule__FunctionDeclaration__ParametersAssignment_5_1_1 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_5_1_1()); 
            // InternalIdl.g:5059:2: ( rule__FunctionDeclaration__ParametersAssignment_5_1_1 )
            // InternalIdl.g:5059:3: rule__FunctionDeclaration__ParametersAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__ParametersAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_5_1__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_7__0"
    // InternalIdl.g:5068:1: rule__FunctionDeclaration__Group_7__0 : rule__FunctionDeclaration__Group_7__0__Impl rule__FunctionDeclaration__Group_7__1 ;
    public final void rule__FunctionDeclaration__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5072:1: ( rule__FunctionDeclaration__Group_7__0__Impl rule__FunctionDeclaration__Group_7__1 )
            // InternalIdl.g:5073:2: rule__FunctionDeclaration__Group_7__0__Impl rule__FunctionDeclaration__Group_7__1
            {
            pushFollow(FOLLOW_23);
            rule__FunctionDeclaration__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_7__0__Impl"
    // InternalIdl.g:5080:1: rule__FunctionDeclaration__Group_7__0__Impl : ( ( rule__FunctionDeclaration__Group_7_0__0 ) ) ;
    public final void rule__FunctionDeclaration__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5084:1: ( ( ( rule__FunctionDeclaration__Group_7_0__0 ) ) )
            // InternalIdl.g:5085:1: ( ( rule__FunctionDeclaration__Group_7_0__0 ) )
            {
            // InternalIdl.g:5085:1: ( ( rule__FunctionDeclaration__Group_7_0__0 ) )
            // InternalIdl.g:5086:2: ( rule__FunctionDeclaration__Group_7_0__0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_7_0()); 
            // InternalIdl.g:5087:2: ( rule__FunctionDeclaration__Group_7_0__0 )
            // InternalIdl.g:5087:3: rule__FunctionDeclaration__Group_7_0__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_7_0__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_7__1"
    // InternalIdl.g:5095:1: rule__FunctionDeclaration__Group_7__1 : rule__FunctionDeclaration__Group_7__1__Impl ;
    public final void rule__FunctionDeclaration__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5099:1: ( rule__FunctionDeclaration__Group_7__1__Impl )
            // InternalIdl.g:5100:2: rule__FunctionDeclaration__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_7__1__Impl"
    // InternalIdl.g:5106:1: rule__FunctionDeclaration__Group_7__1__Impl : ( ( rule__FunctionDeclaration__Group_7_1__0 )? ) ;
    public final void rule__FunctionDeclaration__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5110:1: ( ( ( rule__FunctionDeclaration__Group_7_1__0 )? ) )
            // InternalIdl.g:5111:1: ( ( rule__FunctionDeclaration__Group_7_1__0 )? )
            {
            // InternalIdl.g:5111:1: ( ( rule__FunctionDeclaration__Group_7_1__0 )? )
            // InternalIdl.g:5112:2: ( rule__FunctionDeclaration__Group_7_1__0 )?
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_7_1()); 
            // InternalIdl.g:5113:2: ( rule__FunctionDeclaration__Group_7_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==42) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalIdl.g:5113:3: rule__FunctionDeclaration__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDeclaration__Group_7_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_0__0"
    // InternalIdl.g:5122:1: rule__FunctionDeclaration__Group_7_0__0 : rule__FunctionDeclaration__Group_7_0__0__Impl rule__FunctionDeclaration__Group_7_0__1 ;
    public final void rule__FunctionDeclaration__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5126:1: ( rule__FunctionDeclaration__Group_7_0__0__Impl rule__FunctionDeclaration__Group_7_0__1 )
            // InternalIdl.g:5127:2: rule__FunctionDeclaration__Group_7_0__0__Impl rule__FunctionDeclaration__Group_7_0__1
            {
            pushFollow(FOLLOW_50);
            rule__FunctionDeclaration__Group_7_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_7_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_0__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_0__0__Impl"
    // InternalIdl.g:5134:1: rule__FunctionDeclaration__Group_7_0__0__Impl : ( 'returns' ) ;
    public final void rule__FunctionDeclaration__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5138:1: ( ( 'returns' ) )
            // InternalIdl.g:5139:1: ( 'returns' )
            {
            // InternalIdl.g:5139:1: ( 'returns' )
            // InternalIdl.g:5140:2: 'returns'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getReturnsKeyword_7_0_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getReturnsKeyword_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_0__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_0__1"
    // InternalIdl.g:5149:1: rule__FunctionDeclaration__Group_7_0__1 : rule__FunctionDeclaration__Group_7_0__1__Impl rule__FunctionDeclaration__Group_7_0__2 ;
    public final void rule__FunctionDeclaration__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5153:1: ( rule__FunctionDeclaration__Group_7_0__1__Impl rule__FunctionDeclaration__Group_7_0__2 )
            // InternalIdl.g:5154:2: rule__FunctionDeclaration__Group_7_0__1__Impl rule__FunctionDeclaration__Group_7_0__2
            {
            pushFollow(FOLLOW_50);
            rule__FunctionDeclaration__Group_7_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_7_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_0__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_0__1__Impl"
    // InternalIdl.g:5161:1: rule__FunctionDeclaration__Group_7_0__1__Impl : ( ( rule__FunctionDeclaration__InjectedAssignment_7_0_1 )? ) ;
    public final void rule__FunctionDeclaration__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5165:1: ( ( ( rule__FunctionDeclaration__InjectedAssignment_7_0_1 )? ) )
            // InternalIdl.g:5166:1: ( ( rule__FunctionDeclaration__InjectedAssignment_7_0_1 )? )
            {
            // InternalIdl.g:5166:1: ( ( rule__FunctionDeclaration__InjectedAssignment_7_0_1 )? )
            // InternalIdl.g:5167:2: ( rule__FunctionDeclaration__InjectedAssignment_7_0_1 )?
            {
             before(grammarAccess.getFunctionDeclarationAccess().getInjectedAssignment_7_0_1()); 
            // InternalIdl.g:5168:2: ( rule__FunctionDeclaration__InjectedAssignment_7_0_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==70) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalIdl.g:5168:3: rule__FunctionDeclaration__InjectedAssignment_7_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDeclaration__InjectedAssignment_7_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclarationAccess().getInjectedAssignment_7_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_0__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_0__2"
    // InternalIdl.g:5176:1: rule__FunctionDeclaration__Group_7_0__2 : rule__FunctionDeclaration__Group_7_0__2__Impl ;
    public final void rule__FunctionDeclaration__Group_7_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5180:1: ( rule__FunctionDeclaration__Group_7_0__2__Impl )
            // InternalIdl.g:5181:2: rule__FunctionDeclaration__Group_7_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_7_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_0__2"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_0__2__Impl"
    // InternalIdl.g:5187:1: rule__FunctionDeclaration__Group_7_0__2__Impl : ( ( rule__FunctionDeclaration__ReturnedTypeAssignment_7_0_2 ) ) ;
    public final void rule__FunctionDeclaration__Group_7_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5191:1: ( ( ( rule__FunctionDeclaration__ReturnedTypeAssignment_7_0_2 ) ) )
            // InternalIdl.g:5192:1: ( ( rule__FunctionDeclaration__ReturnedTypeAssignment_7_0_2 ) )
            {
            // InternalIdl.g:5192:1: ( ( rule__FunctionDeclaration__ReturnedTypeAssignment_7_0_2 ) )
            // InternalIdl.g:5193:2: ( rule__FunctionDeclaration__ReturnedTypeAssignment_7_0_2 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getReturnedTypeAssignment_7_0_2()); 
            // InternalIdl.g:5194:2: ( rule__FunctionDeclaration__ReturnedTypeAssignment_7_0_2 )
            // InternalIdl.g:5194:3: rule__FunctionDeclaration__ReturnedTypeAssignment_7_0_2
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__ReturnedTypeAssignment_7_0_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getReturnedTypeAssignment_7_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_0__2__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_1__0"
    // InternalIdl.g:5203:1: rule__FunctionDeclaration__Group_7_1__0 : rule__FunctionDeclaration__Group_7_1__0__Impl rule__FunctionDeclaration__Group_7_1__1 ;
    public final void rule__FunctionDeclaration__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5207:1: ( rule__FunctionDeclaration__Group_7_1__0__Impl rule__FunctionDeclaration__Group_7_1__1 )
            // InternalIdl.g:5208:2: rule__FunctionDeclaration__Group_7_1__0__Impl rule__FunctionDeclaration__Group_7_1__1
            {
            pushFollow(FOLLOW_6);
            rule__FunctionDeclaration__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_1__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_1__0__Impl"
    // InternalIdl.g:5215:1: rule__FunctionDeclaration__Group_7_1__0__Impl : ( 'raises' ) ;
    public final void rule__FunctionDeclaration__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5219:1: ( ( 'raises' ) )
            // InternalIdl.g:5220:1: ( 'raises' )
            {
            // InternalIdl.g:5220:1: ( 'raises' )
            // InternalIdl.g:5221:2: 'raises'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRaisesKeyword_7_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getRaisesKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_1__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_1__1"
    // InternalIdl.g:5230:1: rule__FunctionDeclaration__Group_7_1__1 : rule__FunctionDeclaration__Group_7_1__1__Impl rule__FunctionDeclaration__Group_7_1__2 ;
    public final void rule__FunctionDeclaration__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5234:1: ( rule__FunctionDeclaration__Group_7_1__1__Impl rule__FunctionDeclaration__Group_7_1__2 )
            // InternalIdl.g:5235:2: rule__FunctionDeclaration__Group_7_1__1__Impl rule__FunctionDeclaration__Group_7_1__2
            {
            pushFollow(FOLLOW_24);
            rule__FunctionDeclaration__Group_7_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_7_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_1__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_1__1__Impl"
    // InternalIdl.g:5242:1: rule__FunctionDeclaration__Group_7_1__1__Impl : ( ( rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_1 ) ) ;
    public final void rule__FunctionDeclaration__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5246:1: ( ( ( rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_1 ) ) )
            // InternalIdl.g:5247:1: ( ( rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_1 ) )
            {
            // InternalIdl.g:5247:1: ( ( rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_1 ) )
            // InternalIdl.g:5248:2: ( rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_1 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAssignment_7_1_1()); 
            // InternalIdl.g:5249:2: ( rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_1 )
            // InternalIdl.g:5249:3: rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_1__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_1__2"
    // InternalIdl.g:5257:1: rule__FunctionDeclaration__Group_7_1__2 : rule__FunctionDeclaration__Group_7_1__2__Impl ;
    public final void rule__FunctionDeclaration__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5261:1: ( rule__FunctionDeclaration__Group_7_1__2__Impl )
            // InternalIdl.g:5262:2: rule__FunctionDeclaration__Group_7_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_7_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_1__2"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_1__2__Impl"
    // InternalIdl.g:5268:1: rule__FunctionDeclaration__Group_7_1__2__Impl : ( ( rule__FunctionDeclaration__Group_7_1_2__0 )* ) ;
    public final void rule__FunctionDeclaration__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5272:1: ( ( ( rule__FunctionDeclaration__Group_7_1_2__0 )* ) )
            // InternalIdl.g:5273:1: ( ( rule__FunctionDeclaration__Group_7_1_2__0 )* )
            {
            // InternalIdl.g:5273:1: ( ( rule__FunctionDeclaration__Group_7_1_2__0 )* )
            // InternalIdl.g:5274:2: ( rule__FunctionDeclaration__Group_7_1_2__0 )*
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_7_1_2()); 
            // InternalIdl.g:5275:2: ( rule__FunctionDeclaration__Group_7_1_2__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==38) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalIdl.g:5275:3: rule__FunctionDeclaration__Group_7_1_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__FunctionDeclaration__Group_7_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_7_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_1__2__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_1_2__0"
    // InternalIdl.g:5284:1: rule__FunctionDeclaration__Group_7_1_2__0 : rule__FunctionDeclaration__Group_7_1_2__0__Impl rule__FunctionDeclaration__Group_7_1_2__1 ;
    public final void rule__FunctionDeclaration__Group_7_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5288:1: ( rule__FunctionDeclaration__Group_7_1_2__0__Impl rule__FunctionDeclaration__Group_7_1_2__1 )
            // InternalIdl.g:5289:2: rule__FunctionDeclaration__Group_7_1_2__0__Impl rule__FunctionDeclaration__Group_7_1_2__1
            {
            pushFollow(FOLLOW_6);
            rule__FunctionDeclaration__Group_7_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_7_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_1_2__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_1_2__0__Impl"
    // InternalIdl.g:5296:1: rule__FunctionDeclaration__Group_7_1_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionDeclaration__Group_7_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5300:1: ( ( ',' ) )
            // InternalIdl.g:5301:1: ( ',' )
            {
            // InternalIdl.g:5301:1: ( ',' )
            // InternalIdl.g:5302:2: ','
            {
             before(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_7_1_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_7_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_1_2__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_1_2__1"
    // InternalIdl.g:5311:1: rule__FunctionDeclaration__Group_7_1_2__1 : rule__FunctionDeclaration__Group_7_1_2__1__Impl ;
    public final void rule__FunctionDeclaration__Group_7_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5315:1: ( rule__FunctionDeclaration__Group_7_1_2__1__Impl )
            // InternalIdl.g:5316:2: rule__FunctionDeclaration__Group_7_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_7_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_1_2__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_7_1_2__1__Impl"
    // InternalIdl.g:5322:1: rule__FunctionDeclaration__Group_7_1_2__1__Impl : ( ( rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_2_1 ) ) ;
    public final void rule__FunctionDeclaration__Group_7_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5326:1: ( ( ( rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_2_1 ) ) )
            // InternalIdl.g:5327:1: ( ( rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_2_1 ) )
            {
            // InternalIdl.g:5327:1: ( ( rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_2_1 ) )
            // InternalIdl.g:5328:2: ( rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_2_1 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAssignment_7_1_2_1()); 
            // InternalIdl.g:5329:2: ( rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_2_1 )
            // InternalIdl.g:5329:3: rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAssignment_7_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_7_1_2__1__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__0"
    // InternalIdl.g:5338:1: rule__EventDeclaration__Group__0 : rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 ;
    public final void rule__EventDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5342:1: ( rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 )
            // InternalIdl.g:5343:2: rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__EventDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__0"


    // $ANTLR start "rule__EventDeclaration__Group__0__Impl"
    // InternalIdl.g:5350:1: rule__EventDeclaration__Group__0__Impl : ( 'event' ) ;
    public final void rule__EventDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5354:1: ( ( 'event' ) )
            // InternalIdl.g:5355:1: ( 'event' )
            {
            // InternalIdl.g:5355:1: ( 'event' )
            // InternalIdl.g:5356:2: 'event'
            {
             before(grammarAccess.getEventDeclarationAccess().getEventKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__1"
    // InternalIdl.g:5365:1: rule__EventDeclaration__Group__1 : rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 ;
    public final void rule__EventDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5369:1: ( rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 )
            // InternalIdl.g:5370:2: rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2
            {
            pushFollow(FOLLOW_51);
            rule__EventDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__1"


    // $ANTLR start "rule__EventDeclaration__Group__1__Impl"
    // InternalIdl.g:5377:1: rule__EventDeclaration__Group__1__Impl : ( ( rule__EventDeclaration__NameAssignment_1 )? ) ;
    public final void rule__EventDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5381:1: ( ( ( rule__EventDeclaration__NameAssignment_1 )? ) )
            // InternalIdl.g:5382:1: ( ( rule__EventDeclaration__NameAssignment_1 )? )
            {
            // InternalIdl.g:5382:1: ( ( rule__EventDeclaration__NameAssignment_1 )? )
            // InternalIdl.g:5383:2: ( rule__EventDeclaration__NameAssignment_1 )?
            {
             before(grammarAccess.getEventDeclarationAccess().getNameAssignment_1()); 
            // InternalIdl.g:5384:2: ( rule__EventDeclaration__NameAssignment_1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalIdl.g:5384:3: rule__EventDeclaration__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventDeclaration__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__2"
    // InternalIdl.g:5392:1: rule__EventDeclaration__Group__2 : rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 ;
    public final void rule__EventDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5396:1: ( rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 )
            // InternalIdl.g:5397:2: rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3
            {
            pushFollow(FOLLOW_51);
            rule__EventDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__2"


    // $ANTLR start "rule__EventDeclaration__Group__2__Impl"
    // InternalIdl.g:5404:1: rule__EventDeclaration__Group__2__Impl : ( ( rule__EventDeclaration__Group_2__0 )? ) ;
    public final void rule__EventDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5408:1: ( ( ( rule__EventDeclaration__Group_2__0 )? ) )
            // InternalIdl.g:5409:1: ( ( rule__EventDeclaration__Group_2__0 )? )
            {
            // InternalIdl.g:5409:1: ( ( rule__EventDeclaration__Group_2__0 )? )
            // InternalIdl.g:5410:2: ( rule__EventDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getEventDeclarationAccess().getGroup_2()); 
            // InternalIdl.g:5411:2: ( rule__EventDeclaration__Group_2__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==43) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalIdl.g:5411:3: rule__EventDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__3"
    // InternalIdl.g:5419:1: rule__EventDeclaration__Group__3 : rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4 ;
    public final void rule__EventDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5423:1: ( rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4 )
            // InternalIdl.g:5424:2: rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__EventDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__3"


    // $ANTLR start "rule__EventDeclaration__Group__3__Impl"
    // InternalIdl.g:5431:1: rule__EventDeclaration__Group__3__Impl : ( '(' ) ;
    public final void rule__EventDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5435:1: ( ( '(' ) )
            // InternalIdl.g:5436:1: ( '(' )
            {
            // InternalIdl.g:5436:1: ( '(' )
            // InternalIdl.g:5437:2: '('
            {
             before(grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__4"
    // InternalIdl.g:5446:1: rule__EventDeclaration__Group__4 : rule__EventDeclaration__Group__4__Impl rule__EventDeclaration__Group__5 ;
    public final void rule__EventDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5450:1: ( rule__EventDeclaration__Group__4__Impl rule__EventDeclaration__Group__5 )
            // InternalIdl.g:5451:2: rule__EventDeclaration__Group__4__Impl rule__EventDeclaration__Group__5
            {
            pushFollow(FOLLOW_52);
            rule__EventDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__4"


    // $ANTLR start "rule__EventDeclaration__Group__4__Impl"
    // InternalIdl.g:5458:1: rule__EventDeclaration__Group__4__Impl : ( ( rule__EventDeclaration__DataAssignment_4 ) ) ;
    public final void rule__EventDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5462:1: ( ( ( rule__EventDeclaration__DataAssignment_4 ) ) )
            // InternalIdl.g:5463:1: ( ( rule__EventDeclaration__DataAssignment_4 ) )
            {
            // InternalIdl.g:5463:1: ( ( rule__EventDeclaration__DataAssignment_4 ) )
            // InternalIdl.g:5464:2: ( rule__EventDeclaration__DataAssignment_4 )
            {
             before(grammarAccess.getEventDeclarationAccess().getDataAssignment_4()); 
            // InternalIdl.g:5465:2: ( rule__EventDeclaration__DataAssignment_4 )
            // InternalIdl.g:5465:3: rule__EventDeclaration__DataAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__DataAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclarationAccess().getDataAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__4__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__5"
    // InternalIdl.g:5473:1: rule__EventDeclaration__Group__5 : rule__EventDeclaration__Group__5__Impl rule__EventDeclaration__Group__6 ;
    public final void rule__EventDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5477:1: ( rule__EventDeclaration__Group__5__Impl rule__EventDeclaration__Group__6 )
            // InternalIdl.g:5478:2: rule__EventDeclaration__Group__5__Impl rule__EventDeclaration__Group__6
            {
            pushFollow(FOLLOW_53);
            rule__EventDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__5"


    // $ANTLR start "rule__EventDeclaration__Group__5__Impl"
    // InternalIdl.g:5485:1: rule__EventDeclaration__Group__5__Impl : ( ')' ) ;
    public final void rule__EventDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5489:1: ( ( ')' ) )
            // InternalIdl.g:5490:1: ( ')' )
            {
            // InternalIdl.g:5490:1: ( ')' )
            // InternalIdl.g:5491:2: ')'
            {
             before(grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__5__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__6"
    // InternalIdl.g:5500:1: rule__EventDeclaration__Group__6 : rule__EventDeclaration__Group__6__Impl ;
    public final void rule__EventDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5504:1: ( rule__EventDeclaration__Group__6__Impl )
            // InternalIdl.g:5505:2: rule__EventDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__6"


    // $ANTLR start "rule__EventDeclaration__Group__6__Impl"
    // InternalIdl.g:5511:1: rule__EventDeclaration__Group__6__Impl : ( ( rule__EventDeclaration__Group_6__0 ) ) ;
    public final void rule__EventDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5515:1: ( ( ( rule__EventDeclaration__Group_6__0 ) ) )
            // InternalIdl.g:5516:1: ( ( rule__EventDeclaration__Group_6__0 ) )
            {
            // InternalIdl.g:5516:1: ( ( rule__EventDeclaration__Group_6__0 ) )
            // InternalIdl.g:5517:2: ( rule__EventDeclaration__Group_6__0 )
            {
             before(grammarAccess.getEventDeclarationAccess().getGroup_6()); 
            // InternalIdl.g:5518:2: ( rule__EventDeclaration__Group_6__0 )
            // InternalIdl.g:5518:3: rule__EventDeclaration__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclarationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__6__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_2__0"
    // InternalIdl.g:5527:1: rule__EventDeclaration__Group_2__0 : rule__EventDeclaration__Group_2__0__Impl rule__EventDeclaration__Group_2__1 ;
    public final void rule__EventDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5531:1: ( rule__EventDeclaration__Group_2__0__Impl rule__EventDeclaration__Group_2__1 )
            // InternalIdl.g:5532:2: rule__EventDeclaration__Group_2__0__Impl rule__EventDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_54);
            rule__EventDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_2__0"


    // $ANTLR start "rule__EventDeclaration__Group_2__0__Impl"
    // InternalIdl.g:5539:1: rule__EventDeclaration__Group_2__0__Impl : ( '[' ) ;
    public final void rule__EventDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5543:1: ( ( '[' ) )
            // InternalIdl.g:5544:1: ( '[' )
            {
            // InternalIdl.g:5544:1: ( '[' )
            // InternalIdl.g:5545:2: '['
            {
             before(grammarAccess.getEventDeclarationAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_2__1"
    // InternalIdl.g:5554:1: rule__EventDeclaration__Group_2__1 : rule__EventDeclaration__Group_2__1__Impl rule__EventDeclaration__Group_2__2 ;
    public final void rule__EventDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5558:1: ( rule__EventDeclaration__Group_2__1__Impl rule__EventDeclaration__Group_2__2 )
            // InternalIdl.g:5559:2: rule__EventDeclaration__Group_2__1__Impl rule__EventDeclaration__Group_2__2
            {
            pushFollow(FOLLOW_42);
            rule__EventDeclaration__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_2__1"


    // $ANTLR start "rule__EventDeclaration__Group_2__1__Impl"
    // InternalIdl.g:5566:1: rule__EventDeclaration__Group_2__1__Impl : ( ( rule__EventDeclaration__Group_2_1__0 ) ) ;
    public final void rule__EventDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5570:1: ( ( ( rule__EventDeclaration__Group_2_1__0 ) ) )
            // InternalIdl.g:5571:1: ( ( rule__EventDeclaration__Group_2_1__0 ) )
            {
            // InternalIdl.g:5571:1: ( ( rule__EventDeclaration__Group_2_1__0 ) )
            // InternalIdl.g:5572:2: ( rule__EventDeclaration__Group_2_1__0 )
            {
             before(grammarAccess.getEventDeclarationAccess().getGroup_2_1()); 
            // InternalIdl.g:5573:2: ( rule__EventDeclaration__Group_2_1__0 )
            // InternalIdl.g:5573:3: rule__EventDeclaration__Group_2_1__0
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclarationAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_2__2"
    // InternalIdl.g:5581:1: rule__EventDeclaration__Group_2__2 : rule__EventDeclaration__Group_2__2__Impl ;
    public final void rule__EventDeclaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5585:1: ( rule__EventDeclaration__Group_2__2__Impl )
            // InternalIdl.g:5586:2: rule__EventDeclaration__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_2__2"


    // $ANTLR start "rule__EventDeclaration__Group_2__2__Impl"
    // InternalIdl.g:5592:1: rule__EventDeclaration__Group_2__2__Impl : ( ']' ) ;
    public final void rule__EventDeclaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5596:1: ( ( ']' ) )
            // InternalIdl.g:5597:1: ( ']' )
            {
            // InternalIdl.g:5597:1: ( ']' )
            // InternalIdl.g:5598:2: ']'
            {
             before(grammarAccess.getEventDeclarationAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_2__2__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_2_1__0"
    // InternalIdl.g:5608:1: rule__EventDeclaration__Group_2_1__0 : rule__EventDeclaration__Group_2_1__0__Impl rule__EventDeclaration__Group_2_1__1 ;
    public final void rule__EventDeclaration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5612:1: ( rule__EventDeclaration__Group_2_1__0__Impl rule__EventDeclaration__Group_2_1__1 )
            // InternalIdl.g:5613:2: rule__EventDeclaration__Group_2_1__0__Impl rule__EventDeclaration__Group_2_1__1
            {
            pushFollow(FOLLOW_29);
            rule__EventDeclaration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_2_1__0"


    // $ANTLR start "rule__EventDeclaration__Group_2_1__0__Impl"
    // InternalIdl.g:5620:1: rule__EventDeclaration__Group_2_1__0__Impl : ( 'guid' ) ;
    public final void rule__EventDeclaration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5624:1: ( ( 'guid' ) )
            // InternalIdl.g:5625:1: ( 'guid' )
            {
            // InternalIdl.g:5625:1: ( 'guid' )
            // InternalIdl.g:5626:2: 'guid'
            {
             before(grammarAccess.getEventDeclarationAccess().getGuidKeyword_2_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getGuidKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_2_1__0__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_2_1__1"
    // InternalIdl.g:5635:1: rule__EventDeclaration__Group_2_1__1 : rule__EventDeclaration__Group_2_1__1__Impl rule__EventDeclaration__Group_2_1__2 ;
    public final void rule__EventDeclaration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5639:1: ( rule__EventDeclaration__Group_2_1__1__Impl rule__EventDeclaration__Group_2_1__2 )
            // InternalIdl.g:5640:2: rule__EventDeclaration__Group_2_1__1__Impl rule__EventDeclaration__Group_2_1__2
            {
            pushFollow(FOLLOW_44);
            rule__EventDeclaration__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_2_1__1"


    // $ANTLR start "rule__EventDeclaration__Group_2_1__1__Impl"
    // InternalIdl.g:5647:1: rule__EventDeclaration__Group_2_1__1__Impl : ( '=' ) ;
    public final void rule__EventDeclaration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5651:1: ( ( '=' ) )
            // InternalIdl.g:5652:1: ( '=' )
            {
            // InternalIdl.g:5652:1: ( '=' )
            // InternalIdl.g:5653:2: '='
            {
             before(grammarAccess.getEventDeclarationAccess().getEqualsSignKeyword_2_1_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getEqualsSignKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_2_1__1__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_2_1__2"
    // InternalIdl.g:5662:1: rule__EventDeclaration__Group_2_1__2 : rule__EventDeclaration__Group_2_1__2__Impl ;
    public final void rule__EventDeclaration__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5666:1: ( rule__EventDeclaration__Group_2_1__2__Impl )
            // InternalIdl.g:5667:2: rule__EventDeclaration__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_2_1__2"


    // $ANTLR start "rule__EventDeclaration__Group_2_1__2__Impl"
    // InternalIdl.g:5673:1: rule__EventDeclaration__Group_2_1__2__Impl : ( ( rule__EventDeclaration__GuidAssignment_2_1_2 ) ) ;
    public final void rule__EventDeclaration__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5677:1: ( ( ( rule__EventDeclaration__GuidAssignment_2_1_2 ) ) )
            // InternalIdl.g:5678:1: ( ( rule__EventDeclaration__GuidAssignment_2_1_2 ) )
            {
            // InternalIdl.g:5678:1: ( ( rule__EventDeclaration__GuidAssignment_2_1_2 ) )
            // InternalIdl.g:5679:2: ( rule__EventDeclaration__GuidAssignment_2_1_2 )
            {
             before(grammarAccess.getEventDeclarationAccess().getGuidAssignment_2_1_2()); 
            // InternalIdl.g:5680:2: ( rule__EventDeclaration__GuidAssignment_2_1_2 )
            // InternalIdl.g:5680:3: rule__EventDeclaration__GuidAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__GuidAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclarationAccess().getGuidAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_2_1__2__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6__0"
    // InternalIdl.g:5689:1: rule__EventDeclaration__Group_6__0 : rule__EventDeclaration__Group_6__0__Impl rule__EventDeclaration__Group_6__1 ;
    public final void rule__EventDeclaration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5693:1: ( rule__EventDeclaration__Group_6__0__Impl rule__EventDeclaration__Group_6__1 )
            // InternalIdl.g:5694:2: rule__EventDeclaration__Group_6__0__Impl rule__EventDeclaration__Group_6__1
            {
            pushFollow(FOLLOW_53);
            rule__EventDeclaration__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6__0"


    // $ANTLR start "rule__EventDeclaration__Group_6__0__Impl"
    // InternalIdl.g:5701:1: rule__EventDeclaration__Group_6__0__Impl : ( ( rule__EventDeclaration__Group_6_0__0 )? ) ;
    public final void rule__EventDeclaration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5705:1: ( ( ( rule__EventDeclaration__Group_6_0__0 )? ) )
            // InternalIdl.g:5706:1: ( ( rule__EventDeclaration__Group_6_0__0 )? )
            {
            // InternalIdl.g:5706:1: ( ( rule__EventDeclaration__Group_6_0__0 )? )
            // InternalIdl.g:5707:2: ( rule__EventDeclaration__Group_6_0__0 )?
            {
             before(grammarAccess.getEventDeclarationAccess().getGroup_6_0()); 
            // InternalIdl.g:5708:2: ( rule__EventDeclaration__Group_6_0__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==59) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalIdl.g:5708:3: rule__EventDeclaration__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventDeclaration__Group_6_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventDeclarationAccess().getGroup_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6__0__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6__1"
    // InternalIdl.g:5716:1: rule__EventDeclaration__Group_6__1 : rule__EventDeclaration__Group_6__1__Impl ;
    public final void rule__EventDeclaration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5720:1: ( rule__EventDeclaration__Group_6__1__Impl )
            // InternalIdl.g:5721:2: rule__EventDeclaration__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6__1"


    // $ANTLR start "rule__EventDeclaration__Group_6__1__Impl"
    // InternalIdl.g:5727:1: rule__EventDeclaration__Group_6__1__Impl : ( ( rule__EventDeclaration__Group_6_1__0 )? ) ;
    public final void rule__EventDeclaration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5731:1: ( ( ( rule__EventDeclaration__Group_6_1__0 )? ) )
            // InternalIdl.g:5732:1: ( ( rule__EventDeclaration__Group_6_1__0 )? )
            {
            // InternalIdl.g:5732:1: ( ( rule__EventDeclaration__Group_6_1__0 )? )
            // InternalIdl.g:5733:2: ( rule__EventDeclaration__Group_6_1__0 )?
            {
             before(grammarAccess.getEventDeclarationAccess().getGroup_6_1()); 
            // InternalIdl.g:5734:2: ( rule__EventDeclaration__Group_6_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==42) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalIdl.g:5734:3: rule__EventDeclaration__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventDeclaration__Group_6_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventDeclarationAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6__1__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_0__0"
    // InternalIdl.g:5743:1: rule__EventDeclaration__Group_6_0__0 : rule__EventDeclaration__Group_6_0__0__Impl rule__EventDeclaration__Group_6_0__1 ;
    public final void rule__EventDeclaration__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5747:1: ( rule__EventDeclaration__Group_6_0__0__Impl rule__EventDeclaration__Group_6_0__1 )
            // InternalIdl.g:5748:2: rule__EventDeclaration__Group_6_0__0__Impl rule__EventDeclaration__Group_6_0__1
            {
            pushFollow(FOLLOW_55);
            rule__EventDeclaration__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0__0"


    // $ANTLR start "rule__EventDeclaration__Group_6_0__0__Impl"
    // InternalIdl.g:5755:1: rule__EventDeclaration__Group_6_0__0__Impl : ( 'subscribe' ) ;
    public final void rule__EventDeclaration__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5759:1: ( ( 'subscribe' ) )
            // InternalIdl.g:5760:1: ( 'subscribe' )
            {
            // InternalIdl.g:5760:1: ( 'subscribe' )
            // InternalIdl.g:5761:2: 'subscribe'
            {
             before(grammarAccess.getEventDeclarationAccess().getSubscribeKeyword_6_0_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getSubscribeKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0__0__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_0__1"
    // InternalIdl.g:5770:1: rule__EventDeclaration__Group_6_0__1 : rule__EventDeclaration__Group_6_0__1__Impl rule__EventDeclaration__Group_6_0__2 ;
    public final void rule__EventDeclaration__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5774:1: ( rule__EventDeclaration__Group_6_0__1__Impl rule__EventDeclaration__Group_6_0__2 )
            // InternalIdl.g:5775:2: rule__EventDeclaration__Group_6_0__1__Impl rule__EventDeclaration__Group_6_0__2
            {
            pushFollow(FOLLOW_46);
            rule__EventDeclaration__Group_6_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0__1"


    // $ANTLR start "rule__EventDeclaration__Group_6_0__1__Impl"
    // InternalIdl.g:5782:1: rule__EventDeclaration__Group_6_0__1__Impl : ( 'with' ) ;
    public final void rule__EventDeclaration__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5786:1: ( ( 'with' ) )
            // InternalIdl.g:5787:1: ( 'with' )
            {
            // InternalIdl.g:5787:1: ( 'with' )
            // InternalIdl.g:5788:2: 'with'
            {
             before(grammarAccess.getEventDeclarationAccess().getWithKeyword_6_0_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getWithKeyword_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0__1__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_0__2"
    // InternalIdl.g:5797:1: rule__EventDeclaration__Group_6_0__2 : rule__EventDeclaration__Group_6_0__2__Impl rule__EventDeclaration__Group_6_0__3 ;
    public final void rule__EventDeclaration__Group_6_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5801:1: ( rule__EventDeclaration__Group_6_0__2__Impl rule__EventDeclaration__Group_6_0__3 )
            // InternalIdl.g:5802:2: rule__EventDeclaration__Group_6_0__2__Impl rule__EventDeclaration__Group_6_0__3
            {
            pushFollow(FOLLOW_56);
            rule__EventDeclaration__Group_6_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0__2"


    // $ANTLR start "rule__EventDeclaration__Group_6_0__2__Impl"
    // InternalIdl.g:5809:1: rule__EventDeclaration__Group_6_0__2__Impl : ( '(' ) ;
    public final void rule__EventDeclaration__Group_6_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5813:1: ( ( '(' ) )
            // InternalIdl.g:5814:1: ( '(' )
            {
            // InternalIdl.g:5814:1: ( '(' )
            // InternalIdl.g:5815:2: '('
            {
             before(grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_6_0_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_6_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0__2__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_0__3"
    // InternalIdl.g:5824:1: rule__EventDeclaration__Group_6_0__3 : rule__EventDeclaration__Group_6_0__3__Impl rule__EventDeclaration__Group_6_0__4 ;
    public final void rule__EventDeclaration__Group_6_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5828:1: ( rule__EventDeclaration__Group_6_0__3__Impl rule__EventDeclaration__Group_6_0__4 )
            // InternalIdl.g:5829:2: rule__EventDeclaration__Group_6_0__3__Impl rule__EventDeclaration__Group_6_0__4
            {
            pushFollow(FOLLOW_56);
            rule__EventDeclaration__Group_6_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0__3"


    // $ANTLR start "rule__EventDeclaration__Group_6_0__3__Impl"
    // InternalIdl.g:5836:1: rule__EventDeclaration__Group_6_0__3__Impl : ( ( rule__EventDeclaration__Group_6_0_3__0 )? ) ;
    public final void rule__EventDeclaration__Group_6_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5840:1: ( ( ( rule__EventDeclaration__Group_6_0_3__0 )? ) )
            // InternalIdl.g:5841:1: ( ( rule__EventDeclaration__Group_6_0_3__0 )? )
            {
            // InternalIdl.g:5841:1: ( ( rule__EventDeclaration__Group_6_0_3__0 )? )
            // InternalIdl.g:5842:2: ( rule__EventDeclaration__Group_6_0_3__0 )?
            {
             before(grammarAccess.getEventDeclarationAccess().getGroup_6_0_3()); 
            // InternalIdl.g:5843:2: ( rule__EventDeclaration__Group_6_0_3__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_BYTE && LA53_0<=RULE_ID)||(LA53_0>=RULE_STRINGTYPE && LA53_0<=RULE_BOOLEAN)||LA53_0==39||LA53_0==50) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalIdl.g:5843:3: rule__EventDeclaration__Group_6_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventDeclaration__Group_6_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventDeclarationAccess().getGroup_6_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0__3__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_0__4"
    // InternalIdl.g:5851:1: rule__EventDeclaration__Group_6_0__4 : rule__EventDeclaration__Group_6_0__4__Impl ;
    public final void rule__EventDeclaration__Group_6_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5855:1: ( rule__EventDeclaration__Group_6_0__4__Impl )
            // InternalIdl.g:5856:2: rule__EventDeclaration__Group_6_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0__4"


    // $ANTLR start "rule__EventDeclaration__Group_6_0__4__Impl"
    // InternalIdl.g:5862:1: rule__EventDeclaration__Group_6_0__4__Impl : ( ')' ) ;
    public final void rule__EventDeclaration__Group_6_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5866:1: ( ( ')' ) )
            // InternalIdl.g:5867:1: ( ')' )
            {
            // InternalIdl.g:5867:1: ( ')' )
            // InternalIdl.g:5868:2: ')'
            {
             before(grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_6_0_4()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_6_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0__4__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_0_3__0"
    // InternalIdl.g:5878:1: rule__EventDeclaration__Group_6_0_3__0 : rule__EventDeclaration__Group_6_0_3__0__Impl rule__EventDeclaration__Group_6_0_3__1 ;
    public final void rule__EventDeclaration__Group_6_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5882:1: ( rule__EventDeclaration__Group_6_0_3__0__Impl rule__EventDeclaration__Group_6_0_3__1 )
            // InternalIdl.g:5883:2: rule__EventDeclaration__Group_6_0_3__0__Impl rule__EventDeclaration__Group_6_0_3__1
            {
            pushFollow(FOLLOW_24);
            rule__EventDeclaration__Group_6_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0_3__0"


    // $ANTLR start "rule__EventDeclaration__Group_6_0_3__0__Impl"
    // InternalIdl.g:5890:1: rule__EventDeclaration__Group_6_0_3__0__Impl : ( ( rule__EventDeclaration__KeysAssignment_6_0_3_0 ) ) ;
    public final void rule__EventDeclaration__Group_6_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5894:1: ( ( ( rule__EventDeclaration__KeysAssignment_6_0_3_0 ) ) )
            // InternalIdl.g:5895:1: ( ( rule__EventDeclaration__KeysAssignment_6_0_3_0 ) )
            {
            // InternalIdl.g:5895:1: ( ( rule__EventDeclaration__KeysAssignment_6_0_3_0 ) )
            // InternalIdl.g:5896:2: ( rule__EventDeclaration__KeysAssignment_6_0_3_0 )
            {
             before(grammarAccess.getEventDeclarationAccess().getKeysAssignment_6_0_3_0()); 
            // InternalIdl.g:5897:2: ( rule__EventDeclaration__KeysAssignment_6_0_3_0 )
            // InternalIdl.g:5897:3: rule__EventDeclaration__KeysAssignment_6_0_3_0
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__KeysAssignment_6_0_3_0();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclarationAccess().getKeysAssignment_6_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0_3__0__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_0_3__1"
    // InternalIdl.g:5905:1: rule__EventDeclaration__Group_6_0_3__1 : rule__EventDeclaration__Group_6_0_3__1__Impl ;
    public final void rule__EventDeclaration__Group_6_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5909:1: ( rule__EventDeclaration__Group_6_0_3__1__Impl )
            // InternalIdl.g:5910:2: rule__EventDeclaration__Group_6_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0_3__1"


    // $ANTLR start "rule__EventDeclaration__Group_6_0_3__1__Impl"
    // InternalIdl.g:5916:1: rule__EventDeclaration__Group_6_0_3__1__Impl : ( ( rule__EventDeclaration__Group_6_0_3_1__0 )* ) ;
    public final void rule__EventDeclaration__Group_6_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5920:1: ( ( ( rule__EventDeclaration__Group_6_0_3_1__0 )* ) )
            // InternalIdl.g:5921:1: ( ( rule__EventDeclaration__Group_6_0_3_1__0 )* )
            {
            // InternalIdl.g:5921:1: ( ( rule__EventDeclaration__Group_6_0_3_1__0 )* )
            // InternalIdl.g:5922:2: ( rule__EventDeclaration__Group_6_0_3_1__0 )*
            {
             before(grammarAccess.getEventDeclarationAccess().getGroup_6_0_3_1()); 
            // InternalIdl.g:5923:2: ( rule__EventDeclaration__Group_6_0_3_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==38) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalIdl.g:5923:3: rule__EventDeclaration__Group_6_0_3_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__EventDeclaration__Group_6_0_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getEventDeclarationAccess().getGroup_6_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0_3__1__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_0_3_1__0"
    // InternalIdl.g:5932:1: rule__EventDeclaration__Group_6_0_3_1__0 : rule__EventDeclaration__Group_6_0_3_1__0__Impl rule__EventDeclaration__Group_6_0_3_1__1 ;
    public final void rule__EventDeclaration__Group_6_0_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5936:1: ( rule__EventDeclaration__Group_6_0_3_1__0__Impl rule__EventDeclaration__Group_6_0_3_1__1 )
            // InternalIdl.g:5937:2: rule__EventDeclaration__Group_6_0_3_1__0__Impl rule__EventDeclaration__Group_6_0_3_1__1
            {
            pushFollow(FOLLOW_16);
            rule__EventDeclaration__Group_6_0_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_0_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0_3_1__0"


    // $ANTLR start "rule__EventDeclaration__Group_6_0_3_1__0__Impl"
    // InternalIdl.g:5944:1: rule__EventDeclaration__Group_6_0_3_1__0__Impl : ( ',' ) ;
    public final void rule__EventDeclaration__Group_6_0_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5948:1: ( ( ',' ) )
            // InternalIdl.g:5949:1: ( ',' )
            {
            // InternalIdl.g:5949:1: ( ',' )
            // InternalIdl.g:5950:2: ','
            {
             before(grammarAccess.getEventDeclarationAccess().getCommaKeyword_6_0_3_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getCommaKeyword_6_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0_3_1__0__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_0_3_1__1"
    // InternalIdl.g:5959:1: rule__EventDeclaration__Group_6_0_3_1__1 : rule__EventDeclaration__Group_6_0_3_1__1__Impl ;
    public final void rule__EventDeclaration__Group_6_0_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5963:1: ( rule__EventDeclaration__Group_6_0_3_1__1__Impl )
            // InternalIdl.g:5964:2: rule__EventDeclaration__Group_6_0_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_0_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0_3_1__1"


    // $ANTLR start "rule__EventDeclaration__Group_6_0_3_1__1__Impl"
    // InternalIdl.g:5970:1: rule__EventDeclaration__Group_6_0_3_1__1__Impl : ( ( rule__EventDeclaration__KeysAssignment_6_0_3_1_1 ) ) ;
    public final void rule__EventDeclaration__Group_6_0_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5974:1: ( ( ( rule__EventDeclaration__KeysAssignment_6_0_3_1_1 ) ) )
            // InternalIdl.g:5975:1: ( ( rule__EventDeclaration__KeysAssignment_6_0_3_1_1 ) )
            {
            // InternalIdl.g:5975:1: ( ( rule__EventDeclaration__KeysAssignment_6_0_3_1_1 ) )
            // InternalIdl.g:5976:2: ( rule__EventDeclaration__KeysAssignment_6_0_3_1_1 )
            {
             before(grammarAccess.getEventDeclarationAccess().getKeysAssignment_6_0_3_1_1()); 
            // InternalIdl.g:5977:2: ( rule__EventDeclaration__KeysAssignment_6_0_3_1_1 )
            // InternalIdl.g:5977:3: rule__EventDeclaration__KeysAssignment_6_0_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__KeysAssignment_6_0_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclarationAccess().getKeysAssignment_6_0_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_0_3_1__1__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_1__0"
    // InternalIdl.g:5986:1: rule__EventDeclaration__Group_6_1__0 : rule__EventDeclaration__Group_6_1__0__Impl rule__EventDeclaration__Group_6_1__1 ;
    public final void rule__EventDeclaration__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:5990:1: ( rule__EventDeclaration__Group_6_1__0__Impl rule__EventDeclaration__Group_6_1__1 )
            // InternalIdl.g:5991:2: rule__EventDeclaration__Group_6_1__0__Impl rule__EventDeclaration__Group_6_1__1
            {
            pushFollow(FOLLOW_6);
            rule__EventDeclaration__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_1__0"


    // $ANTLR start "rule__EventDeclaration__Group_6_1__0__Impl"
    // InternalIdl.g:5998:1: rule__EventDeclaration__Group_6_1__0__Impl : ( 'raises' ) ;
    public final void rule__EventDeclaration__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6002:1: ( ( 'raises' ) )
            // InternalIdl.g:6003:1: ( 'raises' )
            {
            // InternalIdl.g:6003:1: ( 'raises' )
            // InternalIdl.g:6004:2: 'raises'
            {
             before(grammarAccess.getEventDeclarationAccess().getRaisesKeyword_6_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getRaisesKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_1__0__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_1__1"
    // InternalIdl.g:6013:1: rule__EventDeclaration__Group_6_1__1 : rule__EventDeclaration__Group_6_1__1__Impl rule__EventDeclaration__Group_6_1__2 ;
    public final void rule__EventDeclaration__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6017:1: ( rule__EventDeclaration__Group_6_1__1__Impl rule__EventDeclaration__Group_6_1__2 )
            // InternalIdl.g:6018:2: rule__EventDeclaration__Group_6_1__1__Impl rule__EventDeclaration__Group_6_1__2
            {
            pushFollow(FOLLOW_24);
            rule__EventDeclaration__Group_6_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_1__1"


    // $ANTLR start "rule__EventDeclaration__Group_6_1__1__Impl"
    // InternalIdl.g:6025:1: rule__EventDeclaration__Group_6_1__1__Impl : ( ( rule__EventDeclaration__RaisedExceptionsAssignment_6_1_1 ) ) ;
    public final void rule__EventDeclaration__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6029:1: ( ( ( rule__EventDeclaration__RaisedExceptionsAssignment_6_1_1 ) ) )
            // InternalIdl.g:6030:1: ( ( rule__EventDeclaration__RaisedExceptionsAssignment_6_1_1 ) )
            {
            // InternalIdl.g:6030:1: ( ( rule__EventDeclaration__RaisedExceptionsAssignment_6_1_1 ) )
            // InternalIdl.g:6031:2: ( rule__EventDeclaration__RaisedExceptionsAssignment_6_1_1 )
            {
             before(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAssignment_6_1_1()); 
            // InternalIdl.g:6032:2: ( rule__EventDeclaration__RaisedExceptionsAssignment_6_1_1 )
            // InternalIdl.g:6032:3: rule__EventDeclaration__RaisedExceptionsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__RaisedExceptionsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_1__1__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_1__2"
    // InternalIdl.g:6040:1: rule__EventDeclaration__Group_6_1__2 : rule__EventDeclaration__Group_6_1__2__Impl ;
    public final void rule__EventDeclaration__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6044:1: ( rule__EventDeclaration__Group_6_1__2__Impl )
            // InternalIdl.g:6045:2: rule__EventDeclaration__Group_6_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_1__2"


    // $ANTLR start "rule__EventDeclaration__Group_6_1__2__Impl"
    // InternalIdl.g:6051:1: rule__EventDeclaration__Group_6_1__2__Impl : ( ( rule__EventDeclaration__Group_6_1_2__0 )* ) ;
    public final void rule__EventDeclaration__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6055:1: ( ( ( rule__EventDeclaration__Group_6_1_2__0 )* ) )
            // InternalIdl.g:6056:1: ( ( rule__EventDeclaration__Group_6_1_2__0 )* )
            {
            // InternalIdl.g:6056:1: ( ( rule__EventDeclaration__Group_6_1_2__0 )* )
            // InternalIdl.g:6057:2: ( rule__EventDeclaration__Group_6_1_2__0 )*
            {
             before(grammarAccess.getEventDeclarationAccess().getGroup_6_1_2()); 
            // InternalIdl.g:6058:2: ( rule__EventDeclaration__Group_6_1_2__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==38) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalIdl.g:6058:3: rule__EventDeclaration__Group_6_1_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__EventDeclaration__Group_6_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getEventDeclarationAccess().getGroup_6_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_1__2__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_1_2__0"
    // InternalIdl.g:6067:1: rule__EventDeclaration__Group_6_1_2__0 : rule__EventDeclaration__Group_6_1_2__0__Impl rule__EventDeclaration__Group_6_1_2__1 ;
    public final void rule__EventDeclaration__Group_6_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6071:1: ( rule__EventDeclaration__Group_6_1_2__0__Impl rule__EventDeclaration__Group_6_1_2__1 )
            // InternalIdl.g:6072:2: rule__EventDeclaration__Group_6_1_2__0__Impl rule__EventDeclaration__Group_6_1_2__1
            {
            pushFollow(FOLLOW_6);
            rule__EventDeclaration__Group_6_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_1_2__0"


    // $ANTLR start "rule__EventDeclaration__Group_6_1_2__0__Impl"
    // InternalIdl.g:6079:1: rule__EventDeclaration__Group_6_1_2__0__Impl : ( ',' ) ;
    public final void rule__EventDeclaration__Group_6_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6083:1: ( ( ',' ) )
            // InternalIdl.g:6084:1: ( ',' )
            {
            // InternalIdl.g:6084:1: ( ',' )
            // InternalIdl.g:6085:2: ','
            {
             before(grammarAccess.getEventDeclarationAccess().getCommaKeyword_6_1_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getCommaKeyword_6_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_1_2__0__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_6_1_2__1"
    // InternalIdl.g:6094:1: rule__EventDeclaration__Group_6_1_2__1 : rule__EventDeclaration__Group_6_1_2__1__Impl ;
    public final void rule__EventDeclaration__Group_6_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6098:1: ( rule__EventDeclaration__Group_6_1_2__1__Impl )
            // InternalIdl.g:6099:2: rule__EventDeclaration__Group_6_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group_6_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_1_2__1"


    // $ANTLR start "rule__EventDeclaration__Group_6_1_2__1__Impl"
    // InternalIdl.g:6105:1: rule__EventDeclaration__Group_6_1_2__1__Impl : ( ( rule__EventDeclaration__RaisedExceptionsAssignment_6_1_2_1 ) ) ;
    public final void rule__EventDeclaration__Group_6_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6109:1: ( ( ( rule__EventDeclaration__RaisedExceptionsAssignment_6_1_2_1 ) ) )
            // InternalIdl.g:6110:1: ( ( rule__EventDeclaration__RaisedExceptionsAssignment_6_1_2_1 ) )
            {
            // InternalIdl.g:6110:1: ( ( rule__EventDeclaration__RaisedExceptionsAssignment_6_1_2_1 ) )
            // InternalIdl.g:6111:2: ( rule__EventDeclaration__RaisedExceptionsAssignment_6_1_2_1 )
            {
             before(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAssignment_6_1_2_1()); 
            // InternalIdl.g:6112:2: ( rule__EventDeclaration__RaisedExceptionsAssignment_6_1_2_1 )
            // InternalIdl.g:6112:3: rule__EventDeclaration__RaisedExceptionsAssignment_6_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__RaisedExceptionsAssignment_6_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAssignment_6_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_6_1_2__1__Impl"


    // $ANTLR start "rule__ParameterElement__Group__0"
    // InternalIdl.g:6121:1: rule__ParameterElement__Group__0 : rule__ParameterElement__Group__0__Impl rule__ParameterElement__Group__1 ;
    public final void rule__ParameterElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6125:1: ( rule__ParameterElement__Group__0__Impl rule__ParameterElement__Group__1 )
            // InternalIdl.g:6126:2: rule__ParameterElement__Group__0__Impl rule__ParameterElement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ParameterElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group__0"


    // $ANTLR start "rule__ParameterElement__Group__0__Impl"
    // InternalIdl.g:6133:1: rule__ParameterElement__Group__0__Impl : ( ( rule__ParameterElement__DirectionAssignment_0 ) ) ;
    public final void rule__ParameterElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6137:1: ( ( ( rule__ParameterElement__DirectionAssignment_0 ) ) )
            // InternalIdl.g:6138:1: ( ( rule__ParameterElement__DirectionAssignment_0 ) )
            {
            // InternalIdl.g:6138:1: ( ( rule__ParameterElement__DirectionAssignment_0 ) )
            // InternalIdl.g:6139:2: ( rule__ParameterElement__DirectionAssignment_0 )
            {
             before(grammarAccess.getParameterElementAccess().getDirectionAssignment_0()); 
            // InternalIdl.g:6140:2: ( rule__ParameterElement__DirectionAssignment_0 )
            // InternalIdl.g:6140:3: rule__ParameterElement__DirectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterElement__DirectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterElementAccess().getDirectionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group__0__Impl"


    // $ANTLR start "rule__ParameterElement__Group__1"
    // InternalIdl.g:6148:1: rule__ParameterElement__Group__1 : rule__ParameterElement__Group__1__Impl rule__ParameterElement__Group__2 ;
    public final void rule__ParameterElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6152:1: ( rule__ParameterElement__Group__1__Impl rule__ParameterElement__Group__2 )
            // InternalIdl.g:6153:2: rule__ParameterElement__Group__1__Impl rule__ParameterElement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ParameterElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group__1"


    // $ANTLR start "rule__ParameterElement__Group__1__Impl"
    // InternalIdl.g:6160:1: rule__ParameterElement__Group__1__Impl : ( ( rule__ParameterElement__ParamTypeAssignment_1 ) ) ;
    public final void rule__ParameterElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6164:1: ( ( ( rule__ParameterElement__ParamTypeAssignment_1 ) ) )
            // InternalIdl.g:6165:1: ( ( rule__ParameterElement__ParamTypeAssignment_1 ) )
            {
            // InternalIdl.g:6165:1: ( ( rule__ParameterElement__ParamTypeAssignment_1 ) )
            // InternalIdl.g:6166:2: ( rule__ParameterElement__ParamTypeAssignment_1 )
            {
             before(grammarAccess.getParameterElementAccess().getParamTypeAssignment_1()); 
            // InternalIdl.g:6167:2: ( rule__ParameterElement__ParamTypeAssignment_1 )
            // InternalIdl.g:6167:3: rule__ParameterElement__ParamTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterElement__ParamTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterElementAccess().getParamTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group__1__Impl"


    // $ANTLR start "rule__ParameterElement__Group__2"
    // InternalIdl.g:6175:1: rule__ParameterElement__Group__2 : rule__ParameterElement__Group__2__Impl ;
    public final void rule__ParameterElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6179:1: ( rule__ParameterElement__Group__2__Impl )
            // InternalIdl.g:6180:2: rule__ParameterElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group__2"


    // $ANTLR start "rule__ParameterElement__Group__2__Impl"
    // InternalIdl.g:6186:1: rule__ParameterElement__Group__2__Impl : ( ( rule__ParameterElement__ParamNameAssignment_2 ) ) ;
    public final void rule__ParameterElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6190:1: ( ( ( rule__ParameterElement__ParamNameAssignment_2 ) ) )
            // InternalIdl.g:6191:1: ( ( rule__ParameterElement__ParamNameAssignment_2 ) )
            {
            // InternalIdl.g:6191:1: ( ( rule__ParameterElement__ParamNameAssignment_2 ) )
            // InternalIdl.g:6192:2: ( rule__ParameterElement__ParamNameAssignment_2 )
            {
             before(grammarAccess.getParameterElementAccess().getParamNameAssignment_2()); 
            // InternalIdl.g:6193:2: ( rule__ParameterElement__ParamNameAssignment_2 )
            // InternalIdl.g:6193:3: rule__ParameterElement__ParamNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterElement__ParamNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterElementAccess().getParamNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalIdl.g:6202:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6206:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalIdl.g:6207:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalIdl.g:6214:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6218:1: ( ( RULE_ID ) )
            // InternalIdl.g:6219:1: ( RULE_ID )
            {
            // InternalIdl.g:6219:1: ( RULE_ID )
            // InternalIdl.g:6220:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalIdl.g:6229:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6233:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalIdl.g:6234:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalIdl.g:6240:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6244:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalIdl.g:6245:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalIdl.g:6245:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalIdl.g:6246:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalIdl.g:6247:2: ( rule__QualifiedName__Group_1__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==61) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalIdl.g:6247:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_58);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalIdl.g:6256:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6260:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalIdl.g:6261:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalIdl.g:6268:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6272:1: ( ( '.' ) )
            // InternalIdl.g:6273:1: ( '.' )
            {
            // InternalIdl.g:6273:1: ( '.' )
            // InternalIdl.g:6274:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalIdl.g:6283:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6287:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalIdl.g:6288:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalIdl.g:6294:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6298:1: ( ( RULE_ID ) )
            // InternalIdl.g:6299:1: ( RULE_ID )
            {
            // InternalIdl.g:6299:1: ( RULE_ID )
            // InternalIdl.g:6300:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalIdl.g:6310:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6314:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalIdl.g:6315:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalIdl.g:6322:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6326:1: ( ( ruleQualifiedName ) )
            // InternalIdl.g:6327:1: ( ruleQualifiedName )
            {
            // InternalIdl.g:6327:1: ( ruleQualifiedName )
            // InternalIdl.g:6328:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalIdl.g:6337:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6341:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalIdl.g:6342:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalIdl.g:6348:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6352:1: ( ( ( '.*' )? ) )
            // InternalIdl.g:6353:1: ( ( '.*' )? )
            {
            // InternalIdl.g:6353:1: ( ( '.*' )? )
            // InternalIdl.g:6354:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalIdl.g:6355:2: ( '.*' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==62) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalIdl.g:6355:3: '.*'
                    {
                    match(input,62,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__UnorderedGroup_4_1"
    // InternalIdl.g:6364:1: rule__InterfaceDeclaration__UnorderedGroup_4_1 : ( rule__InterfaceDeclaration__UnorderedGroup_4_1__0 )? ;
    public final void rule__InterfaceDeclaration__UnorderedGroup_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1());
        	
        try {
            // InternalIdl.g:6369:1: ( ( rule__InterfaceDeclaration__UnorderedGroup_4_1__0 )? )
            // InternalIdl.g:6370:2: ( rule__InterfaceDeclaration__UnorderedGroup_4_1__0 )?
            {
            // InternalIdl.g:6370:2: ( rule__InterfaceDeclaration__UnorderedGroup_4_1__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( LA58_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 0) ) {
                alt58=1;
            }
            else if ( LA58_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 1) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalIdl.g:6370:2: rule__InterfaceDeclaration__UnorderedGroup_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceDeclaration__UnorderedGroup_4_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__UnorderedGroup_4_1"


    // $ANTLR start "rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl"
    // InternalIdl.g:6378:1: rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl : ( ({...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_1__0 ) ) ) ) ) ;
    public final void rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalIdl.g:6383:1: ( ( ({...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_1__0 ) ) ) ) ) )
            // InternalIdl.g:6384:3: ( ({...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_1__0 ) ) ) ) )
            {
            // InternalIdl.g:6384:3: ( ({...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_1__0 ) ) ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( LA59_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 0) ) {
                alt59=1;
            }
            else if ( LA59_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 1) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalIdl.g:6385:3: ({...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_0__0 ) ) ) )
                    {
                    // InternalIdl.g:6385:3: ({...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_0__0 ) ) ) )
                    // InternalIdl.g:6386:4: {...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 0)");
                    }
                    // InternalIdl.g:6386:118: ( ( ( rule__InterfaceDeclaration__Group_4_1_0__0 ) ) )
                    // InternalIdl.g:6387:5: ( ( rule__InterfaceDeclaration__Group_4_1_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalIdl.g:6393:5: ( ( rule__InterfaceDeclaration__Group_4_1_0__0 ) )
                    // InternalIdl.g:6394:6: ( rule__InterfaceDeclaration__Group_4_1_0__0 )
                    {
                     before(grammarAccess.getInterfaceDeclarationAccess().getGroup_4_1_0()); 
                    // InternalIdl.g:6395:6: ( rule__InterfaceDeclaration__Group_4_1_0__0 )
                    // InternalIdl.g:6395:7: rule__InterfaceDeclaration__Group_4_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceDeclaration__Group_4_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInterfaceDeclarationAccess().getGroup_4_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:6400:3: ({...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_1__0 ) ) ) )
                    {
                    // InternalIdl.g:6400:3: ({...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_1__0 ) ) ) )
                    // InternalIdl.g:6401:4: {...}? => ( ( ( rule__InterfaceDeclaration__Group_4_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 1)");
                    }
                    // InternalIdl.g:6401:118: ( ( ( rule__InterfaceDeclaration__Group_4_1_1__0 ) ) )
                    // InternalIdl.g:6402:5: ( ( rule__InterfaceDeclaration__Group_4_1_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalIdl.g:6408:5: ( ( rule__InterfaceDeclaration__Group_4_1_1__0 ) )
                    // InternalIdl.g:6409:6: ( rule__InterfaceDeclaration__Group_4_1_1__0 )
                    {
                     before(grammarAccess.getInterfaceDeclarationAccess().getGroup_4_1_1()); 
                    // InternalIdl.g:6410:6: ( rule__InterfaceDeclaration__Group_4_1_1__0 )
                    // InternalIdl.g:6410:7: rule__InterfaceDeclaration__Group_4_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceDeclaration__Group_4_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInterfaceDeclarationAccess().getGroup_4_1_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__UnorderedGroup_4_1__0"
    // InternalIdl.g:6423:1: rule__InterfaceDeclaration__UnorderedGroup_4_1__0 : rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl ( rule__InterfaceDeclaration__UnorderedGroup_4_1__1 )? ;
    public final void rule__InterfaceDeclaration__UnorderedGroup_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6427:1: ( rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl ( rule__InterfaceDeclaration__UnorderedGroup_4_1__1 )? )
            // InternalIdl.g:6428:2: rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl ( rule__InterfaceDeclaration__UnorderedGroup_4_1__1 )?
            {
            pushFollow(FOLLOW_60);
            rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl();

            state._fsp--;

            // InternalIdl.g:6429:2: ( rule__InterfaceDeclaration__UnorderedGroup_4_1__1 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( LA60_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 0) ) {
                alt60=1;
            }
            else if ( LA60_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 1) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalIdl.g:6429:2: rule__InterfaceDeclaration__UnorderedGroup_4_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceDeclaration__UnorderedGroup_4_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__UnorderedGroup_4_1__0"


    // $ANTLR start "rule__InterfaceDeclaration__UnorderedGroup_4_1__1"
    // InternalIdl.g:6435:1: rule__InterfaceDeclaration__UnorderedGroup_4_1__1 : rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl ;
    public final void rule__InterfaceDeclaration__UnorderedGroup_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6439:1: ( rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl )
            // InternalIdl.g:6440:2: rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__UnorderedGroup_4_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__UnorderedGroup_4_1__1"


    // $ANTLR start "rule__IDLSpecification__ImportedEntitiesAssignment_0"
    // InternalIdl.g:6447:1: rule__IDLSpecification__ImportedEntitiesAssignment_0 : ( ruleImportDeclaration ) ;
    public final void rule__IDLSpecification__ImportedEntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6451:1: ( ( ruleImportDeclaration ) )
            // InternalIdl.g:6452:2: ( ruleImportDeclaration )
            {
            // InternalIdl.g:6452:2: ( ruleImportDeclaration )
            // InternalIdl.g:6453:3: ruleImportDeclaration
            {
             before(grammarAccess.getIDLSpecificationAccess().getImportedEntitiesImportDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getIDLSpecificationAccess().getImportedEntitiesImportDeclarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDLSpecification__ImportedEntitiesAssignment_0"


    // $ANTLR start "rule__IDLSpecification__ModulesAssignment_1"
    // InternalIdl.g:6462:1: rule__IDLSpecification__ModulesAssignment_1 : ( ruleModuleDeclaration ) ;
    public final void rule__IDLSpecification__ModulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6466:1: ( ( ruleModuleDeclaration ) )
            // InternalIdl.g:6467:2: ( ruleModuleDeclaration )
            {
            // InternalIdl.g:6467:2: ( ruleModuleDeclaration )
            // InternalIdl.g:6468:3: ruleModuleDeclaration
            {
             before(grammarAccess.getIDLSpecificationAccess().getModulesModuleDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModuleDeclaration();

            state._fsp--;

             after(grammarAccess.getIDLSpecificationAccess().getModulesModuleDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDLSpecification__ModulesAssignment_1"


    // $ANTLR start "rule__ImportDeclaration__ImportedNamespaceAssignment_1"
    // InternalIdl.g:6477:1: rule__ImportDeclaration__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__ImportDeclaration__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6481:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalIdl.g:6482:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalIdl.g:6482:2: ( ruleQualifiedNameWithWildcard )
            // InternalIdl.g:6483:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__ModuleDeclaration__VirtualAssignment_0"
    // InternalIdl.g:6492:1: rule__ModuleDeclaration__VirtualAssignment_0 : ( ( 'virtual' ) ) ;
    public final void rule__ModuleDeclaration__VirtualAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6496:1: ( ( ( 'virtual' ) ) )
            // InternalIdl.g:6497:2: ( ( 'virtual' ) )
            {
            // InternalIdl.g:6497:2: ( ( 'virtual' ) )
            // InternalIdl.g:6498:3: ( 'virtual' )
            {
             before(grammarAccess.getModuleDeclarationAccess().getVirtualVirtualKeyword_0_0()); 
            // InternalIdl.g:6499:3: ( 'virtual' )
            // InternalIdl.g:6500:4: 'virtual'
            {
             before(grammarAccess.getModuleDeclarationAccess().getVirtualVirtualKeyword_0_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getModuleDeclarationAccess().getVirtualVirtualKeyword_0_0()); 

            }

             after(grammarAccess.getModuleDeclarationAccess().getVirtualVirtualKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__VirtualAssignment_0"


    // $ANTLR start "rule__ModuleDeclaration__MainAssignment_1"
    // InternalIdl.g:6511:1: rule__ModuleDeclaration__MainAssignment_1 : ( ( 'main' ) ) ;
    public final void rule__ModuleDeclaration__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6515:1: ( ( ( 'main' ) ) )
            // InternalIdl.g:6516:2: ( ( 'main' ) )
            {
            // InternalIdl.g:6516:2: ( ( 'main' ) )
            // InternalIdl.g:6517:3: ( 'main' )
            {
             before(grammarAccess.getModuleDeclarationAccess().getMainMainKeyword_1_0()); 
            // InternalIdl.g:6518:3: ( 'main' )
            // InternalIdl.g:6519:4: 'main'
            {
             before(grammarAccess.getModuleDeclarationAccess().getMainMainKeyword_1_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getModuleDeclarationAccess().getMainMainKeyword_1_0()); 

            }

             after(grammarAccess.getModuleDeclarationAccess().getMainMainKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__MainAssignment_1"


    // $ANTLR start "rule__ModuleDeclaration__NameAssignment_3"
    // InternalIdl.g:6530:1: rule__ModuleDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ModuleDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6534:1: ( ( RULE_ID ) )
            // InternalIdl.g:6535:2: ( RULE_ID )
            {
            // InternalIdl.g:6535:2: ( RULE_ID )
            // InternalIdl.g:6536:3: RULE_ID
            {
             before(grammarAccess.getModuleDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__NameAssignment_3"


    // $ANTLR start "rule__ModuleDeclaration__ModuleComponentsAssignment_5"
    // InternalIdl.g:6545:1: rule__ModuleDeclaration__ModuleComponentsAssignment_5 : ( ruleAbstractModuleComponent ) ;
    public final void rule__ModuleDeclaration__ModuleComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6549:1: ( ( ruleAbstractModuleComponent ) )
            // InternalIdl.g:6550:2: ( ruleAbstractModuleComponent )
            {
            // InternalIdl.g:6550:2: ( ruleAbstractModuleComponent )
            // InternalIdl.g:6551:3: ruleAbstractModuleComponent
            {
             before(grammarAccess.getModuleDeclarationAccess().getModuleComponentsAbstractModuleComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractModuleComponent();

            state._fsp--;

             after(grammarAccess.getModuleDeclarationAccess().getModuleComponentsAbstractModuleComponentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__ModuleComponentsAssignment_5"


    // $ANTLR start "rule__ModuleDeclaration__NestedModulesAssignment_6"
    // InternalIdl.g:6560:1: rule__ModuleDeclaration__NestedModulesAssignment_6 : ( ruleModuleDeclaration ) ;
    public final void rule__ModuleDeclaration__NestedModulesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6564:1: ( ( ruleModuleDeclaration ) )
            // InternalIdl.g:6565:2: ( ruleModuleDeclaration )
            {
            // InternalIdl.g:6565:2: ( ruleModuleDeclaration )
            // InternalIdl.g:6566:3: ruleModuleDeclaration
            {
             before(grammarAccess.getModuleDeclarationAccess().getNestedModulesModuleDeclarationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleModuleDeclaration();

            state._fsp--;

             after(grammarAccess.getModuleDeclarationAccess().getNestedModulesModuleDeclarationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDeclaration__NestedModulesAssignment_6"


    // $ANTLR start "rule__ExceptionReferenceDeclaration__NameAssignment_1"
    // InternalIdl.g:6575:1: rule__ExceptionReferenceDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExceptionReferenceDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6579:1: ( ( RULE_ID ) )
            // InternalIdl.g:6580:2: ( RULE_ID )
            {
            // InternalIdl.g:6580:2: ( RULE_ID )
            // InternalIdl.g:6581:3: RULE_ID
            {
             before(grammarAccess.getExceptionReferenceDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExceptionReferenceDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionReferenceDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ExceptionReferenceDeclaration__LocationAssignment_3"
    // InternalIdl.g:6590:1: rule__ExceptionReferenceDeclaration__LocationAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ExceptionReferenceDeclaration__LocationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6594:1: ( ( RULE_STRING ) )
            // InternalIdl.g:6595:2: ( RULE_STRING )
            {
            // InternalIdl.g:6595:2: ( RULE_STRING )
            // InternalIdl.g:6596:3: RULE_STRING
            {
             before(grammarAccess.getExceptionReferenceDeclarationAccess().getLocationSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExceptionReferenceDeclarationAccess().getLocationSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionReferenceDeclaration__LocationAssignment_3"


    // $ANTLR start "rule__ExceptionDeclaration__NameAssignment_1"
    // InternalIdl.g:6605:1: rule__ExceptionDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExceptionDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6609:1: ( ( RULE_ID ) )
            // InternalIdl.g:6610:2: ( RULE_ID )
            {
            // InternalIdl.g:6610:2: ( RULE_ID )
            // InternalIdl.g:6611:3: RULE_ID
            {
             before(grammarAccess.getExceptionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ExceptionDeclaration__SupertypeAssignment_2_1"
    // InternalIdl.g:6620:1: rule__ExceptionDeclaration__SupertypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ExceptionDeclaration__SupertypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6624:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIdl.g:6625:2: ( ( ruleQualifiedName ) )
            {
            // InternalIdl.g:6625:2: ( ( ruleQualifiedName ) )
            // InternalIdl.g:6626:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getSupertypeAbstractExceptionCrossReference_2_1_0()); 
            // InternalIdl.g:6627:3: ( ruleQualifiedName )
            // InternalIdl.g:6628:4: ruleQualifiedName
            {
             before(grammarAccess.getExceptionDeclarationAccess().getSupertypeAbstractExceptionQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getExceptionDeclarationAccess().getSupertypeAbstractExceptionQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getExceptionDeclarationAccess().getSupertypeAbstractExceptionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__SupertypeAssignment_2_1"


    // $ANTLR start "rule__ExceptionDeclaration__MembersAssignment_4_0"
    // InternalIdl.g:6639:1: rule__ExceptionDeclaration__MembersAssignment_4_0 : ( ruleMemberElement ) ;
    public final void rule__ExceptionDeclaration__MembersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6643:1: ( ( ruleMemberElement ) )
            // InternalIdl.g:6644:2: ( ruleMemberElement )
            {
            // InternalIdl.g:6644:2: ( ruleMemberElement )
            // InternalIdl.g:6645:3: ruleMemberElement
            {
             before(grammarAccess.getExceptionDeclarationAccess().getMembersMemberElementParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberElement();

            state._fsp--;

             after(grammarAccess.getExceptionDeclarationAccess().getMembersMemberElementParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDeclaration__MembersAssignment_4_0"


    // $ANTLR start "rule__AbstractType__PrimitiveTypeAssignment_0"
    // InternalIdl.g:6654:1: rule__AbstractType__PrimitiveTypeAssignment_0 : ( rulePrimitiveType ) ;
    public final void rule__AbstractType__PrimitiveTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6658:1: ( ( rulePrimitiveType ) )
            // InternalIdl.g:6659:2: ( rulePrimitiveType )
            {
            // InternalIdl.g:6659:2: ( rulePrimitiveType )
            // InternalIdl.g:6660:3: rulePrimitiveType
            {
             before(grammarAccess.getAbstractTypeAccess().getPrimitiveTypePrimitiveTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getAbstractTypeAccess().getPrimitiveTypePrimitiveTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractType__PrimitiveTypeAssignment_0"


    // $ANTLR start "rule__AbstractType__ReferenceTypeAssignment_1"
    // InternalIdl.g:6669:1: rule__AbstractType__ReferenceTypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AbstractType__ReferenceTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6673:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIdl.g:6674:2: ( ( ruleQualifiedName ) )
            {
            // InternalIdl.g:6674:2: ( ( ruleQualifiedName ) )
            // InternalIdl.g:6675:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAbstractTypeAccess().getReferenceTypeAbstractCrossReferenceCrossReference_1_0()); 
            // InternalIdl.g:6676:3: ( ruleQualifiedName )
            // InternalIdl.g:6677:4: ruleQualifiedName
            {
             before(grammarAccess.getAbstractTypeAccess().getReferenceTypeAbstractCrossReferenceQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAbstractTypeAccess().getReferenceTypeAbstractCrossReferenceQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAbstractTypeAccess().getReferenceTypeAbstractCrossReferenceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractType__ReferenceTypeAssignment_1"


    // $ANTLR start "rule__AbstractType__CollectionTypeAssignment_2"
    // InternalIdl.g:6688:1: rule__AbstractType__CollectionTypeAssignment_2 : ( ruleAbstractCollection ) ;
    public final void rule__AbstractType__CollectionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6692:1: ( ( ruleAbstractCollection ) )
            // InternalIdl.g:6693:2: ( ruleAbstractCollection )
            {
            // InternalIdl.g:6693:2: ( ruleAbstractCollection )
            // InternalIdl.g:6694:3: ruleAbstractCollection
            {
             before(grammarAccess.getAbstractTypeAccess().getCollectionTypeAbstractCollectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractCollection();

            state._fsp--;

             after(grammarAccess.getAbstractTypeAccess().getCollectionTypeAbstractCollectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractType__CollectionTypeAssignment_2"


    // $ANTLR start "rule__AliasDeclaration__TypeAssignment_1"
    // InternalIdl.g:6703:1: rule__AliasDeclaration__TypeAssignment_1 : ( ruleAbstractType ) ;
    public final void rule__AliasDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6707:1: ( ( ruleAbstractType ) )
            // InternalIdl.g:6708:2: ( ruleAbstractType )
            {
            // InternalIdl.g:6708:2: ( ruleAbstractType )
            // InternalIdl.g:6709:3: ruleAbstractType
            {
             before(grammarAccess.getAliasDeclarationAccess().getTypeAbstractTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getAliasDeclarationAccess().getTypeAbstractTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDeclaration__TypeAssignment_1"


    // $ANTLR start "rule__AliasDeclaration__NameAssignment_2"
    // InternalIdl.g:6718:1: rule__AliasDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AliasDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6722:1: ( ( RULE_ID ) )
            // InternalIdl.g:6723:2: ( RULE_ID )
            {
            // InternalIdl.g:6723:2: ( RULE_ID )
            // InternalIdl.g:6724:3: RULE_ID
            {
             before(grammarAccess.getAliasDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAliasDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDeclaration__NameAssignment_2"


    // $ANTLR start "rule__EnumDeclaration__NameAssignment_1"
    // InternalIdl.g:6733:1: rule__EnumDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6737:1: ( ( RULE_ID ) )
            // InternalIdl.g:6738:2: ( RULE_ID )
            {
            // InternalIdl.g:6738:2: ( RULE_ID )
            // InternalIdl.g:6739:3: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__NameAssignment_1"


    // $ANTLR start "rule__EnumDeclaration__ContainedIdentifiersAssignment_3"
    // InternalIdl.g:6748:1: rule__EnumDeclaration__ContainedIdentifiersAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__ContainedIdentifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6752:1: ( ( RULE_ID ) )
            // InternalIdl.g:6753:2: ( RULE_ID )
            {
            // InternalIdl.g:6753:2: ( RULE_ID )
            // InternalIdl.g:6754:3: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getContainedIdentifiersIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getContainedIdentifiersIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__ContainedIdentifiersAssignment_3"


    // $ANTLR start "rule__EnumDeclaration__ContainedIdentifiersAssignment_4_1"
    // InternalIdl.g:6763:1: rule__EnumDeclaration__ContainedIdentifiersAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__ContainedIdentifiersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6767:1: ( ( RULE_ID ) )
            // InternalIdl.g:6768:2: ( RULE_ID )
            {
            // InternalIdl.g:6768:2: ( RULE_ID )
            // InternalIdl.g:6769:3: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getContainedIdentifiersIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getContainedIdentifiersIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__ContainedIdentifiersAssignment_4_1"


    // $ANTLR start "rule__EnumDeclaration__DeclaratorAssignment_6"
    // InternalIdl.g:6778:1: rule__EnumDeclaration__DeclaratorAssignment_6 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__DeclaratorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6782:1: ( ( RULE_ID ) )
            // InternalIdl.g:6783:2: ( RULE_ID )
            {
            // InternalIdl.g:6783:2: ( RULE_ID )
            // InternalIdl.g:6784:3: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getDeclaratorIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getDeclaratorIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__DeclaratorAssignment_6"


    // $ANTLR start "rule__SequenceDeclaration__TypeAssignment_2_0"
    // InternalIdl.g:6793:1: rule__SequenceDeclaration__TypeAssignment_2_0 : ( ruleAbstractType ) ;
    public final void rule__SequenceDeclaration__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6797:1: ( ( ruleAbstractType ) )
            // InternalIdl.g:6798:2: ( ruleAbstractType )
            {
            // InternalIdl.g:6798:2: ( ruleAbstractType )
            // InternalIdl.g:6799:3: ruleAbstractType
            {
             before(grammarAccess.getSequenceDeclarationAccess().getTypeAbstractTypeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getSequenceDeclarationAccess().getTypeAbstractTypeParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__TypeAssignment_2_0"


    // $ANTLR start "rule__SequenceDeclaration__FailableAssignment_2_1_0"
    // InternalIdl.g:6808:1: rule__SequenceDeclaration__FailableAssignment_2_1_0 : ( ( 'failable' ) ) ;
    public final void rule__SequenceDeclaration__FailableAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6812:1: ( ( ( 'failable' ) ) )
            // InternalIdl.g:6813:2: ( ( 'failable' ) )
            {
            // InternalIdl.g:6813:2: ( ( 'failable' ) )
            // InternalIdl.g:6814:3: ( 'failable' )
            {
             before(grammarAccess.getSequenceDeclarationAccess().getFailableFailableKeyword_2_1_0_0()); 
            // InternalIdl.g:6815:3: ( 'failable' )
            // InternalIdl.g:6816:4: 'failable'
            {
             before(grammarAccess.getSequenceDeclarationAccess().getFailableFailableKeyword_2_1_0_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getSequenceDeclarationAccess().getFailableFailableKeyword_2_1_0_0()); 

            }

             after(grammarAccess.getSequenceDeclarationAccess().getFailableFailableKeyword_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__FailableAssignment_2_1_0"


    // $ANTLR start "rule__SequenceDeclaration__TypeAssignment_2_1_1"
    // InternalIdl.g:6827:1: rule__SequenceDeclaration__TypeAssignment_2_1_1 : ( ruleAbstractType ) ;
    public final void rule__SequenceDeclaration__TypeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6831:1: ( ( ruleAbstractType ) )
            // InternalIdl.g:6832:2: ( ruleAbstractType )
            {
            // InternalIdl.g:6832:2: ( ruleAbstractType )
            // InternalIdl.g:6833:3: ruleAbstractType
            {
             before(grammarAccess.getSequenceDeclarationAccess().getTypeAbstractTypeParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getSequenceDeclarationAccess().getTypeAbstractTypeParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__TypeAssignment_2_1_1"


    // $ANTLR start "rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_1"
    // InternalIdl.g:6842:1: rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6846:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIdl.g:6847:2: ( ( ruleQualifiedName ) )
            {
            // InternalIdl.g:6847:2: ( ( ruleQualifiedName ) )
            // InternalIdl.g:6848:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_2_1_2_1_0()); 
            // InternalIdl.g:6849:3: ( ruleQualifiedName )
            // InternalIdl.g:6850:4: ruleQualifiedName
            {
             before(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAbstractExceptionQualifiedNameParserRuleCall_2_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAbstractExceptionQualifiedNameParserRuleCall_2_1_2_1_0_1()); 

            }

             after(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_2_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_1"


    // $ANTLR start "rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_2_1"
    // InternalIdl.g:6861:1: rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6865:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIdl.g:6866:2: ( ( ruleQualifiedName ) )
            {
            // InternalIdl.g:6866:2: ( ( ruleQualifiedName ) )
            // InternalIdl.g:6867:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_2_1_2_2_1_0()); 
            // InternalIdl.g:6868:3: ( ruleQualifiedName )
            // InternalIdl.g:6869:4: ruleQualifiedName
            {
             before(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAbstractExceptionQualifiedNameParserRuleCall_2_1_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAbstractExceptionQualifiedNameParserRuleCall_2_1_2_2_1_0_1()); 

            }

             after(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_2_1_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__RaisedExceptionsAssignment_2_1_2_2_1"


    // $ANTLR start "rule__SequenceDeclaration__SequenceHintsAssignment_4_1"
    // InternalIdl.g:6880:1: rule__SequenceDeclaration__SequenceHintsAssignment_4_1 : ( ruleAbstractSequenceHint ) ;
    public final void rule__SequenceDeclaration__SequenceHintsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6884:1: ( ( ruleAbstractSequenceHint ) )
            // InternalIdl.g:6885:2: ( ruleAbstractSequenceHint )
            {
            // InternalIdl.g:6885:2: ( ruleAbstractSequenceHint )
            // InternalIdl.g:6886:3: ruleAbstractSequenceHint
            {
             before(grammarAccess.getSequenceDeclarationAccess().getSequenceHintsAbstractSequenceHintParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractSequenceHint();

            state._fsp--;

             after(grammarAccess.getSequenceDeclarationAccess().getSequenceHintsAbstractSequenceHintParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__SequenceHintsAssignment_4_1"


    // $ANTLR start "rule__SequenceDeclaration__SequenceHintsAssignment_4_2_1"
    // InternalIdl.g:6895:1: rule__SequenceDeclaration__SequenceHintsAssignment_4_2_1 : ( ruleAbstractSequenceHint ) ;
    public final void rule__SequenceDeclaration__SequenceHintsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6899:1: ( ( ruleAbstractSequenceHint ) )
            // InternalIdl.g:6900:2: ( ruleAbstractSequenceHint )
            {
            // InternalIdl.g:6900:2: ( ruleAbstractSequenceHint )
            // InternalIdl.g:6901:3: ruleAbstractSequenceHint
            {
             before(grammarAccess.getSequenceDeclarationAccess().getSequenceHintsAbstractSequenceHintParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractSequenceHint();

            state._fsp--;

             after(grammarAccess.getSequenceDeclarationAccess().getSequenceHintsAbstractSequenceHintParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDeclaration__SequenceHintsAssignment_4_2_1"


    // $ANTLR start "rule__TypicalLengthHint__LengthAssignment_4"
    // InternalIdl.g:6910:1: rule__TypicalLengthHint__LengthAssignment_4 : ( RULE_INT ) ;
    public final void rule__TypicalLengthHint__LengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6914:1: ( ( RULE_INT ) )
            // InternalIdl.g:6915:2: ( RULE_INT )
            {
            // InternalIdl.g:6915:2: ( RULE_INT )
            // InternalIdl.g:6916:3: RULE_INT
            {
             before(grammarAccess.getTypicalLengthHintAccess().getLengthINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypicalLengthHintAccess().getLengthINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalLengthHint__LengthAssignment_4"


    // $ANTLR start "rule__TypicalSizeHint__SizeAssignment_4"
    // InternalIdl.g:6925:1: rule__TypicalSizeHint__SizeAssignment_4 : ( RULE_INT ) ;
    public final void rule__TypicalSizeHint__SizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6929:1: ( ( RULE_INT ) )
            // InternalIdl.g:6930:2: ( RULE_INT )
            {
            // InternalIdl.g:6930:2: ( RULE_INT )
            // InternalIdl.g:6931:3: RULE_INT
            {
             before(grammarAccess.getTypicalSizeHintAccess().getSizeINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypicalSizeHintAccess().getSizeINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypicalSizeHint__SizeAssignment_4"


    // $ANTLR start "rule__TupleDeclaration__TypesAssignment_2"
    // InternalIdl.g:6940:1: rule__TupleDeclaration__TypesAssignment_2 : ( ruleAbstractType ) ;
    public final void rule__TupleDeclaration__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6944:1: ( ( ruleAbstractType ) )
            // InternalIdl.g:6945:2: ( ruleAbstractType )
            {
            // InternalIdl.g:6945:2: ( ruleAbstractType )
            // InternalIdl.g:6946:3: ruleAbstractType
            {
             before(grammarAccess.getTupleDeclarationAccess().getTypesAbstractTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getTupleDeclarationAccess().getTypesAbstractTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__TypesAssignment_2"


    // $ANTLR start "rule__TupleDeclaration__TypesAssignment_3_1"
    // InternalIdl.g:6955:1: rule__TupleDeclaration__TypesAssignment_3_1 : ( ruleAbstractType ) ;
    public final void rule__TupleDeclaration__TypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6959:1: ( ( ruleAbstractType ) )
            // InternalIdl.g:6960:2: ( ruleAbstractType )
            {
            // InternalIdl.g:6960:2: ( ruleAbstractType )
            // InternalIdl.g:6961:3: ruleAbstractType
            {
             before(grammarAccess.getTupleDeclarationAccess().getTypesAbstractTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getTupleDeclarationAccess().getTypesAbstractTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleDeclaration__TypesAssignment_3_1"


    // $ANTLR start "rule__StructDeclaration__NameAssignment_1"
    // InternalIdl.g:6970:1: rule__StructDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StructDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6974:1: ( ( RULE_ID ) )
            // InternalIdl.g:6975:2: ( RULE_ID )
            {
            // InternalIdl.g:6975:2: ( RULE_ID )
            // InternalIdl.g:6976:3: RULE_ID
            {
             before(grammarAccess.getStructDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__NameAssignment_1"


    // $ANTLR start "rule__StructDeclaration__SupertypeAssignment_2_1"
    // InternalIdl.g:6985:1: rule__StructDeclaration__SupertypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__StructDeclaration__SupertypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:6989:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIdl.g:6990:2: ( ( ruleQualifiedName ) )
            {
            // InternalIdl.g:6990:2: ( ( ruleQualifiedName ) )
            // InternalIdl.g:6991:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getStructDeclarationAccess().getSupertypeStructDeclarationCrossReference_2_1_0()); 
            // InternalIdl.g:6992:3: ( ruleQualifiedName )
            // InternalIdl.g:6993:4: ruleQualifiedName
            {
             before(grammarAccess.getStructDeclarationAccess().getSupertypeStructDeclarationQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getStructDeclarationAccess().getSupertypeStructDeclarationQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getStructDeclarationAccess().getSupertypeStructDeclarationCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__SupertypeAssignment_2_1"


    // $ANTLR start "rule__StructDeclaration__MembersAssignment_4_0_0"
    // InternalIdl.g:7004:1: rule__StructDeclaration__MembersAssignment_4_0_0 : ( ruleMemberElement ) ;
    public final void rule__StructDeclaration__MembersAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7008:1: ( ( ruleMemberElement ) )
            // InternalIdl.g:7009:2: ( ruleMemberElement )
            {
            // InternalIdl.g:7009:2: ( ruleMemberElement )
            // InternalIdl.g:7010:3: ruleMemberElement
            {
             before(grammarAccess.getStructDeclarationAccess().getMembersMemberElementParserRuleCall_4_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberElement();

            state._fsp--;

             after(grammarAccess.getStructDeclarationAccess().getMembersMemberElementParserRuleCall_4_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__MembersAssignment_4_0_0"


    // $ANTLR start "rule__StructDeclaration__TypeDeclsAssignment_4_0_1"
    // InternalIdl.g:7019:1: rule__StructDeclaration__TypeDeclsAssignment_4_0_1 : ( ruleAbstractTypeDeclaration ) ;
    public final void rule__StructDeclaration__TypeDeclsAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7023:1: ( ( ruleAbstractTypeDeclaration ) )
            // InternalIdl.g:7024:2: ( ruleAbstractTypeDeclaration )
            {
            // InternalIdl.g:7024:2: ( ruleAbstractTypeDeclaration )
            // InternalIdl.g:7025:3: ruleAbstractTypeDeclaration
            {
             before(grammarAccess.getStructDeclarationAccess().getTypeDeclsAbstractTypeDeclarationParserRuleCall_4_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getStructDeclarationAccess().getTypeDeclsAbstractTypeDeclarationParserRuleCall_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__TypeDeclsAssignment_4_0_1"


    // $ANTLR start "rule__StructDeclaration__DeclaratorAssignment_6"
    // InternalIdl.g:7034:1: rule__StructDeclaration__DeclaratorAssignment_6 : ( RULE_ID ) ;
    public final void rule__StructDeclaration__DeclaratorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7038:1: ( ( RULE_ID ) )
            // InternalIdl.g:7039:2: ( RULE_ID )
            {
            // InternalIdl.g:7039:2: ( RULE_ID )
            // InternalIdl.g:7040:3: RULE_ID
            {
             before(grammarAccess.getStructDeclarationAccess().getDeclaratorIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructDeclarationAccess().getDeclaratorIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__DeclaratorAssignment_6"


    // $ANTLR start "rule__MemberElement__OptionalAssignment_0"
    // InternalIdl.g:7049:1: rule__MemberElement__OptionalAssignment_0 : ( ( 'optional' ) ) ;
    public final void rule__MemberElement__OptionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7053:1: ( ( ( 'optional' ) ) )
            // InternalIdl.g:7054:2: ( ( 'optional' ) )
            {
            // InternalIdl.g:7054:2: ( ( 'optional' ) )
            // InternalIdl.g:7055:3: ( 'optional' )
            {
             before(grammarAccess.getMemberElementAccess().getOptionalOptionalKeyword_0_0()); 
            // InternalIdl.g:7056:3: ( 'optional' )
            // InternalIdl.g:7057:4: 'optional'
            {
             before(grammarAccess.getMemberElementAccess().getOptionalOptionalKeyword_0_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getMemberElementAccess().getOptionalOptionalKeyword_0_0()); 

            }

             after(grammarAccess.getMemberElementAccess().getOptionalOptionalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberElement__OptionalAssignment_0"


    // $ANTLR start "rule__MemberElement__TypeAssignment_1"
    // InternalIdl.g:7068:1: rule__MemberElement__TypeAssignment_1 : ( ruleAbstractType ) ;
    public final void rule__MemberElement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7072:1: ( ( ruleAbstractType ) )
            // InternalIdl.g:7073:2: ( ruleAbstractType )
            {
            // InternalIdl.g:7073:2: ( ruleAbstractType )
            // InternalIdl.g:7074:3: ruleAbstractType
            {
             before(grammarAccess.getMemberElementAccess().getTypeAbstractTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getMemberElementAccess().getTypeAbstractTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberElement__TypeAssignment_1"


    // $ANTLR start "rule__MemberElement__NameAssignment_2"
    // InternalIdl.g:7083:1: rule__MemberElement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MemberElement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7087:1: ( ( RULE_ID ) )
            // InternalIdl.g:7088:2: ( RULE_ID )
            {
            // InternalIdl.g:7088:2: ( RULE_ID )
            // InternalIdl.g:7089:3: RULE_ID
            {
             before(grammarAccess.getMemberElementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberElementAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberElement__NameAssignment_2"


    // $ANTLR start "rule__KeyElement__TypeAssignment_0"
    // InternalIdl.g:7098:1: rule__KeyElement__TypeAssignment_0 : ( ruleAbstractType ) ;
    public final void rule__KeyElement__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7102:1: ( ( ruleAbstractType ) )
            // InternalIdl.g:7103:2: ( ruleAbstractType )
            {
            // InternalIdl.g:7103:2: ( ruleAbstractType )
            // InternalIdl.g:7104:3: ruleAbstractType
            {
             before(grammarAccess.getKeyElementAccess().getTypeAbstractTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getKeyElementAccess().getTypeAbstractTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyElement__TypeAssignment_0"


    // $ANTLR start "rule__KeyElement__KeyNameAssignment_1"
    // InternalIdl.g:7113:1: rule__KeyElement__KeyNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KeyElement__KeyNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7117:1: ( ( RULE_ID ) )
            // InternalIdl.g:7118:2: ( RULE_ID )
            {
            // InternalIdl.g:7118:2: ( RULE_ID )
            // InternalIdl.g:7119:3: RULE_ID
            {
             before(grammarAccess.getKeyElementAccess().getKeyNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKeyElementAccess().getKeyNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyElement__KeyNameAssignment_1"


    // $ANTLR start "rule__InterfaceDeclaration__DocCommentsAssignment_0"
    // InternalIdl.g:7128:1: rule__InterfaceDeclaration__DocCommentsAssignment_0 : ( ruleDocCommentElement ) ;
    public final void rule__InterfaceDeclaration__DocCommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7132:1: ( ( ruleDocCommentElement ) )
            // InternalIdl.g:7133:2: ( ruleDocCommentElement )
            {
            // InternalIdl.g:7133:2: ( ruleDocCommentElement )
            // InternalIdl.g:7134:3: ruleDocCommentElement
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getDocCommentsDocCommentElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDocCommentElement();

            state._fsp--;

             after(grammarAccess.getInterfaceDeclarationAccess().getDocCommentsDocCommentElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__DocCommentsAssignment_0"


    // $ANTLR start "rule__InterfaceDeclaration__AbstractAssignment_1"
    // InternalIdl.g:7143:1: rule__InterfaceDeclaration__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__InterfaceDeclaration__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7147:1: ( ( ( 'abstract' ) ) )
            // InternalIdl.g:7148:2: ( ( 'abstract' ) )
            {
            // InternalIdl.g:7148:2: ( ( 'abstract' ) )
            // InternalIdl.g:7149:3: ( 'abstract' )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalIdl.g:7150:3: ( 'abstract' )
            // InternalIdl.g:7151:4: 'abstract'
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getAbstractAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getInterfaceDeclarationAccess().getAbstractAbstractKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__AbstractAssignment_1"


    // $ANTLR start "rule__InterfaceDeclaration__NameAssignment_3"
    // InternalIdl.g:7162:1: rule__InterfaceDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__InterfaceDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7166:1: ( ( RULE_ID ) )
            // InternalIdl.g:7167:2: ( RULE_ID )
            {
            // InternalIdl.g:7167:2: ( RULE_ID )
            // InternalIdl.g:7168:3: RULE_ID
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__NameAssignment_3"


    // $ANTLR start "rule__InterfaceDeclaration__VersionAssignment_4_1_0_2"
    // InternalIdl.g:7177:1: rule__InterfaceDeclaration__VersionAssignment_4_1_0_2 : ( RULE_VERSION ) ;
    public final void rule__InterfaceDeclaration__VersionAssignment_4_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7181:1: ( ( RULE_VERSION ) )
            // InternalIdl.g:7182:2: ( RULE_VERSION )
            {
            // InternalIdl.g:7182:2: ( RULE_VERSION )
            // InternalIdl.g:7183:3: RULE_VERSION
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getVersionVERSIONTerminalRuleCall_4_1_0_2_0()); 
            match(input,RULE_VERSION,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getVersionVERSIONTerminalRuleCall_4_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__VersionAssignment_4_1_0_2"


    // $ANTLR start "rule__InterfaceDeclaration__GuidAssignment_4_1_1_2"
    // InternalIdl.g:7192:1: rule__InterfaceDeclaration__GuidAssignment_4_1_1_2 : ( RULE_UUID_LITERAL ) ;
    public final void rule__InterfaceDeclaration__GuidAssignment_4_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7196:1: ( ( RULE_UUID_LITERAL ) )
            // InternalIdl.g:7197:2: ( RULE_UUID_LITERAL )
            {
            // InternalIdl.g:7197:2: ( RULE_UUID_LITERAL )
            // InternalIdl.g:7198:3: RULE_UUID_LITERAL
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getGuidUUID_LITERALTerminalRuleCall_4_1_1_2_0()); 
            match(input,RULE_UUID_LITERAL,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getGuidUUID_LITERALTerminalRuleCall_4_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__GuidAssignment_4_1_1_2"


    // $ANTLR start "rule__InterfaceDeclaration__DerivesFromAssignment_5_1"
    // InternalIdl.g:7207:1: rule__InterfaceDeclaration__DerivesFromAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__InterfaceDeclaration__DerivesFromAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7211:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIdl.g:7212:2: ( ( ruleQualifiedName ) )
            {
            // InternalIdl.g:7212:2: ( ( ruleQualifiedName ) )
            // InternalIdl.g:7213:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromInterfaceDeclarationCrossReference_5_1_0()); 
            // InternalIdl.g:7214:3: ( ruleQualifiedName )
            // InternalIdl.g:7215:4: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromInterfaceDeclarationQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromInterfaceDeclarationQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromInterfaceDeclarationCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__DerivesFromAssignment_5_1"


    // $ANTLR start "rule__InterfaceDeclaration__DerivesFromAssignment_5_2_1"
    // InternalIdl.g:7226:1: rule__InterfaceDeclaration__DerivesFromAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__InterfaceDeclaration__DerivesFromAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7230:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIdl.g:7231:2: ( ( ruleQualifiedName ) )
            {
            // InternalIdl.g:7231:2: ( ( ruleQualifiedName ) )
            // InternalIdl.g:7232:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromInterfaceDeclarationCrossReference_5_2_1_0()); 
            // InternalIdl.g:7233:3: ( ruleQualifiedName )
            // InternalIdl.g:7234:4: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromInterfaceDeclarationQualifiedNameParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromInterfaceDeclarationQualifiedNameParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromInterfaceDeclarationCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__DerivesFromAssignment_5_2_1"


    // $ANTLR start "rule__InterfaceDeclaration__ContainsAssignment_7"
    // InternalIdl.g:7245:1: rule__InterfaceDeclaration__ContainsAssignment_7 : ( ruleAbstractInterfaceComponent ) ;
    public final void rule__InterfaceDeclaration__ContainsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7249:1: ( ( ruleAbstractInterfaceComponent ) )
            // InternalIdl.g:7250:2: ( ruleAbstractInterfaceComponent )
            {
            // InternalIdl.g:7250:2: ( ruleAbstractInterfaceComponent )
            // InternalIdl.g:7251:3: ruleAbstractInterfaceComponent
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getContainsAbstractInterfaceComponentParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractInterfaceComponent();

            state._fsp--;

             after(grammarAccess.getInterfaceDeclarationAccess().getContainsAbstractInterfaceComponentParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__ContainsAssignment_7"


    // $ANTLR start "rule__FunctionDeclaration__DocCommentsAssignment_0"
    // InternalIdl.g:7260:1: rule__FunctionDeclaration__DocCommentsAssignment_0 : ( ruleDocCommentElement ) ;
    public final void rule__FunctionDeclaration__DocCommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7264:1: ( ( ruleDocCommentElement ) )
            // InternalIdl.g:7265:2: ( ruleDocCommentElement )
            {
            // InternalIdl.g:7265:2: ( ruleDocCommentElement )
            // InternalIdl.g:7266:3: ruleDocCommentElement
            {
             before(grammarAccess.getFunctionDeclarationAccess().getDocCommentsDocCommentElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDocCommentElement();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getDocCommentsDocCommentElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__DocCommentsAssignment_0"


    // $ANTLR start "rule__FunctionDeclaration__SyncAssignment_1"
    // InternalIdl.g:7275:1: rule__FunctionDeclaration__SyncAssignment_1 : ( ( 'sync' ) ) ;
    public final void rule__FunctionDeclaration__SyncAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7279:1: ( ( ( 'sync' ) ) )
            // InternalIdl.g:7280:2: ( ( 'sync' ) )
            {
            // InternalIdl.g:7280:2: ( ( 'sync' ) )
            // InternalIdl.g:7281:3: ( 'sync' )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getSyncSyncKeyword_1_0()); 
            // InternalIdl.g:7282:3: ( 'sync' )
            // InternalIdl.g:7283:4: 'sync'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getSyncSyncKeyword_1_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getSyncSyncKeyword_1_0()); 

            }

             after(grammarAccess.getFunctionDeclarationAccess().getSyncSyncKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__SyncAssignment_1"


    // $ANTLR start "rule__FunctionDeclaration__QueryAssignment_2"
    // InternalIdl.g:7294:1: rule__FunctionDeclaration__QueryAssignment_2 : ( ( 'query' ) ) ;
    public final void rule__FunctionDeclaration__QueryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7298:1: ( ( ( 'query' ) ) )
            // InternalIdl.g:7299:2: ( ( 'query' ) )
            {
            // InternalIdl.g:7299:2: ( ( 'query' ) )
            // InternalIdl.g:7300:3: ( 'query' )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getQueryQueryKeyword_2_0()); 
            // InternalIdl.g:7301:3: ( 'query' )
            // InternalIdl.g:7302:4: 'query'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getQueryQueryKeyword_2_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getQueryQueryKeyword_2_0()); 

            }

             after(grammarAccess.getFunctionDeclarationAccess().getQueryQueryKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__QueryAssignment_2"


    // $ANTLR start "rule__FunctionDeclaration__NameAssignment_3"
    // InternalIdl.g:7313:1: rule__FunctionDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7317:1: ( ( RULE_ID ) )
            // InternalIdl.g:7318:2: ( RULE_ID )
            {
            // InternalIdl.g:7318:2: ( RULE_ID )
            // InternalIdl.g:7319:3: RULE_ID
            {
             before(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__NameAssignment_3"


    // $ANTLR start "rule__FunctionDeclaration__ParametersAssignment_5_0"
    // InternalIdl.g:7328:1: rule__FunctionDeclaration__ParametersAssignment_5_0 : ( ruleParameterElement ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7332:1: ( ( ruleParameterElement ) )
            // InternalIdl.g:7333:2: ( ruleParameterElement )
            {
            // InternalIdl.g:7333:2: ( ruleParameterElement )
            // InternalIdl.g:7334:3: ruleParameterElement
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersParameterElementParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterElement();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getParametersParameterElementParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__ParametersAssignment_5_0"


    // $ANTLR start "rule__FunctionDeclaration__ParametersAssignment_5_1_1"
    // InternalIdl.g:7343:1: rule__FunctionDeclaration__ParametersAssignment_5_1_1 : ( ruleParameterElement ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7347:1: ( ( ruleParameterElement ) )
            // InternalIdl.g:7348:2: ( ruleParameterElement )
            {
            // InternalIdl.g:7348:2: ( ruleParameterElement )
            // InternalIdl.g:7349:3: ruleParameterElement
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersParameterElementParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterElement();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getParametersParameterElementParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__ParametersAssignment_5_1_1"


    // $ANTLR start "rule__FunctionDeclaration__InjectedAssignment_7_0_1"
    // InternalIdl.g:7358:1: rule__FunctionDeclaration__InjectedAssignment_7_0_1 : ( ( 'injectable' ) ) ;
    public final void rule__FunctionDeclaration__InjectedAssignment_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7362:1: ( ( ( 'injectable' ) ) )
            // InternalIdl.g:7363:2: ( ( 'injectable' ) )
            {
            // InternalIdl.g:7363:2: ( ( 'injectable' ) )
            // InternalIdl.g:7364:3: ( 'injectable' )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getInjectedInjectableKeyword_7_0_1_0()); 
            // InternalIdl.g:7365:3: ( 'injectable' )
            // InternalIdl.g:7366:4: 'injectable'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getInjectedInjectableKeyword_7_0_1_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getInjectedInjectableKeyword_7_0_1_0()); 

            }

             after(grammarAccess.getFunctionDeclarationAccess().getInjectedInjectableKeyword_7_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__InjectedAssignment_7_0_1"


    // $ANTLR start "rule__FunctionDeclaration__ReturnedTypeAssignment_7_0_2"
    // InternalIdl.g:7377:1: rule__FunctionDeclaration__ReturnedTypeAssignment_7_0_2 : ( ruleReturnTypeElement ) ;
    public final void rule__FunctionDeclaration__ReturnedTypeAssignment_7_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7381:1: ( ( ruleReturnTypeElement ) )
            // InternalIdl.g:7382:2: ( ruleReturnTypeElement )
            {
            // InternalIdl.g:7382:2: ( ruleReturnTypeElement )
            // InternalIdl.g:7383:3: ruleReturnTypeElement
            {
             before(grammarAccess.getFunctionDeclarationAccess().getReturnedTypeReturnTypeElementParserRuleCall_7_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReturnTypeElement();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getReturnedTypeReturnTypeElementParserRuleCall_7_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__ReturnedTypeAssignment_7_0_2"


    // $ANTLR start "rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_1"
    // InternalIdl.g:7392:1: rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7396:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIdl.g:7397:2: ( ( ruleQualifiedName ) )
            {
            // InternalIdl.g:7397:2: ( ( ruleQualifiedName ) )
            // InternalIdl.g:7398:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_7_1_1_0()); 
            // InternalIdl.g:7399:3: ( ruleQualifiedName )
            // InternalIdl.g:7400:4: ruleQualifiedName
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAbstractExceptionQualifiedNameParserRuleCall_7_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAbstractExceptionQualifiedNameParserRuleCall_7_1_1_0_1()); 

            }

             after(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_1"


    // $ANTLR start "rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_2_1"
    // InternalIdl.g:7411:1: rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7415:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIdl.g:7416:2: ( ( ruleQualifiedName ) )
            {
            // InternalIdl.g:7416:2: ( ( ruleQualifiedName ) )
            // InternalIdl.g:7417:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_7_1_2_1_0()); 
            // InternalIdl.g:7418:3: ( ruleQualifiedName )
            // InternalIdl.g:7419:4: ruleQualifiedName
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAbstractExceptionQualifiedNameParserRuleCall_7_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAbstractExceptionQualifiedNameParserRuleCall_7_1_2_1_0_1()); 

            }

             after(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_7_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__RaisedExceptionsAssignment_7_1_2_1"


    // $ANTLR start "rule__EventDeclaration__NameAssignment_1"
    // InternalIdl.g:7430:1: rule__EventDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EventDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7434:1: ( ( RULE_ID ) )
            // InternalIdl.g:7435:2: ( RULE_ID )
            {
            // InternalIdl.g:7435:2: ( RULE_ID )
            // InternalIdl.g:7436:3: RULE_ID
            {
             before(grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__NameAssignment_1"


    // $ANTLR start "rule__EventDeclaration__GuidAssignment_2_1_2"
    // InternalIdl.g:7445:1: rule__EventDeclaration__GuidAssignment_2_1_2 : ( RULE_UUID_LITERAL ) ;
    public final void rule__EventDeclaration__GuidAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7449:1: ( ( RULE_UUID_LITERAL ) )
            // InternalIdl.g:7450:2: ( RULE_UUID_LITERAL )
            {
            // InternalIdl.g:7450:2: ( RULE_UUID_LITERAL )
            // InternalIdl.g:7451:3: RULE_UUID_LITERAL
            {
             before(grammarAccess.getEventDeclarationAccess().getGuidUUID_LITERALTerminalRuleCall_2_1_2_0()); 
            match(input,RULE_UUID_LITERAL,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getGuidUUID_LITERALTerminalRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__GuidAssignment_2_1_2"


    // $ANTLR start "rule__EventDeclaration__DataAssignment_4"
    // InternalIdl.g:7460:1: rule__EventDeclaration__DataAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EventDeclaration__DataAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7464:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIdl.g:7465:2: ( ( ruleQualifiedName ) )
            {
            // InternalIdl.g:7465:2: ( ( ruleQualifiedName ) )
            // InternalIdl.g:7466:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEventDeclarationAccess().getDataStructDeclarationCrossReference_4_0()); 
            // InternalIdl.g:7467:3: ( ruleQualifiedName )
            // InternalIdl.g:7468:4: ruleQualifiedName
            {
             before(grammarAccess.getEventDeclarationAccess().getDataStructDeclarationQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEventDeclarationAccess().getDataStructDeclarationQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getEventDeclarationAccess().getDataStructDeclarationCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__DataAssignment_4"


    // $ANTLR start "rule__EventDeclaration__KeysAssignment_6_0_3_0"
    // InternalIdl.g:7479:1: rule__EventDeclaration__KeysAssignment_6_0_3_0 : ( ruleKeyElement ) ;
    public final void rule__EventDeclaration__KeysAssignment_6_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7483:1: ( ( ruleKeyElement ) )
            // InternalIdl.g:7484:2: ( ruleKeyElement )
            {
            // InternalIdl.g:7484:2: ( ruleKeyElement )
            // InternalIdl.g:7485:3: ruleKeyElement
            {
             before(grammarAccess.getEventDeclarationAccess().getKeysKeyElementParserRuleCall_6_0_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyElement();

            state._fsp--;

             after(grammarAccess.getEventDeclarationAccess().getKeysKeyElementParserRuleCall_6_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__KeysAssignment_6_0_3_0"


    // $ANTLR start "rule__EventDeclaration__KeysAssignment_6_0_3_1_1"
    // InternalIdl.g:7494:1: rule__EventDeclaration__KeysAssignment_6_0_3_1_1 : ( ruleKeyElement ) ;
    public final void rule__EventDeclaration__KeysAssignment_6_0_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7498:1: ( ( ruleKeyElement ) )
            // InternalIdl.g:7499:2: ( ruleKeyElement )
            {
            // InternalIdl.g:7499:2: ( ruleKeyElement )
            // InternalIdl.g:7500:3: ruleKeyElement
            {
             before(grammarAccess.getEventDeclarationAccess().getKeysKeyElementParserRuleCall_6_0_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyElement();

            state._fsp--;

             after(grammarAccess.getEventDeclarationAccess().getKeysKeyElementParserRuleCall_6_0_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__KeysAssignment_6_0_3_1_1"


    // $ANTLR start "rule__EventDeclaration__RaisedExceptionsAssignment_6_1_1"
    // InternalIdl.g:7509:1: rule__EventDeclaration__RaisedExceptionsAssignment_6_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EventDeclaration__RaisedExceptionsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7513:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIdl.g:7514:2: ( ( ruleQualifiedName ) )
            {
            // InternalIdl.g:7514:2: ( ( ruleQualifiedName ) )
            // InternalIdl.g:7515:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_6_1_1_0()); 
            // InternalIdl.g:7516:3: ( ruleQualifiedName )
            // InternalIdl.g:7517:4: ruleQualifiedName
            {
             before(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAbstractExceptionQualifiedNameParserRuleCall_6_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAbstractExceptionQualifiedNameParserRuleCall_6_1_1_0_1()); 

            }

             after(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__RaisedExceptionsAssignment_6_1_1"


    // $ANTLR start "rule__EventDeclaration__RaisedExceptionsAssignment_6_1_2_1"
    // InternalIdl.g:7528:1: rule__EventDeclaration__RaisedExceptionsAssignment_6_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EventDeclaration__RaisedExceptionsAssignment_6_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7532:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIdl.g:7533:2: ( ( ruleQualifiedName ) )
            {
            // InternalIdl.g:7533:2: ( ( ruleQualifiedName ) )
            // InternalIdl.g:7534:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_6_1_2_1_0()); 
            // InternalIdl.g:7535:3: ( ruleQualifiedName )
            // InternalIdl.g:7536:4: ruleQualifiedName
            {
             before(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAbstractExceptionQualifiedNameParserRuleCall_6_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAbstractExceptionQualifiedNameParserRuleCall_6_1_2_1_0_1()); 

            }

             after(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_6_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__RaisedExceptionsAssignment_6_1_2_1"


    // $ANTLR start "rule__ReturnTypeElement__VoidAssignment_1"
    // InternalIdl.g:7547:1: rule__ReturnTypeElement__VoidAssignment_1 : ( ( 'void' ) ) ;
    public final void rule__ReturnTypeElement__VoidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7551:1: ( ( ( 'void' ) ) )
            // InternalIdl.g:7552:2: ( ( 'void' ) )
            {
            // InternalIdl.g:7552:2: ( ( 'void' ) )
            // InternalIdl.g:7553:3: ( 'void' )
            {
             before(grammarAccess.getReturnTypeElementAccess().getVoidVoidKeyword_1_0()); 
            // InternalIdl.g:7554:3: ( 'void' )
            // InternalIdl.g:7555:4: 'void'
            {
             before(grammarAccess.getReturnTypeElementAccess().getVoidVoidKeyword_1_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getReturnTypeElementAccess().getVoidVoidKeyword_1_0()); 

            }

             after(grammarAccess.getReturnTypeElementAccess().getVoidVoidKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeElement__VoidAssignment_1"


    // $ANTLR start "rule__ParameterElement__DirectionAssignment_0"
    // InternalIdl.g:7566:1: rule__ParameterElement__DirectionAssignment_0 : ( ruleParameterDirection ) ;
    public final void rule__ParameterElement__DirectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7570:1: ( ( ruleParameterDirection ) )
            // InternalIdl.g:7571:2: ( ruleParameterDirection )
            {
            // InternalIdl.g:7571:2: ( ruleParameterDirection )
            // InternalIdl.g:7572:3: ruleParameterDirection
            {
             before(grammarAccess.getParameterElementAccess().getDirectionParameterDirectionEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterDirection();

            state._fsp--;

             after(grammarAccess.getParameterElementAccess().getDirectionParameterDirectionEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__DirectionAssignment_0"


    // $ANTLR start "rule__ParameterElement__ParamTypeAssignment_1"
    // InternalIdl.g:7581:1: rule__ParameterElement__ParamTypeAssignment_1 : ( ruleAbstractType ) ;
    public final void rule__ParameterElement__ParamTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7585:1: ( ( ruleAbstractType ) )
            // InternalIdl.g:7586:2: ( ruleAbstractType )
            {
            // InternalIdl.g:7586:2: ( ruleAbstractType )
            // InternalIdl.g:7587:3: ruleAbstractType
            {
             before(grammarAccess.getParameterElementAccess().getParamTypeAbstractTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getParameterElementAccess().getParamTypeAbstractTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__ParamTypeAssignment_1"


    // $ANTLR start "rule__ParameterElement__ParamNameAssignment_2"
    // InternalIdl.g:7596:1: rule__ParameterElement__ParamNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParameterElement__ParamNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7600:1: ( ( RULE_ID ) )
            // InternalIdl.g:7601:2: ( RULE_ID )
            {
            // InternalIdl.g:7601:2: ( RULE_ID )
            // InternalIdl.g:7602:3: RULE_ID
            {
             before(grammarAccess.getParameterElementAccess().getParamNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterElementAccess().getParamNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__ParamNameAssignment_2"


    // $ANTLR start "rule__DocCommentElement__TextAssignment"
    // InternalIdl.g:7611:1: rule__DocCommentElement__TextAssignment : ( ( rule__DocCommentElement__TextAlternatives_0 ) ) ;
    public final void rule__DocCommentElement__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7615:1: ( ( ( rule__DocCommentElement__TextAlternatives_0 ) ) )
            // InternalIdl.g:7616:2: ( ( rule__DocCommentElement__TextAlternatives_0 ) )
            {
            // InternalIdl.g:7616:2: ( ( rule__DocCommentElement__TextAlternatives_0 ) )
            // InternalIdl.g:7617:3: ( rule__DocCommentElement__TextAlternatives_0 )
            {
             before(grammarAccess.getDocCommentElementAccess().getTextAlternatives_0()); 
            // InternalIdl.g:7618:3: ( rule__DocCommentElement__TextAlternatives_0 )
            // InternalIdl.g:7618:4: rule__DocCommentElement__TextAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DocCommentElement__TextAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDocCommentElementAccess().getTextAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocCommentElement__TextAssignment"


    // $ANTLR start "rule__PrimitiveType__IntegerTypeAssignment_0"
    // InternalIdl.g:7626:1: rule__PrimitiveType__IntegerTypeAssignment_0 : ( ruleIntegerType ) ;
    public final void rule__PrimitiveType__IntegerTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7630:1: ( ( ruleIntegerType ) )
            // InternalIdl.g:7631:2: ( ruleIntegerType )
            {
            // InternalIdl.g:7631:2: ( ruleIntegerType )
            // InternalIdl.g:7632:3: ruleIntegerType
            {
             before(grammarAccess.getPrimitiveTypeAccess().getIntegerTypeIntegerTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getIntegerTypeIntegerTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__IntegerTypeAssignment_0"


    // $ANTLR start "rule__PrimitiveType__StringTypeAssignment_1"
    // InternalIdl.g:7641:1: rule__PrimitiveType__StringTypeAssignment_1 : ( RULE_STRINGTYPE ) ;
    public final void rule__PrimitiveType__StringTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7645:1: ( ( RULE_STRINGTYPE ) )
            // InternalIdl.g:7646:2: ( RULE_STRINGTYPE )
            {
            // InternalIdl.g:7646:2: ( RULE_STRINGTYPE )
            // InternalIdl.g:7647:3: RULE_STRINGTYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getStringTypeSTRINGTYPETerminalRuleCall_1_0()); 
            match(input,RULE_STRINGTYPE,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getStringTypeSTRINGTYPETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__StringTypeAssignment_1"


    // $ANTLR start "rule__PrimitiveType__CharTypeAssignment_2"
    // InternalIdl.g:7656:1: rule__PrimitiveType__CharTypeAssignment_2 : ( RULE_CHAR ) ;
    public final void rule__PrimitiveType__CharTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7660:1: ( ( RULE_CHAR ) )
            // InternalIdl.g:7661:2: ( RULE_CHAR )
            {
            // InternalIdl.g:7661:2: ( RULE_CHAR )
            // InternalIdl.g:7662:3: RULE_CHAR
            {
             before(grammarAccess.getPrimitiveTypeAccess().getCharTypeCHARTerminalRuleCall_2_0()); 
            match(input,RULE_CHAR,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getCharTypeCHARTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__CharTypeAssignment_2"


    // $ANTLR start "rule__PrimitiveType__FloatingPointTypeAssignment_3"
    // InternalIdl.g:7671:1: rule__PrimitiveType__FloatingPointTypeAssignment_3 : ( ruleFloatingPointType ) ;
    public final void rule__PrimitiveType__FloatingPointTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7675:1: ( ( ruleFloatingPointType ) )
            // InternalIdl.g:7676:2: ( ruleFloatingPointType )
            {
            // InternalIdl.g:7676:2: ( ruleFloatingPointType )
            // InternalIdl.g:7677:3: ruleFloatingPointType
            {
             before(grammarAccess.getPrimitiveTypeAccess().getFloatingPointTypeFloatingPointTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatingPointType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getFloatingPointTypeFloatingPointTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__FloatingPointTypeAssignment_3"


    // $ANTLR start "rule__PrimitiveType__UuidTypeAssignment_4"
    // InternalIdl.g:7686:1: rule__PrimitiveType__UuidTypeAssignment_4 : ( RULE_UUID ) ;
    public final void rule__PrimitiveType__UuidTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7690:1: ( ( RULE_UUID ) )
            // InternalIdl.g:7691:2: ( RULE_UUID )
            {
            // InternalIdl.g:7691:2: ( RULE_UUID )
            // InternalIdl.g:7692:3: RULE_UUID
            {
             before(grammarAccess.getPrimitiveTypeAccess().getUuidTypeUUIDTerminalRuleCall_4_0()); 
            match(input,RULE_UUID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getUuidTypeUUIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__UuidTypeAssignment_4"


    // $ANTLR start "rule__PrimitiveType__BooleanTypeAssignment_5"
    // InternalIdl.g:7701:1: rule__PrimitiveType__BooleanTypeAssignment_5 : ( RULE_BOOLEAN ) ;
    public final void rule__PrimitiveType__BooleanTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIdl.g:7705:1: ( ( RULE_BOOLEAN ) )
            // InternalIdl.g:7706:2: ( RULE_BOOLEAN )
            {
            // InternalIdl.g:7706:2: ( RULE_BOOLEAN )
            // InternalIdl.g:7707:3: RULE_BOOLEAN
            {
             before(grammarAccess.getPrimitiveTypeAccess().getBooleanTypeBOOLEANTerminalRuleCall_5_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getBooleanTypeBOOLEANTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__BooleanTypeAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x8000000020000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x8000000020000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x80180032A0000030L,0x0000000000000009L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0018003200000032L,0x0000000000000008L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00040080801E1FC0L,0x0000000000000004L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00040080001E1FC2L,0x0000000000000004L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00040080001E1FC0L,0x0000000000000004L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00040080001E1FC0L,0x0000000000000006L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x001C00B2801E1FF0L,0x000000000000000CL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x001C00B2001E1FF2L,0x000000000000000CL});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080840000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x041C00B2801E1FF0L,0x000000000000003CL});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x041C00B2001E1FF2L,0x000000000000003CL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000001030L,0x0000000000000030L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x010000000C000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00040080001E1FC0L,0x00000000000000C4L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080080000001000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800040000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x01040080001E1FC0L,0x0000000000000004L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0060000000000002L});

}
