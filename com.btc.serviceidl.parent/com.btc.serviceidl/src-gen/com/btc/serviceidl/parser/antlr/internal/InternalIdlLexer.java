package com.btc.serviceidl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIdlLexer extends Lexer {
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

    public InternalIdlLexer() {;} 
    public InternalIdlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalIdlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalIdl.g"; }

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:11:7: ( 'import' )
            // InternalIdl.g:11:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:12:7: ( 'virtual' )
            // InternalIdl.g:12:9: 'virtual'
            {
            match("virtual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:13:7: ( 'main' )
            // InternalIdl.g:13:9: 'main'
            {
            match("main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:14:7: ( 'module' )
            // InternalIdl.g:14:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:15:7: ( '{' )
            // InternalIdl.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:16:7: ( '}' )
            // InternalIdl.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:17:7: ( ';' )
            // InternalIdl.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:18:7: ( 'exception' )
            // InternalIdl.g:18:9: 'exception'
            {
            match("exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:19:7: ( 'ref' )
            // InternalIdl.g:19:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:20:7: ( ':' )
            // InternalIdl.g:20:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:21:7: ( 'typedef' )
            // InternalIdl.g:21:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:22:7: ( 'enum' )
            // InternalIdl.g:22:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:23:7: ( ',' )
            // InternalIdl.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:24:7: ( 'sequence' )
            // InternalIdl.g:24:9: 'sequence'
            {
            match("sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:25:7: ( '<' )
            // InternalIdl.g:25:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:26:7: ( 'failable' )
            // InternalIdl.g:26:9: 'failable'
            {
            match("failable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:27:7: ( 'raises' )
            // InternalIdl.g:27:9: 'raises'
            {
            match("raises"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:28:7: ( '>' )
            // InternalIdl.g:28:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:29:7: ( '[' )
            // InternalIdl.g:29:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:30:7: ( ']' )
            // InternalIdl.g:30:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:31:7: ( 'typical' )
            // InternalIdl.g:31:9: 'typical'
            {
            match("typical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:32:7: ( 'length' )
            // InternalIdl.g:32:9: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:33:7: ( '=' )
            // InternalIdl.g:33:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:34:7: ( 'element' )
            // InternalIdl.g:34:9: 'element'
            {
            match("element"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:35:7: ( 'size' )
            // InternalIdl.g:35:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:36:7: ( 'tuple' )
            // InternalIdl.g:36:9: 'tuple'
            {
            match("tuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:37:7: ( 'struct' )
            // InternalIdl.g:37:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:38:7: ( 'optional' )
            // InternalIdl.g:38:9: 'optional'
            {
            match("optional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:39:7: ( 'abstract' )
            // InternalIdl.g:39:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:40:7: ( 'interface' )
            // InternalIdl.g:40:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:41:7: ( 'version' )
            // InternalIdl.g:41:9: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:42:7: ( 'guid' )
            // InternalIdl.g:42:9: 'guid'
            {
            match("guid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:43:7: ( 'sync' )
            // InternalIdl.g:43:9: 'sync'
            {
            match("sync"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:44:7: ( 'query' )
            // InternalIdl.g:44:9: 'query'
            {
            match("query"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:45:7: ( '(' )
            // InternalIdl.g:45:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:46:7: ( ')' )
            // InternalIdl.g:46:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:47:7: ( 'returns' )
            // InternalIdl.g:47:9: 'returns'
            {
            match("returns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:48:7: ( 'injectable' )
            // InternalIdl.g:48:9: 'injectable'
            {
            match("injectable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:49:7: ( 'event' )
            // InternalIdl.g:49:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:50:7: ( 'subscribe' )
            // InternalIdl.g:50:9: 'subscribe'
            {
            match("subscribe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:51:7: ( 'with' )
            // InternalIdl.g:51:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:52:7: ( 'void' )
            // InternalIdl.g:52:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:53:7: ( '.' )
            // InternalIdl.g:53:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:54:7: ( '.*' )
            // InternalIdl.g:54:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:55:7: ( 'in' )
            // InternalIdl.g:55:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:56:7: ( 'out' )
            // InternalIdl.g:56:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "RULE_BYTE"
    public final void mRULE_BYTE() throws RecognitionException {
        try {
            int _type = RULE_BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2797:11: ( 'byte' )
            // InternalIdl.g:2797:13: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BYTE"

    // $ANTLR start "RULE_INT16"
    public final void mRULE_INT16() throws RecognitionException {
        try {
            int _type = RULE_INT16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2799:12: ( 'int16' )
            // InternalIdl.g:2799:14: 'int16'
            {
            match("int16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT16"

    // $ANTLR start "RULE_INT32"
    public final void mRULE_INT32() throws RecognitionException {
        try {
            int _type = RULE_INT32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2801:12: ( 'int32' )
            // InternalIdl.g:2801:14: 'int32'
            {
            match("int32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT32"

    // $ANTLR start "RULE_INT64"
    public final void mRULE_INT64() throws RecognitionException {
        try {
            int _type = RULE_INT64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2803:12: ( 'int64' )
            // InternalIdl.g:2803:14: 'int64'
            {
            match("int64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT64"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2805:11: ( 'char' )
            // InternalIdl.g:2805:13: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_STRINGTYPE"
    public final void mRULE_STRINGTYPE() throws RecognitionException {
        try {
            int _type = RULE_STRINGTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2807:17: ( 'string' )
            // InternalIdl.g:2807:19: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRINGTYPE"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2809:12: ( 'float' )
            // InternalIdl.g:2809:14: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2811:13: ( 'double' )
            // InternalIdl.g:2811:15: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2813:14: ( 'boolean' )
            // InternalIdl.g:2813:16: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_UUID"
    public final void mRULE_UUID() throws RecognitionException {
        try {
            int _type = RULE_UUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2815:11: ( 'uuid' )
            // InternalIdl.g:2815:13: 'uuid'
            {
            match("uuid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UUID"

    // $ANTLR start "RULE_VERSION"
    public final void mRULE_VERSION() throws RecognitionException {
        try {
            int _type = RULE_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2817:14: ( RULE_INT '.' RULE_INT '.' RULE_INT )
            // InternalIdl.g:2817:16: RULE_INT '.' RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERSION"

    // $ANTLR start "RULE_UUID_LITERAL"
    public final void mRULE_UUID_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_UUID_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2819:19: ( RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX '-' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '-' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '-' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '-' RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX )
            // InternalIdl.g:2819:21: RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX '-' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '-' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '-' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '-' RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX RULE_HEX
            {
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            match('-'); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            match('-'); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            match('-'); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            match('-'); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UUID_LITERAL"

    // $ANTLR start "RULE_ML_DOC_COMMENT"
    public final void mRULE_ML_DOC_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_DOC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2821:21: ( '<#' ( options {greedy=false; } : . )* '#>' )
            // InternalIdl.g:2821:23: '<#' ( options {greedy=false; } : . )* '#>'
            {
            match("<#"); 

            // InternalIdl.g:2821:28: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='#') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='>') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='=')||(LA1_1>='?' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\"')||(LA1_0>='$' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIdl.g:2821:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("#>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_DOC_COMMENT"

    // $ANTLR start "RULE_SL_DOC_COMMENT"
    public final void mRULE_SL_DOC_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_DOC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2823:21: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalIdl.g:2823:23: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalIdl.g:2823:27: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIdl.g:2823:27: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalIdl.g:2823:43: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIdl.g:2823:44: ( '\\r' )? '\\n'
                    {
                    // InternalIdl.g:2823:44: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalIdl.g:2823:44: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_DOC_COMMENT"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            // InternalIdl.g:2825:19: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalIdl.g:2825:21: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2827:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalIdl.g:2827:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalIdl.g:2827:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIdl.g:2827:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalIdl.g:2827:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIdl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2829:10: ( ( '0' .. '9' )+ )
            // InternalIdl.g:2829:12: ( '0' .. '9' )+
            {
            // InternalIdl.g:2829:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIdl.g:2829:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2831:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalIdl.g:2831:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalIdl.g:2831:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalIdl.g:2831:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalIdl.g:2831:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalIdl.g:2831:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIdl.g:2831:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalIdl.g:2831:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalIdl.g:2831:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalIdl.g:2831:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIdl.g:2831:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2833:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalIdl.g:2833:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalIdl.g:2833:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIdl.g:2833:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2835:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalIdl.g:2835:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalIdl.g:2835:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIdl.g:2835:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalIdl.g:2835:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIdl.g:2835:41: ( '\\r' )? '\\n'
                    {
                    // InternalIdl.g:2835:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalIdl.g:2835:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2837:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalIdl.g:2837:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalIdl.g:2837:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIdl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIdl.g:2839:16: ( . )
            // InternalIdl.g:2839:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalIdl.g:1:8: ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | RULE_BYTE | RULE_INT16 | RULE_INT32 | RULE_INT64 | RULE_CHAR | RULE_STRINGTYPE | RULE_FLOAT | RULE_DOUBLE | RULE_BOOLEAN | RULE_UUID | RULE_VERSION | RULE_UUID_LITERAL | RULE_ML_DOC_COMMENT | RULE_SL_DOC_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=67;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalIdl.g:1:10: T__26
                {
                mT__26(); 

                }
                break;
            case 2 :
                // InternalIdl.g:1:16: T__27
                {
                mT__27(); 

                }
                break;
            case 3 :
                // InternalIdl.g:1:22: T__28
                {
                mT__28(); 

                }
                break;
            case 4 :
                // InternalIdl.g:1:28: T__29
                {
                mT__29(); 

                }
                break;
            case 5 :
                // InternalIdl.g:1:34: T__30
                {
                mT__30(); 

                }
                break;
            case 6 :
                // InternalIdl.g:1:40: T__31
                {
                mT__31(); 

                }
                break;
            case 7 :
                // InternalIdl.g:1:46: T__32
                {
                mT__32(); 

                }
                break;
            case 8 :
                // InternalIdl.g:1:52: T__33
                {
                mT__33(); 

                }
                break;
            case 9 :
                // InternalIdl.g:1:58: T__34
                {
                mT__34(); 

                }
                break;
            case 10 :
                // InternalIdl.g:1:64: T__35
                {
                mT__35(); 

                }
                break;
            case 11 :
                // InternalIdl.g:1:70: T__36
                {
                mT__36(); 

                }
                break;
            case 12 :
                // InternalIdl.g:1:76: T__37
                {
                mT__37(); 

                }
                break;
            case 13 :
                // InternalIdl.g:1:82: T__38
                {
                mT__38(); 

                }
                break;
            case 14 :
                // InternalIdl.g:1:88: T__39
                {
                mT__39(); 

                }
                break;
            case 15 :
                // InternalIdl.g:1:94: T__40
                {
                mT__40(); 

                }
                break;
            case 16 :
                // InternalIdl.g:1:100: T__41
                {
                mT__41(); 

                }
                break;
            case 17 :
                // InternalIdl.g:1:106: T__42
                {
                mT__42(); 

                }
                break;
            case 18 :
                // InternalIdl.g:1:112: T__43
                {
                mT__43(); 

                }
                break;
            case 19 :
                // InternalIdl.g:1:118: T__44
                {
                mT__44(); 

                }
                break;
            case 20 :
                // InternalIdl.g:1:124: T__45
                {
                mT__45(); 

                }
                break;
            case 21 :
                // InternalIdl.g:1:130: T__46
                {
                mT__46(); 

                }
                break;
            case 22 :
                // InternalIdl.g:1:136: T__47
                {
                mT__47(); 

                }
                break;
            case 23 :
                // InternalIdl.g:1:142: T__48
                {
                mT__48(); 

                }
                break;
            case 24 :
                // InternalIdl.g:1:148: T__49
                {
                mT__49(); 

                }
                break;
            case 25 :
                // InternalIdl.g:1:154: T__50
                {
                mT__50(); 

                }
                break;
            case 26 :
                // InternalIdl.g:1:160: T__51
                {
                mT__51(); 

                }
                break;
            case 27 :
                // InternalIdl.g:1:166: T__52
                {
                mT__52(); 

                }
                break;
            case 28 :
                // InternalIdl.g:1:172: T__53
                {
                mT__53(); 

                }
                break;
            case 29 :
                // InternalIdl.g:1:178: T__54
                {
                mT__54(); 

                }
                break;
            case 30 :
                // InternalIdl.g:1:184: T__55
                {
                mT__55(); 

                }
                break;
            case 31 :
                // InternalIdl.g:1:190: T__56
                {
                mT__56(); 

                }
                break;
            case 32 :
                // InternalIdl.g:1:196: T__57
                {
                mT__57(); 

                }
                break;
            case 33 :
                // InternalIdl.g:1:202: T__58
                {
                mT__58(); 

                }
                break;
            case 34 :
                // InternalIdl.g:1:208: T__59
                {
                mT__59(); 

                }
                break;
            case 35 :
                // InternalIdl.g:1:214: T__60
                {
                mT__60(); 

                }
                break;
            case 36 :
                // InternalIdl.g:1:220: T__61
                {
                mT__61(); 

                }
                break;
            case 37 :
                // InternalIdl.g:1:226: T__62
                {
                mT__62(); 

                }
                break;
            case 38 :
                // InternalIdl.g:1:232: T__63
                {
                mT__63(); 

                }
                break;
            case 39 :
                // InternalIdl.g:1:238: T__64
                {
                mT__64(); 

                }
                break;
            case 40 :
                // InternalIdl.g:1:244: T__65
                {
                mT__65(); 

                }
                break;
            case 41 :
                // InternalIdl.g:1:250: T__66
                {
                mT__66(); 

                }
                break;
            case 42 :
                // InternalIdl.g:1:256: T__67
                {
                mT__67(); 

                }
                break;
            case 43 :
                // InternalIdl.g:1:262: T__68
                {
                mT__68(); 

                }
                break;
            case 44 :
                // InternalIdl.g:1:268: T__69
                {
                mT__69(); 

                }
                break;
            case 45 :
                // InternalIdl.g:1:274: T__70
                {
                mT__70(); 

                }
                break;
            case 46 :
                // InternalIdl.g:1:280: T__71
                {
                mT__71(); 

                }
                break;
            case 47 :
                // InternalIdl.g:1:286: RULE_BYTE
                {
                mRULE_BYTE(); 

                }
                break;
            case 48 :
                // InternalIdl.g:1:296: RULE_INT16
                {
                mRULE_INT16(); 

                }
                break;
            case 49 :
                // InternalIdl.g:1:307: RULE_INT32
                {
                mRULE_INT32(); 

                }
                break;
            case 50 :
                // InternalIdl.g:1:318: RULE_INT64
                {
                mRULE_INT64(); 

                }
                break;
            case 51 :
                // InternalIdl.g:1:329: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 52 :
                // InternalIdl.g:1:339: RULE_STRINGTYPE
                {
                mRULE_STRINGTYPE(); 

                }
                break;
            case 53 :
                // InternalIdl.g:1:355: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 54 :
                // InternalIdl.g:1:366: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 55 :
                // InternalIdl.g:1:378: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 56 :
                // InternalIdl.g:1:391: RULE_UUID
                {
                mRULE_UUID(); 

                }
                break;
            case 57 :
                // InternalIdl.g:1:401: RULE_VERSION
                {
                mRULE_VERSION(); 

                }
                break;
            case 58 :
                // InternalIdl.g:1:414: RULE_UUID_LITERAL
                {
                mRULE_UUID_LITERAL(); 

                }
                break;
            case 59 :
                // InternalIdl.g:1:432: RULE_ML_DOC_COMMENT
                {
                mRULE_ML_DOC_COMMENT(); 

                }
                break;
            case 60 :
                // InternalIdl.g:1:452: RULE_SL_DOC_COMMENT
                {
                mRULE_SL_DOC_COMMENT(); 

                }
                break;
            case 61 :
                // InternalIdl.g:1:472: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 62 :
                // InternalIdl.g:1:480: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 63 :
                // InternalIdl.g:1:489: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 64 :
                // InternalIdl.g:1:501: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 65 :
                // InternalIdl.g:1:517: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 66 :
                // InternalIdl.g:1:533: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 67 :
                // InternalIdl.g:1:541: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\3\54\3\uffff\2\54\1\uffff\1\54\1\uffff\1\54\1\106\1\54\3\uffff\1\54\1\uffff\4\54\2\uffff\1\54\1\127\4\54\1\135\1\54\1\uffff\1\51\1\uffff\3\51\2\uffff\1\54\1\151\1\uffff\5\54\3\uffff\7\54\1\uffff\2\54\1\uffff\5\54\2\uffff\2\54\3\uffff\1\54\1\uffff\5\54\2\uffff\1\54\2\uffff\5\54\2\uffff\1\135\6\uffff\3\54\1\uffff\12\54\1\u009d\15\54\1\u00ad\11\54\1\135\10\54\1\u00c0\1\u00c1\2\54\1\u00c4\3\54\1\uffff\6\54\1\u00ce\2\54\1\u00d1\5\54\1\uffff\1\54\1\u00d8\1\54\1\u00da\1\u00db\1\54\1\u00dd\1\54\1\u00df\1\135\2\54\1\u00e3\1\u00e4\1\u00e5\3\54\2\uffff\2\54\1\uffff\1\54\1\u00ec\5\54\1\u00f2\1\54\1\uffff\2\54\1\uffff\2\54\1\u00f8\3\54\1\uffff\1\u00fc\2\uffff\1\54\1\uffff\1\54\1\uffff\1\135\1\u0100\1\54\3\uffff\3\54\1\u0105\2\54\1\uffff\2\54\1\u010a\2\54\1\uffff\1\54\1\u010e\1\u010f\2\54\1\uffff\1\u0112\2\54\1\uffff\1\54\1\u0116\1\135\1\uffff\2\54\1\u011a\1\u011b\1\uffff\1\54\1\u011d\1\54\1\u011f\1\uffff\1\u0120\1\u0121\1\54\2\uffff\2\54\1\uffff\2\54\1\u0127\1\uffff\1\135\2\54\2\uffff\1\54\1\uffff\1\54\3\uffff\1\u012c\1\54\1\u012e\1\u012f\1\u0130\1\uffff\1\135\1\u0132\1\54\1\u0134\1\uffff\1\u0135\3\uffff\1\135\1\uffff\1\u0136\3\uffff";
    static final String DFA16_eofS =
        "\u0137\uffff";
    static final String DFA16_minS =
        "\1\0\1\155\1\145\1\141\3\uffff\1\60\1\141\1\uffff\1\165\1\uffff\1\145\1\43\1\60\3\uffff\1\145\1\uffff\1\160\1\60\2\165\2\uffff\1\151\1\52\3\60\1\165\1\56\1\60\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\160\1\60\1\uffff\2\162\2\151\1\144\3\uffff\1\143\1\165\2\145\1\60\1\146\1\151\1\uffff\2\160\1\uffff\1\161\1\172\1\162\1\156\1\142\2\uffff\1\60\1\157\3\uffff\1\156\1\uffff\2\164\1\60\1\151\1\145\2\uffff\1\164\2\uffff\1\164\1\157\1\141\1\165\1\151\2\uffff\1\56\6\uffff\1\157\1\61\1\145\1\uffff\1\164\1\163\1\144\1\156\1\165\1\145\2\155\1\156\2\60\1\165\1\163\1\145\1\154\1\165\1\145\1\151\1\143\1\163\1\154\1\141\1\147\1\151\1\60\1\164\1\144\1\162\1\150\1\145\1\154\1\162\1\142\1\144\1\56\2\162\1\66\1\62\1\64\1\143\1\165\1\151\2\60\1\154\1\160\1\60\1\145\1\164\1\60\1\uffff\1\162\1\145\1\144\1\143\2\145\1\60\1\143\1\156\1\60\1\143\1\141\2\164\1\157\1\uffff\1\162\1\60\1\171\2\60\1\145\1\60\1\154\1\60\1\56\1\164\1\146\3\60\1\164\1\141\1\157\2\uffff\1\145\1\164\1\uffff\1\156\2\60\1\156\1\163\1\145\1\141\1\60\1\156\1\uffff\1\164\1\147\1\uffff\1\162\1\142\1\60\1\150\1\156\1\141\1\uffff\1\60\2\uffff\1\141\1\uffff\1\145\1\uffff\1\56\1\60\1\141\3\uffff\1\141\1\154\1\156\1\60\1\151\1\164\1\uffff\1\60\1\163\1\60\1\146\1\154\1\uffff\1\143\2\60\1\151\1\154\1\uffff\1\60\1\141\1\143\1\uffff\1\156\1\60\1\56\1\uffff\1\143\1\142\2\60\1\uffff\1\157\3\60\1\uffff\2\60\1\145\2\uffff\1\142\1\145\1\uffff\1\154\1\164\1\60\1\uffff\1\56\1\145\1\154\2\uffff\1\156\1\uffff\1\55\3\uffff\1\60\1\145\3\60\1\uffff\1\55\1\60\1\145\1\60\1\uffff\1\60\3\uffff\1\56\1\uffff\1\60\3\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\156\2\157\3\uffff\1\170\1\145\1\uffff\1\171\1\uffff\1\171\1\43\1\154\3\uffff\1\145\1\uffff\1\165\1\146\2\165\2\uffff\1\151\1\52\1\171\1\150\1\157\1\165\2\146\1\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\160\1\172\1\uffff\2\162\2\151\1\144\3\uffff\1\143\1\165\2\145\1\146\1\164\1\151\1\uffff\2\160\1\uffff\1\161\1\172\1\162\1\156\1\142\2\uffff\1\151\1\157\3\uffff\1\156\1\uffff\2\164\1\163\1\151\1\145\2\uffff\1\164\2\uffff\1\164\1\157\1\141\1\165\1\151\2\uffff\1\146\6\uffff\1\157\2\145\1\uffff\1\164\1\163\1\144\1\156\1\165\1\145\2\155\1\156\1\146\1\172\1\165\1\163\1\151\1\154\1\165\1\145\1\165\1\143\1\163\1\154\1\141\1\147\1\151\1\172\1\164\1\144\1\162\1\150\1\145\1\154\1\162\1\142\1\144\1\146\2\162\1\66\1\62\1\64\1\143\1\165\1\151\2\172\1\154\1\160\1\172\1\145\1\164\1\146\1\uffff\1\162\1\145\1\144\1\143\2\145\1\172\1\143\1\156\1\172\1\143\1\141\2\164\1\157\1\uffff\1\162\1\172\1\171\2\172\1\145\1\172\1\154\1\172\1\146\1\164\1\146\3\172\1\164\1\141\1\157\2\uffff\1\145\1\164\1\uffff\1\156\1\172\1\146\1\156\1\163\1\145\1\141\1\172\1\156\1\uffff\1\164\1\147\1\uffff\1\162\1\142\1\172\1\150\1\156\1\141\1\uffff\1\172\2\uffff\1\141\1\uffff\1\145\1\uffff\1\146\1\172\1\141\3\uffff\1\141\1\154\1\156\1\172\1\151\1\164\1\uffff\1\146\1\163\1\172\1\146\1\154\1\uffff\1\143\2\172\1\151\1\154\1\uffff\1\172\1\141\1\143\1\uffff\1\156\1\172\1\146\1\uffff\1\143\1\142\2\172\1\uffff\1\157\1\172\1\146\1\172\1\uffff\2\172\1\145\2\uffff\1\142\1\145\1\uffff\1\154\1\164\1\172\1\uffff\1\146\1\145\1\154\2\uffff\1\156\1\uffff\1\55\3\uffff\1\172\1\145\3\172\1\uffff\1\71\1\172\1\145\1\172\1\uffff\1\172\3\uffff\1\71\1\uffff\1\172\3\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\5\1\6\1\7\2\uffff\1\12\1\uffff\1\15\3\uffff\1\22\1\23\1\24\1\uffff\1\27\4\uffff\1\43\1\44\10\uffff\1\74\1\uffff\1\75\3\uffff\1\102\1\103\2\uffff\1\75\5\uffff\1\5\1\6\1\7\7\uffff\1\12\2\uffff\1\15\5\uffff\1\73\1\17\2\uffff\1\22\1\23\1\24\1\uffff\1\27\5\uffff\1\43\1\44\1\uffff\1\54\1\53\5\uffff\1\76\1\71\1\uffff\1\72\1\74\1\77\1\100\1\101\1\102\3\uffff\1\55\63\uffff\1\11\17\uffff\1\56\22\uffff\1\52\1\3\2\uffff\1\14\11\uffff\1\31\2\uffff\1\41\6\uffff\1\40\1\uffff\1\51\1\57\1\uffff\1\63\1\uffff\1\70\3\uffff\1\60\1\61\1\62\6\uffff\1\47\5\uffff\1\32\5\uffff\1\65\3\uffff\1\42\3\uffff\1\1\4\uffff\1\4\4\uffff\1\21\3\uffff\1\33\1\64\2\uffff\1\26\3\uffff\1\66\3\uffff\1\2\1\37\1\uffff\1\30\1\uffff\1\45\1\13\1\25\5\uffff\1\67\4\uffff\1\16\1\uffff\1\20\1\34\1\35\1\uffff\1\36\1\uffff\1\10\1\50\1\46";
    static final String DFA16_specialS =
        "\1\2\44\uffff\1\0\1\1\u0110\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\51\1\45\1\42\3\51\1\46\1\30\1\31\2\51\1\13\1\51\1\33\1\47\12\40\1\11\1\6\1\15\1\23\1\17\2\51\6\41\24\44\1\20\1\51\1\21\1\43\1\44\1\51\1\25\1\34\1\35\1\36\1\7\1\16\1\26\1\44\1\1\2\44\1\22\1\3\1\44\1\24\1\44\1\27\1\10\1\14\1\12\1\37\1\2\1\32\3\44\1\4\1\51\1\5\uff82\51",
            "\1\52\1\53",
            "\1\56\3\uffff\1\55\5\uffff\1\57",
            "\1\60\15\uffff\1\61",
            "",
            "",
            "",
            "\12\71\7\uffff\6\71\32\uffff\6\71\5\uffff\1\67\1\uffff\1\66\7\uffff\1\70\1\uffff\1\65",
            "\1\73\3\uffff\1\72",
            "",
            "\1\76\3\uffff\1\75",
            "",
            "\1\100\3\uffff\1\101\12\uffff\1\102\1\104\3\uffff\1\103",
            "\1\105",
            "\12\71\7\uffff\6\71\32\uffff\1\107\5\71\5\uffff\1\110",
            "",
            "",
            "",
            "\1\114",
            "",
            "\1\116\4\uffff\1\117",
            "\12\71\7\uffff\6\71\32\uffff\1\71\1\120\4\71",
            "\1\121",
            "\1\122",
            "",
            "",
            "\1\125",
            "\1\126",
            "\12\71\7\uffff\6\71\32\uffff\6\71\10\uffff\1\131\11\uffff\1\130",
            "\12\71\7\uffff\6\71\32\uffff\6\71\1\uffff\1\132",
            "\12\71\7\uffff\6\71\32\uffff\6\71\10\uffff\1\133",
            "\1\134",
            "\1\136\1\uffff\12\137\7\uffff\6\140\32\uffff\6\140",
            "\12\71\7\uffff\6\71\32\uffff\6\71",
            "",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\0\142",
            "\0\142",
            "\1\143\4\uffff\1\144",
            "",
            "",
            "\1\146",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\11\54\1\150\11\54\1\147\6\54",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\12\163\7\uffff\6\163\32\uffff\6\163",
            "\1\164\15\uffff\1\165",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "",
            "\12\163\7\uffff\6\163\32\uffff\6\163\2\uffff\1\176",
            "\1\177",
            "",
            "",
            "",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\12\163\7\uffff\6\163\32\uffff\6\163\14\uffff\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "",
            "\1\u0086",
            "",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "\1\136\1\uffff\12\u008c\7\uffff\6\140\32\uffff\6\140",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008d",
            "\1\u008f\1\uffff\1\u0090\2\uffff\1\u0091\56\uffff\1\u008e",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\u009c\7\uffff\6\u009c\32\uffff\6\u009c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a6\13\uffff\1\u00a5",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\136\1\uffff\12\u00b7\7\uffff\6\140\32\uffff\6\140",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00c2",
            "\1\u00c3",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00c5",
            "\1\u00c6",
            "\12\u00c7\7\uffff\6\u00c7\32\uffff\6\u00c7",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00cf",
            "\1\u00d0",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00d9",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00dc",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00de",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\136\1\uffff\12\u00e0\7\uffff\6\140\32\uffff\6\140",
            "\1\u00e1",
            "\1\u00e2",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\u00ed\7\uffff\6\u00ed\32\uffff\6\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "",
            "\1\136\1\uffff\12\u00ff\7\uffff\6\140\32\uffff\6\140",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0101",
            "",
            "",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0106",
            "\1\u0107",
            "",
            "\12\u0108\7\uffff\6\u0108\32\uffff\6\u0108",
            "\1\u0109",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u010b",
            "\1\u010c",
            "",
            "\1\u010d",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0110",
            "\1\u0111",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\136\1\uffff\12\u0117\7\uffff\6\140\32\uffff\6\140",
            "",
            "\1\u0118",
            "\1\u0119",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u011c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\u011e\7\uffff\6\u011e\32\uffff\6\u011e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0122",
            "",
            "",
            "\1\u0123",
            "\1\u0124",
            "",
            "\1\u0125",
            "\1\u0126",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\136\1\uffff\12\u0128\7\uffff\6\140\32\uffff\6\140",
            "\1\u0129",
            "\1\u012a",
            "",
            "",
            "\1\u012b",
            "",
            "\1\140",
            "",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u012d",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\140\1\136\1\uffff\12\u0131",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0133",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "\1\136\1\uffff\12\u0131",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | RULE_BYTE | RULE_INT16 | RULE_INT32 | RULE_INT64 | RULE_CHAR | RULE_STRINGTYPE | RULE_FLOAT | RULE_DOUBLE | RULE_BOOLEAN | RULE_UUID | RULE_VERSION | RULE_UUID_LITERAL | RULE_ML_DOC_COMMENT | RULE_SL_DOC_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_37 = input.LA(1);

                        s = -1;
                        if ( ((LA16_37>='\u0000' && LA16_37<='\uFFFF')) ) {s = 98;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_38 = input.LA(1);

                        s = -1;
                        if ( ((LA16_38>='\u0000' && LA16_38<='\uFFFF')) ) {s = 98;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='i') ) {s = 1;}

                        else if ( (LA16_0=='v') ) {s = 2;}

                        else if ( (LA16_0=='m') ) {s = 3;}

                        else if ( (LA16_0=='{') ) {s = 4;}

                        else if ( (LA16_0=='}') ) {s = 5;}

                        else if ( (LA16_0==';') ) {s = 6;}

                        else if ( (LA16_0=='e') ) {s = 7;}

                        else if ( (LA16_0=='r') ) {s = 8;}

                        else if ( (LA16_0==':') ) {s = 9;}

                        else if ( (LA16_0=='t') ) {s = 10;}

                        else if ( (LA16_0==',') ) {s = 11;}

                        else if ( (LA16_0=='s') ) {s = 12;}

                        else if ( (LA16_0=='<') ) {s = 13;}

                        else if ( (LA16_0=='f') ) {s = 14;}

                        else if ( (LA16_0=='>') ) {s = 15;}

                        else if ( (LA16_0=='[') ) {s = 16;}

                        else if ( (LA16_0==']') ) {s = 17;}

                        else if ( (LA16_0=='l') ) {s = 18;}

                        else if ( (LA16_0=='=') ) {s = 19;}

                        else if ( (LA16_0=='o') ) {s = 20;}

                        else if ( (LA16_0=='a') ) {s = 21;}

                        else if ( (LA16_0=='g') ) {s = 22;}

                        else if ( (LA16_0=='q') ) {s = 23;}

                        else if ( (LA16_0=='(') ) {s = 24;}

                        else if ( (LA16_0==')') ) {s = 25;}

                        else if ( (LA16_0=='w') ) {s = 26;}

                        else if ( (LA16_0=='.') ) {s = 27;}

                        else if ( (LA16_0=='b') ) {s = 28;}

                        else if ( (LA16_0=='c') ) {s = 29;}

                        else if ( (LA16_0=='d') ) {s = 30;}

                        else if ( (LA16_0=='u') ) {s = 31;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 32;}

                        else if ( ((LA16_0>='A' && LA16_0<='F')) ) {s = 33;}

                        else if ( (LA16_0=='#') ) {s = 34;}

                        else if ( (LA16_0=='^') ) {s = 35;}

                        else if ( ((LA16_0>='G' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='h'||(LA16_0>='j' && LA16_0<='k')||LA16_0=='n'||LA16_0=='p'||(LA16_0>='x' && LA16_0<='z')) ) {s = 36;}

                        else if ( (LA16_0=='\"') ) {s = 37;}

                        else if ( (LA16_0=='\'') ) {s = 38;}

                        else if ( (LA16_0=='/') ) {s = 39;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 40;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='$' && LA16_0<='&')||(LA16_0>='*' && LA16_0<='+')||LA16_0=='-'||(LA16_0>='?' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}