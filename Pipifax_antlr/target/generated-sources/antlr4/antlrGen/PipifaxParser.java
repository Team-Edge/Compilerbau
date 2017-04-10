// Generated from C:\Users\Florian\workspace\Pipifax_antlr\Pipifax.g4 by ANTLR 4.7
package antlrGen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PipifaxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_VAR=1, KW_INT=2, KW_DOUBLE=3, KW_STRING=4, KW_FUNC=5, KW_IF=6, KW_ELSE=7, 
		KW_WHILE=8, COMMA=9, ASSIGNER=10, BR_OP_1=11, BR_CL_1=12, BR_OP_2=13, 
		BR_CL_2=14, BR_OP_3=15, BR_CL_3=16, OP_PLUS=17, OP_MINUS=18, OP_MULT=19, 
		OP_DIV=20, OP_AND=21, OP_OR=22, OP_NOT=23, CMP_SMALLER=24, CMP_GREATER=25, 
		CMP_EQUAL=26, CMP_UNEQUAL=27, CMP_EQSMALLER=28, CMP_EQGREATER=29, CMP_COMPARE=30, 
		NUM_INT=31, NUM_FLOAT=32, NUM_E_FLOAT=33, STRING=34, ID=35, COMMENT=36, 
		WS=37;
	public static final int
		RULE_startRule = 0, RULE_program = 1, RULE_function = 2, RULE_optParamList = 3, 
		RULE_paramList = 4, RULE_paramDecl = 5, RULE_codeBlock = 6, RULE_statement = 7, 
		RULE_ifInstruction = 8, RULE_whileLoop = 9, RULE_declaration = 10, RULE_dataType = 11, 
		RULE_arrayIndex = 12, RULE_assignment = 13, RULE_varAccess = 14, RULE_expression = 15, 
		RULE_orExpression = 16, RULE_andExpression = 17, RULE_invExpression = 18, 
		RULE_comparisonExpression = 19, RULE_sumExpression = 20, RULE_multExpression = 21, 
		RULE_bracExpression = 22, RULE_innerExpression = 23, RULE_funcCall = 24, 
		RULE_optArgList = 25, RULE_argList = 26, RULE_argument = 27, RULE_literal = 28, 
		RULE_cast = 29;
	public static final String[] ruleNames = {
		"startRule", "program", "function", "optParamList", "paramList", "paramDecl", 
		"codeBlock", "statement", "ifInstruction", "whileLoop", "declaration", 
		"dataType", "arrayIndex", "assignment", "varAccess", "expression", "orExpression", 
		"andExpression", "invExpression", "comparisonExpression", "sumExpression", 
		"multExpression", "bracExpression", "innerExpression", "funcCall", "optArgList", 
		"argList", "argument", "literal", "cast"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'int'", "'double'", "'string'", "'func'", "'if'", "'else'", 
		"'while'", "','", "'='", "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", 
		"'-'", "'*'", "'/'", "'&&'", "'||'", "'!'", "'<'", "'>'", "'=='", "'!='", 
		"'<='", "'>='", "'<=>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KW_VAR", "KW_INT", "KW_DOUBLE", "KW_STRING", "KW_FUNC", "KW_IF", 
		"KW_ELSE", "KW_WHILE", "COMMA", "ASSIGNER", "BR_OP_1", "BR_CL_1", "BR_OP_2", 
		"BR_CL_2", "BR_OP_3", "BR_CL_3", "OP_PLUS", "OP_MINUS", "OP_MULT", "OP_DIV", 
		"OP_AND", "OP_OR", "OP_NOT", "CMP_SMALLER", "CMP_GREATER", "CMP_EQUAL", 
		"CMP_UNEQUAL", "CMP_EQSMALLER", "CMP_EQGREATER", "CMP_COMPARE", "NUM_INT", 
		"NUM_FLOAT", "NUM_E_FLOAT", "STRING", "ID", "COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pipifax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PipifaxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartRuleContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			program();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_VAR || _la==KW_FUNC) {
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_FUNC:
					{
					setState(62);
					function();
					}
					break;
				case KW_VAR:
					{
					setState(63);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode KW_FUNC() { return getToken(PipifaxParser.KW_FUNC, 0); }
		public TerminalNode ID() { return getToken(PipifaxParser.ID, 0); }
		public OptParamListContext optParamList() {
			return getRuleContext(OptParamListContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(KW_FUNC);
			setState(70);
			match(ID);
			setState(71);
			optParamList();
			setState(72);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptParamListContext extends ParserRuleContext {
		public TerminalNode BR_OP_1() { return getToken(PipifaxParser.BR_OP_1, 0); }
		public TerminalNode BR_CL_1() { return getToken(PipifaxParser.BR_CL_1, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public OptParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterOptParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitOptParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitOptParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptParamListContext optParamList() throws RecognitionException {
		OptParamListContext _localctx = new OptParamListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_optParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(BR_OP_1);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(75);
				paramList();
				}
			}

			setState(78);
			match(BR_CL_1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamDeclContext> paramDecl() {
			return getRuleContexts(ParamDeclContext.class);
		}
		public ParamDeclContext paramDecl(int i) {
			return getRuleContext(ParamDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PipifaxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PipifaxParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			paramDecl();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(81);
				match(COMMA);
				setState(82);
				paramDecl();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipifaxParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode OP_MULT() { return getToken(PipifaxParser.OP_MULT, 0); }
		public ParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitParamDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitParamDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamDeclContext paramDecl() throws RecognitionException {
		ParamDeclContext _localctx = new ParamDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_MULT) {
				{
				setState(89);
				match(OP_MULT);
				}
			}

			setState(92);
			dataType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public TerminalNode BR_OP_3() { return getToken(PipifaxParser.BR_OP_3, 0); }
		public TerminalNode BR_CL_3() { return getToken(PipifaxParser.BR_CL_3, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(BR_OP_3);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_VAR) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << BR_OP_1) | (1L << OP_NOT) | (1L << NUM_INT) | (1L << NUM_FLOAT) | (1L << NUM_E_FLOAT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(95);
				statement();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(BR_CL_3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfInstructionContext ifInstruction() {
			return getRuleContext(IfInstructionContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				ifInstruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				whileLoop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfInstructionContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(PipifaxParser.KW_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(PipifaxParser.KW_ELSE, 0); }
		public IfInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterIfInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitIfInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitIfInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfInstructionContext ifInstruction() throws RecognitionException {
		IfInstructionContext _localctx = new IfInstructionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifInstruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(KW_IF);
			setState(111);
			expression();
			setState(112);
			codeBlock();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ELSE) {
				{
				setState(113);
				match(KW_ELSE);
				setState(114);
				codeBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(PipifaxParser.KW_WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(KW_WHILE);
			setState(118);
			expression();
			setState(119);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode KW_VAR() { return getToken(PipifaxParser.KW_VAR, 0); }
		public TerminalNode ID() { return getToken(PipifaxParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(KW_VAR);
			setState(122);
			match(ID);
			setState(123);
			dataType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode KW_INT() { return getToken(PipifaxParser.KW_INT, 0); }
		public TerminalNode KW_DOUBLE() { return getToken(PipifaxParser.KW_DOUBLE, 0); }
		public TerminalNode KW_STRING() { return getToken(PipifaxParser.KW_STRING, 0); }
		public List<ArrayIndexContext> arrayIndex() {
			return getRuleContexts(ArrayIndexContext.class);
		}
		public ArrayIndexContext arrayIndex(int i) {
			return getRuleContext(ArrayIndexContext.class,i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR_OP_2) {
				{
				{
				setState(125);
				arrayIndex();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_INT) | (1L << KW_DOUBLE) | (1L << KW_STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayIndexContext extends ParserRuleContext {
		public TerminalNode BR_OP_2() { return getToken(PipifaxParser.BR_OP_2, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BR_CL_2() { return getToken(PipifaxParser.BR_CL_2, 0); }
		public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(BR_OP_2);
			setState(134);
			expression();
			setState(135);
			match(BR_CL_2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public VarAccessContext varAccess() {
			return getRuleContext(VarAccessContext.class,0);
		}
		public TerminalNode ASSIGNER() { return getToken(PipifaxParser.ASSIGNER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			varAccess();
			setState(138);
			match(ASSIGNER);
			setState(139);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarAccessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipifaxParser.ID, 0); }
		public List<ArrayIndexContext> arrayIndex() {
			return getRuleContexts(ArrayIndexContext.class);
		}
		public ArrayIndexContext arrayIndex(int i) {
			return getRuleContext(ArrayIndexContext.class,i);
		}
		public VarAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterVarAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitVarAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitVarAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAccessContext varAccess() throws RecognitionException {
		VarAccessContext _localctx = new VarAccessContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR_OP_2) {
				{
				{
				setState(142);
				arrayIndex();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			orExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(PipifaxParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(PipifaxParser.OP_OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			andExpression();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(151);
				match(OP_OR);
				setState(152);
				andExpression();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<InvExpressionContext> invExpression() {
			return getRuleContexts(InvExpressionContext.class);
		}
		public InvExpressionContext invExpression(int i) {
			return getRuleContext(InvExpressionContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(PipifaxParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(PipifaxParser.OP_AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			invExpression();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				setState(159);
				match(OP_AND);
				setState(160);
				invExpression();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode OP_NOT() { return getToken(PipifaxParser.OP_NOT, 0); }
		public InvExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterInvExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitInvExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitInvExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvExpressionContext invExpression() throws RecognitionException {
		InvExpressionContext _localctx = new InvExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_invExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_NOT) {
				{
				setState(166);
				match(OP_NOT);
				}
			}

			setState(169);
			comparisonExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<SumExpressionContext> sumExpression() {
			return getRuleContexts(SumExpressionContext.class);
		}
		public SumExpressionContext sumExpression(int i) {
			return getRuleContext(SumExpressionContext.class,i);
		}
		public List<TerminalNode> CMP_SMALLER() { return getTokens(PipifaxParser.CMP_SMALLER); }
		public TerminalNode CMP_SMALLER(int i) {
			return getToken(PipifaxParser.CMP_SMALLER, i);
		}
		public List<TerminalNode> CMP_GREATER() { return getTokens(PipifaxParser.CMP_GREATER); }
		public TerminalNode CMP_GREATER(int i) {
			return getToken(PipifaxParser.CMP_GREATER, i);
		}
		public List<TerminalNode> CMP_EQSMALLER() { return getTokens(PipifaxParser.CMP_EQSMALLER); }
		public TerminalNode CMP_EQSMALLER(int i) {
			return getToken(PipifaxParser.CMP_EQSMALLER, i);
		}
		public List<TerminalNode> CMP_EQGREATER() { return getTokens(PipifaxParser.CMP_EQGREATER); }
		public TerminalNode CMP_EQGREATER(int i) {
			return getToken(PipifaxParser.CMP_EQGREATER, i);
		}
		public List<TerminalNode> CMP_EQUAL() { return getTokens(PipifaxParser.CMP_EQUAL); }
		public TerminalNode CMP_EQUAL(int i) {
			return getToken(PipifaxParser.CMP_EQUAL, i);
		}
		public List<TerminalNode> CMP_UNEQUAL() { return getTokens(PipifaxParser.CMP_UNEQUAL); }
		public TerminalNode CMP_UNEQUAL(int i) {
			return getToken(PipifaxParser.CMP_UNEQUAL, i);
		}
		public List<TerminalNode> CMP_COMPARE() { return getTokens(PipifaxParser.CMP_COMPARE); }
		public TerminalNode CMP_COMPARE(int i) {
			return getToken(PipifaxParser.CMP_COMPARE, i);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			sumExpression();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CMP_SMALLER) | (1L << CMP_GREATER) | (1L << CMP_EQUAL) | (1L << CMP_UNEQUAL) | (1L << CMP_EQSMALLER) | (1L << CMP_EQGREATER) | (1L << CMP_COMPARE))) != 0)) {
				{
				setState(186);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CMP_SMALLER:
					{
					{
					setState(172);
					match(CMP_SMALLER);
					setState(173);
					sumExpression();
					}
					}
					break;
				case CMP_GREATER:
					{
					{
					setState(174);
					match(CMP_GREATER);
					setState(175);
					sumExpression();
					}
					}
					break;
				case CMP_EQSMALLER:
					{
					{
					setState(176);
					match(CMP_EQSMALLER);
					setState(177);
					sumExpression();
					}
					}
					break;
				case CMP_EQGREATER:
					{
					{
					setState(178);
					match(CMP_EQGREATER);
					setState(179);
					sumExpression();
					}
					}
					break;
				case CMP_EQUAL:
					{
					{
					setState(180);
					match(CMP_EQUAL);
					setState(181);
					sumExpression();
					}
					}
					break;
				case CMP_UNEQUAL:
					{
					{
					setState(182);
					match(CMP_UNEQUAL);
					setState(183);
					sumExpression();
					}
					}
					break;
				case CMP_COMPARE:
					{
					{
					setState(184);
					match(CMP_COMPARE);
					setState(185);
					sumExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumExpressionContext extends ParserRuleContext {
		public List<MultExpressionContext> multExpression() {
			return getRuleContexts(MultExpressionContext.class);
		}
		public MultExpressionContext multExpression(int i) {
			return getRuleContext(MultExpressionContext.class,i);
		}
		public List<TerminalNode> OP_PLUS() { return getTokens(PipifaxParser.OP_PLUS); }
		public TerminalNode OP_PLUS(int i) {
			return getToken(PipifaxParser.OP_PLUS, i);
		}
		public List<TerminalNode> OP_MINUS() { return getTokens(PipifaxParser.OP_MINUS); }
		public TerminalNode OP_MINUS(int i) {
			return getToken(PipifaxParser.OP_MINUS, i);
		}
		public SumExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterSumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitSumExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitSumExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumExpressionContext sumExpression() throws RecognitionException {
		SumExpressionContext _localctx = new SumExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sumExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			multExpression();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_PLUS || _la==OP_MINUS) {
				{
				setState(196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_PLUS:
					{
					{
					setState(192);
					match(OP_PLUS);
					setState(193);
					multExpression();
					}
					}
					break;
				case OP_MINUS:
					{
					{
					setState(194);
					match(OP_MINUS);
					setState(195);
					multExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExpressionContext extends ParserRuleContext {
		public List<BracExpressionContext> bracExpression() {
			return getRuleContexts(BracExpressionContext.class);
		}
		public BracExpressionContext bracExpression(int i) {
			return getRuleContext(BracExpressionContext.class,i);
		}
		public List<TerminalNode> OP_MULT() { return getTokens(PipifaxParser.OP_MULT); }
		public TerminalNode OP_MULT(int i) {
			return getToken(PipifaxParser.OP_MULT, i);
		}
		public List<TerminalNode> OP_DIV() { return getTokens(PipifaxParser.OP_DIV); }
		public TerminalNode OP_DIV(int i) {
			return getToken(PipifaxParser.OP_DIV, i);
		}
		public MultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExpressionContext multExpression() throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			bracExpression();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MULT || _la==OP_DIV) {
				{
				setState(206);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_MULT:
					{
					{
					setState(202);
					match(OP_MULT);
					setState(203);
					bracExpression();
					}
					}
					break;
				case OP_DIV:
					{
					{
					setState(204);
					match(OP_DIV);
					setState(205);
					bracExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracExpressionContext extends ParserRuleContext {
		public InnerExpressionContext innerExpression() {
			return getRuleContext(InnerExpressionContext.class,0);
		}
		public TerminalNode BR_OP_1() { return getToken(PipifaxParser.BR_OP_1, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BR_CL_1() { return getToken(PipifaxParser.BR_CL_1, 0); }
		public BracExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterBracExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitBracExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitBracExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracExpressionContext bracExpression() throws RecognitionException {
		BracExpressionContext _localctx = new BracExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bracExpression);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				innerExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(212);
				match(BR_OP_1);
				setState(213);
				expression();
				setState(214);
				match(BR_CL_1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public VarAccessContext varAccess() {
			return getRuleContext(VarAccessContext.class,0);
		}
		public InnerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterInnerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitInnerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitInnerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerExpressionContext innerExpression() throws RecognitionException {
		InnerExpressionContext _localctx = new InnerExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_innerExpression);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				funcCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				varAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipifaxParser.ID, 0); }
		public OptArgListContext optArgList() {
			return getRuleContext(OptArgListContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ID);
			setState(224);
			optArgList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptArgListContext extends ParserRuleContext {
		public TerminalNode BR_OP_1() { return getToken(PipifaxParser.BR_OP_1, 0); }
		public TerminalNode BR_CL_1() { return getToken(PipifaxParser.BR_CL_1, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public OptArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterOptArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitOptArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitOptArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptArgListContext optArgList() throws RecognitionException {
		OptArgListContext _localctx = new OptArgListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_optArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(BR_OP_1);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BR_OP_1) | (1L << OP_NOT) | (1L << NUM_INT) | (1L << NUM_FLOAT) | (1L << NUM_E_FLOAT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(227);
				argList();
				}
			}

			setState(230);
			match(BR_CL_1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PipifaxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PipifaxParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			argument();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233);
				match(COMMA);
				setState(234);
				argument();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(PipifaxParser.NUM_INT, 0); }
		public TerminalNode NUM_FLOAT() { return getToken(PipifaxParser.NUM_FLOAT, 0); }
		public TerminalNode NUM_E_FLOAT() { return getToken(PipifaxParser.NUM_E_FLOAT, 0); }
		public TerminalNode STRING() { return getToken(PipifaxParser.STRING, 0); }
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BR_OP_1) {
				{
				setState(242);
				cast();
				}
			}

			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM_INT) | (1L << NUM_FLOAT) | (1L << NUM_E_FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastContext extends ParserRuleContext {
		public TerminalNode BR_OP_1() { return getToken(PipifaxParser.BR_OP_1, 0); }
		public TerminalNode BR_CL_1() { return getToken(PipifaxParser.BR_CL_1, 0); }
		public TerminalNode KW_INT() { return getToken(PipifaxParser.KW_INT, 0); }
		public TerminalNode KW_DOUBLE() { return getToken(PipifaxParser.KW_DOUBLE, 0); }
		public TerminalNode KW_STRING() { return getToken(PipifaxParser.KW_STRING, 0); }
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipifaxListener ) ((PipifaxListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(BR_OP_1);
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_INT) | (1L << KW_DOUBLE) | (1L << KW_STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(249);
			match(BR_CL_1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\7\3C\n\3\f\3\16\3F\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5O\n\5\3"+
		"\5\3\5\3\6\3\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\7\3\7\5\7]\n\7\3\7\3\7\3"+
		"\b\3\b\7\bc\n\b\f\b\16\bf\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\5\nv\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\7"+
		"\r\u0081\n\r\f\r\16\r\u0084\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\7\20\u0092\n\20\f\20\16\20\u0095\13\20\3\21\3\21"+
		"\3\22\3\22\3\22\7\22\u009c\n\22\f\22\16\22\u009f\13\22\3\23\3\23\3\23"+
		"\7\23\u00a4\n\23\f\23\16\23\u00a7\13\23\3\24\5\24\u00aa\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u00bd\n\25\f\25\16\25\u00c0\13\25\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u00c7\n\26\f\26\16\26\u00ca\13\26\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u00d1\n\27\f\27\16\27\u00d4\13\27\3\30\3\30\3\30\3\30\3\30\5\30\u00db"+
		"\n\30\3\31\3\31\3\31\5\31\u00e0\n\31\3\32\3\32\3\32\3\33\3\33\5\33\u00e7"+
		"\n\33\3\33\3\33\3\34\3\34\3\34\7\34\u00ee\n\34\f\34\16\34\u00f1\13\34"+
		"\3\35\3\35\3\36\5\36\u00f6\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\2\2"+
		" \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\4\3"+
		"\2\4\6\3\2!$\2\u0100\2>\3\2\2\2\4D\3\2\2\2\6G\3\2\2\2\bL\3\2\2\2\nR\3"+
		"\2\2\2\fZ\3\2\2\2\16`\3\2\2\2\20n\3\2\2\2\22p\3\2\2\2\24w\3\2\2\2\26{"+
		"\3\2\2\2\30\u0082\3\2\2\2\32\u0087\3\2\2\2\34\u008b\3\2\2\2\36\u008f\3"+
		"\2\2\2 \u0096\3\2\2\2\"\u0098\3\2\2\2$\u00a0\3\2\2\2&\u00a9\3\2\2\2(\u00ad"+
		"\3\2\2\2*\u00c1\3\2\2\2,\u00cb\3\2\2\2.\u00da\3\2\2\2\60\u00df\3\2\2\2"+
		"\62\u00e1\3\2\2\2\64\u00e4\3\2\2\2\66\u00ea\3\2\2\28\u00f2\3\2\2\2:\u00f5"+
		"\3\2\2\2<\u00f9\3\2\2\2>?\5\4\3\2?\3\3\2\2\2@C\5\6\4\2AC\5\26\f\2B@\3"+
		"\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\5\3\2\2\2FD\3\2\2\2GH"+
		"\7\7\2\2HI\7%\2\2IJ\5\b\5\2JK\5\16\b\2K\7\3\2\2\2LN\7\r\2\2MO\5\n\6\2"+
		"NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\16\2\2Q\t\3\2\2\2RW\5\f\7\2ST\7\13"+
		"\2\2TV\5\f\7\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\13\3\2\2\2YW\3"+
		"\2\2\2Z\\\7%\2\2[]\7\25\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\5\30\r\2"+
		"_\r\3\2\2\2`d\7\21\2\2ac\5\20\t\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2"+
		"\2\2eg\3\2\2\2fd\3\2\2\2gh\7\22\2\2h\17\3\2\2\2io\5\22\n\2jo\5\24\13\2"+
		"ko\5\26\f\2lo\5\34\17\2mo\5 \21\2ni\3\2\2\2nj\3\2\2\2nk\3\2\2\2nl\3\2"+
		"\2\2nm\3\2\2\2o\21\3\2\2\2pq\7\b\2\2qr\5 \21\2ru\5\16\b\2st\7\t\2\2tv"+
		"\5\16\b\2us\3\2\2\2uv\3\2\2\2v\23\3\2\2\2wx\7\n\2\2xy\5 \21\2yz\5\16\b"+
		"\2z\25\3\2\2\2{|\7\3\2\2|}\7%\2\2}~\5\30\r\2~\27\3\2\2\2\177\u0081\5\32"+
		"\16\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\t\2"+
		"\2\2\u0086\31\3\2\2\2\u0087\u0088\7\17\2\2\u0088\u0089\5 \21\2\u0089\u008a"+
		"\7\20\2\2\u008a\33\3\2\2\2\u008b\u008c\5\36\20\2\u008c\u008d\7\f\2\2\u008d"+
		"\u008e\5 \21\2\u008e\35\3\2\2\2\u008f\u0093\7%\2\2\u0090\u0092\5\32\16"+
		"\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\37\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\"\22\2\u0097"+
		"!\3\2\2\2\u0098\u009d\5$\23\2\u0099\u009a\7\30\2\2\u009a\u009c\5$\23\2"+
		"\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e#\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a5\5&\24\2\u00a1"+
		"\u00a2\7\27\2\2\u00a2\u00a4\5&\24\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3"+
		"\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6%\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00aa\7\31\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ac\5(\25\2\u00ac\'\3\2\2\2\u00ad\u00be\5"+
		"*\26\2\u00ae\u00af\7\32\2\2\u00af\u00bd\5*\26\2\u00b0\u00b1\7\33\2\2\u00b1"+
		"\u00bd\5*\26\2\u00b2\u00b3\7\36\2\2\u00b3\u00bd\5*\26\2\u00b4\u00b5\7"+
		"\37\2\2\u00b5\u00bd\5*\26\2\u00b6\u00b7\7\34\2\2\u00b7\u00bd\5*\26\2\u00b8"+
		"\u00b9\7\35\2\2\u00b9\u00bd\5*\26\2\u00ba\u00bb\7 \2\2\u00bb\u00bd\5*"+
		"\26\2\u00bc\u00ae\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bc"+
		"\u00b4\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		")\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c8\5,\27\2\u00c2\u00c3\7\23\2\2"+
		"\u00c3\u00c7\5,\27\2\u00c4\u00c5\7\24\2\2\u00c5\u00c7\5,\27\2\u00c6\u00c2"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9+\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00d2\5.\30\2"+
		"\u00cc\u00cd\7\25\2\2\u00cd\u00d1\5.\30\2\u00ce\u00cf\7\26\2\2\u00cf\u00d1"+
		"\5.\30\2\u00d0\u00cc\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3-\3\2\2\2\u00d4\u00d2\3\2\2\2"+
		"\u00d5\u00db\5\60\31\2\u00d6\u00d7\7\r\2\2\u00d7\u00d8\5 \21\2\u00d8\u00d9"+
		"\7\16\2\2\u00d9\u00db\3\2\2\2\u00da\u00d5\3\2\2\2\u00da\u00d6\3\2\2\2"+
		"\u00db/\3\2\2\2\u00dc\u00e0\5:\36\2\u00dd\u00e0\5\62\32\2\u00de\u00e0"+
		"\5\36\20\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2"+
		"\u00e0\61\3\2\2\2\u00e1\u00e2\7%\2\2\u00e2\u00e3\5\64\33\2\u00e3\63\3"+
		"\2\2\2\u00e4\u00e6\7\r\2\2\u00e5\u00e7\5\66\34\2\u00e6\u00e5\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\16\2\2\u00e9\65\3\2\2"+
		"\2\u00ea\u00ef\58\35\2\u00eb\u00ec\7\13\2\2\u00ec\u00ee\58\35\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\67\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\5 \21\2\u00f39\3"+
		"\2\2\2\u00f4\u00f6\5<\37\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\t\3\2\2\u00f8;\3\2\2\2\u00f9\u00fa\7\r\2\2"+
		"\u00fa\u00fb\t\2\2\2\u00fb\u00fc\7\16\2\2\u00fc=\3\2\2\2\32BDNW\\dnu\u0082"+
		"\u0093\u009d\u00a5\u00a9\u00bc\u00be\u00c6\u00c8\u00d0\u00d2\u00da\u00df"+
		"\u00e6\u00ef\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}