package com.btc.serviceidl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.btc.serviceidl.services.IdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIdlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_VERSION", "RULE_UUID_LITERAL", "RULE_SL_DOC_COMMENT", "RULE_ML_DOC_COMMENT", "RULE_STRINGTYPE", "RULE_CHAR", "RULE_UUID", "RULE_BOOLEAN", "RULE_BYTE", "RULE_INT16", "RULE_INT32", "RULE_INT64", "RULE_FLOAT", "RULE_DOUBLE", "RULE_HEX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'virtual'", "'main'", "'module'", "'{'", "'}'", "';'", "'exception'", "'ref'", "':'", "'typedef'", "'enum'", "','", "'sequence'", "'<'", "'failable'", "'raises'", "'>'", "'['", "']'", "'typical'", "'length'", "'='", "'element'", "'size'", "'tuple'", "'struct'", "'optional'", "'abstract'", "'interface'", "'version'", "'guid'", "'sync'", "'query'", "'('", "')'", "'returns'", "'injectable'", "'event'", "'subscribe'", "'with'", "'void'", "'.'", "'.*'", "'in'", "'out'"
    };
    public static final int RULE_HEX=21;
    public static final int T__50=50;
    public static final int RULE_INT32=17;
    public static final int RULE_BOOLEAN=14;
    public static final int RULE_ML_DOC_COMMENT=10;
    public static final int RULE_VERSION=7;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int RULE_CHAR=12;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT64=18;
    public static final int RULE_STRINGTYPE=11;
    public static final int T__26=26;
    public static final int RULE_UUID=13;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public static final int RULE_UUID_LITERAL=8;
    public static final int RULE_STRING=5;
    public static final int RULE_BYTE=15;
    public static final int RULE_SL_COMMENT=23;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=20;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_INT16=16;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=24;
    public static final int RULE_SL_DOC_COMMENT=9;
    public static final int RULE_ANY_OTHER=25;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=19;
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

        public InternalIdlParser(TokenStream input, IdlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "IDLSpecification";
       	}

       	@Override
       	protected IdlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleIDLSpecification"
    // InternalIdl.g:65:1: entryRuleIDLSpecification returns [EObject current=null] : iv_ruleIDLSpecification= ruleIDLSpecification EOF ;
    public final EObject entryRuleIDLSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDLSpecification = null;


        try {
            // InternalIdl.g:65:57: (iv_ruleIDLSpecification= ruleIDLSpecification EOF )
            // InternalIdl.g:66:2: iv_ruleIDLSpecification= ruleIDLSpecification EOF
            {
             newCompositeNode(grammarAccess.getIDLSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIDLSpecification=ruleIDLSpecification();

            state._fsp--;

             current =iv_ruleIDLSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDLSpecification"


    // $ANTLR start "ruleIDLSpecification"
    // InternalIdl.g:72:1: ruleIDLSpecification returns [EObject current=null] : ( ( (lv_importedEntities_0_0= ruleImportDeclaration ) )* ( (lv_modules_1_0= ruleModuleDeclaration ) )* ) ;
    public final EObject ruleIDLSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_importedEntities_0_0 = null;

        EObject lv_modules_1_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:78:2: ( ( ( (lv_importedEntities_0_0= ruleImportDeclaration ) )* ( (lv_modules_1_0= ruleModuleDeclaration ) )* ) )
            // InternalIdl.g:79:2: ( ( (lv_importedEntities_0_0= ruleImportDeclaration ) )* ( (lv_modules_1_0= ruleModuleDeclaration ) )* )
            {
            // InternalIdl.g:79:2: ( ( (lv_importedEntities_0_0= ruleImportDeclaration ) )* ( (lv_modules_1_0= ruleModuleDeclaration ) )* )
            // InternalIdl.g:80:3: ( (lv_importedEntities_0_0= ruleImportDeclaration ) )* ( (lv_modules_1_0= ruleModuleDeclaration ) )*
            {
            // InternalIdl.g:80:3: ( (lv_importedEntities_0_0= ruleImportDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIdl.g:81:4: (lv_importedEntities_0_0= ruleImportDeclaration )
            	    {
            	    // InternalIdl.g:81:4: (lv_importedEntities_0_0= ruleImportDeclaration )
            	    // InternalIdl.g:82:5: lv_importedEntities_0_0= ruleImportDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getIDLSpecificationAccess().getImportedEntitiesImportDeclarationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_importedEntities_0_0=ruleImportDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIDLSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"importedEntities",
            	    						lv_importedEntities_0_0,
            	    						"com.btc.serviceidl.Idl.ImportDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalIdl.g:99:3: ( (lv_modules_1_0= ruleModuleDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=27 && LA2_0<=29)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIdl.g:100:4: (lv_modules_1_0= ruleModuleDeclaration )
            	    {
            	    // InternalIdl.g:100:4: (lv_modules_1_0= ruleModuleDeclaration )
            	    // InternalIdl.g:101:5: lv_modules_1_0= ruleModuleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getIDLSpecificationAccess().getModulesModuleDeclarationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_modules_1_0=ruleModuleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIDLSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modules",
            	    						lv_modules_1_0,
            	    						"com.btc.serviceidl.Idl.ModuleDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDLSpecification"


    // $ANTLR start "entryRuleImportDeclaration"
    // InternalIdl.g:122:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // InternalIdl.g:122:58: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // InternalIdl.g:123:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
             newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;

             current =iv_ruleImportDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // InternalIdl.g:129:1: ruleImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:135:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalIdl.g:136:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalIdl.g:136:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalIdl.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportDeclarationAccess().getImportKeyword_0());
            		
            // InternalIdl.g:141:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalIdl.g:142:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalIdl.g:142:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalIdl.g:143:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportDeclarationRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"com.btc.serviceidl.Idl.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleModuleDeclaration"
    // InternalIdl.g:164:1: entryRuleModuleDeclaration returns [EObject current=null] : iv_ruleModuleDeclaration= ruleModuleDeclaration EOF ;
    public final EObject entryRuleModuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleDeclaration = null;


        try {
            // InternalIdl.g:164:58: (iv_ruleModuleDeclaration= ruleModuleDeclaration EOF )
            // InternalIdl.g:165:2: iv_ruleModuleDeclaration= ruleModuleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getModuleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleDeclaration=ruleModuleDeclaration();

            state._fsp--;

             current =iv_ruleModuleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModuleDeclaration"


    // $ANTLR start "ruleModuleDeclaration"
    // InternalIdl.g:171:1: ruleModuleDeclaration returns [EObject current=null] : ( ( (lv_virtual_0_0= 'virtual' ) )? ( (lv_main_1_0= 'main' ) )? otherlv_2= 'module' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_moduleComponents_5_0= ruleAbstractModuleComponent ) )* ( (lv_nestedModules_6_0= ruleModuleDeclaration ) )* otherlv_7= '}' ) ;
    public final EObject ruleModuleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_virtual_0_0=null;
        Token lv_main_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_moduleComponents_5_0 = null;

        EObject lv_nestedModules_6_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:177:2: ( ( ( (lv_virtual_0_0= 'virtual' ) )? ( (lv_main_1_0= 'main' ) )? otherlv_2= 'module' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_moduleComponents_5_0= ruleAbstractModuleComponent ) )* ( (lv_nestedModules_6_0= ruleModuleDeclaration ) )* otherlv_7= '}' ) )
            // InternalIdl.g:178:2: ( ( (lv_virtual_0_0= 'virtual' ) )? ( (lv_main_1_0= 'main' ) )? otherlv_2= 'module' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_moduleComponents_5_0= ruleAbstractModuleComponent ) )* ( (lv_nestedModules_6_0= ruleModuleDeclaration ) )* otherlv_7= '}' )
            {
            // InternalIdl.g:178:2: ( ( (lv_virtual_0_0= 'virtual' ) )? ( (lv_main_1_0= 'main' ) )? otherlv_2= 'module' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_moduleComponents_5_0= ruleAbstractModuleComponent ) )* ( (lv_nestedModules_6_0= ruleModuleDeclaration ) )* otherlv_7= '}' )
            // InternalIdl.g:179:3: ( (lv_virtual_0_0= 'virtual' ) )? ( (lv_main_1_0= 'main' ) )? otherlv_2= 'module' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_moduleComponents_5_0= ruleAbstractModuleComponent ) )* ( (lv_nestedModules_6_0= ruleModuleDeclaration ) )* otherlv_7= '}'
            {
            // InternalIdl.g:179:3: ( (lv_virtual_0_0= 'virtual' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalIdl.g:180:4: (lv_virtual_0_0= 'virtual' )
                    {
                    // InternalIdl.g:180:4: (lv_virtual_0_0= 'virtual' )
                    // InternalIdl.g:181:5: lv_virtual_0_0= 'virtual'
                    {
                    lv_virtual_0_0=(Token)match(input,27,FOLLOW_6); 

                    					newLeafNode(lv_virtual_0_0, grammarAccess.getModuleDeclarationAccess().getVirtualVirtualKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModuleDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "virtual", true, "virtual");
                    				

                    }


                    }
                    break;

            }

            // InternalIdl.g:193:3: ( (lv_main_1_0= 'main' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIdl.g:194:4: (lv_main_1_0= 'main' )
                    {
                    // InternalIdl.g:194:4: (lv_main_1_0= 'main' )
                    // InternalIdl.g:195:5: lv_main_1_0= 'main'
                    {
                    lv_main_1_0=(Token)match(input,28,FOLLOW_7); 

                    					newLeafNode(lv_main_1_0, grammarAccess.getModuleDeclarationAccess().getMainMainKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModuleDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "main", true, "main");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModuleDeclarationAccess().getModuleKeyword_2());
            		
            // InternalIdl.g:211:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalIdl.g:212:4: (lv_name_3_0= RULE_ID )
            {
            // InternalIdl.g:212:4: (lv_name_3_0= RULE_ID )
            // InternalIdl.g:213:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getModuleDeclarationAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getModuleDeclarationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalIdl.g:233:3: ( (lv_moduleComponents_5_0= ruleAbstractModuleComponent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_SL_DOC_COMMENT && LA5_0<=RULE_ML_DOC_COMMENT)||LA5_0==33||(LA5_0>=36 && LA5_0<=37)||LA5_0==52||(LA5_0>=54 && LA5_0<=55)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIdl.g:234:4: (lv_moduleComponents_5_0= ruleAbstractModuleComponent )
            	    {
            	    // InternalIdl.g:234:4: (lv_moduleComponents_5_0= ruleAbstractModuleComponent )
            	    // InternalIdl.g:235:5: lv_moduleComponents_5_0= ruleAbstractModuleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getModuleDeclarationAccess().getModuleComponentsAbstractModuleComponentParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_moduleComponents_5_0=ruleAbstractModuleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moduleComponents",
            	    						lv_moduleComponents_5_0,
            	    						"com.btc.serviceidl.Idl.AbstractModuleComponent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalIdl.g:252:3: ( (lv_nestedModules_6_0= ruleModuleDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=27 && LA6_0<=29)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIdl.g:253:4: (lv_nestedModules_6_0= ruleModuleDeclaration )
            	    {
            	    // InternalIdl.g:253:4: (lv_nestedModules_6_0= ruleModuleDeclaration )
            	    // InternalIdl.g:254:5: lv_nestedModules_6_0= ruleModuleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getModuleDeclarationAccess().getNestedModulesModuleDeclarationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_nestedModules_6_0=ruleModuleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nestedModules",
            	    						lv_nestedModules_6_0,
            	    						"com.btc.serviceidl.Idl.ModuleDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getModuleDeclarationAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModuleDeclaration"


    // $ANTLR start "entryRuleAbstractModuleComponent"
    // InternalIdl.g:279:1: entryRuleAbstractModuleComponent returns [EObject current=null] : iv_ruleAbstractModuleComponent= ruleAbstractModuleComponent EOF ;
    public final EObject entryRuleAbstractModuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractModuleComponent = null;


        try {
            // InternalIdl.g:279:64: (iv_ruleAbstractModuleComponent= ruleAbstractModuleComponent EOF )
            // InternalIdl.g:280:2: iv_ruleAbstractModuleComponent= ruleAbstractModuleComponent EOF
            {
             newCompositeNode(grammarAccess.getAbstractModuleComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractModuleComponent=ruleAbstractModuleComponent();

            state._fsp--;

             current =iv_ruleAbstractModuleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractModuleComponent"


    // $ANTLR start "ruleAbstractModuleComponent"
    // InternalIdl.g:286:1: ruleAbstractModuleComponent returns [EObject current=null] : ( (this_EnumDeclaration_0= ruleEnumDeclaration otherlv_1= ';' ) | (this_StructDeclaration_2= ruleStructDeclaration otherlv_3= ';' ) | (this_AbstractException_4= ruleAbstractException otherlv_5= ';' ) | (this_InterfaceDeclaration_6= ruleInterfaceDeclaration otherlv_7= ';' ) | (this_AliasDeclaration_8= ruleAliasDeclaration otherlv_9= ';' ) ) ;
    public final EObject ruleAbstractModuleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_EnumDeclaration_0 = null;

        EObject this_StructDeclaration_2 = null;

        EObject this_AbstractException_4 = null;

        EObject this_InterfaceDeclaration_6 = null;

        EObject this_AliasDeclaration_8 = null;



        	enterRule();

        try {
            // InternalIdl.g:292:2: ( ( (this_EnumDeclaration_0= ruleEnumDeclaration otherlv_1= ';' ) | (this_StructDeclaration_2= ruleStructDeclaration otherlv_3= ';' ) | (this_AbstractException_4= ruleAbstractException otherlv_5= ';' ) | (this_InterfaceDeclaration_6= ruleInterfaceDeclaration otherlv_7= ';' ) | (this_AliasDeclaration_8= ruleAliasDeclaration otherlv_9= ';' ) ) )
            // InternalIdl.g:293:2: ( (this_EnumDeclaration_0= ruleEnumDeclaration otherlv_1= ';' ) | (this_StructDeclaration_2= ruleStructDeclaration otherlv_3= ';' ) | (this_AbstractException_4= ruleAbstractException otherlv_5= ';' ) | (this_InterfaceDeclaration_6= ruleInterfaceDeclaration otherlv_7= ';' ) | (this_AliasDeclaration_8= ruleAliasDeclaration otherlv_9= ';' ) )
            {
            // InternalIdl.g:293:2: ( (this_EnumDeclaration_0= ruleEnumDeclaration otherlv_1= ';' ) | (this_StructDeclaration_2= ruleStructDeclaration otherlv_3= ';' ) | (this_AbstractException_4= ruleAbstractException otherlv_5= ';' ) | (this_InterfaceDeclaration_6= ruleInterfaceDeclaration otherlv_7= ';' ) | (this_AliasDeclaration_8= ruleAliasDeclaration otherlv_9= ';' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt7=1;
                }
                break;
            case 52:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case RULE_SL_DOC_COMMENT:
            case RULE_ML_DOC_COMMENT:
            case 54:
            case 55:
                {
                alt7=4;
                }
                break;
            case 36:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIdl.g:294:3: (this_EnumDeclaration_0= ruleEnumDeclaration otherlv_1= ';' )
                    {
                    // InternalIdl.g:294:3: (this_EnumDeclaration_0= ruleEnumDeclaration otherlv_1= ';' )
                    // InternalIdl.g:295:4: this_EnumDeclaration_0= ruleEnumDeclaration otherlv_1= ';'
                    {

                    				newCompositeNode(grammarAccess.getAbstractModuleComponentAccess().getEnumDeclarationParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_11);
                    this_EnumDeclaration_0=ruleEnumDeclaration();

                    state._fsp--;


                    				current = this_EnumDeclaration_0;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_1=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:309:3: (this_StructDeclaration_2= ruleStructDeclaration otherlv_3= ';' )
                    {
                    // InternalIdl.g:309:3: (this_StructDeclaration_2= ruleStructDeclaration otherlv_3= ';' )
                    // InternalIdl.g:310:4: this_StructDeclaration_2= ruleStructDeclaration otherlv_3= ';'
                    {

                    				newCompositeNode(grammarAccess.getAbstractModuleComponentAccess().getStructDeclarationParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_11);
                    this_StructDeclaration_2=ruleStructDeclaration();

                    state._fsp--;


                    				current = this_StructDeclaration_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIdl.g:324:3: (this_AbstractException_4= ruleAbstractException otherlv_5= ';' )
                    {
                    // InternalIdl.g:324:3: (this_AbstractException_4= ruleAbstractException otherlv_5= ';' )
                    // InternalIdl.g:325:4: this_AbstractException_4= ruleAbstractException otherlv_5= ';'
                    {

                    				newCompositeNode(grammarAccess.getAbstractModuleComponentAccess().getAbstractExceptionParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_11);
                    this_AbstractException_4=ruleAbstractException();

                    state._fsp--;


                    				current = this_AbstractException_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIdl.g:339:3: (this_InterfaceDeclaration_6= ruleInterfaceDeclaration otherlv_7= ';' )
                    {
                    // InternalIdl.g:339:3: (this_InterfaceDeclaration_6= ruleInterfaceDeclaration otherlv_7= ';' )
                    // InternalIdl.g:340:4: this_InterfaceDeclaration_6= ruleInterfaceDeclaration otherlv_7= ';'
                    {

                    				newCompositeNode(grammarAccess.getAbstractModuleComponentAccess().getInterfaceDeclarationParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_11);
                    this_InterfaceDeclaration_6=ruleInterfaceDeclaration();

                    state._fsp--;


                    				current = this_InterfaceDeclaration_6;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_7=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalIdl.g:354:3: (this_AliasDeclaration_8= ruleAliasDeclaration otherlv_9= ';' )
                    {
                    // InternalIdl.g:354:3: (this_AliasDeclaration_8= ruleAliasDeclaration otherlv_9= ';' )
                    // InternalIdl.g:355:4: this_AliasDeclaration_8= ruleAliasDeclaration otherlv_9= ';'
                    {

                    				newCompositeNode(grammarAccess.getAbstractModuleComponentAccess().getAliasDeclarationParserRuleCall_4_0());
                    			
                    pushFollow(FOLLOW_11);
                    this_AliasDeclaration_8=ruleAliasDeclaration();

                    state._fsp--;


                    				current = this_AliasDeclaration_8;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_9=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getAbstractModuleComponentAccess().getSemicolonKeyword_4_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractModuleComponent"


    // $ANTLR start "entryRuleAbstractException"
    // InternalIdl.g:372:1: entryRuleAbstractException returns [EObject current=null] : iv_ruleAbstractException= ruleAbstractException EOF ;
    public final EObject entryRuleAbstractException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractException = null;


        try {
            // InternalIdl.g:372:58: (iv_ruleAbstractException= ruleAbstractException EOF )
            // InternalIdl.g:373:2: iv_ruleAbstractException= ruleAbstractException EOF
            {
             newCompositeNode(grammarAccess.getAbstractExceptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractException=ruleAbstractException();

            state._fsp--;

             current =iv_ruleAbstractException; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractException"


    // $ANTLR start "ruleAbstractException"
    // InternalIdl.g:379:1: ruleAbstractException returns [EObject current=null] : (this_ExceptionReferenceDeclaration_0= ruleExceptionReferenceDeclaration | this_ExceptionDeclaration_1= ruleExceptionDeclaration ) ;
    public final EObject ruleAbstractException() throws RecognitionException {
        EObject current = null;

        EObject this_ExceptionReferenceDeclaration_0 = null;

        EObject this_ExceptionDeclaration_1 = null;



        	enterRule();

        try {
            // InternalIdl.g:385:2: ( (this_ExceptionReferenceDeclaration_0= ruleExceptionReferenceDeclaration | this_ExceptionDeclaration_1= ruleExceptionDeclaration ) )
            // InternalIdl.g:386:2: (this_ExceptionReferenceDeclaration_0= ruleExceptionReferenceDeclaration | this_ExceptionDeclaration_1= ruleExceptionDeclaration )
            {
            // InternalIdl.g:386:2: (this_ExceptionReferenceDeclaration_0= ruleExceptionReferenceDeclaration | this_ExceptionDeclaration_1= ruleExceptionDeclaration )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==34) ) {
                        alt8=1;
                    }
                    else if ( (LA8_2==30||LA8_2==35) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalIdl.g:387:3: this_ExceptionReferenceDeclaration_0= ruleExceptionReferenceDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractExceptionAccess().getExceptionReferenceDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExceptionReferenceDeclaration_0=ruleExceptionReferenceDeclaration();

                    state._fsp--;


                    			current = this_ExceptionReferenceDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIdl.g:396:3: this_ExceptionDeclaration_1= ruleExceptionDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractExceptionAccess().getExceptionDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExceptionDeclaration_1=ruleExceptionDeclaration();

                    state._fsp--;


                    			current = this_ExceptionDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractException"


    // $ANTLR start "entryRuleExceptionReferenceDeclaration"
    // InternalIdl.g:408:1: entryRuleExceptionReferenceDeclaration returns [EObject current=null] : iv_ruleExceptionReferenceDeclaration= ruleExceptionReferenceDeclaration EOF ;
    public final EObject entryRuleExceptionReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionReferenceDeclaration = null;


        try {
            // InternalIdl.g:408:70: (iv_ruleExceptionReferenceDeclaration= ruleExceptionReferenceDeclaration EOF )
            // InternalIdl.g:409:2: iv_ruleExceptionReferenceDeclaration= ruleExceptionReferenceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExceptionReferenceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExceptionReferenceDeclaration=ruleExceptionReferenceDeclaration();

            state._fsp--;

             current =iv_ruleExceptionReferenceDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExceptionReferenceDeclaration"


    // $ANTLR start "ruleExceptionReferenceDeclaration"
    // InternalIdl.g:415:1: ruleExceptionReferenceDeclaration returns [EObject current=null] : (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ref' ( (lv_location_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleExceptionReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_location_3_0=null;


        	enterRule();

        try {
            // InternalIdl.g:421:2: ( (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ref' ( (lv_location_3_0= RULE_STRING ) ) ) )
            // InternalIdl.g:422:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ref' ( (lv_location_3_0= RULE_STRING ) ) )
            {
            // InternalIdl.g:422:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ref' ( (lv_location_3_0= RULE_STRING ) ) )
            // InternalIdl.g:423:3: otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ref' ( (lv_location_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExceptionReferenceDeclarationAccess().getExceptionKeyword_0());
            		
            // InternalIdl.g:427:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIdl.g:428:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIdl.g:428:4: (lv_name_1_0= RULE_ID )
            // InternalIdl.g:429:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExceptionReferenceDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExceptionReferenceDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getExceptionReferenceDeclarationAccess().getRefKeyword_2());
            		
            // InternalIdl.g:449:3: ( (lv_location_3_0= RULE_STRING ) )
            // InternalIdl.g:450:4: (lv_location_3_0= RULE_STRING )
            {
            // InternalIdl.g:450:4: (lv_location_3_0= RULE_STRING )
            // InternalIdl.g:451:5: lv_location_3_0= RULE_STRING
            {
            lv_location_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_location_3_0, grammarAccess.getExceptionReferenceDeclarationAccess().getLocationSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExceptionReferenceDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExceptionReferenceDeclaration"


    // $ANTLR start "entryRuleExceptionDeclaration"
    // InternalIdl.g:471:1: entryRuleExceptionDeclaration returns [EObject current=null] : iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF ;
    public final EObject entryRuleExceptionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionDeclaration = null;


        try {
            // InternalIdl.g:471:61: (iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF )
            // InternalIdl.g:472:2: iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExceptionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExceptionDeclaration=ruleExceptionDeclaration();

            state._fsp--;

             current =iv_ruleExceptionDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExceptionDeclaration"


    // $ANTLR start "ruleExceptionDeclaration"
    // InternalIdl.g:478:1: ruleExceptionDeclaration returns [EObject current=null] : (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( (lv_members_5_0= ruleMemberElement ) ) otherlv_6= ';' )* otherlv_7= '}' ) ;
    public final EObject ruleExceptionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_members_5_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:484:2: ( (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( (lv_members_5_0= ruleMemberElement ) ) otherlv_6= ';' )* otherlv_7= '}' ) )
            // InternalIdl.g:485:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( (lv_members_5_0= ruleMemberElement ) ) otherlv_6= ';' )* otherlv_7= '}' )
            {
            // InternalIdl.g:485:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( (lv_members_5_0= ruleMemberElement ) ) otherlv_6= ';' )* otherlv_7= '}' )
            // InternalIdl.g:486:3: otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( (lv_members_5_0= ruleMemberElement ) ) otherlv_6= ';' )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExceptionDeclarationAccess().getExceptionKeyword_0());
            		
            // InternalIdl.g:490:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIdl.g:491:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIdl.g:491:4: (lv_name_1_0= RULE_ID )
            // InternalIdl.g:492:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExceptionDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExceptionDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIdl.g:508:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIdl.g:509:4: otherlv_2= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getExceptionDeclarationAccess().getColonKeyword_2_0());
                    			
                    // InternalIdl.g:513:4: ( ( ruleQualifiedName ) )
                    // InternalIdl.g:514:5: ( ruleQualifiedName )
                    {
                    // InternalIdl.g:514:5: ( ruleQualifiedName )
                    // InternalIdl.g:515:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExceptionDeclarationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getSupertypeAbstractExceptionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getExceptionDeclarationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalIdl.g:534:3: ( ( (lv_members_5_0= ruleMemberElement ) ) otherlv_6= ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=RULE_STRINGTYPE && LA10_0<=RULE_DOUBLE)||LA10_0==39||LA10_0==51||LA10_0==53) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIdl.g:535:4: ( (lv_members_5_0= ruleMemberElement ) ) otherlv_6= ';'
            	    {
            	    // InternalIdl.g:535:4: ( (lv_members_5_0= ruleMemberElement ) )
            	    // InternalIdl.g:536:5: (lv_members_5_0= ruleMemberElement )
            	    {
            	    // InternalIdl.g:536:5: (lv_members_5_0= ruleMemberElement )
            	    // InternalIdl.g:537:6: lv_members_5_0= ruleMemberElement
            	    {

            	    						newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getMembersMemberElementParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_members_5_0=ruleMemberElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExceptionDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"members",
            	    							lv_members_5_0,
            	    							"com.btc.serviceidl.Idl.MemberElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,32,FOLLOW_15); 

            	    				newLeafNode(otherlv_6, grammarAccess.getExceptionDeclarationAccess().getSemicolonKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_7=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExceptionDeclarationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExceptionDeclaration"


    // $ANTLR start "entryRuleAbstractTypeDeclaration"
    // InternalIdl.g:567:1: entryRuleAbstractTypeDeclaration returns [EObject current=null] : iv_ruleAbstractTypeDeclaration= ruleAbstractTypeDeclaration EOF ;
    public final EObject entryRuleAbstractTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTypeDeclaration = null;


        try {
            // InternalIdl.g:567:64: (iv_ruleAbstractTypeDeclaration= ruleAbstractTypeDeclaration EOF )
            // InternalIdl.g:568:2: iv_ruleAbstractTypeDeclaration= ruleAbstractTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAbstractTypeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractTypeDeclaration=ruleAbstractTypeDeclaration();

            state._fsp--;

             current =iv_ruleAbstractTypeDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractTypeDeclaration"


    // $ANTLR start "ruleAbstractTypeDeclaration"
    // InternalIdl.g:574:1: ruleAbstractTypeDeclaration returns [EObject current=null] : (this_AliasDeclaration_0= ruleAliasDeclaration | this_EnumDeclaration_1= ruleEnumDeclaration | this_StructDeclaration_2= ruleStructDeclaration | this_AbstractException_3= ruleAbstractException ) ;
    public final EObject ruleAbstractTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_AliasDeclaration_0 = null;

        EObject this_EnumDeclaration_1 = null;

        EObject this_StructDeclaration_2 = null;

        EObject this_AbstractException_3 = null;



        	enterRule();

        try {
            // InternalIdl.g:580:2: ( (this_AliasDeclaration_0= ruleAliasDeclaration | this_EnumDeclaration_1= ruleEnumDeclaration | this_StructDeclaration_2= ruleStructDeclaration | this_AbstractException_3= ruleAbstractException ) )
            // InternalIdl.g:581:2: (this_AliasDeclaration_0= ruleAliasDeclaration | this_EnumDeclaration_1= ruleEnumDeclaration | this_StructDeclaration_2= ruleStructDeclaration | this_AbstractException_3= ruleAbstractException )
            {
            // InternalIdl.g:581:2: (this_AliasDeclaration_0= ruleAliasDeclaration | this_EnumDeclaration_1= ruleEnumDeclaration | this_StructDeclaration_2= ruleStructDeclaration | this_AbstractException_3= ruleAbstractException )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt11=1;
                }
                break;
            case 37:
                {
                alt11=2;
                }
                break;
            case 52:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalIdl.g:582:3: this_AliasDeclaration_0= ruleAliasDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeDeclarationAccess().getAliasDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AliasDeclaration_0=ruleAliasDeclaration();

                    state._fsp--;


                    			current = this_AliasDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIdl.g:591:3: this_EnumDeclaration_1= ruleEnumDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeDeclarationAccess().getEnumDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumDeclaration_1=ruleEnumDeclaration();

                    state._fsp--;


                    			current = this_EnumDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIdl.g:600:3: this_StructDeclaration_2= ruleStructDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeDeclarationAccess().getStructDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StructDeclaration_2=ruleStructDeclaration();

                    state._fsp--;


                    			current = this_StructDeclaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalIdl.g:609:3: this_AbstractException_3= ruleAbstractException
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeDeclarationAccess().getAbstractExceptionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractException_3=ruleAbstractException();

                    state._fsp--;


                    			current = this_AbstractException_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractTypeDeclaration"


    // $ANTLR start "entryRuleAbstractType"
    // InternalIdl.g:621:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalIdl.g:621:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalIdl.g:622:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
             newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;

             current =iv_ruleAbstractType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalIdl.g:628:1: ruleAbstractType returns [EObject current=null] : ( ( (lv_primitiveType_0_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) | ( (lv_collectionType_2_0= ruleAbstractCollection ) ) ) ;
    public final EObject ruleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject lv_primitiveType_0_0 = null;

        EObject lv_collectionType_2_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:634:2: ( ( ( (lv_primitiveType_0_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) | ( (lv_collectionType_2_0= ruleAbstractCollection ) ) ) )
            // InternalIdl.g:635:2: ( ( (lv_primitiveType_0_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) | ( (lv_collectionType_2_0= ruleAbstractCollection ) ) )
            {
            // InternalIdl.g:635:2: ( ( (lv_primitiveType_0_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) | ( (lv_collectionType_2_0= ruleAbstractCollection ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_STRINGTYPE:
            case RULE_CHAR:
            case RULE_UUID:
            case RULE_BOOLEAN:
            case RULE_BYTE:
            case RULE_INT16:
            case RULE_INT32:
            case RULE_INT64:
            case RULE_FLOAT:
            case RULE_DOUBLE:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case 39:
            case 51:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalIdl.g:636:3: ( (lv_primitiveType_0_0= rulePrimitiveType ) )
                    {
                    // InternalIdl.g:636:3: ( (lv_primitiveType_0_0= rulePrimitiveType ) )
                    // InternalIdl.g:637:4: (lv_primitiveType_0_0= rulePrimitiveType )
                    {
                    // InternalIdl.g:637:4: (lv_primitiveType_0_0= rulePrimitiveType )
                    // InternalIdl.g:638:5: lv_primitiveType_0_0= rulePrimitiveType
                    {

                    					newCompositeNode(grammarAccess.getAbstractTypeAccess().getPrimitiveTypePrimitiveTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_primitiveType_0_0=rulePrimitiveType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractTypeRule());
                    					}
                    					set(
                    						current,
                    						"primitiveType",
                    						lv_primitiveType_0_0,
                    						"com.btc.serviceidl.Idl.PrimitiveType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:656:3: ( ( ruleQualifiedName ) )
                    {
                    // InternalIdl.g:656:3: ( ( ruleQualifiedName ) )
                    // InternalIdl.g:657:4: ( ruleQualifiedName )
                    {
                    // InternalIdl.g:657:4: ( ruleQualifiedName )
                    // InternalIdl.g:658:5: ruleQualifiedName
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAbstractTypeRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getAbstractTypeAccess().getReferenceTypeAbstractCrossReferenceCrossReference_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIdl.g:673:3: ( (lv_collectionType_2_0= ruleAbstractCollection ) )
                    {
                    // InternalIdl.g:673:3: ( (lv_collectionType_2_0= ruleAbstractCollection ) )
                    // InternalIdl.g:674:4: (lv_collectionType_2_0= ruleAbstractCollection )
                    {
                    // InternalIdl.g:674:4: (lv_collectionType_2_0= ruleAbstractCollection )
                    // InternalIdl.g:675:5: lv_collectionType_2_0= ruleAbstractCollection
                    {

                    					newCompositeNode(grammarAccess.getAbstractTypeAccess().getCollectionTypeAbstractCollectionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_collectionType_2_0=ruleAbstractCollection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractTypeRule());
                    					}
                    					set(
                    						current,
                    						"collectionType",
                    						lv_collectionType_2_0,
                    						"com.btc.serviceidl.Idl.AbstractCollection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRuleAliasDeclaration"
    // InternalIdl.g:696:1: entryRuleAliasDeclaration returns [EObject current=null] : iv_ruleAliasDeclaration= ruleAliasDeclaration EOF ;
    public final EObject entryRuleAliasDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasDeclaration = null;


        try {
            // InternalIdl.g:696:57: (iv_ruleAliasDeclaration= ruleAliasDeclaration EOF )
            // InternalIdl.g:697:2: iv_ruleAliasDeclaration= ruleAliasDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAliasDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAliasDeclaration=ruleAliasDeclaration();

            state._fsp--;

             current =iv_ruleAliasDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasDeclaration"


    // $ANTLR start "ruleAliasDeclaration"
    // InternalIdl.g:703:1: ruleAliasDeclaration returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAliasDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:709:2: ( (otherlv_0= 'typedef' ( (lv_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalIdl.g:710:2: (otherlv_0= 'typedef' ( (lv_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalIdl.g:710:2: (otherlv_0= 'typedef' ( (lv_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalIdl.g:711:3: otherlv_0= 'typedef' ( (lv_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getAliasDeclarationAccess().getTypedefKeyword_0());
            		
            // InternalIdl.g:715:3: ( (lv_type_1_0= ruleAbstractType ) )
            // InternalIdl.g:716:4: (lv_type_1_0= ruleAbstractType )
            {
            // InternalIdl.g:716:4: (lv_type_1_0= ruleAbstractType )
            // InternalIdl.g:717:5: lv_type_1_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getAliasDeclarationAccess().getTypeAbstractTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_1_0=ruleAbstractType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAliasDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"com.btc.serviceidl.Idl.AbstractType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIdl.g:734:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIdl.g:735:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIdl.g:735:4: (lv_name_2_0= RULE_ID )
            // InternalIdl.g:736:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAliasDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAliasDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasDeclaration"


    // $ANTLR start "entryRuleEnumDeclaration"
    // InternalIdl.g:756:1: entryRuleEnumDeclaration returns [EObject current=null] : iv_ruleEnumDeclaration= ruleEnumDeclaration EOF ;
    public final EObject entryRuleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDeclaration = null;


        try {
            // InternalIdl.g:756:56: (iv_ruleEnumDeclaration= ruleEnumDeclaration EOF )
            // InternalIdl.g:757:2: iv_ruleEnumDeclaration= ruleEnumDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumDeclaration=ruleEnumDeclaration();

            state._fsp--;

             current =iv_ruleEnumDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // InternalIdl.g:763:1: ruleEnumDeclaration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_containedIdentifiers_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_containedIdentifiers_5_0= RULE_ID ) ) )* otherlv_6= '}' ( (lv_declarator_7_0= RULE_ID ) )? ) ;
    public final EObject ruleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_containedIdentifiers_3_0=null;
        Token otherlv_4=null;
        Token lv_containedIdentifiers_5_0=null;
        Token otherlv_6=null;
        Token lv_declarator_7_0=null;


        	enterRule();

        try {
            // InternalIdl.g:769:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_containedIdentifiers_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_containedIdentifiers_5_0= RULE_ID ) ) )* otherlv_6= '}' ( (lv_declarator_7_0= RULE_ID ) )? ) )
            // InternalIdl.g:770:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_containedIdentifiers_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_containedIdentifiers_5_0= RULE_ID ) ) )* otherlv_6= '}' ( (lv_declarator_7_0= RULE_ID ) )? )
            {
            // InternalIdl.g:770:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_containedIdentifiers_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_containedIdentifiers_5_0= RULE_ID ) ) )* otherlv_6= '}' ( (lv_declarator_7_0= RULE_ID ) )? )
            // InternalIdl.g:771:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_containedIdentifiers_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_containedIdentifiers_5_0= RULE_ID ) ) )* otherlv_6= '}' ( (lv_declarator_7_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumDeclarationAccess().getEnumKeyword_0());
            		
            // InternalIdl.g:775:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIdl.g:776:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIdl.g:776:4: (lv_name_1_0= RULE_ID )
            // InternalIdl.g:777:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIdl.g:797:3: ( (lv_containedIdentifiers_3_0= RULE_ID ) )
            // InternalIdl.g:798:4: (lv_containedIdentifiers_3_0= RULE_ID )
            {
            // InternalIdl.g:798:4: (lv_containedIdentifiers_3_0= RULE_ID )
            // InternalIdl.g:799:5: lv_containedIdentifiers_3_0= RULE_ID
            {
            lv_containedIdentifiers_3_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_containedIdentifiers_3_0, grammarAccess.getEnumDeclarationAccess().getContainedIdentifiersIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumDeclarationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"containedIdentifiers",
            						lv_containedIdentifiers_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIdl.g:815:3: (otherlv_4= ',' ( (lv_containedIdentifiers_5_0= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==38) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIdl.g:816:4: otherlv_4= ',' ( (lv_containedIdentifiers_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalIdl.g:820:4: ( (lv_containedIdentifiers_5_0= RULE_ID ) )
            	    // InternalIdl.g:821:5: (lv_containedIdentifiers_5_0= RULE_ID )
            	    {
            	    // InternalIdl.g:821:5: (lv_containedIdentifiers_5_0= RULE_ID )
            	    // InternalIdl.g:822:6: lv_containedIdentifiers_5_0= RULE_ID
            	    {
            	    lv_containedIdentifiers_5_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    						newLeafNode(lv_containedIdentifiers_5_0, grammarAccess.getEnumDeclarationAccess().getContainedIdentifiersIDTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEnumDeclarationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"containedIdentifiers",
            	    							lv_containedIdentifiers_5_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_6=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalIdl.g:843:3: ( (lv_declarator_7_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIdl.g:844:4: (lv_declarator_7_0= RULE_ID )
                    {
                    // InternalIdl.g:844:4: (lv_declarator_7_0= RULE_ID )
                    // InternalIdl.g:845:5: lv_declarator_7_0= RULE_ID
                    {
                    lv_declarator_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_declarator_7_0, grammarAccess.getEnumDeclarationAccess().getDeclaratorIDTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEnumDeclarationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"declarator",
                    						lv_declarator_7_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleAbstractCollection"
    // InternalIdl.g:865:1: entryRuleAbstractCollection returns [EObject current=null] : iv_ruleAbstractCollection= ruleAbstractCollection EOF ;
    public final EObject entryRuleAbstractCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCollection = null;


        try {
            // InternalIdl.g:865:59: (iv_ruleAbstractCollection= ruleAbstractCollection EOF )
            // InternalIdl.g:866:2: iv_ruleAbstractCollection= ruleAbstractCollection EOF
            {
             newCompositeNode(grammarAccess.getAbstractCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractCollection=ruleAbstractCollection();

            state._fsp--;

             current =iv_ruleAbstractCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractCollection"


    // $ANTLR start "ruleAbstractCollection"
    // InternalIdl.g:872:1: ruleAbstractCollection returns [EObject current=null] : (this_SequenceDeclaration_0= ruleSequenceDeclaration | this_TupleDeclaration_1= ruleTupleDeclaration ) ;
    public final EObject ruleAbstractCollection() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceDeclaration_0 = null;

        EObject this_TupleDeclaration_1 = null;



        	enterRule();

        try {
            // InternalIdl.g:878:2: ( (this_SequenceDeclaration_0= ruleSequenceDeclaration | this_TupleDeclaration_1= ruleTupleDeclaration ) )
            // InternalIdl.g:879:2: (this_SequenceDeclaration_0= ruleSequenceDeclaration | this_TupleDeclaration_1= ruleTupleDeclaration )
            {
            // InternalIdl.g:879:2: (this_SequenceDeclaration_0= ruleSequenceDeclaration | this_TupleDeclaration_1= ruleTupleDeclaration )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            else if ( (LA15_0==51) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalIdl.g:880:3: this_SequenceDeclaration_0= ruleSequenceDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractCollectionAccess().getSequenceDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceDeclaration_0=ruleSequenceDeclaration();

                    state._fsp--;


                    			current = this_SequenceDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIdl.g:889:3: this_TupleDeclaration_1= ruleTupleDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractCollectionAccess().getTupleDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TupleDeclaration_1=ruleTupleDeclaration();

                    state._fsp--;


                    			current = this_TupleDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractCollection"


    // $ANTLR start "entryRuleSequenceDeclaration"
    // InternalIdl.g:901:1: entryRuleSequenceDeclaration returns [EObject current=null] : iv_ruleSequenceDeclaration= ruleSequenceDeclaration EOF ;
    public final EObject entryRuleSequenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceDeclaration = null;


        try {
            // InternalIdl.g:901:60: (iv_ruleSequenceDeclaration= ruleSequenceDeclaration EOF )
            // InternalIdl.g:902:2: iv_ruleSequenceDeclaration= ruleSequenceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSequenceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceDeclaration=ruleSequenceDeclaration();

            state._fsp--;

             current =iv_ruleSequenceDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceDeclaration"


    // $ANTLR start "ruleSequenceDeclaration"
    // InternalIdl.g:908:1: ruleSequenceDeclaration returns [EObject current=null] : (otherlv_0= 'sequence' otherlv_1= '<' ( ( (lv_type_2_0= ruleAbstractType ) ) | ( ( (lv_failable_3_0= 'failable' ) ) ( (lv_type_4_0= ruleAbstractType ) ) (otherlv_5= 'raises' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? ) ) otherlv_9= '>' (otherlv_10= '[' ( (lv_sequenceHints_11_0= ruleAbstractSequenceHint ) ) (otherlv_12= ',' ( (lv_sequenceHints_13_0= ruleAbstractSequenceHint ) ) )* otherlv_14= ']' )? ) ;
    public final EObject ruleSequenceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_failable_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_type_2_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_sequenceHints_11_0 = null;

        EObject lv_sequenceHints_13_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:914:2: ( (otherlv_0= 'sequence' otherlv_1= '<' ( ( (lv_type_2_0= ruleAbstractType ) ) | ( ( (lv_failable_3_0= 'failable' ) ) ( (lv_type_4_0= ruleAbstractType ) ) (otherlv_5= 'raises' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? ) ) otherlv_9= '>' (otherlv_10= '[' ( (lv_sequenceHints_11_0= ruleAbstractSequenceHint ) ) (otherlv_12= ',' ( (lv_sequenceHints_13_0= ruleAbstractSequenceHint ) ) )* otherlv_14= ']' )? ) )
            // InternalIdl.g:915:2: (otherlv_0= 'sequence' otherlv_1= '<' ( ( (lv_type_2_0= ruleAbstractType ) ) | ( ( (lv_failable_3_0= 'failable' ) ) ( (lv_type_4_0= ruleAbstractType ) ) (otherlv_5= 'raises' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? ) ) otherlv_9= '>' (otherlv_10= '[' ( (lv_sequenceHints_11_0= ruleAbstractSequenceHint ) ) (otherlv_12= ',' ( (lv_sequenceHints_13_0= ruleAbstractSequenceHint ) ) )* otherlv_14= ']' )? )
            {
            // InternalIdl.g:915:2: (otherlv_0= 'sequence' otherlv_1= '<' ( ( (lv_type_2_0= ruleAbstractType ) ) | ( ( (lv_failable_3_0= 'failable' ) ) ( (lv_type_4_0= ruleAbstractType ) ) (otherlv_5= 'raises' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? ) ) otherlv_9= '>' (otherlv_10= '[' ( (lv_sequenceHints_11_0= ruleAbstractSequenceHint ) ) (otherlv_12= ',' ( (lv_sequenceHints_13_0= ruleAbstractSequenceHint ) ) )* otherlv_14= ']' )? )
            // InternalIdl.g:916:3: otherlv_0= 'sequence' otherlv_1= '<' ( ( (lv_type_2_0= ruleAbstractType ) ) | ( ( (lv_failable_3_0= 'failable' ) ) ( (lv_type_4_0= ruleAbstractType ) ) (otherlv_5= 'raises' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? ) ) otherlv_9= '>' (otherlv_10= '[' ( (lv_sequenceHints_11_0= ruleAbstractSequenceHint ) ) (otherlv_12= ',' ( (lv_sequenceHints_13_0= ruleAbstractSequenceHint ) ) )* otherlv_14= ']' )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceDeclarationAccess().getSequenceKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceDeclarationAccess().getLessThanSignKeyword_1());
            		
            // InternalIdl.g:924:3: ( ( (lv_type_2_0= ruleAbstractType ) ) | ( ( (lv_failable_3_0= 'failable' ) ) ( (lv_type_4_0= ruleAbstractType ) ) (otherlv_5= 'raises' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=RULE_STRINGTYPE && LA18_0<=RULE_DOUBLE)||LA18_0==39||LA18_0==51) ) {
                alt18=1;
            }
            else if ( (LA18_0==41) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalIdl.g:925:4: ( (lv_type_2_0= ruleAbstractType ) )
                    {
                    // InternalIdl.g:925:4: ( (lv_type_2_0= ruleAbstractType ) )
                    // InternalIdl.g:926:5: (lv_type_2_0= ruleAbstractType )
                    {
                    // InternalIdl.g:926:5: (lv_type_2_0= ruleAbstractType )
                    // InternalIdl.g:927:6: lv_type_2_0= ruleAbstractType
                    {

                    						newCompositeNode(grammarAccess.getSequenceDeclarationAccess().getTypeAbstractTypeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_type_2_0=ruleAbstractType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"com.btc.serviceidl.Idl.AbstractType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:945:4: ( ( (lv_failable_3_0= 'failable' ) ) ( (lv_type_4_0= ruleAbstractType ) ) (otherlv_5= 'raises' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? )
                    {
                    // InternalIdl.g:945:4: ( ( (lv_failable_3_0= 'failable' ) ) ( (lv_type_4_0= ruleAbstractType ) ) (otherlv_5= 'raises' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? )
                    // InternalIdl.g:946:5: ( (lv_failable_3_0= 'failable' ) ) ( (lv_type_4_0= ruleAbstractType ) ) (otherlv_5= 'raises' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )?
                    {
                    // InternalIdl.g:946:5: ( (lv_failable_3_0= 'failable' ) )
                    // InternalIdl.g:947:6: (lv_failable_3_0= 'failable' )
                    {
                    // InternalIdl.g:947:6: (lv_failable_3_0= 'failable' )
                    // InternalIdl.g:948:7: lv_failable_3_0= 'failable'
                    {
                    lv_failable_3_0=(Token)match(input,41,FOLLOW_16); 

                    							newLeafNode(lv_failable_3_0, grammarAccess.getSequenceDeclarationAccess().getFailableFailableKeyword_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSequenceDeclarationRule());
                    							}
                    							setWithLastConsumed(current, "failable", true, "failable");
                    						

                    }


                    }

                    // InternalIdl.g:960:5: ( (lv_type_4_0= ruleAbstractType ) )
                    // InternalIdl.g:961:6: (lv_type_4_0= ruleAbstractType )
                    {
                    // InternalIdl.g:961:6: (lv_type_4_0= ruleAbstractType )
                    // InternalIdl.g:962:7: lv_type_4_0= ruleAbstractType
                    {

                    							newCompositeNode(grammarAccess.getSequenceDeclarationAccess().getTypeAbstractTypeParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_22);
                    lv_type_4_0=ruleAbstractType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSequenceDeclarationRule());
                    							}
                    							set(
                    								current,
                    								"type",
                    								lv_type_4_0,
                    								"com.btc.serviceidl.Idl.AbstractType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalIdl.g:979:5: (otherlv_5= 'raises' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==42) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalIdl.g:980:6: otherlv_5= 'raises' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            otherlv_5=(Token)match(input,42,FOLLOW_5); 

                            						newLeafNode(otherlv_5, grammarAccess.getSequenceDeclarationAccess().getRaisesKeyword_2_1_2_0());
                            					
                            // InternalIdl.g:984:6: ( ( ruleQualifiedName ) )
                            // InternalIdl.g:985:7: ( ruleQualifiedName )
                            {
                            // InternalIdl.g:985:7: ( ruleQualifiedName )
                            // InternalIdl.g:986:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getSequenceDeclarationRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_2_1_2_1_0());
                            							
                            pushFollow(FOLLOW_23);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalIdl.g:1000:6: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==38) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalIdl.g:1001:7: otherlv_7= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_7=(Token)match(input,38,FOLLOW_5); 

                            	    							newLeafNode(otherlv_7, grammarAccess.getSequenceDeclarationAccess().getCommaKeyword_2_1_2_2_0());
                            	    						
                            	    // InternalIdl.g:1005:7: ( ( ruleQualifiedName ) )
                            	    // InternalIdl.g:1006:8: ( ruleQualifiedName )
                            	    {
                            	    // InternalIdl.g:1006:8: ( ruleQualifiedName )
                            	    // InternalIdl.g:1007:9: ruleQualifiedName
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getSequenceDeclarationRule());
                            	    									}
                            	    								

                            	    									newCompositeNode(grammarAccess.getSequenceDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_2_1_2_2_1_0());
                            	    								
                            	    pushFollow(FOLLOW_23);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,43,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getSequenceDeclarationAccess().getGreaterThanSignKeyword_3());
            		
            // InternalIdl.g:1029:3: (otherlv_10= '[' ( (lv_sequenceHints_11_0= ruleAbstractSequenceHint ) ) (otherlv_12= ',' ( (lv_sequenceHints_13_0= ruleAbstractSequenceHint ) ) )* otherlv_14= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalIdl.g:1030:4: otherlv_10= '[' ( (lv_sequenceHints_11_0= ruleAbstractSequenceHint ) ) (otherlv_12= ',' ( (lv_sequenceHints_13_0= ruleAbstractSequenceHint ) ) )* otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,44,FOLLOW_25); 

                    				newLeafNode(otherlv_10, grammarAccess.getSequenceDeclarationAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalIdl.g:1034:4: ( (lv_sequenceHints_11_0= ruleAbstractSequenceHint ) )
                    // InternalIdl.g:1035:5: (lv_sequenceHints_11_0= ruleAbstractSequenceHint )
                    {
                    // InternalIdl.g:1035:5: (lv_sequenceHints_11_0= ruleAbstractSequenceHint )
                    // InternalIdl.g:1036:6: lv_sequenceHints_11_0= ruleAbstractSequenceHint
                    {

                    						newCompositeNode(grammarAccess.getSequenceDeclarationAccess().getSequenceHintsAbstractSequenceHintParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_sequenceHints_11_0=ruleAbstractSequenceHint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"sequenceHints",
                    							lv_sequenceHints_11_0,
                    							"com.btc.serviceidl.Idl.AbstractSequenceHint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIdl.g:1053:4: (otherlv_12= ',' ( (lv_sequenceHints_13_0= ruleAbstractSequenceHint ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==38) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalIdl.g:1054:5: otherlv_12= ',' ( (lv_sequenceHints_13_0= ruleAbstractSequenceHint ) )
                    	    {
                    	    otherlv_12=(Token)match(input,38,FOLLOW_25); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSequenceDeclarationAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalIdl.g:1058:5: ( (lv_sequenceHints_13_0= ruleAbstractSequenceHint ) )
                    	    // InternalIdl.g:1059:6: (lv_sequenceHints_13_0= ruleAbstractSequenceHint )
                    	    {
                    	    // InternalIdl.g:1059:6: (lv_sequenceHints_13_0= ruleAbstractSequenceHint )
                    	    // InternalIdl.g:1060:7: lv_sequenceHints_13_0= ruleAbstractSequenceHint
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceDeclarationAccess().getSequenceHintsAbstractSequenceHintParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_sequenceHints_13_0=ruleAbstractSequenceHint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sequenceHints",
                    	    								lv_sequenceHints_13_0,
                    	    								"com.btc.serviceidl.Idl.AbstractSequenceHint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,45,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getSequenceDeclarationAccess().getRightSquareBracketKeyword_4_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceDeclaration"


    // $ANTLR start "entryRuleAbstractSequenceHint"
    // InternalIdl.g:1087:1: entryRuleAbstractSequenceHint returns [EObject current=null] : iv_ruleAbstractSequenceHint= ruleAbstractSequenceHint EOF ;
    public final EObject entryRuleAbstractSequenceHint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSequenceHint = null;


        try {
            // InternalIdl.g:1087:61: (iv_ruleAbstractSequenceHint= ruleAbstractSequenceHint EOF )
            // InternalIdl.g:1088:2: iv_ruleAbstractSequenceHint= ruleAbstractSequenceHint EOF
            {
             newCompositeNode(grammarAccess.getAbstractSequenceHintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractSequenceHint=ruleAbstractSequenceHint();

            state._fsp--;

             current =iv_ruleAbstractSequenceHint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractSequenceHint"


    // $ANTLR start "ruleAbstractSequenceHint"
    // InternalIdl.g:1094:1: ruleAbstractSequenceHint returns [EObject current=null] : (this_TypicalLengthHint_0= ruleTypicalLengthHint | this_TypicalSizeHint_1= ruleTypicalSizeHint ) ;
    public final EObject ruleAbstractSequenceHint() throws RecognitionException {
        EObject current = null;

        EObject this_TypicalLengthHint_0 = null;

        EObject this_TypicalSizeHint_1 = null;



        	enterRule();

        try {
            // InternalIdl.g:1100:2: ( (this_TypicalLengthHint_0= ruleTypicalLengthHint | this_TypicalSizeHint_1= ruleTypicalSizeHint ) )
            // InternalIdl.g:1101:2: (this_TypicalLengthHint_0= ruleTypicalLengthHint | this_TypicalSizeHint_1= ruleTypicalSizeHint )
            {
            // InternalIdl.g:1101:2: (this_TypicalLengthHint_0= ruleTypicalLengthHint | this_TypicalSizeHint_1= ruleTypicalSizeHint )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==49) ) {
                    alt21=2;
                }
                else if ( (LA21_1==39) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalIdl.g:1102:3: this_TypicalLengthHint_0= ruleTypicalLengthHint
                    {

                    			newCompositeNode(grammarAccess.getAbstractSequenceHintAccess().getTypicalLengthHintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypicalLengthHint_0=ruleTypicalLengthHint();

                    state._fsp--;


                    			current = this_TypicalLengthHint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIdl.g:1111:3: this_TypicalSizeHint_1= ruleTypicalSizeHint
                    {

                    			newCompositeNode(grammarAccess.getAbstractSequenceHintAccess().getTypicalSizeHintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypicalSizeHint_1=ruleTypicalSizeHint();

                    state._fsp--;


                    			current = this_TypicalSizeHint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractSequenceHint"


    // $ANTLR start "entryRuleTypicalLengthHint"
    // InternalIdl.g:1123:1: entryRuleTypicalLengthHint returns [EObject current=null] : iv_ruleTypicalLengthHint= ruleTypicalLengthHint EOF ;
    public final EObject entryRuleTypicalLengthHint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypicalLengthHint = null;


        try {
            // InternalIdl.g:1123:58: (iv_ruleTypicalLengthHint= ruleTypicalLengthHint EOF )
            // InternalIdl.g:1124:2: iv_ruleTypicalLengthHint= ruleTypicalLengthHint EOF
            {
             newCompositeNode(grammarAccess.getTypicalLengthHintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypicalLengthHint=ruleTypicalLengthHint();

            state._fsp--;

             current =iv_ruleTypicalLengthHint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypicalLengthHint"


    // $ANTLR start "ruleTypicalLengthHint"
    // InternalIdl.g:1130:1: ruleTypicalLengthHint returns [EObject current=null] : (otherlv_0= 'typical' otherlv_1= 'sequence' otherlv_2= 'length' otherlv_3= '=' ( (lv_length_4_0= RULE_INT ) ) ) ;
    public final EObject ruleTypicalLengthHint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_length_4_0=null;


        	enterRule();

        try {
            // InternalIdl.g:1136:2: ( (otherlv_0= 'typical' otherlv_1= 'sequence' otherlv_2= 'length' otherlv_3= '=' ( (lv_length_4_0= RULE_INT ) ) ) )
            // InternalIdl.g:1137:2: (otherlv_0= 'typical' otherlv_1= 'sequence' otherlv_2= 'length' otherlv_3= '=' ( (lv_length_4_0= RULE_INT ) ) )
            {
            // InternalIdl.g:1137:2: (otherlv_0= 'typical' otherlv_1= 'sequence' otherlv_2= 'length' otherlv_3= '=' ( (lv_length_4_0= RULE_INT ) ) )
            // InternalIdl.g:1138:3: otherlv_0= 'typical' otherlv_1= 'sequence' otherlv_2= 'length' otherlv_3= '=' ( (lv_length_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getTypicalLengthHintAccess().getTypicalKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getTypicalLengthHintAccess().getSequenceKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getTypicalLengthHintAccess().getLengthKeyword_2());
            		
            otherlv_3=(Token)match(input,48,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getTypicalLengthHintAccess().getEqualsSignKeyword_3());
            		
            // InternalIdl.g:1154:3: ( (lv_length_4_0= RULE_INT ) )
            // InternalIdl.g:1155:4: (lv_length_4_0= RULE_INT )
            {
            // InternalIdl.g:1155:4: (lv_length_4_0= RULE_INT )
            // InternalIdl.g:1156:5: lv_length_4_0= RULE_INT
            {
            lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_length_4_0, grammarAccess.getTypicalLengthHintAccess().getLengthINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypicalLengthHintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"length",
            						lv_length_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypicalLengthHint"


    // $ANTLR start "entryRuleTypicalSizeHint"
    // InternalIdl.g:1176:1: entryRuleTypicalSizeHint returns [EObject current=null] : iv_ruleTypicalSizeHint= ruleTypicalSizeHint EOF ;
    public final EObject entryRuleTypicalSizeHint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypicalSizeHint = null;


        try {
            // InternalIdl.g:1176:56: (iv_ruleTypicalSizeHint= ruleTypicalSizeHint EOF )
            // InternalIdl.g:1177:2: iv_ruleTypicalSizeHint= ruleTypicalSizeHint EOF
            {
             newCompositeNode(grammarAccess.getTypicalSizeHintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypicalSizeHint=ruleTypicalSizeHint();

            state._fsp--;

             current =iv_ruleTypicalSizeHint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypicalSizeHint"


    // $ANTLR start "ruleTypicalSizeHint"
    // InternalIdl.g:1183:1: ruleTypicalSizeHint returns [EObject current=null] : (otherlv_0= 'typical' otherlv_1= 'element' otherlv_2= 'size' otherlv_3= '=' ( (lv_size_4_0= RULE_INT ) ) ) ;
    public final EObject ruleTypicalSizeHint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_size_4_0=null;


        	enterRule();

        try {
            // InternalIdl.g:1189:2: ( (otherlv_0= 'typical' otherlv_1= 'element' otherlv_2= 'size' otherlv_3= '=' ( (lv_size_4_0= RULE_INT ) ) ) )
            // InternalIdl.g:1190:2: (otherlv_0= 'typical' otherlv_1= 'element' otherlv_2= 'size' otherlv_3= '=' ( (lv_size_4_0= RULE_INT ) ) )
            {
            // InternalIdl.g:1190:2: (otherlv_0= 'typical' otherlv_1= 'element' otherlv_2= 'size' otherlv_3= '=' ( (lv_size_4_0= RULE_INT ) ) )
            // InternalIdl.g:1191:3: otherlv_0= 'typical' otherlv_1= 'element' otherlv_2= 'size' otherlv_3= '=' ( (lv_size_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getTypicalSizeHintAccess().getTypicalKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getTypicalSizeHintAccess().getElementKeyword_1());
            		
            otherlv_2=(Token)match(input,50,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getTypicalSizeHintAccess().getSizeKeyword_2());
            		
            otherlv_3=(Token)match(input,48,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getTypicalSizeHintAccess().getEqualsSignKeyword_3());
            		
            // InternalIdl.g:1207:3: ( (lv_size_4_0= RULE_INT ) )
            // InternalIdl.g:1208:4: (lv_size_4_0= RULE_INT )
            {
            // InternalIdl.g:1208:4: (lv_size_4_0= RULE_INT )
            // InternalIdl.g:1209:5: lv_size_4_0= RULE_INT
            {
            lv_size_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_size_4_0, grammarAccess.getTypicalSizeHintAccess().getSizeINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypicalSizeHintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypicalSizeHint"


    // $ANTLR start "entryRuleTupleDeclaration"
    // InternalIdl.g:1229:1: entryRuleTupleDeclaration returns [EObject current=null] : iv_ruleTupleDeclaration= ruleTupleDeclaration EOF ;
    public final EObject entryRuleTupleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleDeclaration = null;


        try {
            // InternalIdl.g:1229:57: (iv_ruleTupleDeclaration= ruleTupleDeclaration EOF )
            // InternalIdl.g:1230:2: iv_ruleTupleDeclaration= ruleTupleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTupleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTupleDeclaration=ruleTupleDeclaration();

            state._fsp--;

             current =iv_ruleTupleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleDeclaration"


    // $ANTLR start "ruleTupleDeclaration"
    // InternalIdl.g:1236:1: ruleTupleDeclaration returns [EObject current=null] : (otherlv_0= 'tuple' otherlv_1= '<' ( (lv_types_2_0= ruleAbstractType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleAbstractType ) ) )* otherlv_5= '>' ) ;
    public final EObject ruleTupleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_types_2_0 = null;

        EObject lv_types_4_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:1242:2: ( (otherlv_0= 'tuple' otherlv_1= '<' ( (lv_types_2_0= ruleAbstractType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleAbstractType ) ) )* otherlv_5= '>' ) )
            // InternalIdl.g:1243:2: (otherlv_0= 'tuple' otherlv_1= '<' ( (lv_types_2_0= ruleAbstractType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleAbstractType ) ) )* otherlv_5= '>' )
            {
            // InternalIdl.g:1243:2: (otherlv_0= 'tuple' otherlv_1= '<' ( (lv_types_2_0= ruleAbstractType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleAbstractType ) ) )* otherlv_5= '>' )
            // InternalIdl.g:1244:3: otherlv_0= 'tuple' otherlv_1= '<' ( (lv_types_2_0= ruleAbstractType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleAbstractType ) ) )* otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTupleDeclarationAccess().getTupleKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleDeclarationAccess().getLessThanSignKeyword_1());
            		
            // InternalIdl.g:1252:3: ( (lv_types_2_0= ruleAbstractType ) )
            // InternalIdl.g:1253:4: (lv_types_2_0= ruleAbstractType )
            {
            // InternalIdl.g:1253:4: (lv_types_2_0= ruleAbstractType )
            // InternalIdl.g:1254:5: lv_types_2_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getTupleDeclarationAccess().getTypesAbstractTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_types_2_0=ruleAbstractType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleDeclarationRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_2_0,
            						"com.btc.serviceidl.Idl.AbstractType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIdl.g:1271:3: (otherlv_3= ',' ( (lv_types_4_0= ruleAbstractType ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIdl.g:1272:4: otherlv_3= ',' ( (lv_types_4_0= ruleAbstractType ) )
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_16); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTupleDeclarationAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIdl.g:1276:4: ( (lv_types_4_0= ruleAbstractType ) )
            	    // InternalIdl.g:1277:5: (lv_types_4_0= ruleAbstractType )
            	    {
            	    // InternalIdl.g:1277:5: (lv_types_4_0= ruleAbstractType )
            	    // InternalIdl.g:1278:6: lv_types_4_0= ruleAbstractType
            	    {

            	    						newCompositeNode(grammarAccess.getTupleDeclarationAccess().getTypesAbstractTypeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_types_4_0=ruleAbstractType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTupleDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_4_0,
            	    							"com.btc.serviceidl.Idl.AbstractType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_5=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTupleDeclarationAccess().getGreaterThanSignKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleDeclaration"


    // $ANTLR start "entryRuleStructDeclaration"
    // InternalIdl.g:1304:1: entryRuleStructDeclaration returns [EObject current=null] : iv_ruleStructDeclaration= ruleStructDeclaration EOF ;
    public final EObject entryRuleStructDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructDeclaration = null;


        try {
            // InternalIdl.g:1304:58: (iv_ruleStructDeclaration= ruleStructDeclaration EOF )
            // InternalIdl.g:1305:2: iv_ruleStructDeclaration= ruleStructDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStructDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructDeclaration=ruleStructDeclaration();

            state._fsp--;

             current =iv_ruleStructDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructDeclaration"


    // $ANTLR start "ruleStructDeclaration"
    // InternalIdl.g:1311:1: ruleStructDeclaration returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( ( (lv_members_5_0= ruleMemberElement ) ) | ( (lv_typeDecls_6_0= ruleAbstractTypeDeclaration ) ) ) otherlv_7= ';' )* otherlv_8= '}' ( (lv_declarator_9_0= RULE_ID ) )? ) ;
    public final EObject ruleStructDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_declarator_9_0=null;
        EObject lv_members_5_0 = null;

        EObject lv_typeDecls_6_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:1317:2: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( ( (lv_members_5_0= ruleMemberElement ) ) | ( (lv_typeDecls_6_0= ruleAbstractTypeDeclaration ) ) ) otherlv_7= ';' )* otherlv_8= '}' ( (lv_declarator_9_0= RULE_ID ) )? ) )
            // InternalIdl.g:1318:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( ( (lv_members_5_0= ruleMemberElement ) ) | ( (lv_typeDecls_6_0= ruleAbstractTypeDeclaration ) ) ) otherlv_7= ';' )* otherlv_8= '}' ( (lv_declarator_9_0= RULE_ID ) )? )
            {
            // InternalIdl.g:1318:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( ( (lv_members_5_0= ruleMemberElement ) ) | ( (lv_typeDecls_6_0= ruleAbstractTypeDeclaration ) ) ) otherlv_7= ';' )* otherlv_8= '}' ( (lv_declarator_9_0= RULE_ID ) )? )
            // InternalIdl.g:1319:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( ( ( (lv_members_5_0= ruleMemberElement ) ) | ( (lv_typeDecls_6_0= ruleAbstractTypeDeclaration ) ) ) otherlv_7= ';' )* otherlv_8= '}' ( (lv_declarator_9_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStructDeclarationAccess().getStructKeyword_0());
            		
            // InternalIdl.g:1323:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIdl.g:1324:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIdl.g:1324:4: (lv_name_1_0= RULE_ID )
            // InternalIdl.g:1325:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStructDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIdl.g:1341:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalIdl.g:1342:4: otherlv_2= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getStructDeclarationAccess().getColonKeyword_2_0());
                    			
                    // InternalIdl.g:1346:4: ( ( ruleQualifiedName ) )
                    // InternalIdl.g:1347:5: ( ruleQualifiedName )
                    {
                    // InternalIdl.g:1347:5: ( ruleQualifiedName )
                    // InternalIdl.g:1348:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStructDeclarationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStructDeclarationAccess().getSupertypeStructDeclarationCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getStructDeclarationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalIdl.g:1367:3: ( ( ( (lv_members_5_0= ruleMemberElement ) ) | ( (lv_typeDecls_6_0= ruleAbstractTypeDeclaration ) ) ) otherlv_7= ';' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=RULE_STRINGTYPE && LA25_0<=RULE_DOUBLE)||LA25_0==33||(LA25_0>=36 && LA25_0<=37)||LA25_0==39||(LA25_0>=51 && LA25_0<=53)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalIdl.g:1368:4: ( ( (lv_members_5_0= ruleMemberElement ) ) | ( (lv_typeDecls_6_0= ruleAbstractTypeDeclaration ) ) ) otherlv_7= ';'
            	    {
            	    // InternalIdl.g:1368:4: ( ( (lv_members_5_0= ruleMemberElement ) ) | ( (lv_typeDecls_6_0= ruleAbstractTypeDeclaration ) ) )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==RULE_ID||(LA24_0>=RULE_STRINGTYPE && LA24_0<=RULE_DOUBLE)||LA24_0==39||LA24_0==51||LA24_0==53) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==33||(LA24_0>=36 && LA24_0<=37)||LA24_0==52) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalIdl.g:1369:5: ( (lv_members_5_0= ruleMemberElement ) )
            	            {
            	            // InternalIdl.g:1369:5: ( (lv_members_5_0= ruleMemberElement ) )
            	            // InternalIdl.g:1370:6: (lv_members_5_0= ruleMemberElement )
            	            {
            	            // InternalIdl.g:1370:6: (lv_members_5_0= ruleMemberElement )
            	            // InternalIdl.g:1371:7: lv_members_5_0= ruleMemberElement
            	            {

            	            							newCompositeNode(grammarAccess.getStructDeclarationAccess().getMembersMemberElementParserRuleCall_4_0_0_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_members_5_0=ruleMemberElement();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getStructDeclarationRule());
            	            							}
            	            							add(
            	            								current,
            	            								"members",
            	            								lv_members_5_0,
            	            								"com.btc.serviceidl.Idl.MemberElement");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalIdl.g:1389:5: ( (lv_typeDecls_6_0= ruleAbstractTypeDeclaration ) )
            	            {
            	            // InternalIdl.g:1389:5: ( (lv_typeDecls_6_0= ruleAbstractTypeDeclaration ) )
            	            // InternalIdl.g:1390:6: (lv_typeDecls_6_0= ruleAbstractTypeDeclaration )
            	            {
            	            // InternalIdl.g:1390:6: (lv_typeDecls_6_0= ruleAbstractTypeDeclaration )
            	            // InternalIdl.g:1391:7: lv_typeDecls_6_0= ruleAbstractTypeDeclaration
            	            {

            	            							newCompositeNode(grammarAccess.getStructDeclarationAccess().getTypeDeclsAbstractTypeDeclarationParserRuleCall_4_0_1_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_typeDecls_6_0=ruleAbstractTypeDeclaration();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getStructDeclarationRule());
            	            							}
            	            							add(
            	            								current,
            	            								"typeDecls",
            	            								lv_typeDecls_6_0,
            	            								"com.btc.serviceidl.Idl.AbstractTypeDeclaration");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_7=(Token)match(input,32,FOLLOW_33); 

            	    				newLeafNode(otherlv_7, grammarAccess.getStructDeclarationAccess().getSemicolonKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_8=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getStructDeclarationAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalIdl.g:1418:3: ( (lv_declarator_9_0= RULE_ID ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalIdl.g:1419:4: (lv_declarator_9_0= RULE_ID )
                    {
                    // InternalIdl.g:1419:4: (lv_declarator_9_0= RULE_ID )
                    // InternalIdl.g:1420:5: lv_declarator_9_0= RULE_ID
                    {
                    lv_declarator_9_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_declarator_9_0, grammarAccess.getStructDeclarationAccess().getDeclaratorIDTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStructDeclarationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"declarator",
                    						lv_declarator_9_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructDeclaration"


    // $ANTLR start "entryRuleMemberElement"
    // InternalIdl.g:1440:1: entryRuleMemberElement returns [EObject current=null] : iv_ruleMemberElement= ruleMemberElement EOF ;
    public final EObject entryRuleMemberElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberElement = null;


        try {
            // InternalIdl.g:1440:54: (iv_ruleMemberElement= ruleMemberElement EOF )
            // InternalIdl.g:1441:2: iv_ruleMemberElement= ruleMemberElement EOF
            {
             newCompositeNode(grammarAccess.getMemberElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemberElement=ruleMemberElement();

            state._fsp--;

             current =iv_ruleMemberElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberElement"


    // $ANTLR start "ruleMemberElement"
    // InternalIdl.g:1447:1: ruleMemberElement returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleMemberElement() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:1453:2: ( ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalIdl.g:1454:2: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalIdl.g:1454:2: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalIdl.g:1455:3: ( (lv_optional_0_0= 'optional' ) )? ( (lv_type_1_0= ruleAbstractType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalIdl.g:1455:3: ( (lv_optional_0_0= 'optional' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==53) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalIdl.g:1456:4: (lv_optional_0_0= 'optional' )
                    {
                    // InternalIdl.g:1456:4: (lv_optional_0_0= 'optional' )
                    // InternalIdl.g:1457:5: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,53,FOLLOW_16); 

                    					newLeafNode(lv_optional_0_0, grammarAccess.getMemberElementAccess().getOptionalOptionalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMemberElementRule());
                    					}
                    					setWithLastConsumed(current, "optional", true, "optional");
                    				

                    }


                    }
                    break;

            }

            // InternalIdl.g:1469:3: ( (lv_type_1_0= ruleAbstractType ) )
            // InternalIdl.g:1470:4: (lv_type_1_0= ruleAbstractType )
            {
            // InternalIdl.g:1470:4: (lv_type_1_0= ruleAbstractType )
            // InternalIdl.g:1471:5: lv_type_1_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getMemberElementAccess().getTypeAbstractTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_1_0=ruleAbstractType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMemberElementRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"com.btc.serviceidl.Idl.AbstractType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIdl.g:1488:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIdl.g:1489:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIdl.g:1489:4: (lv_name_2_0= RULE_ID )
            // InternalIdl.g:1490:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMemberElementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberElement"


    // $ANTLR start "entryRuleKeyElement"
    // InternalIdl.g:1510:1: entryRuleKeyElement returns [EObject current=null] : iv_ruleKeyElement= ruleKeyElement EOF ;
    public final EObject entryRuleKeyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyElement = null;


        try {
            // InternalIdl.g:1510:51: (iv_ruleKeyElement= ruleKeyElement EOF )
            // InternalIdl.g:1511:2: iv_ruleKeyElement= ruleKeyElement EOF
            {
             newCompositeNode(grammarAccess.getKeyElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyElement=ruleKeyElement();

            state._fsp--;

             current =iv_ruleKeyElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyElement"


    // $ANTLR start "ruleKeyElement"
    // InternalIdl.g:1517:1: ruleKeyElement returns [EObject current=null] : ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_keyName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleKeyElement() throws RecognitionException {
        EObject current = null;

        Token lv_keyName_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:1523:2: ( ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_keyName_1_0= RULE_ID ) ) ) )
            // InternalIdl.g:1524:2: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_keyName_1_0= RULE_ID ) ) )
            {
            // InternalIdl.g:1524:2: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_keyName_1_0= RULE_ID ) ) )
            // InternalIdl.g:1525:3: ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_keyName_1_0= RULE_ID ) )
            {
            // InternalIdl.g:1525:3: ( (lv_type_0_0= ruleAbstractType ) )
            // InternalIdl.g:1526:4: (lv_type_0_0= ruleAbstractType )
            {
            // InternalIdl.g:1526:4: (lv_type_0_0= ruleAbstractType )
            // InternalIdl.g:1527:5: lv_type_0_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getKeyElementAccess().getTypeAbstractTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_0_0=ruleAbstractType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyElementRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"com.btc.serviceidl.Idl.AbstractType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIdl.g:1544:3: ( (lv_keyName_1_0= RULE_ID ) )
            // InternalIdl.g:1545:4: (lv_keyName_1_0= RULE_ID )
            {
            // InternalIdl.g:1545:4: (lv_keyName_1_0= RULE_ID )
            // InternalIdl.g:1546:5: lv_keyName_1_0= RULE_ID
            {
            lv_keyName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_keyName_1_0, grammarAccess.getKeyElementAccess().getKeyNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"keyName",
            						lv_keyName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyElement"


    // $ANTLR start "entryRuleInterfaceDeclaration"
    // InternalIdl.g:1566:1: entryRuleInterfaceDeclaration returns [EObject current=null] : iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF ;
    public final EObject entryRuleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDeclaration = null;


        try {
            // InternalIdl.g:1566:61: (iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF )
            // InternalIdl.g:1567:2: iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getInterfaceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceDeclaration=ruleInterfaceDeclaration();

            state._fsp--;

             current =iv_ruleInterfaceDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceDeclaration"


    // $ANTLR start "ruleInterfaceDeclaration"
    // InternalIdl.g:1573:1: ruleInterfaceDeclaration returns [EObject current=null] : ( ( (lv_docComments_0_0= ruleDocCommentElement ) )* ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )* ) ) ) otherlv_12= ']' )? (otherlv_13= ':' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_17= '{' ( (lv_contains_18_0= ruleAbstractInterfaceComponent ) )* otherlv_19= '}' ) ;
    public final EObject ruleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_version_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_guid_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_docComments_0_0 = null;

        EObject lv_contains_18_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:1579:2: ( ( ( (lv_docComments_0_0= ruleDocCommentElement ) )* ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )* ) ) ) otherlv_12= ']' )? (otherlv_13= ':' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_17= '{' ( (lv_contains_18_0= ruleAbstractInterfaceComponent ) )* otherlv_19= '}' ) )
            // InternalIdl.g:1580:2: ( ( (lv_docComments_0_0= ruleDocCommentElement ) )* ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )* ) ) ) otherlv_12= ']' )? (otherlv_13= ':' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_17= '{' ( (lv_contains_18_0= ruleAbstractInterfaceComponent ) )* otherlv_19= '}' )
            {
            // InternalIdl.g:1580:2: ( ( (lv_docComments_0_0= ruleDocCommentElement ) )* ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )* ) ) ) otherlv_12= ']' )? (otherlv_13= ':' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_17= '{' ( (lv_contains_18_0= ruleAbstractInterfaceComponent ) )* otherlv_19= '}' )
            // InternalIdl.g:1581:3: ( (lv_docComments_0_0= ruleDocCommentElement ) )* ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )* ) ) ) otherlv_12= ']' )? (otherlv_13= ':' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_17= '{' ( (lv_contains_18_0= ruleAbstractInterfaceComponent ) )* otherlv_19= '}'
            {
            // InternalIdl.g:1581:3: ( (lv_docComments_0_0= ruleDocCommentElement ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_SL_DOC_COMMENT && LA28_0<=RULE_ML_DOC_COMMENT)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalIdl.g:1582:4: (lv_docComments_0_0= ruleDocCommentElement )
            	    {
            	    // InternalIdl.g:1582:4: (lv_docComments_0_0= ruleDocCommentElement )
            	    // InternalIdl.g:1583:5: lv_docComments_0_0= ruleDocCommentElement
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDocCommentsDocCommentElementParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_docComments_0_0=ruleDocCommentElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"docComments",
            	    						lv_docComments_0_0,
            	    						"com.btc.serviceidl.Idl.DocCommentElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalIdl.g:1600:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==54) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalIdl.g:1601:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalIdl.g:1601:4: (lv_abstract_1_0= 'abstract' )
                    // InternalIdl.g:1602:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,54,FOLLOW_35); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getInterfaceDeclarationAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInterfaceDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,55,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceDeclarationAccess().getInterfaceKeyword_2());
            		
            // InternalIdl.g:1618:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalIdl.g:1619:4: (lv_name_3_0= RULE_ID )
            {
            // InternalIdl.g:1619:4: (lv_name_3_0= RULE_ID )
            // InternalIdl.g:1620:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_3_0, grammarAccess.getInterfaceDeclarationAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIdl.g:1636:3: (otherlv_4= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )* ) ) ) otherlv_12= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalIdl.g:1637:4: otherlv_4= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )* ) ) ) otherlv_12= ']'
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceDeclarationAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalIdl.g:1641:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )* ) ) )
                    // InternalIdl.g:1642:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )* ) )
                    {
                    // InternalIdl.g:1642:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )* ) )
                    // InternalIdl.g:1643:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1());
                    					
                    // InternalIdl.g:1646:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )* )
                    // InternalIdl.g:1647:7: ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )*
                    {
                    // InternalIdl.g:1647:7: ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) ) )*
                    loop30:
                    do {
                        int alt30=3;
                        int LA30_0 = input.LA(1);

                        if ( LA30_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 0) ) {
                            alt30=1;
                        }
                        else if ( LA30_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 1) ) {
                            alt30=2;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalIdl.g:1648:5: ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) )
                    	    {
                    	    // InternalIdl.g:1648:5: ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) ) )
                    	    // InternalIdl.g:1649:6: {...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleInterfaceDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 0)");
                    	    }
                    	    // InternalIdl.g:1649:120: ( ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) ) )
                    	    // InternalIdl.g:1650:7: ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 0);
                    	    						
                    	    // InternalIdl.g:1653:10: ({...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) ) )
                    	    // InternalIdl.g:1653:11: {...}? => (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleInterfaceDeclaration", "true");
                    	    }
                    	    // InternalIdl.g:1653:20: (otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) ) )
                    	    // InternalIdl.g:1653:21: otherlv_6= 'version' otherlv_7= '=' ( (lv_version_8_0= RULE_VERSION ) )
                    	    {
                    	    otherlv_6=(Token)match(input,56,FOLLOW_29); 

                    	    										newLeafNode(otherlv_6, grammarAccess.getInterfaceDeclarationAccess().getVersionKeyword_4_1_0_0());
                    	    									
                    	    otherlv_7=(Token)match(input,48,FOLLOW_38); 

                    	    										newLeafNode(otherlv_7, grammarAccess.getInterfaceDeclarationAccess().getEqualsSignKeyword_4_1_0_1());
                    	    									
                    	    // InternalIdl.g:1661:10: ( (lv_version_8_0= RULE_VERSION ) )
                    	    // InternalIdl.g:1662:11: (lv_version_8_0= RULE_VERSION )
                    	    {
                    	    // InternalIdl.g:1662:11: (lv_version_8_0= RULE_VERSION )
                    	    // InternalIdl.g:1663:12: lv_version_8_0= RULE_VERSION
                    	    {
                    	    lv_version_8_0=(Token)match(input,RULE_VERSION,FOLLOW_37); 

                    	    												newLeafNode(lv_version_8_0, grammarAccess.getInterfaceDeclarationAccess().getVersionVERSIONTerminalRuleCall_4_1_0_2_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getInterfaceDeclarationRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"version",
                    	    													lv_version_8_0,
                    	    													"com.btc.serviceidl.Idl.VERSION");
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIdl.g:1685:5: ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) )
                    	    {
                    	    // InternalIdl.g:1685:5: ({...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) ) )
                    	    // InternalIdl.g:1686:6: {...}? => ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleInterfaceDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 1)");
                    	    }
                    	    // InternalIdl.g:1686:120: ( ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) ) )
                    	    // InternalIdl.g:1687:7: ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1(), 1);
                    	    						
                    	    // InternalIdl.g:1690:10: ({...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) ) )
                    	    // InternalIdl.g:1690:11: {...}? => (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleInterfaceDeclaration", "true");
                    	    }
                    	    // InternalIdl.g:1690:20: (otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) ) )
                    	    // InternalIdl.g:1690:21: otherlv_9= 'guid' otherlv_10= '=' ( (lv_guid_11_0= RULE_UUID_LITERAL ) )
                    	    {
                    	    otherlv_9=(Token)match(input,57,FOLLOW_29); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getInterfaceDeclarationAccess().getGuidKeyword_4_1_1_0());
                    	    									
                    	    otherlv_10=(Token)match(input,48,FOLLOW_39); 

                    	    										newLeafNode(otherlv_10, grammarAccess.getInterfaceDeclarationAccess().getEqualsSignKeyword_4_1_1_1());
                    	    									
                    	    // InternalIdl.g:1698:10: ( (lv_guid_11_0= RULE_UUID_LITERAL ) )
                    	    // InternalIdl.g:1699:11: (lv_guid_11_0= RULE_UUID_LITERAL )
                    	    {
                    	    // InternalIdl.g:1699:11: (lv_guid_11_0= RULE_UUID_LITERAL )
                    	    // InternalIdl.g:1700:12: lv_guid_11_0= RULE_UUID_LITERAL
                    	    {
                    	    lv_guid_11_0=(Token)match(input,RULE_UUID_LITERAL,FOLLOW_37); 

                    	    												newLeafNode(lv_guid_11_0, grammarAccess.getInterfaceDeclarationAccess().getGuidUUID_LITERALTerminalRuleCall_4_1_1_2_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getInterfaceDeclarationRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"guid",
                    	    													lv_guid_11_0,
                    	    													"com.btc.serviceidl.Idl.UUID_LITERAL");
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getInterfaceDeclarationAccess().getUnorderedGroup_4_1());
                    					

                    }

                    otherlv_12=(Token)match(input,45,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getInterfaceDeclarationAccess().getRightSquareBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalIdl.g:1734:3: (otherlv_13= ':' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalIdl.g:1735:4: otherlv_13= ':' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_13=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getInterfaceDeclarationAccess().getColonKeyword_5_0());
                    			
                    // InternalIdl.g:1739:4: ( ( ruleQualifiedName ) )
                    // InternalIdl.g:1740:5: ( ruleQualifiedName )
                    {
                    // InternalIdl.g:1740:5: ( ruleQualifiedName )
                    // InternalIdl.g:1741:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterfaceDeclarationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromInterfaceDeclarationCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIdl.g:1755:4: (otherlv_15= ',' ( ( ruleQualifiedName ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==38) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalIdl.g:1756:5: otherlv_15= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_15=(Token)match(input,38,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getInterfaceDeclarationAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalIdl.g:1760:5: ( ( ruleQualifiedName ) )
                    	    // InternalIdl.g:1761:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalIdl.g:1761:6: ( ruleQualifiedName )
                    	    // InternalIdl.g:1762:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInterfaceDeclarationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDerivesFromInterfaceDeclarationCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,30,FOLLOW_41); 

            			newLeafNode(otherlv_17, grammarAccess.getInterfaceDeclarationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalIdl.g:1782:3: ( (lv_contains_18_0= ruleAbstractInterfaceComponent ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||(LA34_0>=RULE_SL_DOC_COMMENT && LA34_0<=RULE_ML_DOC_COMMENT)||LA34_0==33||(LA34_0>=36 && LA34_0<=37)||LA34_0==52||(LA34_0>=58 && LA34_0<=59)||LA34_0==64) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalIdl.g:1783:4: (lv_contains_18_0= ruleAbstractInterfaceComponent )
            	    {
            	    // InternalIdl.g:1783:4: (lv_contains_18_0= ruleAbstractInterfaceComponent )
            	    // InternalIdl.g:1784:5: lv_contains_18_0= ruleAbstractInterfaceComponent
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getContainsAbstractInterfaceComponentParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_contains_18_0=ruleAbstractInterfaceComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contains",
            	    						lv_contains_18_0,
            	    						"com.btc.serviceidl.Idl.AbstractInterfaceComponent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_19=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getInterfaceDeclarationAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceDeclaration"


    // $ANTLR start "entryRuleAbstractInterfaceComponent"
    // InternalIdl.g:1809:1: entryRuleAbstractInterfaceComponent returns [EObject current=null] : iv_ruleAbstractInterfaceComponent= ruleAbstractInterfaceComponent EOF ;
    public final EObject entryRuleAbstractInterfaceComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractInterfaceComponent = null;


        try {
            // InternalIdl.g:1809:67: (iv_ruleAbstractInterfaceComponent= ruleAbstractInterfaceComponent EOF )
            // InternalIdl.g:1810:2: iv_ruleAbstractInterfaceComponent= ruleAbstractInterfaceComponent EOF
            {
             newCompositeNode(grammarAccess.getAbstractInterfaceComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractInterfaceComponent=ruleAbstractInterfaceComponent();

            state._fsp--;

             current =iv_ruleAbstractInterfaceComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractInterfaceComponent"


    // $ANTLR start "ruleAbstractInterfaceComponent"
    // InternalIdl.g:1816:1: ruleAbstractInterfaceComponent returns [EObject current=null] : ( (this_AbstractTypeDeclaration_0= ruleAbstractTypeDeclaration otherlv_1= ';' ) | (this_FunctionDeclaration_2= ruleFunctionDeclaration otherlv_3= ';' ) | (this_EventDeclaration_4= ruleEventDeclaration otherlv_5= ';' ) ) ;
    public final EObject ruleAbstractInterfaceComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_AbstractTypeDeclaration_0 = null;

        EObject this_FunctionDeclaration_2 = null;

        EObject this_EventDeclaration_4 = null;



        	enterRule();

        try {
            // InternalIdl.g:1822:2: ( ( (this_AbstractTypeDeclaration_0= ruleAbstractTypeDeclaration otherlv_1= ';' ) | (this_FunctionDeclaration_2= ruleFunctionDeclaration otherlv_3= ';' ) | (this_EventDeclaration_4= ruleEventDeclaration otherlv_5= ';' ) ) )
            // InternalIdl.g:1823:2: ( (this_AbstractTypeDeclaration_0= ruleAbstractTypeDeclaration otherlv_1= ';' ) | (this_FunctionDeclaration_2= ruleFunctionDeclaration otherlv_3= ';' ) | (this_EventDeclaration_4= ruleEventDeclaration otherlv_5= ';' ) )
            {
            // InternalIdl.g:1823:2: ( (this_AbstractTypeDeclaration_0= ruleAbstractTypeDeclaration otherlv_1= ';' ) | (this_FunctionDeclaration_2= ruleFunctionDeclaration otherlv_3= ';' ) | (this_EventDeclaration_4= ruleEventDeclaration otherlv_5= ';' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 33:
            case 36:
            case 37:
            case 52:
                {
                alt35=1;
                }
                break;
            case RULE_ID:
            case RULE_SL_DOC_COMMENT:
            case RULE_ML_DOC_COMMENT:
            case 58:
            case 59:
                {
                alt35=2;
                }
                break;
            case 64:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalIdl.g:1824:3: (this_AbstractTypeDeclaration_0= ruleAbstractTypeDeclaration otherlv_1= ';' )
                    {
                    // InternalIdl.g:1824:3: (this_AbstractTypeDeclaration_0= ruleAbstractTypeDeclaration otherlv_1= ';' )
                    // InternalIdl.g:1825:4: this_AbstractTypeDeclaration_0= ruleAbstractTypeDeclaration otherlv_1= ';'
                    {

                    				newCompositeNode(grammarAccess.getAbstractInterfaceComponentAccess().getAbstractTypeDeclarationParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_11);
                    this_AbstractTypeDeclaration_0=ruleAbstractTypeDeclaration();

                    state._fsp--;


                    				current = this_AbstractTypeDeclaration_0;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_1=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getAbstractInterfaceComponentAccess().getSemicolonKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:1839:3: (this_FunctionDeclaration_2= ruleFunctionDeclaration otherlv_3= ';' )
                    {
                    // InternalIdl.g:1839:3: (this_FunctionDeclaration_2= ruleFunctionDeclaration otherlv_3= ';' )
                    // InternalIdl.g:1840:4: this_FunctionDeclaration_2= ruleFunctionDeclaration otherlv_3= ';'
                    {

                    				newCompositeNode(grammarAccess.getAbstractInterfaceComponentAccess().getFunctionDeclarationParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_11);
                    this_FunctionDeclaration_2=ruleFunctionDeclaration();

                    state._fsp--;


                    				current = this_FunctionDeclaration_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAbstractInterfaceComponentAccess().getSemicolonKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIdl.g:1854:3: (this_EventDeclaration_4= ruleEventDeclaration otherlv_5= ';' )
                    {
                    // InternalIdl.g:1854:3: (this_EventDeclaration_4= ruleEventDeclaration otherlv_5= ';' )
                    // InternalIdl.g:1855:4: this_EventDeclaration_4= ruleEventDeclaration otherlv_5= ';'
                    {

                    				newCompositeNode(grammarAccess.getAbstractInterfaceComponentAccess().getEventDeclarationParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_11);
                    this_EventDeclaration_4=ruleEventDeclaration();

                    state._fsp--;


                    				current = this_EventDeclaration_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAbstractInterfaceComponentAccess().getSemicolonKeyword_2_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractInterfaceComponent"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalIdl.g:1872:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // InternalIdl.g:1872:60: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // InternalIdl.g:1873:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;

             current =iv_ruleFunctionDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalIdl.g:1879:1: ruleFunctionDeclaration returns [EObject current=null] : ( ( (lv_docComments_0_0= ruleDocCommentElement ) )* ( (lv_sync_1_0= 'sync' ) )? ( (lv_query_2_0= 'query' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameterElement ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameterElement ) ) )* )? otherlv_8= ')' ( (otherlv_9= 'returns' ( (lv_injected_10_0= 'injectable' ) )? ( (lv_returnedType_11_0= ruleReturnTypeElement ) ) ) (otherlv_12= 'raises' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ) ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_sync_1_0=null;
        Token lv_query_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_injected_10_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_docComments_0_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_returnedType_11_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:1885:2: ( ( ( (lv_docComments_0_0= ruleDocCommentElement ) )* ( (lv_sync_1_0= 'sync' ) )? ( (lv_query_2_0= 'query' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameterElement ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameterElement ) ) )* )? otherlv_8= ')' ( (otherlv_9= 'returns' ( (lv_injected_10_0= 'injectable' ) )? ( (lv_returnedType_11_0= ruleReturnTypeElement ) ) ) (otherlv_12= 'raises' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ) ) )
            // InternalIdl.g:1886:2: ( ( (lv_docComments_0_0= ruleDocCommentElement ) )* ( (lv_sync_1_0= 'sync' ) )? ( (lv_query_2_0= 'query' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameterElement ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameterElement ) ) )* )? otherlv_8= ')' ( (otherlv_9= 'returns' ( (lv_injected_10_0= 'injectable' ) )? ( (lv_returnedType_11_0= ruleReturnTypeElement ) ) ) (otherlv_12= 'raises' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            {
            // InternalIdl.g:1886:2: ( ( (lv_docComments_0_0= ruleDocCommentElement ) )* ( (lv_sync_1_0= 'sync' ) )? ( (lv_query_2_0= 'query' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameterElement ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameterElement ) ) )* )? otherlv_8= ')' ( (otherlv_9= 'returns' ( (lv_injected_10_0= 'injectable' ) )? ( (lv_returnedType_11_0= ruleReturnTypeElement ) ) ) (otherlv_12= 'raises' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalIdl.g:1887:3: ( (lv_docComments_0_0= ruleDocCommentElement ) )* ( (lv_sync_1_0= 'sync' ) )? ( (lv_query_2_0= 'query' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameterElement ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameterElement ) ) )* )? otherlv_8= ')' ( (otherlv_9= 'returns' ( (lv_injected_10_0= 'injectable' ) )? ( (lv_returnedType_11_0= ruleReturnTypeElement ) ) ) (otherlv_12= 'raises' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalIdl.g:1887:3: ( (lv_docComments_0_0= ruleDocCommentElement ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_SL_DOC_COMMENT && LA36_0<=RULE_ML_DOC_COMMENT)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalIdl.g:1888:4: (lv_docComments_0_0= ruleDocCommentElement )
            	    {
            	    // InternalIdl.g:1888:4: (lv_docComments_0_0= ruleDocCommentElement )
            	    // InternalIdl.g:1889:5: lv_docComments_0_0= ruleDocCommentElement
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getDocCommentsDocCommentElementParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_docComments_0_0=ruleDocCommentElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"docComments",
            	    						lv_docComments_0_0,
            	    						"com.btc.serviceidl.Idl.DocCommentElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalIdl.g:1906:3: ( (lv_sync_1_0= 'sync' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==58) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalIdl.g:1907:4: (lv_sync_1_0= 'sync' )
                    {
                    // InternalIdl.g:1907:4: (lv_sync_1_0= 'sync' )
                    // InternalIdl.g:1908:5: lv_sync_1_0= 'sync'
                    {
                    lv_sync_1_0=(Token)match(input,58,FOLLOW_43); 

                    					newLeafNode(lv_sync_1_0, grammarAccess.getFunctionDeclarationAccess().getSyncSyncKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "sync", true, "sync");
                    				

                    }


                    }
                    break;

            }

            // InternalIdl.g:1920:3: ( (lv_query_2_0= 'query' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==59) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalIdl.g:1921:4: (lv_query_2_0= 'query' )
                    {
                    // InternalIdl.g:1921:4: (lv_query_2_0= 'query' )
                    // InternalIdl.g:1922:5: lv_query_2_0= 'query'
                    {
                    lv_query_2_0=(Token)match(input,59,FOLLOW_5); 

                    					newLeafNode(lv_query_2_0, grammarAccess.getFunctionDeclarationAccess().getQueryQueryKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "query", true, "query");
                    				

                    }


                    }
                    break;

            }

            // InternalIdl.g:1934:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalIdl.g:1935:4: (lv_name_3_0= RULE_ID )
            {
            // InternalIdl.g:1935:4: (lv_name_3_0= RULE_ID )
            // InternalIdl.g:1936:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,60,FOLLOW_45); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_4());
            		
            // InternalIdl.g:1956:3: ( ( (lv_parameters_5_0= ruleParameterElement ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameterElement ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=70 && LA40_0<=71)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalIdl.g:1957:4: ( (lv_parameters_5_0= ruleParameterElement ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameterElement ) ) )*
                    {
                    // InternalIdl.g:1957:4: ( (lv_parameters_5_0= ruleParameterElement ) )
                    // InternalIdl.g:1958:5: (lv_parameters_5_0= ruleParameterElement )
                    {
                    // InternalIdl.g:1958:5: (lv_parameters_5_0= ruleParameterElement )
                    // InternalIdl.g:1959:6: lv_parameters_5_0= ruleParameterElement
                    {

                    						newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersParameterElementParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_parameters_5_0=ruleParameterElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_5_0,
                    							"com.btc.serviceidl.Idl.ParameterElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIdl.g:1976:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameterElement ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==38) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalIdl.g:1977:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleParameterElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,38,FOLLOW_47); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalIdl.g:1981:5: ( (lv_parameters_7_0= ruleParameterElement ) )
                    	    // InternalIdl.g:1982:6: (lv_parameters_7_0= ruleParameterElement )
                    	    {
                    	    // InternalIdl.g:1982:6: (lv_parameters_7_0= ruleParameterElement )
                    	    // InternalIdl.g:1983:7: lv_parameters_7_0= ruleParameterElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersParameterElementParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    lv_parameters_7_0=ruleParameterElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_7_0,
                    	    								"com.btc.serviceidl.Idl.ParameterElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,61,FOLLOW_48); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_6());
            		
            // InternalIdl.g:2006:3: ( (otherlv_9= 'returns' ( (lv_injected_10_0= 'injectable' ) )? ( (lv_returnedType_11_0= ruleReturnTypeElement ) ) ) (otherlv_12= 'raises' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalIdl.g:2007:4: (otherlv_9= 'returns' ( (lv_injected_10_0= 'injectable' ) )? ( (lv_returnedType_11_0= ruleReturnTypeElement ) ) ) (otherlv_12= 'raises' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            // InternalIdl.g:2007:4: (otherlv_9= 'returns' ( (lv_injected_10_0= 'injectable' ) )? ( (lv_returnedType_11_0= ruleReturnTypeElement ) ) )
            // InternalIdl.g:2008:5: otherlv_9= 'returns' ( (lv_injected_10_0= 'injectable' ) )? ( (lv_returnedType_11_0= ruleReturnTypeElement ) )
            {
            otherlv_9=(Token)match(input,62,FOLLOW_49); 

            					newLeafNode(otherlv_9, grammarAccess.getFunctionDeclarationAccess().getReturnsKeyword_7_0_0());
            				
            // InternalIdl.g:2012:5: ( (lv_injected_10_0= 'injectable' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==63) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalIdl.g:2013:6: (lv_injected_10_0= 'injectable' )
                    {
                    // InternalIdl.g:2013:6: (lv_injected_10_0= 'injectable' )
                    // InternalIdl.g:2014:7: lv_injected_10_0= 'injectable'
                    {
                    lv_injected_10_0=(Token)match(input,63,FOLLOW_49); 

                    							newLeafNode(lv_injected_10_0, grammarAccess.getFunctionDeclarationAccess().getInjectedInjectableKeyword_7_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    							}
                    							setWithLastConsumed(current, "injected", true, "injectable");
                    						

                    }


                    }
                    break;

            }

            // InternalIdl.g:2026:5: ( (lv_returnedType_11_0= ruleReturnTypeElement ) )
            // InternalIdl.g:2027:6: (lv_returnedType_11_0= ruleReturnTypeElement )
            {
            // InternalIdl.g:2027:6: (lv_returnedType_11_0= ruleReturnTypeElement )
            // InternalIdl.g:2028:7: lv_returnedType_11_0= ruleReturnTypeElement
            {

            							newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getReturnedTypeReturnTypeElementParserRuleCall_7_0_2_0());
            						
            pushFollow(FOLLOW_50);
            lv_returnedType_11_0=ruleReturnTypeElement();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            							}
            							set(
            								current,
            								"returnedType",
            								lv_returnedType_11_0,
            								"com.btc.serviceidl.Idl.ReturnTypeElement");
            							afterParserOrEnumRuleCall();
            						

            }


            }


            }

            // InternalIdl.g:2046:4: (otherlv_12= 'raises' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalIdl.g:2047:5: otherlv_12= 'raises' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_12=(Token)match(input,42,FOLLOW_5); 

                    					newLeafNode(otherlv_12, grammarAccess.getFunctionDeclarationAccess().getRaisesKeyword_7_1_0());
                    				
                    // InternalIdl.g:2051:5: ( ( ruleQualifiedName ) )
                    // InternalIdl.g:2052:6: ( ruleQualifiedName )
                    {
                    // InternalIdl.g:2052:6: ( ruleQualifiedName )
                    // InternalIdl.g:2053:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_7_1_1_0());
                    						
                    pushFollow(FOLLOW_51);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalIdl.g:2067:5: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==38) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalIdl.g:2068:6: otherlv_14= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_14=(Token)match(input,38,FOLLOW_5); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_7_1_2_0());
                    	    					
                    	    // InternalIdl.g:2072:6: ( ( ruleQualifiedName ) )
                    	    // InternalIdl.g:2073:7: ( ruleQualifiedName )
                    	    {
                    	    // InternalIdl.g:2073:7: ( ruleQualifiedName )
                    	    // InternalIdl.g:2074:8: ruleQualifiedName
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    	    								}
                    	    							

                    	    								newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_7_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_51);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleEventDeclaration"
    // InternalIdl.g:2095:1: entryRuleEventDeclaration returns [EObject current=null] : iv_ruleEventDeclaration= ruleEventDeclaration EOF ;
    public final EObject entryRuleEventDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclaration = null;


        try {
            // InternalIdl.g:2095:57: (iv_ruleEventDeclaration= ruleEventDeclaration EOF )
            // InternalIdl.g:2096:2: iv_ruleEventDeclaration= ruleEventDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEventDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventDeclaration=ruleEventDeclaration();

            state._fsp--;

             current =iv_ruleEventDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventDeclaration"


    // $ANTLR start "ruleEventDeclaration"
    // InternalIdl.g:2102:1: ruleEventDeclaration returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '[' (otherlv_3= 'guid' otherlv_4= '=' ( (lv_guid_5_0= RULE_UUID_LITERAL ) ) ) otherlv_6= ']' )? otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= ')' ( (otherlv_10= 'subscribe' otherlv_11= 'with' otherlv_12= '(' ( ( (lv_keys_13_0= ruleKeyElement ) ) (otherlv_14= ',' ( (lv_keys_15_0= ruleKeyElement ) ) )* )? otherlv_16= ')' )? (otherlv_17= 'raises' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? ) ) ;
    public final EObject ruleEventDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_guid_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_keys_13_0 = null;

        EObject lv_keys_15_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:2108:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '[' (otherlv_3= 'guid' otherlv_4= '=' ( (lv_guid_5_0= RULE_UUID_LITERAL ) ) ) otherlv_6= ']' )? otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= ')' ( (otherlv_10= 'subscribe' otherlv_11= 'with' otherlv_12= '(' ( ( (lv_keys_13_0= ruleKeyElement ) ) (otherlv_14= ',' ( (lv_keys_15_0= ruleKeyElement ) ) )* )? otherlv_16= ')' )? (otherlv_17= 'raises' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? ) ) )
            // InternalIdl.g:2109:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '[' (otherlv_3= 'guid' otherlv_4= '=' ( (lv_guid_5_0= RULE_UUID_LITERAL ) ) ) otherlv_6= ']' )? otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= ')' ( (otherlv_10= 'subscribe' otherlv_11= 'with' otherlv_12= '(' ( ( (lv_keys_13_0= ruleKeyElement ) ) (otherlv_14= ',' ( (lv_keys_15_0= ruleKeyElement ) ) )* )? otherlv_16= ')' )? (otherlv_17= 'raises' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            {
            // InternalIdl.g:2109:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '[' (otherlv_3= 'guid' otherlv_4= '=' ( (lv_guid_5_0= RULE_UUID_LITERAL ) ) ) otherlv_6= ']' )? otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= ')' ( (otherlv_10= 'subscribe' otherlv_11= 'with' otherlv_12= '(' ( ( (lv_keys_13_0= ruleKeyElement ) ) (otherlv_14= ',' ( (lv_keys_15_0= ruleKeyElement ) ) )* )? otherlv_16= ')' )? (otherlv_17= 'raises' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalIdl.g:2110:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '[' (otherlv_3= 'guid' otherlv_4= '=' ( (lv_guid_5_0= RULE_UUID_LITERAL ) ) ) otherlv_6= ']' )? otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= ')' ( (otherlv_10= 'subscribe' otherlv_11= 'with' otherlv_12= '(' ( ( (lv_keys_13_0= ruleKeyElement ) ) (otherlv_14= ',' ( (lv_keys_15_0= ruleKeyElement ) ) )* )? otherlv_16= ')' )? (otherlv_17= 'raises' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getEventDeclarationAccess().getEventKeyword_0());
            		
            // InternalIdl.g:2114:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalIdl.g:2115:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalIdl.g:2115:4: (lv_name_1_0= RULE_ID )
                    // InternalIdl.g:2116:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_53); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEventDeclarationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalIdl.g:2132:3: (otherlv_2= '[' (otherlv_3= 'guid' otherlv_4= '=' ( (lv_guid_5_0= RULE_UUID_LITERAL ) ) ) otherlv_6= ']' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalIdl.g:2133:4: otherlv_2= '[' (otherlv_3= 'guid' otherlv_4= '=' ( (lv_guid_5_0= RULE_UUID_LITERAL ) ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_54); 

                    				newLeafNode(otherlv_2, grammarAccess.getEventDeclarationAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalIdl.g:2137:4: (otherlv_3= 'guid' otherlv_4= '=' ( (lv_guid_5_0= RULE_UUID_LITERAL ) ) )
                    // InternalIdl.g:2138:5: otherlv_3= 'guid' otherlv_4= '=' ( (lv_guid_5_0= RULE_UUID_LITERAL ) )
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_29); 

                    					newLeafNode(otherlv_3, grammarAccess.getEventDeclarationAccess().getGuidKeyword_2_1_0());
                    				
                    otherlv_4=(Token)match(input,48,FOLLOW_39); 

                    					newLeafNode(otherlv_4, grammarAccess.getEventDeclarationAccess().getEqualsSignKeyword_2_1_1());
                    				
                    // InternalIdl.g:2146:5: ( (lv_guid_5_0= RULE_UUID_LITERAL ) )
                    // InternalIdl.g:2147:6: (lv_guid_5_0= RULE_UUID_LITERAL )
                    {
                    // InternalIdl.g:2147:6: (lv_guid_5_0= RULE_UUID_LITERAL )
                    // InternalIdl.g:2148:7: lv_guid_5_0= RULE_UUID_LITERAL
                    {
                    lv_guid_5_0=(Token)match(input,RULE_UUID_LITERAL,FOLLOW_55); 

                    							newLeafNode(lv_guid_5_0, grammarAccess.getEventDeclarationAccess().getGuidUUID_LITERALTerminalRuleCall_2_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEventDeclarationRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"guid",
                    								lv_guid_5_0,
                    								"com.btc.serviceidl.Idl.UUID_LITERAL");
                    						

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,45,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventDeclarationAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,60,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalIdl.g:2174:3: ( ( ruleQualifiedName ) )
            // InternalIdl.g:2175:4: ( ruleQualifiedName )
            {
            // InternalIdl.g:2175:4: ( ruleQualifiedName )
            // InternalIdl.g:2176:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEventDeclarationAccess().getDataStructDeclarationCrossReference_4_0());
            				
            pushFollow(FOLLOW_56);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,61,FOLLOW_57); 

            			newLeafNode(otherlv_9, grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_5());
            		
            // InternalIdl.g:2194:3: ( (otherlv_10= 'subscribe' otherlv_11= 'with' otherlv_12= '(' ( ( (lv_keys_13_0= ruleKeyElement ) ) (otherlv_14= ',' ( (lv_keys_15_0= ruleKeyElement ) ) )* )? otherlv_16= ')' )? (otherlv_17= 'raises' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalIdl.g:2195:4: (otherlv_10= 'subscribe' otherlv_11= 'with' otherlv_12= '(' ( ( (lv_keys_13_0= ruleKeyElement ) ) (otherlv_14= ',' ( (lv_keys_15_0= ruleKeyElement ) ) )* )? otherlv_16= ')' )? (otherlv_17= 'raises' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            // InternalIdl.g:2195:4: (otherlv_10= 'subscribe' otherlv_11= 'with' otherlv_12= '(' ( ( (lv_keys_13_0= ruleKeyElement ) ) (otherlv_14= ',' ( (lv_keys_15_0= ruleKeyElement ) ) )* )? otherlv_16= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==65) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalIdl.g:2196:5: otherlv_10= 'subscribe' otherlv_11= 'with' otherlv_12= '(' ( ( (lv_keys_13_0= ruleKeyElement ) ) (otherlv_14= ',' ( (lv_keys_15_0= ruleKeyElement ) ) )* )? otherlv_16= ')'
                    {
                    otherlv_10=(Token)match(input,65,FOLLOW_58); 

                    					newLeafNode(otherlv_10, grammarAccess.getEventDeclarationAccess().getSubscribeKeyword_6_0_0());
                    				
                    otherlv_11=(Token)match(input,66,FOLLOW_44); 

                    					newLeafNode(otherlv_11, grammarAccess.getEventDeclarationAccess().getWithKeyword_6_0_1());
                    				
                    otherlv_12=(Token)match(input,60,FOLLOW_59); 

                    					newLeafNode(otherlv_12, grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_6_0_2());
                    				
                    // InternalIdl.g:2208:5: ( ( (lv_keys_13_0= ruleKeyElement ) ) (otherlv_14= ',' ( (lv_keys_15_0= ruleKeyElement ) ) )* )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID||(LA47_0>=RULE_STRINGTYPE && LA47_0<=RULE_DOUBLE)||LA47_0==39||LA47_0==51) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalIdl.g:2209:6: ( (lv_keys_13_0= ruleKeyElement ) ) (otherlv_14= ',' ( (lv_keys_15_0= ruleKeyElement ) ) )*
                            {
                            // InternalIdl.g:2209:6: ( (lv_keys_13_0= ruleKeyElement ) )
                            // InternalIdl.g:2210:7: (lv_keys_13_0= ruleKeyElement )
                            {
                            // InternalIdl.g:2210:7: (lv_keys_13_0= ruleKeyElement )
                            // InternalIdl.g:2211:8: lv_keys_13_0= ruleKeyElement
                            {

                            								newCompositeNode(grammarAccess.getEventDeclarationAccess().getKeysKeyElementParserRuleCall_6_0_3_0_0());
                            							
                            pushFollow(FOLLOW_46);
                            lv_keys_13_0=ruleKeyElement();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getEventDeclarationRule());
                            								}
                            								add(
                            									current,
                            									"keys",
                            									lv_keys_13_0,
                            									"com.btc.serviceidl.Idl.KeyElement");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalIdl.g:2228:6: (otherlv_14= ',' ( (lv_keys_15_0= ruleKeyElement ) ) )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==38) ) {
                                    alt46=1;
                                }


                                switch (alt46) {
                            	case 1 :
                            	    // InternalIdl.g:2229:7: otherlv_14= ',' ( (lv_keys_15_0= ruleKeyElement ) )
                            	    {
                            	    otherlv_14=(Token)match(input,38,FOLLOW_16); 

                            	    							newLeafNode(otherlv_14, grammarAccess.getEventDeclarationAccess().getCommaKeyword_6_0_3_1_0());
                            	    						
                            	    // InternalIdl.g:2233:7: ( (lv_keys_15_0= ruleKeyElement ) )
                            	    // InternalIdl.g:2234:8: (lv_keys_15_0= ruleKeyElement )
                            	    {
                            	    // InternalIdl.g:2234:8: (lv_keys_15_0= ruleKeyElement )
                            	    // InternalIdl.g:2235:9: lv_keys_15_0= ruleKeyElement
                            	    {

                            	    									newCompositeNode(grammarAccess.getEventDeclarationAccess().getKeysKeyElementParserRuleCall_6_0_3_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_46);
                            	    lv_keys_15_0=ruleKeyElement();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getEventDeclarationRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"keys",
                            	    										lv_keys_15_0,
                            	    										"com.btc.serviceidl.Idl.KeyElement");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop46;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,61,FOLLOW_50); 

                    					newLeafNode(otherlv_16, grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_6_0_4());
                    				

                    }
                    break;

            }

            // InternalIdl.g:2259:4: (otherlv_17= 'raises' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalIdl.g:2260:5: otherlv_17= 'raises' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_17=(Token)match(input,42,FOLLOW_5); 

                    					newLeafNode(otherlv_17, grammarAccess.getEventDeclarationAccess().getRaisesKeyword_6_1_0());
                    				
                    // InternalIdl.g:2264:5: ( ( ruleQualifiedName ) )
                    // InternalIdl.g:2265:6: ( ruleQualifiedName )
                    {
                    // InternalIdl.g:2265:6: ( ruleQualifiedName )
                    // InternalIdl.g:2266:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEventDeclarationRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_6_1_1_0());
                    						
                    pushFollow(FOLLOW_51);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalIdl.g:2280:5: (otherlv_19= ',' ( ( ruleQualifiedName ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==38) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalIdl.g:2281:6: otherlv_19= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_19=(Token)match(input,38,FOLLOW_5); 

                    	    						newLeafNode(otherlv_19, grammarAccess.getEventDeclarationAccess().getCommaKeyword_6_1_2_0());
                    	    					
                    	    // InternalIdl.g:2285:6: ( ( ruleQualifiedName ) )
                    	    // InternalIdl.g:2286:7: ( ruleQualifiedName )
                    	    {
                    	    // InternalIdl.g:2286:7: ( ruleQualifiedName )
                    	    // InternalIdl.g:2287:8: ruleQualifiedName
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getEventDeclarationRule());
                    	    								}
                    	    							

                    	    								newCompositeNode(grammarAccess.getEventDeclarationAccess().getRaisedExceptionsAbstractExceptionCrossReference_6_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_51);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventDeclaration"


    // $ANTLR start "entryRuleReturnTypeElement"
    // InternalIdl.g:2308:1: entryRuleReturnTypeElement returns [EObject current=null] : iv_ruleReturnTypeElement= ruleReturnTypeElement EOF ;
    public final EObject entryRuleReturnTypeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnTypeElement = null;


        try {
            // InternalIdl.g:2308:58: (iv_ruleReturnTypeElement= ruleReturnTypeElement EOF )
            // InternalIdl.g:2309:2: iv_ruleReturnTypeElement= ruleReturnTypeElement EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnTypeElement=ruleReturnTypeElement();

            state._fsp--;

             current =iv_ruleReturnTypeElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnTypeElement"


    // $ANTLR start "ruleReturnTypeElement"
    // InternalIdl.g:2315:1: ruleReturnTypeElement returns [EObject current=null] : (this_AbstractType_0= ruleAbstractType | ( (lv_void_1_0= 'void' ) ) ) ;
    public final EObject ruleReturnTypeElement() throws RecognitionException {
        EObject current = null;

        Token lv_void_1_0=null;
        EObject this_AbstractType_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:2321:2: ( (this_AbstractType_0= ruleAbstractType | ( (lv_void_1_0= 'void' ) ) ) )
            // InternalIdl.g:2322:2: (this_AbstractType_0= ruleAbstractType | ( (lv_void_1_0= 'void' ) ) )
            {
            // InternalIdl.g:2322:2: (this_AbstractType_0= ruleAbstractType | ( (lv_void_1_0= 'void' ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||(LA51_0>=RULE_STRINGTYPE && LA51_0<=RULE_DOUBLE)||LA51_0==39||LA51_0==51) ) {
                alt51=1;
            }
            else if ( (LA51_0==67) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalIdl.g:2323:3: this_AbstractType_0= ruleAbstractType
                    {

                    			newCompositeNode(grammarAccess.getReturnTypeElementAccess().getAbstractTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractType_0=ruleAbstractType();

                    state._fsp--;


                    			current = this_AbstractType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIdl.g:2332:3: ( (lv_void_1_0= 'void' ) )
                    {
                    // InternalIdl.g:2332:3: ( (lv_void_1_0= 'void' ) )
                    // InternalIdl.g:2333:4: (lv_void_1_0= 'void' )
                    {
                    // InternalIdl.g:2333:4: (lv_void_1_0= 'void' )
                    // InternalIdl.g:2334:5: lv_void_1_0= 'void'
                    {
                    lv_void_1_0=(Token)match(input,67,FOLLOW_2); 

                    					newLeafNode(lv_void_1_0, grammarAccess.getReturnTypeElementAccess().getVoidVoidKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReturnTypeElementRule());
                    					}
                    					setWithLastConsumed(current, "void", true, "void");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnTypeElement"


    // $ANTLR start "entryRuleParameterElement"
    // InternalIdl.g:2350:1: entryRuleParameterElement returns [EObject current=null] : iv_ruleParameterElement= ruleParameterElement EOF ;
    public final EObject entryRuleParameterElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterElement = null;


        try {
            // InternalIdl.g:2350:57: (iv_ruleParameterElement= ruleParameterElement EOF )
            // InternalIdl.g:2351:2: iv_ruleParameterElement= ruleParameterElement EOF
            {
             newCompositeNode(grammarAccess.getParameterElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterElement=ruleParameterElement();

            state._fsp--;

             current =iv_ruleParameterElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterElement"


    // $ANTLR start "ruleParameterElement"
    // InternalIdl.g:2357:1: ruleParameterElement returns [EObject current=null] : ( ( (lv_direction_0_0= ruleParameterDirection ) ) ( (lv_paramType_1_0= ruleAbstractType ) ) ( (lv_paramName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterElement() throws RecognitionException {
        EObject current = null;

        Token lv_paramName_2_0=null;
        Enumerator lv_direction_0_0 = null;

        EObject lv_paramType_1_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:2363:2: ( ( ( (lv_direction_0_0= ruleParameterDirection ) ) ( (lv_paramType_1_0= ruleAbstractType ) ) ( (lv_paramName_2_0= RULE_ID ) ) ) )
            // InternalIdl.g:2364:2: ( ( (lv_direction_0_0= ruleParameterDirection ) ) ( (lv_paramType_1_0= ruleAbstractType ) ) ( (lv_paramName_2_0= RULE_ID ) ) )
            {
            // InternalIdl.g:2364:2: ( ( (lv_direction_0_0= ruleParameterDirection ) ) ( (lv_paramType_1_0= ruleAbstractType ) ) ( (lv_paramName_2_0= RULE_ID ) ) )
            // InternalIdl.g:2365:3: ( (lv_direction_0_0= ruleParameterDirection ) ) ( (lv_paramType_1_0= ruleAbstractType ) ) ( (lv_paramName_2_0= RULE_ID ) )
            {
            // InternalIdl.g:2365:3: ( (lv_direction_0_0= ruleParameterDirection ) )
            // InternalIdl.g:2366:4: (lv_direction_0_0= ruleParameterDirection )
            {
            // InternalIdl.g:2366:4: (lv_direction_0_0= ruleParameterDirection )
            // InternalIdl.g:2367:5: lv_direction_0_0= ruleParameterDirection
            {

            					newCompositeNode(grammarAccess.getParameterElementAccess().getDirectionParameterDirectionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_direction_0_0=ruleParameterDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterElementRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_0_0,
            						"com.btc.serviceidl.Idl.ParameterDirection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIdl.g:2384:3: ( (lv_paramType_1_0= ruleAbstractType ) )
            // InternalIdl.g:2385:4: (lv_paramType_1_0= ruleAbstractType )
            {
            // InternalIdl.g:2385:4: (lv_paramType_1_0= ruleAbstractType )
            // InternalIdl.g:2386:5: lv_paramType_1_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getParameterElementAccess().getParamTypeAbstractTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_paramType_1_0=ruleAbstractType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterElementRule());
            					}
            					set(
            						current,
            						"paramType",
            						lv_paramType_1_0,
            						"com.btc.serviceidl.Idl.AbstractType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIdl.g:2403:3: ( (lv_paramName_2_0= RULE_ID ) )
            // InternalIdl.g:2404:4: (lv_paramName_2_0= RULE_ID )
            {
            // InternalIdl.g:2404:4: (lv_paramName_2_0= RULE_ID )
            // InternalIdl.g:2405:5: lv_paramName_2_0= RULE_ID
            {
            lv_paramName_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_paramName_2_0, grammarAccess.getParameterElementAccess().getParamNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"paramName",
            						lv_paramName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterElement"


    // $ANTLR start "entryRuleDocCommentElement"
    // InternalIdl.g:2425:1: entryRuleDocCommentElement returns [EObject current=null] : iv_ruleDocCommentElement= ruleDocCommentElement EOF ;
    public final EObject entryRuleDocCommentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocCommentElement = null;


        try {
            // InternalIdl.g:2425:58: (iv_ruleDocCommentElement= ruleDocCommentElement EOF )
            // InternalIdl.g:2426:2: iv_ruleDocCommentElement= ruleDocCommentElement EOF
            {
             newCompositeNode(grammarAccess.getDocCommentElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocCommentElement=ruleDocCommentElement();

            state._fsp--;

             current =iv_ruleDocCommentElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocCommentElement"


    // $ANTLR start "ruleDocCommentElement"
    // InternalIdl.g:2432:1: ruleDocCommentElement returns [EObject current=null] : ( ( (lv_text_0_1= RULE_SL_DOC_COMMENT | lv_text_0_2= RULE_ML_DOC_COMMENT ) ) ) ;
    public final EObject ruleDocCommentElement() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_1=null;
        Token lv_text_0_2=null;


        	enterRule();

        try {
            // InternalIdl.g:2438:2: ( ( ( (lv_text_0_1= RULE_SL_DOC_COMMENT | lv_text_0_2= RULE_ML_DOC_COMMENT ) ) ) )
            // InternalIdl.g:2439:2: ( ( (lv_text_0_1= RULE_SL_DOC_COMMENT | lv_text_0_2= RULE_ML_DOC_COMMENT ) ) )
            {
            // InternalIdl.g:2439:2: ( ( (lv_text_0_1= RULE_SL_DOC_COMMENT | lv_text_0_2= RULE_ML_DOC_COMMENT ) ) )
            // InternalIdl.g:2440:3: ( (lv_text_0_1= RULE_SL_DOC_COMMENT | lv_text_0_2= RULE_ML_DOC_COMMENT ) )
            {
            // InternalIdl.g:2440:3: ( (lv_text_0_1= RULE_SL_DOC_COMMENT | lv_text_0_2= RULE_ML_DOC_COMMENT ) )
            // InternalIdl.g:2441:4: (lv_text_0_1= RULE_SL_DOC_COMMENT | lv_text_0_2= RULE_ML_DOC_COMMENT )
            {
            // InternalIdl.g:2441:4: (lv_text_0_1= RULE_SL_DOC_COMMENT | lv_text_0_2= RULE_ML_DOC_COMMENT )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_SL_DOC_COMMENT) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ML_DOC_COMMENT) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalIdl.g:2442:5: lv_text_0_1= RULE_SL_DOC_COMMENT
                    {
                    lv_text_0_1=(Token)match(input,RULE_SL_DOC_COMMENT,FOLLOW_2); 

                    					newLeafNode(lv_text_0_1, grammarAccess.getDocCommentElementAccess().getTextSL_DOC_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDocCommentElementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"text",
                    						lv_text_0_1,
                    						"com.btc.serviceidl.Idl.SL_DOC_COMMENT");
                    				

                    }
                    break;
                case 2 :
                    // InternalIdl.g:2457:5: lv_text_0_2= RULE_ML_DOC_COMMENT
                    {
                    lv_text_0_2=(Token)match(input,RULE_ML_DOC_COMMENT,FOLLOW_2); 

                    					newLeafNode(lv_text_0_2, grammarAccess.getDocCommentElementAccess().getTextML_DOC_COMMENTTerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDocCommentElementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"text",
                    						lv_text_0_2,
                    						"com.btc.serviceidl.Idl.ML_DOC_COMMENT");
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocCommentElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalIdl.g:2477:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalIdl.g:2477:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalIdl.g:2478:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalIdl.g:2484:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalIdl.g:2490:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalIdl.g:2491:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalIdl.g:2491:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalIdl.g:2492:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_60); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalIdl.g:2499:3: (kw= '.' this_ID_2= RULE_ID )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==68) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalIdl.g:2500:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,68,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_60); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalIdl.g:2517:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalIdl.g:2517:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalIdl.g:2518:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalIdl.g:2524:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:2530:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalIdl.g:2531:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalIdl.g:2531:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalIdl.g:2532:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_61);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalIdl.g:2542:3: (kw= '.*' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==69) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalIdl.g:2543:4: kw= '.*'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalIdl.g:2553:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalIdl.g:2553:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalIdl.g:2554:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalIdl.g:2560:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_integerType_0_0= ruleIntegerType ) ) | ( (lv_stringType_1_0= RULE_STRINGTYPE ) ) | ( (lv_charType_2_0= RULE_CHAR ) ) | ( (lv_floatingPointType_3_0= ruleFloatingPointType ) ) | ( (lv_uuidType_4_0= RULE_UUID ) ) | ( (lv_booleanType_5_0= RULE_BOOLEAN ) ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_stringType_1_0=null;
        Token lv_charType_2_0=null;
        Token lv_uuidType_4_0=null;
        Token lv_booleanType_5_0=null;
        AntlrDatatypeRuleToken lv_integerType_0_0 = null;

        AntlrDatatypeRuleToken lv_floatingPointType_3_0 = null;



        	enterRule();

        try {
            // InternalIdl.g:2566:2: ( ( ( (lv_integerType_0_0= ruleIntegerType ) ) | ( (lv_stringType_1_0= RULE_STRINGTYPE ) ) | ( (lv_charType_2_0= RULE_CHAR ) ) | ( (lv_floatingPointType_3_0= ruleFloatingPointType ) ) | ( (lv_uuidType_4_0= RULE_UUID ) ) | ( (lv_booleanType_5_0= RULE_BOOLEAN ) ) ) )
            // InternalIdl.g:2567:2: ( ( (lv_integerType_0_0= ruleIntegerType ) ) | ( (lv_stringType_1_0= RULE_STRINGTYPE ) ) | ( (lv_charType_2_0= RULE_CHAR ) ) | ( (lv_floatingPointType_3_0= ruleFloatingPointType ) ) | ( (lv_uuidType_4_0= RULE_UUID ) ) | ( (lv_booleanType_5_0= RULE_BOOLEAN ) ) )
            {
            // InternalIdl.g:2567:2: ( ( (lv_integerType_0_0= ruleIntegerType ) ) | ( (lv_stringType_1_0= RULE_STRINGTYPE ) ) | ( (lv_charType_2_0= RULE_CHAR ) ) | ( (lv_floatingPointType_3_0= ruleFloatingPointType ) ) | ( (lv_uuidType_4_0= RULE_UUID ) ) | ( (lv_booleanType_5_0= RULE_BOOLEAN ) ) )
            int alt55=6;
            switch ( input.LA(1) ) {
            case RULE_BYTE:
            case RULE_INT16:
            case RULE_INT32:
            case RULE_INT64:
                {
                alt55=1;
                }
                break;
            case RULE_STRINGTYPE:
                {
                alt55=2;
                }
                break;
            case RULE_CHAR:
                {
                alt55=3;
                }
                break;
            case RULE_FLOAT:
            case RULE_DOUBLE:
                {
                alt55=4;
                }
                break;
            case RULE_UUID:
                {
                alt55=5;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt55=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalIdl.g:2568:3: ( (lv_integerType_0_0= ruleIntegerType ) )
                    {
                    // InternalIdl.g:2568:3: ( (lv_integerType_0_0= ruleIntegerType ) )
                    // InternalIdl.g:2569:4: (lv_integerType_0_0= ruleIntegerType )
                    {
                    // InternalIdl.g:2569:4: (lv_integerType_0_0= ruleIntegerType )
                    // InternalIdl.g:2570:5: lv_integerType_0_0= ruleIntegerType
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getIntegerTypeIntegerTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_integerType_0_0=ruleIntegerType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					set(
                    						current,
                    						"integerType",
                    						lv_integerType_0_0,
                    						"com.btc.serviceidl.Idl.IntegerType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:2588:3: ( (lv_stringType_1_0= RULE_STRINGTYPE ) )
                    {
                    // InternalIdl.g:2588:3: ( (lv_stringType_1_0= RULE_STRINGTYPE ) )
                    // InternalIdl.g:2589:4: (lv_stringType_1_0= RULE_STRINGTYPE )
                    {
                    // InternalIdl.g:2589:4: (lv_stringType_1_0= RULE_STRINGTYPE )
                    // InternalIdl.g:2590:5: lv_stringType_1_0= RULE_STRINGTYPE
                    {
                    lv_stringType_1_0=(Token)match(input,RULE_STRINGTYPE,FOLLOW_2); 

                    					newLeafNode(lv_stringType_1_0, grammarAccess.getPrimitiveTypeAccess().getStringTypeSTRINGTYPETerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"stringType",
                    						lv_stringType_1_0,
                    						"com.btc.serviceidl.Idl.STRINGTYPE");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIdl.g:2607:3: ( (lv_charType_2_0= RULE_CHAR ) )
                    {
                    // InternalIdl.g:2607:3: ( (lv_charType_2_0= RULE_CHAR ) )
                    // InternalIdl.g:2608:4: (lv_charType_2_0= RULE_CHAR )
                    {
                    // InternalIdl.g:2608:4: (lv_charType_2_0= RULE_CHAR )
                    // InternalIdl.g:2609:5: lv_charType_2_0= RULE_CHAR
                    {
                    lv_charType_2_0=(Token)match(input,RULE_CHAR,FOLLOW_2); 

                    					newLeafNode(lv_charType_2_0, grammarAccess.getPrimitiveTypeAccess().getCharTypeCHARTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"charType",
                    						lv_charType_2_0,
                    						"com.btc.serviceidl.Idl.CHAR");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalIdl.g:2626:3: ( (lv_floatingPointType_3_0= ruleFloatingPointType ) )
                    {
                    // InternalIdl.g:2626:3: ( (lv_floatingPointType_3_0= ruleFloatingPointType ) )
                    // InternalIdl.g:2627:4: (lv_floatingPointType_3_0= ruleFloatingPointType )
                    {
                    // InternalIdl.g:2627:4: (lv_floatingPointType_3_0= ruleFloatingPointType )
                    // InternalIdl.g:2628:5: lv_floatingPointType_3_0= ruleFloatingPointType
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getFloatingPointTypeFloatingPointTypeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_floatingPointType_3_0=ruleFloatingPointType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					set(
                    						current,
                    						"floatingPointType",
                    						lv_floatingPointType_3_0,
                    						"com.btc.serviceidl.Idl.FloatingPointType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalIdl.g:2646:3: ( (lv_uuidType_4_0= RULE_UUID ) )
                    {
                    // InternalIdl.g:2646:3: ( (lv_uuidType_4_0= RULE_UUID ) )
                    // InternalIdl.g:2647:4: (lv_uuidType_4_0= RULE_UUID )
                    {
                    // InternalIdl.g:2647:4: (lv_uuidType_4_0= RULE_UUID )
                    // InternalIdl.g:2648:5: lv_uuidType_4_0= RULE_UUID
                    {
                    lv_uuidType_4_0=(Token)match(input,RULE_UUID,FOLLOW_2); 

                    					newLeafNode(lv_uuidType_4_0, grammarAccess.getPrimitiveTypeAccess().getUuidTypeUUIDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"uuidType",
                    						lv_uuidType_4_0,
                    						"com.btc.serviceidl.Idl.UUID");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalIdl.g:2665:3: ( (lv_booleanType_5_0= RULE_BOOLEAN ) )
                    {
                    // InternalIdl.g:2665:3: ( (lv_booleanType_5_0= RULE_BOOLEAN ) )
                    // InternalIdl.g:2666:4: (lv_booleanType_5_0= RULE_BOOLEAN )
                    {
                    // InternalIdl.g:2666:4: (lv_booleanType_5_0= RULE_BOOLEAN )
                    // InternalIdl.g:2667:5: lv_booleanType_5_0= RULE_BOOLEAN
                    {
                    lv_booleanType_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    					newLeafNode(lv_booleanType_5_0, grammarAccess.getPrimitiveTypeAccess().getBooleanTypeBOOLEANTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"booleanType",
                    						lv_booleanType_5_0,
                    						"com.btc.serviceidl.Idl.BOOLEAN");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalIdl.g:2687:1: entryRuleIntegerType returns [String current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final String entryRuleIntegerType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerType = null;


        try {
            // InternalIdl.g:2687:51: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalIdl.g:2688:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalIdl.g:2694:1: ruleIntegerType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BYTE_0= RULE_BYTE | this_INT16_1= RULE_INT16 | this_INT32_2= RULE_INT32 | this_INT64_3= RULE_INT64 ) ;
    public final AntlrDatatypeRuleToken ruleIntegerType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BYTE_0=null;
        Token this_INT16_1=null;
        Token this_INT32_2=null;
        Token this_INT64_3=null;


        	enterRule();

        try {
            // InternalIdl.g:2700:2: ( (this_BYTE_0= RULE_BYTE | this_INT16_1= RULE_INT16 | this_INT32_2= RULE_INT32 | this_INT64_3= RULE_INT64 ) )
            // InternalIdl.g:2701:2: (this_BYTE_0= RULE_BYTE | this_INT16_1= RULE_INT16 | this_INT32_2= RULE_INT32 | this_INT64_3= RULE_INT64 )
            {
            // InternalIdl.g:2701:2: (this_BYTE_0= RULE_BYTE | this_INT16_1= RULE_INT16 | this_INT32_2= RULE_INT32 | this_INT64_3= RULE_INT64 )
            int alt56=4;
            switch ( input.LA(1) ) {
            case RULE_BYTE:
                {
                alt56=1;
                }
                break;
            case RULE_INT16:
                {
                alt56=2;
                }
                break;
            case RULE_INT32:
                {
                alt56=3;
                }
                break;
            case RULE_INT64:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalIdl.g:2702:3: this_BYTE_0= RULE_BYTE
                    {
                    this_BYTE_0=(Token)match(input,RULE_BYTE,FOLLOW_2); 

                    			current.merge(this_BYTE_0);
                    		

                    			newLeafNode(this_BYTE_0, grammarAccess.getIntegerTypeAccess().getBYTETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIdl.g:2710:3: this_INT16_1= RULE_INT16
                    {
                    this_INT16_1=(Token)match(input,RULE_INT16,FOLLOW_2); 

                    			current.merge(this_INT16_1);
                    		

                    			newLeafNode(this_INT16_1, grammarAccess.getIntegerTypeAccess().getINT16TerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalIdl.g:2718:3: this_INT32_2= RULE_INT32
                    {
                    this_INT32_2=(Token)match(input,RULE_INT32,FOLLOW_2); 

                    			current.merge(this_INT32_2);
                    		

                    			newLeafNode(this_INT32_2, grammarAccess.getIntegerTypeAccess().getINT32TerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalIdl.g:2726:3: this_INT64_3= RULE_INT64
                    {
                    this_INT64_3=(Token)match(input,RULE_INT64,FOLLOW_2); 

                    			current.merge(this_INT64_3);
                    		

                    			newLeafNode(this_INT64_3, grammarAccess.getIntegerTypeAccess().getINT64TerminalRuleCall_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleFloatingPointType"
    // InternalIdl.g:2737:1: entryRuleFloatingPointType returns [String current=null] : iv_ruleFloatingPointType= ruleFloatingPointType EOF ;
    public final String entryRuleFloatingPointType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointType = null;


        try {
            // InternalIdl.g:2737:57: (iv_ruleFloatingPointType= ruleFloatingPointType EOF )
            // InternalIdl.g:2738:2: iv_ruleFloatingPointType= ruleFloatingPointType EOF
            {
             newCompositeNode(grammarAccess.getFloatingPointTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatingPointType=ruleFloatingPointType();

            state._fsp--;

             current =iv_ruleFloatingPointType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatingPointType"


    // $ANTLR start "ruleFloatingPointType"
    // InternalIdl.g:2744:1: ruleFloatingPointType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_0= RULE_FLOAT | this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleFloatingPointType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_0=null;
        Token this_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalIdl.g:2750:2: ( (this_FLOAT_0= RULE_FLOAT | this_DOUBLE_1= RULE_DOUBLE ) )
            // InternalIdl.g:2751:2: (this_FLOAT_0= RULE_FLOAT | this_DOUBLE_1= RULE_DOUBLE )
            {
            // InternalIdl.g:2751:2: (this_FLOAT_0= RULE_FLOAT | this_DOUBLE_1= RULE_DOUBLE )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_FLOAT) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_DOUBLE) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalIdl.g:2752:3: this_FLOAT_0= RULE_FLOAT
                    {
                    this_FLOAT_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    			current.merge(this_FLOAT_0);
                    		

                    			newLeafNode(this_FLOAT_0, grammarAccess.getFloatingPointTypeAccess().getFLOATTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIdl.g:2760:3: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_1);
                    		

                    			newLeafNode(this_DOUBLE_1, grammarAccess.getFloatingPointTypeAccess().getDOUBLETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatingPointType"


    // $ANTLR start "ruleParameterDirection"
    // InternalIdl.g:2771:1: ruleParameterDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleParameterDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIdl.g:2777:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalIdl.g:2778:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalIdl.g:2778:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==70) ) {
                alt58=1;
            }
            else if ( (LA58_0==71) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalIdl.g:2779:3: (enumLiteral_0= 'in' )
                    {
                    // InternalIdl.g:2779:3: (enumLiteral_0= 'in' )
                    // InternalIdl.g:2780:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getParameterDirectionAccess().getPARAM_INEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterDirectionAccess().getPARAM_INEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIdl.g:2787:3: (enumLiteral_1= 'out' )
                    {
                    // InternalIdl.g:2787:3: (enumLiteral_1= 'out' )
                    // InternalIdl.g:2788:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getParameterDirectionAccess().getPARAM_OUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParameterDirectionAccess().getPARAM_OUTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDirection"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00D00032B8000600L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000B8000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00280080801FF810L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00280080001FF810L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00280280001FF810L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000204000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00F800B2801FFE10L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00C0000000000600L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100840000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0300200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0CF800B2801FFE10L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0C00000000000610L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000004000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x80280080001FF810L,0x0000000000000008L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000100000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1000100000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x20280080001FF810L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});

}
