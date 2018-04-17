// Generated from cpp.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cppParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, MultiLineMacro=22, Directive=23, 
		Else=24, Enum=25, Float=26, For=27, If=28, Inline=29, Int=30, Long=31, 
		New=32, Operator=33, Return=34, Short=35, Signed=36, Static=37, Static_assert=38, 
		Static_cast=39, Switch=40, Unsigned=41, Void=42, Wchar=43, Plus=44, Minus=45, 
		Star=46, Div=47, Mod=48, Caret=49, And=50, Or=51, Tilde=52, Not=53, Assign=54, 
		Less=55, Greater=56, MinusAssign=57, StarAssign=58, DivAssign=59, ModAssign=60, 
		XorAssign=61, AndAssign=62, OrAssign=63, LeftShift=64, LeftShiftAssign=65, 
		Equal=66, Identifier=67, Integerliteral=68, Decimalliteral=69, Octalliteral=70, 
		Hexadecimalliteral=71, Binaryliteral=72, Integersuffix=73, Characterliteral=74, 
		Floatingliteral=75, Stringliteral=76, Whitespace=77, Newline=78, Break=79, 
		Continue=80, Char=81, Char16=82, Char32=83, Bool=84, Double=85, Auto=86, 
		Default=87, Delete=88;
	public static final int
		RULE_translationunit = 0, RULE_idexpression = 1, RULE_postfixexpression = 2, 
		RULE_expressionlist = 3, RULE_additiveexpression = 4, RULE_relationalexpression = 5, 
		RULE_assignmentexpression = 6, RULE_statement = 7, RULE_statementseq = 8, 
		RULE_selectionstatement = 9, RULE_condition = 10, RULE_jumpstatement = 11, 
		RULE_declarationseq = 12, RULE_simpledeclaration = 13, RULE_declspecifier = 14, 
		RULE_declspecifierseq = 15, RULE_simpletypespecifier = 16, RULE_originalnamespacename = 17, 
		RULE_attributespecifierseq = 18, RULE_attributespecifier = 19, RULE_initdeclaratorlist = 20, 
		RULE_initdeclarator = 21, RULE_declarator = 22, RULE_ptrdeclarator = 23, 
		RULE_noptrdeclarator = 24, RULE_parametersandqualifiers = 25, RULE_ptroperator = 26, 
		RULE_ptrabstractdeclarator = 27, RULE_noptrabstractdeclarator = 28, RULE_noptrabstractpackdeclarator = 29, 
		RULE_parameterdeclarationclause = 30, RULE_parameterdeclarationlist = 31, 
		RULE_parameterdeclaration = 32, RULE_functiondefinition = 33, RULE_functionbody = 34, 
		RULE_initializer = 35, RULE_braceorequalinitializer = 36, RULE_initializerclause = 37, 
		RULE_initializerlist = 38, RULE_bracedinitlist = 39, RULE_classordecltype = 40, 
		RULE_ctorinitializer = 41, RULE_rightShift = 42, RULE_rightShiftAssign = 43, 
		RULE_theoperator = 44, RULE_literal = 45;
	public static final String[] ruleNames = {
		"translationunit", "idexpression", "postfixexpression", "expressionlist", 
		"additiveexpression", "relationalexpression", "assignmentexpression", 
		"statement", "statementseq", "selectionstatement", "condition", "jumpstatement", 
		"declarationseq", "simpledeclaration", "declspecifier", "declspecifierseq", 
		"simpletypespecifier", "originalnamespacename", "attributespecifierseq", 
		"attributespecifier", "initdeclaratorlist", "initdeclarator", "declarator", 
		"ptrdeclarator", "noptrdeclarator", "parametersandqualifiers", "ptroperator", 
		"ptrabstractdeclarator", "noptrabstractdeclarator", "noptrabstractpackdeclarator", 
		"parameterdeclarationclause", "parameterdeclarationlist", "parameterdeclaration", 
		"functiondefinition", "functionbody", "initializer", "braceorequalinitializer", 
		"initializerclause", "initializerlist", "bracedinitlist", "classordecltype", 
		"ctorinitializer", "rightShift", "rightShiftAssign", "theoperator", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#include <iostream>'", "'('", "')'", "';'", "'['", "']'", "','", 
		"'&&'", "'...'", "'{'", "'}'", "':'", "'+='", "'!='", "'<='", "'>='", 
		"'||'", "'++'", "'--'", "'->*'", "'->'", null, null, "'else'", "'enum '", 
		"'float '", "'for '", "'if '", "'inline '", "'int '", "'long '", "'new '", 
		"'operator '", "'return '", "'short '", "'signed '", "'static '", "'static_assert '", 
		"'static_cast '", "'switch'", "'unsigned '", "'void'", "'wchar_t'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'~'", "'!'", "'='", 
		"'<'", "'>'", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", 
		"'<<'", "'<<='", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "MultiLineMacro", 
		"Directive", "Else", "Enum", "Float", "For", "If", "Inline", "Int", "Long", 
		"New", "Operator", "Return", "Short", "Signed", "Static", "Static_assert", 
		"Static_cast", "Switch", "Unsigned", "Void", "Wchar", "Plus", "Minus", 
		"Star", "Div", "Mod", "Caret", "And", "Or", "Tilde", "Not", "Assign", 
		"Less", "Greater", "MinusAssign", "StarAssign", "DivAssign", "ModAssign", 
		"XorAssign", "AndAssign", "OrAssign", "LeftShift", "LeftShiftAssign", 
		"Equal", "Identifier", "Integerliteral", "Decimalliteral", "Octalliteral", 
		"Hexadecimalliteral", "Binaryliteral", "Integersuffix", "Characterliteral", 
		"Floatingliteral", "Stringliteral", "Whitespace", "Newline", "Break", 
		"Continue", "Char", "Char16", "Char32", "Bool", "Double", "Auto", "Default", 
		"Delete"
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
	public String getGrammarFileName() { return "cpp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TranslationunitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(cppParser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterTranslationunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitTranslationunit(this);
		}
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__0);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Wchar) | (1L << Star) | (1L << And))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Identifier - 67)) | (1L << (Integerliteral - 67)) | (1L << (Characterliteral - 67)) | (1L << (Floatingliteral - 67)) | (1L << (Stringliteral - 67)) | (1L << (Char - 67)) | (1L << (Char16 - 67)) | (1L << (Char32 - 67)) | (1L << (Bool - 67)) | (1L << (Double - 67)) | (1L << (Auto - 67)))) != 0)) {
				{
				setState(93);
				declarationseq(0);
				}
			}

			setState(96);
			match(EOF);
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

	public static class IdexpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(cppParser.Identifier, 0); }
		public IdexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterIdexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitIdexpression(this);
		}
	}

	public final IdexpressionContext idexpression() throws RecognitionException {
		IdexpressionContext _localctx = new IdexpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_idexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(Identifier);
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

	public static class PostfixexpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterPostfixexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitPostfixexpression(this);
		}
	}

	public final PostfixexpressionContext postfixexpression() throws RecognitionException {
		return postfixexpression(0);
	}

	private PostfixexpressionContext postfixexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixexpressionContext _localctx = new PostfixexpressionContext(_ctx, _parentState);
		PostfixexpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_postfixexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(101);
				literal();
				}
				break;
			case 2:
				{
				setState(102);
				idexpression();
				}
				break;
			case 3:
				{
				setState(103);
				simpletypespecifier();
				setState(104);
				match(T__1);
				setState(105);
				expressionlist();
				setState(106);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PostfixexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
					setState(110);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(111);
					match(T__1);
					setState(114);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(112);
						idexpression();
						}
						break;
					case Integerliteral:
					case Characterliteral:
					case Floatingliteral:
					case Stringliteral:
						{
						setState(113);
						literal();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(116);
					match(T__2);
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionlistContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitExpressionlist(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			additiveexpression();
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

	public static class AdditiveexpressionContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<IdexpressionContext> idexpression() {
			return getRuleContexts(IdexpressionContext.class);
		}
		public IdexpressionContext idexpression(int i) {
			return getRuleContext(IdexpressionContext.class,i);
		}
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterAdditiveexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitAdditiveexpression(this);
		}
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_additiveexpression);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				idexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(127);
					idexpression();
					}
					break;
				case Integerliteral:
				case Characterliteral:
				case Floatingliteral:
				case Stringliteral:
					{
					setState(128);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131);
				match(Star);
				setState(134);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(132);
					idexpression();
					}
					break;
				case Integerliteral:
				case Characterliteral:
				case Floatingliteral:
				case Stringliteral:
					{
					setState(133);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(136);
					idexpression();
					}
					break;
				case Integerliteral:
				case Characterliteral:
				case Floatingliteral:
				case Stringliteral:
					{
					setState(137);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(140);
				match(Div);
				setState(143);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(141);
					idexpression();
					}
					break;
				case Integerliteral:
				case Characterliteral:
				case Floatingliteral:
				case Stringliteral:
					{
					setState(142);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(145);
					idexpression();
					}
					break;
				case Integerliteral:
				case Characterliteral:
				case Floatingliteral:
				case Stringliteral:
					{
					setState(146);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149);
				match(Plus);
				setState(152);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(150);
					idexpression();
					}
					break;
				case Integerliteral:
				case Characterliteral:
				case Floatingliteral:
				case Stringliteral:
					{
					setState(151);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(154);
					idexpression();
					}
					break;
				case Integerliteral:
				case Characterliteral:
				case Floatingliteral:
				case Stringliteral:
					{
					setState(155);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(158);
				match(Minus);
				setState(161);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(159);
					idexpression();
					}
					break;
				case Integerliteral:
				case Characterliteral:
				case Floatingliteral:
				case Stringliteral:
					{
					setState(160);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class RelationalexpressionContext extends ParserRuleContext {
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterRelationalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitRelationalexpression(this);
		}
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relationalexpression);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				idexpression();
				setState(166);
				match(Less);
				setState(167);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				idexpression();
				setState(170);
				match(Greater);
				setState(171);
				literal();
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

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitAssignmentexpression(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignmentexpression);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				idexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				postfixexpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				additiveexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				relationalexpression();
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

	public static class StatementContext extends ParserRuleContext {
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(183);
					attributespecifierseq(0);
					}
				}

				setState(186);
				selectionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(187);
					attributespecifierseq(0);
					}
				}

				setState(190);
				jumpstatement();
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

	public static class StatementseqContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public StatementseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterStatementseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitStatementseq(this);
		}
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		return statementseq(0);
	}

	private StatementseqContext statementseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementseqContext _localctx = new StatementseqContext(_ctx, _parentState);
		StatementseqContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(194);
				simpletypespecifier();
				}
				break;
			case 2:
				{
				setState(195);
				selectionstatement();
				}
				break;
			case 3:
				{
				setState(196);
				simpledeclaration();
				}
				break;
			case 4:
				{
				setState(197);
				jumpstatement();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(200);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(201);
						simpletypespecifier();
						}
						break;
					case 2:
						{
						setState(202);
						selectionstatement();
						}
						break;
					case 3:
						{
						setState(203);
						simpledeclaration();
						}
						break;
					case 4:
						{
						setState(204);
						jumpstatement();
						}
						break;
					}
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectionstatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(cppParser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(cppParser.Else, 0); }
		public TerminalNode Switch() { return getToken(cppParser.Switch, 0); }
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterSelectionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitSelectionstatement(this);
		}
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectionstatement);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(If);
				setState(213);
				match(T__1);
				setState(214);
				condition();
				setState(215);
				match(T__2);
				setState(216);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(If);
				setState(219);
				match(T__1);
				setState(220);
				condition();
				setState(221);
				match(T__2);
				setState(222);
				statement();
				setState(223);
				match(Else);
				setState(224);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(Switch);
				setState(227);
				match(T__1);
				setState(228);
				condition();
				setState(229);
				match(T__2);
				setState(230);
				statement();
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

	public static class ConditionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				relationalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(235);
					attributespecifierseq(0);
					}
				}

				setState(238);
				declspecifierseq();
				setState(239);
				declarator();
				setState(240);
				match(Assign);
				setState(241);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(243);
					attributespecifierseq(0);
					}
				}

				setState(246);
				declspecifierseq();
				setState(247);
				declarator();
				setState(248);
				bracedinitlist();
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

	public static class JumpstatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(cppParser.Break, 0); }
		public TerminalNode Continue() { return getToken(cppParser.Continue, 0); }
		public TerminalNode Return() { return getToken(cppParser.Return, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public JumpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterJumpstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitJumpstatement(this);
		}
	}

	public final JumpstatementContext jumpstatement() throws RecognitionException {
		JumpstatementContext _localctx = new JumpstatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jumpstatement);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(Break);
				setState(253);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(Continue);
				setState(255);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(Return);
				setState(259);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Integerliteral:
				case Characterliteral:
				case Floatingliteral:
				case Stringliteral:
					{
					setState(257);
					literal();
					}
					break;
				case Identifier:
					{
					setState(258);
					idexpression();
					}
					break;
				case T__3:
					break;
				default:
					break;
				}
				setState(261);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(Return);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Identifier - 67)) | (1L << (Integerliteral - 67)) | (1L << (Characterliteral - 67)) | (1L << (Floatingliteral - 67)) | (1L << (Stringliteral - 67)))) != 0)) {
					{
					setState(263);
					additiveexpression();
					}
				}

				setState(266);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				match(Return);
				setState(268);
				bracedinitlist();
				setState(269);
				match(T__3);
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

	public static class DeclarationseqContext extends ParserRuleContext {
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitDeclarationseq(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		return declarationseq(0);
	}

	private DeclarationseqContext declarationseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, _parentState);
		DeclarationseqContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(274);
			functiondefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(276);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(277);
					functiondefinition();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpledeclarationContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public List<InitdeclaratorContext> initdeclarator() {
			return getRuleContexts(InitdeclaratorContext.class);
		}
		public InitdeclaratorContext initdeclarator(int i) {
			return getRuleContext(InitdeclaratorContext.class,i);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public SimpledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterSimpledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitSimpledeclaration(this);
		}
	}

	public final SimpledeclarationContext simpledeclaration() throws RecognitionException {
		SimpledeclarationContext _localctx = new SimpledeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simpledeclaration);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				simpletypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(284);
					declspecifierseq();
					}
					break;
				}
				setState(287);
				initdeclarator();
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(288);
					initdeclarator();
					}
					break;
				}
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(291);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				attributespecifierseq(0);
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(295);
					declspecifierseq();
					}
					break;
				}
				setState(298);
				initdeclaratorlist(0);
				setState(299);
				match(T__3);
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

	public static class DeclspecifierContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public DeclspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterDeclspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitDeclspecifier(this);
		}
	}

	public final DeclspecifierContext declspecifier() throws RecognitionException {
		DeclspecifierContext _localctx = new DeclspecifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			simpletypespecifier();
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

	public static class DeclspecifierseqContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public DeclspecifierContext declspecifier() {
			return getRuleContext(DeclspecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterDeclspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitDeclspecifierseq(this);
		}
	}

	public final DeclspecifierseqContext declspecifierseq() throws RecognitionException {
		DeclspecifierseqContext _localctx = new DeclspecifierseqContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declspecifierseq);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				simpletypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				declspecifier();
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(307);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				declspecifier();
				setState(311);
				declspecifierseq();
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

	public static class SimpletypespecifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(cppParser.Identifier, 0); }
		public TerminalNode Char() { return getToken(cppParser.Char, 0); }
		public TerminalNode Char16() { return getToken(cppParser.Char16, 0); }
		public TerminalNode Char32() { return getToken(cppParser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(cppParser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(cppParser.Bool, 0); }
		public TerminalNode Short() { return getToken(cppParser.Short, 0); }
		public TerminalNode Int() { return getToken(cppParser.Int, 0); }
		public TerminalNode Long() { return getToken(cppParser.Long, 0); }
		public TerminalNode Signed() { return getToken(cppParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(cppParser.Unsigned, 0); }
		public TerminalNode Float() { return getToken(cppParser.Float, 0); }
		public TerminalNode Double() { return getToken(cppParser.Double, 0); }
		public TerminalNode Void() { return getToken(cppParser.Void, 0); }
		public TerminalNode Auto() { return getToken(cppParser.Auto, 0); }
		public SimpletypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterSimpletypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitSimpletypespecifier(this);
		}
	}

	public final SimpletypespecifierContext simpletypespecifier() throws RecognitionException {
		SimpletypespecifierContext _localctx = new SimpletypespecifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpletypespecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (Float - 26)) | (1L << (Int - 26)) | (1L << (Long - 26)) | (1L << (Short - 26)) | (1L << (Signed - 26)) | (1L << (Unsigned - 26)) | (1L << (Void - 26)) | (1L << (Wchar - 26)) | (1L << (Identifier - 26)) | (1L << (Char - 26)) | (1L << (Char16 - 26)) | (1L << (Char32 - 26)) | (1L << (Bool - 26)) | (1L << (Double - 26)) | (1L << (Auto - 26)))) != 0)) ) {
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

	public static class OriginalnamespacenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(cppParser.Identifier, 0); }
		public OriginalnamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterOriginalnamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitOriginalnamespacename(this);
		}
	}

	public final OriginalnamespacenameContext originalnamespacename() throws RecognitionException {
		OriginalnamespacenameContext _localctx = new OriginalnamespacenameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(Identifier);
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

	public static class AttributespecifierseqContext extends ParserRuleContext {
		public AttributespecifierContext attributespecifier() {
			return getRuleContext(AttributespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterAttributespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitAttributespecifierseq(this);
		}
	}

	public final AttributespecifierseqContext attributespecifierseq() throws RecognitionException {
		return attributespecifierseq(0);
	}

	private AttributespecifierseqContext attributespecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributespecifierseqContext _localctx = new AttributespecifierseqContext(_ctx, _parentState);
		AttributespecifierseqContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(320);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(322);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(323);
					attributespecifier();
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributespecifierContext extends ParserRuleContext {
		public AttributespecifierContext attributespecifier() {
			return getRuleContext(AttributespecifierContext.class,0);
		}
		public AttributespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterAttributespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitAttributespecifier(this);
		}
	}

	public final AttributespecifierContext attributespecifier() throws RecognitionException {
		AttributespecifierContext _localctx = new AttributespecifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attributespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__4);
			setState(330);
			match(T__4);
			setState(331);
			attributespecifier();
			setState(332);
			match(T__5);
			setState(333);
			match(T__5);
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

	public static class InitdeclaratorlistContext extends ParserRuleContext {
		public InitdeclaratorContext initdeclarator() {
			return getRuleContext(InitdeclaratorContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public InitdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterInitdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitInitdeclaratorlist(this);
		}
	}

	public final InitdeclaratorlistContext initdeclaratorlist() throws RecognitionException {
		return initdeclaratorlist(0);
	}

	private InitdeclaratorlistContext initdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, _parentState);
		InitdeclaratorlistContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(336);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(338);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(339);
					match(T__6);
					setState(340);
					initdeclarator();
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterInitdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitInitdeclarator(this);
		}
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(346);
				simpletypespecifier();
				}
				break;
			}
			setState(349);
			declarator();
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(350);
				initializer();
				}
				break;
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

	public static class DeclaratorContext extends ParserRuleContext {
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declarator);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				idexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				idexpression();
				setState(355);
				parametersandqualifiers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				noptrdeclarator(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				ptrdeclarator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				noptrdeclarator(0);
				setState(360);
				parametersandqualifiers();
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

	public static class PtrdeclaratorContext extends ParserRuleContext {
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public PtrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterPtrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitPtrdeclarator(this);
		}
	}

	public final PtrdeclaratorContext ptrdeclarator() throws RecognitionException {
		PtrdeclaratorContext _localctx = new PtrdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ptrdeclarator);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				noptrdeclarator(0);
				}
				break;
			case T__7:
			case Star:
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				ptroperator();
				setState(366);
				ptrdeclarator();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NoptrdeclaratorContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<IdexpressionContext> idexpression() {
			return getRuleContexts(IdexpressionContext.class);
		}
		public IdexpressionContext idexpression(int i) {
			return getRuleContext(IdexpressionContext.class,i);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public NoptrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterNoptrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitNoptrdeclarator(this);
		}
	}

	public final NoptrdeclaratorContext noptrdeclarator() throws RecognitionException {
		return noptrdeclarator(0);
	}

	private NoptrdeclaratorContext noptrdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrdeclaratorContext _localctx = new NoptrdeclaratorContext(_ctx, _parentState);
		NoptrdeclaratorContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(371);
				literal();
				}
				break;
			case 2:
				{
				setState(372);
				idexpression();
				}
				break;
			case 3:
				{
				setState(373);
				idexpression();
				setState(374);
				match(T__4);
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(375);
					idexpression();
					}
				}

				setState(378);
				match(T__5);
				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(379);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(382);
				match(T__1);
				setState(383);
				ptrdeclarator();
				setState(384);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
					setState(388);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(389);
					parametersandqualifiers();
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametersandqualifiersContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParametersandqualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersandqualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterParametersandqualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitParametersandqualifiers(this);
		}
	}

	public final ParametersandqualifiersContext parametersandqualifiers() throws RecognitionException {
		ParametersandqualifiersContext _localctx = new ParametersandqualifiersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parametersandqualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(T__1);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Wchar))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Identifier - 67)) | (1L << (Char - 67)) | (1L << (Char16 - 67)) | (1L << (Char32 - 67)) | (1L << (Bool - 67)) | (1L << (Double - 67)) | (1L << (Auto - 67)))) != 0)) {
				{
				setState(396);
				parameterdeclarationlist(0);
				}
			}

			setState(399);
			match(T__2);
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

	public static class PtroperatorContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtroperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptroperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterPtroperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitPtroperator(this);
		}
	}

	public final PtroperatorContext ptroperator() throws RecognitionException {
		PtroperatorContext _localctx = new PtroperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ptroperator);
		int _la;
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(Star);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(402);
					attributespecifierseq(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(And);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(406);
					attributespecifierseq(0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				match(T__7);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(410);
					attributespecifierseq(0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				match(Star);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(414);
					attributespecifierseq(0);
					}
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

	public static class PtrabstractdeclaratorContext extends ParserRuleContext {
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public PtrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterPtrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitPtrabstractdeclarator(this);
		}
	}

	public final PtrabstractdeclaratorContext ptrabstractdeclarator() throws RecognitionException {
		PtrabstractdeclaratorContext _localctx = new PtrabstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ptrabstractdeclarator);
		int _la;
		try {
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				noptrabstractdeclarator(0);
				}
				break;
			case T__7:
			case Star:
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				ptroperator();
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << Star) | (1L << And))) != 0)) {
					{
					setState(421);
					ptrabstractdeclarator();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NoptrabstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterNoptrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitNoptrabstractdeclarator(this);
		}
	}

	public final NoptrabstractdeclaratorContext noptrabstractdeclarator() throws RecognitionException {
		return noptrabstractdeclarator(0);
	}

	private NoptrabstractdeclaratorContext noptrabstractdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractdeclaratorContext _localctx = new NoptrabstractdeclaratorContext(_ctx, _parentState);
		NoptrabstractdeclaratorContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_noptrabstractdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(427);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(428);
				match(T__1);
				setState(429);
				ptrabstractdeclarator();
				setState(430);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
					setState(434);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(435);
					parametersandqualifiers();
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NoptrabstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterNoptrabstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitNoptrabstractpackdeclarator(this);
		}
	}

	public final NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() throws RecognitionException {
		return noptrabstractpackdeclarator(0);
	}

	private NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractpackdeclaratorContext _localctx = new NoptrabstractpackdeclaratorContext(_ctx, _parentState);
		NoptrabstractpackdeclaratorContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_noptrabstractpackdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(442);
			match(T__8);
			}
			_ctx.stop = _input.LT(-1);
			setState(448);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
					setState(444);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(445);
					parametersandqualifiers();
					}
					} 
				}
				setState(450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationclauseContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterParameterdeclarationclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitParameterdeclarationclause(this);
		}
	}

	public final ParameterdeclarationclauseContext parameterdeclarationclause() throws RecognitionException {
		ParameterdeclarationclauseContext _localctx = new ParameterdeclarationclauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Wchar))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Identifier - 67)) | (1L << (Char - 67)) | (1L << (Char16 - 67)) | (1L << (Char32 - 67)) | (1L << (Bool - 67)) | (1L << (Double - 67)) | (1L << (Auto - 67)))) != 0)) {
					{
					setState(451);
					parameterdeclarationlist(0);
					}
				}

				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(454);
					match(T__8);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				parameterdeclarationlist(0);
				setState(458);
				match(T__6);
				setState(459);
				match(T__8);
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

	public static class ParameterdeclarationlistContext extends ParserRuleContext {
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterParameterdeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitParameterdeclarationlist(this);
		}
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		return parameterdeclarationlist(0);
	}

	private ParameterdeclarationlistContext parameterdeclarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, _parentState);
		ParameterdeclarationlistContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(464);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(466);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(467);
					match(T__6);
					setState(468);
					parameterdeclaration();
					}
					} 
				}
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterParameterdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitParameterdeclaration(this);
		}
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameterdeclaration);
		int _la;
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(474);
					attributespecifierseq(0);
					}
				}

				setState(477);
				simpletypespecifier();
				setState(478);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(480);
					attributespecifierseq(0);
					}
				}

				setState(483);
				declspecifierseq();
				setState(484);
				declarator();
				setState(485);
				match(Assign);
				setState(486);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(488);
					attributespecifierseq(0);
					}
				}

				setState(491);
				declspecifierseq();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(492);
					attributespecifierseq(0);
					}
				}

				setState(495);
				declspecifierseq();
				setState(496);
				match(Assign);
				setState(497);
				initializerclause();
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

	public static class FunctiondefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterFunctiondefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitFunctiondefinition(this);
		}
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functiondefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(501);
				simpletypespecifier();
				}
				break;
			}
			setState(504);
			declarator();
			setState(505);
			functionbody();
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

	public static class FunctionbodyContext extends ParserRuleContext {
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public TerminalNode Default() { return getToken(cppParser.Default, 0); }
		public TerminalNode Delete() { return getToken(cppParser.Delete, 0); }
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitFunctionbody(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionbody);
		int _la;
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(507);
					ctorinitializer();
					}
				}

				setState(510);
				match(T__9);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__7) | (1L << Float) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Switch) | (1L << Unsigned) | (1L << Void) | (1L << Wchar) | (1L << Star) | (1L << And))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Identifier - 67)) | (1L << (Integerliteral - 67)) | (1L << (Characterliteral - 67)) | (1L << (Floatingliteral - 67)) | (1L << (Stringliteral - 67)) | (1L << (Break - 67)) | (1L << (Continue - 67)) | (1L << (Char - 67)) | (1L << (Char16 - 67)) | (1L << (Char32 - 67)) | (1L << (Bool - 67)) | (1L << (Double - 67)) | (1L << (Auto - 67)))) != 0)) {
					{
					setState(511);
					statementseq(0);
					}
				}

				setState(514);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(Assign);
				setState(516);
				match(Default);
				setState(517);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				match(Assign);
				setState(519);
				match(Delete);
				setState(520);
				match(T__3);
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

	public static class InitializerContext extends ParserRuleContext {
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			braceorequalinitializer();
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

	public static class BraceorequalinitializerContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public List<IdexpressionContext> idexpression() {
			return getRuleContexts(IdexpressionContext.class);
		}
		public IdexpressionContext idexpression(int i) {
			return getRuleContext(IdexpressionContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public BraceorequalinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceorequalinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterBraceorequalinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitBraceorequalinitializer(this);
		}
	}

	public final BraceorequalinitializerContext braceorequalinitializer() throws RecognitionException {
		BraceorequalinitializerContext _localctx = new BraceorequalinitializerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_braceorequalinitializer);
		int _la;
		try {
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(525);
					idexpression();
					}
				}

				setState(528);
				match(Assign);
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(529);
					additiveexpression();
					}
					break;
				case 2:
					{
					setState(530);
					postfixexpression(0);
					}
					break;
				case 3:
					{
					setState(531);
					idexpression();
					}
					break;
				case 4:
					{
					setState(532);
					literal();
					}
					break;
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InitializerclauseContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public InitializerclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterInitializerclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitInitializerclause(this);
		}
	}

	public final InitializerclauseContext initializerclause() throws RecognitionException {
		InitializerclauseContext _localctx = new InitializerclauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_initializerclause);
		try {
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Wchar:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Char:
			case Char16:
			case Char32:
			case Bool:
			case Double:
			case Auto:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				assignmentexpression();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InitializerlistContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public InitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterInitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitInitializerlist(this);
		}
	}

	public final InitializerlistContext initializerlist() throws RecognitionException {
		return initializerlist(0);
	}

	private InitializerlistContext initializerlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerlistContext _localctx = new InitializerlistContext(_ctx, _parentState);
		InitializerlistContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(543);
			initializerclause();
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(544);
				match(T__8);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(547);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(548);
					match(T__6);
					setState(549);
					initializerclause();
					setState(551);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(550);
						match(T__8);
						}
						break;
					}
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BracedinitlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public BracedinitlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedinitlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterBracedinitlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitBracedinitlist(this);
		}
	}

	public final BracedinitlistContext bracedinitlist() throws RecognitionException {
		BracedinitlistContext _localctx = new BracedinitlistContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_bracedinitlist);
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(T__9);
				setState(559);
				initializerlist(0);
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(560);
					match(T__6);
					}
				}

				setState(563);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				match(T__9);
				setState(566);
				match(T__10);
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

	public static class ClassordecltypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(cppParser.Identifier, 0); }
		public ClassordecltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classordecltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterClassordecltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitClassordecltype(this);
		}
	}

	public final ClassordecltypeContext classordecltype() throws RecognitionException {
		ClassordecltypeContext _localctx = new ClassordecltypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classordecltype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(Identifier);
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

	public static class CtorinitializerContext extends ParserRuleContext {
		public CtorinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterCtorinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitCtorinitializer(this);
		}
	}

	public final CtorinitializerContext ctorinitializer() throws RecognitionException {
		CtorinitializerContext _localctx = new CtorinitializerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(T__11);
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

	public static class RightShiftContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(cppParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(cppParser.Greater, i);
		}
		public RightShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterRightShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitRightShift(this);
		}
	}

	public final RightShiftContext rightShift() throws RecognitionException {
		RightShiftContext _localctx = new RightShiftContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_rightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(Greater);
			setState(574);
			match(Greater);
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

	public static class RightShiftAssignContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(cppParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(cppParser.Greater, i);
		}
		public TerminalNode Assign() { return getToken(cppParser.Assign, 0); }
		public RightShiftAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShiftAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterRightShiftAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitRightShiftAssign(this);
		}
	}

	public final RightShiftAssignContext rightShiftAssign() throws RecognitionException {
		RightShiftAssignContext _localctx = new RightShiftAssignContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_rightShiftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(Greater);
			setState(577);
			match(Greater);
			setState(578);
			match(Assign);
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

	public static class TheoperatorContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(cppParser.New, 0); }
		public TerminalNode Delete() { return getToken(cppParser.Delete, 0); }
		public RightShiftContext rightShift() {
			return getRuleContext(RightShiftContext.class,0);
		}
		public RightShiftAssignContext rightShiftAssign() {
			return getRuleContext(RightShiftAssignContext.class,0);
		}
		public TheoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterTheoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitTheoperator(this);
		}
	}

	public final TheoperatorContext theoperator() throws RecognitionException {
		TheoperatorContext _localctx = new TheoperatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_theoperator);
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				match(New);
				setState(583);
				match(T__4);
				setState(584);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				match(Delete);
				setState(586);
				match(T__4);
				setState(587);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(588);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(589);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(590);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(591);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(592);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(593);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(594);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(595);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(596);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(597);
				match(Not);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(598);
				match(Assign);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(599);
				match(Less);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(600);
				match(Greater);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(601);
				match(T__12);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(602);
				match(MinusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(603);
				match(StarAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(604);
				match(DivAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(605);
				match(ModAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(606);
				match(XorAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(607);
				match(AndAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(608);
				match(OrAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(609);
				match(LeftShift);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(610);
				rightShift();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(611);
				rightShiftAssign();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(612);
				match(LeftShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(613);
				match(Equal);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(614);
				match(T__13);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(615);
				match(T__14);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(616);
				match(T__15);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(617);
				match(T__7);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(618);
				match(T__16);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(619);
				match(T__17);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(620);
				match(T__18);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(621);
				match(T__6);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(622);
				match(T__19);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(623);
				match(T__20);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(624);
				match(T__1);
				setState(625);
				match(T__2);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(626);
				match(T__4);
				setState(627);
				match(T__5);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integerliteral() { return getToken(cppParser.Integerliteral, 0); }
		public TerminalNode Characterliteral() { return getToken(cppParser.Characterliteral, 0); }
		public TerminalNode Floatingliteral() { return getToken(cppParser.Floatingliteral, 0); }
		public TerminalNode Stringliteral() { return getToken(cppParser.Stringliteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Integerliteral - 68)) | (1L << (Characterliteral - 68)) | (1L << (Floatingliteral - 68)) | (1L << (Stringliteral - 68)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		case 8:
			return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 12:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 18:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 20:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 24:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 28:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 29:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 31:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 38:
			return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixexpression_sempred(PostfixexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statementseq_sempred(StatementseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationseq_sempred(DeclarationseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerlist_sempred(InitializerlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Z\u027b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\5\2a\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4o\n\4\3\4\3\4\3\4\3\4\5\4u\n\4\3\4\3\4\7\4y\n\4"+
		"\f\4\16\4|\13\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0084\n\6\3\6\3\6\3\6\5\6"+
		"\u0089\n\6\3\6\3\6\5\6\u008d\n\6\3\6\3\6\3\6\5\6\u0092\n\6\3\6\3\6\5\6"+
		"\u0096\n\6\3\6\3\6\3\6\5\6\u009b\n\6\3\6\3\6\5\6\u009f\n\6\3\6\3\6\3\6"+
		"\5\6\u00a4\n\6\5\6\u00a6\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b0"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u00b7\n\b\3\t\3\t\5\t\u00bb\n\t\3\t\3\t\5"+
		"\t\u00bf\n\t\3\t\5\t\u00c2\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c9\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00d0\n\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00eb\n\13\3\f\3\f\5\f\u00ef\n\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00f7\n\f\3\f\3\f\3\f\3\f\5\f\u00fd\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0106\n\r\3\r\3\r\3\r\5\r\u010b\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0112\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u0119\n\16\f\16\16"+
		"\16\u011c\13\16\3\17\3\17\5\17\u0120\n\17\3\17\3\17\5\17\u0124\n\17\3"+
		"\17\5\17\u0127\n\17\3\17\3\17\5\17\u012b\n\17\3\17\3\17\3\17\5\17\u0130"+
		"\n\17\3\20\3\20\3\21\3\21\3\21\5\21\u0137\n\21\3\21\3\21\3\21\5\21\u013c"+
		"\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0147\n\24\f\24"+
		"\16\24\u014a\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\7\26\u0158\n\26\f\26\16\26\u015b\13\26\3\27\5\27\u015e\n\27\3"+
		"\27\3\27\5\27\u0162\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u016d\n\30\3\31\3\31\3\31\3\31\5\31\u0173\n\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u017b\n\32\3\32\3\32\5\32\u017f\n\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0185\n\32\3\32\3\32\7\32\u0189\n\32\f\32\16\32\u018c\13\32"+
		"\3\33\3\33\5\33\u0190\n\33\3\33\3\33\3\34\3\34\5\34\u0196\n\34\3\34\3"+
		"\34\5\34\u019a\n\34\3\34\3\34\5\34\u019e\n\34\3\34\3\34\5\34\u01a2\n\34"+
		"\5\34\u01a4\n\34\3\35\3\35\3\35\5\35\u01a9\n\35\5\35\u01ab\n\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u01b3\n\36\3\36\3\36\7\36\u01b7\n\36\f\36"+
		"\16\36\u01ba\13\36\3\37\3\37\3\37\3\37\3\37\7\37\u01c1\n\37\f\37\16\37"+
		"\u01c4\13\37\3 \5 \u01c7\n \3 \5 \u01ca\n \3 \3 \3 \3 \5 \u01d0\n \3!"+
		"\3!\3!\3!\3!\3!\7!\u01d8\n!\f!\16!\u01db\13!\3\"\5\"\u01de\n\"\3\"\3\""+
		"\3\"\3\"\5\"\u01e4\n\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01ec\n\"\3\"\3\"\5"+
		"\"\u01f0\n\"\3\"\3\"\3\"\3\"\5\"\u01f6\n\"\3#\5#\u01f9\n#\3#\3#\3#\3$"+
		"\5$\u01ff\n$\3$\3$\5$\u0203\n$\3$\3$\3$\3$\3$\3$\3$\5$\u020c\n$\3%\3%"+
		"\3&\5&\u0211\n&\3&\3&\3&\3&\3&\5&\u0218\n&\3&\5&\u021b\n&\3\'\3\'\5\'"+
		"\u021f\n\'\3(\3(\3(\5(\u0224\n(\3(\3(\3(\3(\5(\u022a\n(\7(\u022c\n(\f"+
		"(\16(\u022f\13(\3)\3)\3)\5)\u0234\n)\3)\3)\3)\3)\5)\u023a\n)\3*\3*\3+"+
		"\3+\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0277\n.\3/\3/\3/\2\f\6\22\32&*\62:"+
		"<@N\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\\2\4\b\2\34\34 !%&+-EESX\4\2FFLN\2\u02e5\2^\3\2\2\2\4"+
		"d\3\2\2\2\6n\3\2\2\2\b}\3\2\2\2\n\u00a5\3\2\2\2\f\u00af\3\2\2\2\16\u00b6"+
		"\3\2\2\2\20\u00c1\3\2\2\2\22\u00c3\3\2\2\2\24\u00ea\3\2\2\2\26\u00fc\3"+
		"\2\2\2\30\u0111\3\2\2\2\32\u0113\3\2\2\2\34\u012f\3\2\2\2\36\u0131\3\2"+
		"\2\2 \u013b\3\2\2\2\"\u013d\3\2\2\2$\u013f\3\2\2\2&\u0141\3\2\2\2(\u014b"+
		"\3\2\2\2*\u0151\3\2\2\2,\u015d\3\2\2\2.\u016c\3\2\2\2\60\u0172\3\2\2\2"+
		"\62\u0184\3\2\2\2\64\u018d\3\2\2\2\66\u01a3\3\2\2\28\u01aa\3\2\2\2:\u01b2"+
		"\3\2\2\2<\u01bb\3\2\2\2>\u01cf\3\2\2\2@\u01d1\3\2\2\2B\u01f5\3\2\2\2D"+
		"\u01f8\3\2\2\2F\u020b\3\2\2\2H\u020d\3\2\2\2J\u021a\3\2\2\2L\u021e\3\2"+
		"\2\2N\u0220\3\2\2\2P\u0239\3\2\2\2R\u023b\3\2\2\2T\u023d\3\2\2\2V\u023f"+
		"\3\2\2\2X\u0242\3\2\2\2Z\u0276\3\2\2\2\\\u0278\3\2\2\2^`\7\3\2\2_a\5\32"+
		"\16\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\2\2\3c\3\3\2\2\2de\7E\2\2e\5\3"+
		"\2\2\2fg\b\4\1\2go\5\\/\2ho\5\4\3\2ij\5\"\22\2jk\7\4\2\2kl\5\b\5\2lm\7"+
		"\5\2\2mo\3\2\2\2nf\3\2\2\2nh\3\2\2\2ni\3\2\2\2oz\3\2\2\2pq\f\4\2\2qt\7"+
		"\4\2\2ru\5\4\3\2su\5\\/\2tr\3\2\2\2ts\3\2\2\2uv\3\2\2\2vw\7\5\2\2wy\3"+
		"\2\2\2xp\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\7\3\2\2\2|z\3\2\2\2}~"+
		"\5\n\6\2~\t\3\2\2\2\177\u00a6\5\\/\2\u0080\u00a6\5\4\3\2\u0081\u0084\5"+
		"\4\3\2\u0082\u0084\5\\/\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0088\7\60\2\2\u0086\u0089\5\4\3\2\u0087\u0089\5"+
		"\\/\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u00a6\3\2\2\2\u008a"+
		"\u008d\5\4\3\2\u008b\u008d\5\\/\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0091\7\61\2\2\u008f\u0092\5\4\3\2\u0090"+
		"\u0092\5\\/\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u00a6\3\2"+
		"\2\2\u0093\u0096\5\4\3\2\u0094\u0096\5\\/\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009a\7.\2\2\u0098\u009b\5\4"+
		"\3\2\u0099\u009b\5\\/\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\u00a6\3\2\2\2\u009c\u009f\5\4\3\2\u009d\u009f\5\\/\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\7/\2\2\u00a1"+
		"\u00a4\5\4\3\2\u00a2\u00a4\5\\/\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a6\3\2\2\2\u00a5\177\3\2\2\2\u00a5\u0080\3\2\2\2\u00a5\u0083"+
		"\3\2\2\2\u00a5\u008c\3\2\2\2\u00a5\u0095\3\2\2\2\u00a5\u009e\3\2\2\2\u00a6"+
		"\13\3\2\2\2\u00a7\u00a8\5\4\3\2\u00a8\u00a9\79\2\2\u00a9\u00aa\5\\/\2"+
		"\u00aa\u00b0\3\2\2\2\u00ab\u00ac\5\4\3\2\u00ac\u00ad\7:\2\2\u00ad\u00ae"+
		"\5\\/\2\u00ae\u00b0\3\2\2\2\u00af\u00a7\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0"+
		"\r\3\2\2\2\u00b1\u00b7\5\\/\2\u00b2\u00b7\5\4\3\2\u00b3\u00b7\5\6\4\2"+
		"\u00b4\u00b7\5\n\6\2\u00b5\u00b7\5\f\7\2\u00b6\u00b1\3\2\2\2\u00b6\u00b2"+
		"\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\17\3\2\2\2\u00b8\u00c2\5\34\17\2\u00b9\u00bb\5&\24\2\u00ba\u00b9\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c2\5\24\13\2\u00bd"+
		"\u00bf\5&\24\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\5\30\r\2\u00c1\u00b8\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1"+
		"\u00be\3\2\2\2\u00c2\21\3\2\2\2\u00c3\u00c8\b\n\1\2\u00c4\u00c9\5\"\22"+
		"\2\u00c5\u00c9\5\24\13\2\u00c6\u00c9\5\34\17\2\u00c7\u00c9\5\30\r\2\u00c8"+
		"\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2"+
		"\2\2\u00c9\u00d3\3\2\2\2\u00ca\u00cf\f\3\2\2\u00cb\u00d0\5\"\22\2\u00cc"+
		"\u00d0\5\24\13\2\u00cd\u00d0\5\34\17\2\u00ce\u00d0\5\30\r\2\u00cf\u00cb"+
		"\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\23\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7"+
		"\7\36\2\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9\5\26\f\2\u00d9\u00da\7\5\2\2"+
		"\u00da\u00db\5\20\t\2\u00db\u00eb\3\2\2\2\u00dc\u00dd\7\36\2\2\u00dd\u00de"+
		"\7\4\2\2\u00de\u00df\5\26\f\2\u00df\u00e0\7\5\2\2\u00e0\u00e1\5\20\t\2"+
		"\u00e1\u00e2\7\32\2\2\u00e2\u00e3\5\20\t\2\u00e3\u00eb\3\2\2\2\u00e4\u00e5"+
		"\7*\2\2\u00e5\u00e6\7\4\2\2\u00e6\u00e7\5\26\f\2\u00e7\u00e8\7\5\2\2\u00e8"+
		"\u00e9\5\20\t\2\u00e9\u00eb\3\2\2\2\u00ea\u00d6\3\2\2\2\u00ea\u00dc\3"+
		"\2\2\2\u00ea\u00e4\3\2\2\2\u00eb\25\3\2\2\2\u00ec\u00fd\5\f\7\2\u00ed"+
		"\u00ef\5&\24\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\5 \21\2\u00f1\u00f2\5.\30\2\u00f2\u00f3\78\2\2\u00f3"+
		"\u00f4\5L\'\2\u00f4\u00fd\3\2\2\2\u00f5\u00f7\5&\24\2\u00f6\u00f5\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\5 \21\2\u00f9"+
		"\u00fa\5.\30\2\u00fa\u00fb\5P)\2\u00fb\u00fd\3\2\2\2\u00fc\u00ec\3\2\2"+
		"\2\u00fc\u00ee\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fd\27\3\2\2\2\u00fe\u00ff"+
		"\7Q\2\2\u00ff\u0112\7\6\2\2\u0100\u0101\7R\2\2\u0101\u0112\7\6\2\2\u0102"+
		"\u0105\7$\2\2\u0103\u0106\5\\/\2\u0104\u0106\5\4\3\2\u0105\u0103\3\2\2"+
		"\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0112"+
		"\7\6\2\2\u0108\u010a\7$\2\2\u0109\u010b\5\n\6\2\u010a\u0109\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0112\7\6\2\2\u010d\u010e\7$"+
		"\2\2\u010e\u010f\5P)\2\u010f\u0110\7\6\2\2\u0110\u0112\3\2\2\2\u0111\u00fe"+
		"\3\2\2\2\u0111\u0100\3\2\2\2\u0111\u0102\3\2\2\2\u0111\u0108\3\2\2\2\u0111"+
		"\u010d\3\2\2\2\u0112\31\3\2\2\2\u0113\u0114\b\16\1\2\u0114\u0115\5D#\2"+
		"\u0115\u011a\3\2\2\2\u0116\u0117\f\3\2\2\u0117\u0119\5D#\2\u0118\u0116"+
		"\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\33\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0130\5\"\22\2\u011e\u0120\5 \21"+
		"\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123"+
		"\5,\27\2\u0122\u0124\5,\27\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0127\7\6\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0130\3\2\2\2\u0128\u012a\5&\24\2\u0129\u012b\5 \21\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\5*"+
		"\26\2\u012d\u012e\7\6\2\2\u012e\u0130\3\2\2\2\u012f\u011d\3\2\2\2\u012f"+
		"\u011f\3\2\2\2\u012f\u0128\3\2\2\2\u0130\35\3\2\2\2\u0131\u0132\5\"\22"+
		"\2\u0132\37\3\2\2\2\u0133\u013c\5\"\22\2\u0134\u0136\5\36\20\2\u0135\u0137"+
		"\5&\24\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013c\3\2\2\2\u0138"+
		"\u0139\5\36\20\2\u0139\u013a\5 \21\2\u013a\u013c\3\2\2\2\u013b\u0133\3"+
		"\2\2\2\u013b\u0134\3\2\2\2\u013b\u0138\3\2\2\2\u013c!\3\2\2\2\u013d\u013e"+
		"\t\2\2\2\u013e#\3\2\2\2\u013f\u0140\7E\2\2\u0140%\3\2\2\2\u0141\u0142"+
		"\b\24\1\2\u0142\u0143\5(\25\2\u0143\u0148\3\2\2\2\u0144\u0145\f\3\2\2"+
		"\u0145\u0147\5(\25\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\'\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014c\7\7\2\2\u014c\u014d\7\7\2\2\u014d\u014e\5(\25\2\u014e\u014f\7\b"+
		"\2\2\u014f\u0150\7\b\2\2\u0150)\3\2\2\2\u0151\u0152\b\26\1\2\u0152\u0153"+
		"\5,\27\2\u0153\u0159\3\2\2\2\u0154\u0155\f\3\2\2\u0155\u0156\7\t\2\2\u0156"+
		"\u0158\5,\27\2\u0157\u0154\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a+\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e"+
		"\5\"\22\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2"+
		"\u015f\u0161\5.\30\2\u0160\u0162\5H%\2\u0161\u0160\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162-\3\2\2\2\u0163\u016d\5\4\3\2\u0164\u0165\5\4\3\2\u0165"+
		"\u0166\5\64\33\2\u0166\u016d\3\2\2\2\u0167\u016d\5\62\32\2\u0168\u016d"+
		"\5\60\31\2\u0169\u016a\5\62\32\2\u016a\u016b\5\64\33\2\u016b\u016d\3\2"+
		"\2\2\u016c\u0163\3\2\2\2\u016c\u0164\3\2\2\2\u016c\u0167\3\2\2\2\u016c"+
		"\u0168\3\2\2\2\u016c\u0169\3\2\2\2\u016d/\3\2\2\2\u016e\u0173\5\62\32"+
		"\2\u016f\u0170\5\66\34\2\u0170\u0171\5\60\31\2\u0171\u0173\3\2\2\2\u0172"+
		"\u016e\3\2\2\2\u0172\u016f\3\2\2\2\u0173\61\3\2\2\2\u0174\u0175\b\32\1"+
		"\2\u0175\u0185\5\\/\2\u0176\u0185\5\4\3\2\u0177\u0178\5\4\3\2\u0178\u017a"+
		"\7\7\2\2\u0179\u017b\5\4\3\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017e\7\b\2\2\u017d\u017f\5&\24\2\u017e\u017d\3\2"+
		"\2\2\u017e\u017f\3\2\2\2\u017f\u0185\3\2\2\2\u0180\u0181\7\4\2\2\u0181"+
		"\u0182\5\60\31\2\u0182\u0183\7\5\2\2\u0183\u0185\3\2\2\2\u0184\u0174\3"+
		"\2\2\2\u0184\u0176\3\2\2\2\u0184\u0177\3\2\2\2\u0184\u0180\3\2\2\2\u0185"+
		"\u018a\3\2\2\2\u0186\u0187\f\5\2\2\u0187\u0189\5\64\33\2\u0188\u0186\3"+
		"\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\63\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018f\7\4\2\2\u018e\u0190\5@!\2"+
		"\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192"+
		"\7\5\2\2\u0192\65\3\2\2\2\u0193\u0195\7\60\2\2\u0194\u0196\5&\24\2\u0195"+
		"\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u01a4\3\2\2\2\u0197\u0199\7\64"+
		"\2\2\u0198\u019a\5&\24\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u01a4\3\2\2\2\u019b\u019d\7\n\2\2\u019c\u019e\5&\24\2\u019d\u019c\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u01a4\3\2\2\2\u019f\u01a1\7\60\2\2\u01a0"+
		"\u01a2\5&\24\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2"+
		"\2\2\u01a3\u0193\3\2\2\2\u01a3\u0197\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3"+
		"\u019f\3\2\2\2\u01a4\67\3\2\2\2\u01a5\u01ab\5:\36\2\u01a6\u01a8\5\66\34"+
		"\2\u01a7\u01a9\58\35\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab"+
		"\3\2\2\2\u01aa\u01a5\3\2\2\2\u01aa\u01a6\3\2\2\2\u01ab9\3\2\2\2\u01ac"+
		"\u01ad\b\36\1\2\u01ad\u01b3\5\64\33\2\u01ae\u01af\7\4\2\2\u01af\u01b0"+
		"\58\35\2\u01b0\u01b1\7\5\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01ac\3\2\2\2\u01b2"+
		"\u01ae\3\2\2\2\u01b3\u01b8\3\2\2\2\u01b4\u01b5\f\5\2\2\u01b5\u01b7\5\64"+
		"\33\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9;\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\b\37\1\2"+
		"\u01bc\u01bd\7\13\2\2\u01bd\u01c2\3\2\2\2\u01be\u01bf\f\4\2\2\u01bf\u01c1"+
		"\5\64\33\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2"+
		"\u01c2\u01c3\3\2\2\2\u01c3=\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c7\5"+
		"@!\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01ca\7\13\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01d0\3"+
		"\2\2\2\u01cb\u01cc\5@!\2\u01cc\u01cd\7\t\2\2\u01cd\u01ce\7\13\2\2\u01ce"+
		"\u01d0\3\2\2\2\u01cf\u01c6\3\2\2\2\u01cf\u01cb\3\2\2\2\u01d0?\3\2\2\2"+
		"\u01d1\u01d2\b!\1\2\u01d2\u01d3\5B\"\2\u01d3\u01d9\3\2\2\2\u01d4\u01d5"+
		"\f\3\2\2\u01d5\u01d6\7\t\2\2\u01d6\u01d8\5B\"\2\u01d7\u01d4\3\2\2\2\u01d8"+
		"\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01daA\3\2\2\2"+
		"\u01db\u01d9\3\2\2\2\u01dc\u01de\5&\24\2\u01dd\u01dc\3\2\2\2\u01dd\u01de"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\5\"\22\2\u01e0\u01e1\5.\30\2"+
		"\u01e1\u01f6\3\2\2\2\u01e2\u01e4\5&\24\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\5 \21\2\u01e6\u01e7\5.\30\2\u01e7"+
		"\u01e8\78\2\2\u01e8\u01e9\5L\'\2\u01e9\u01f6\3\2\2\2\u01ea\u01ec\5&\24"+
		"\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f6"+
		"\5 \21\2\u01ee\u01f0\5&\24\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f2\5 \21\2\u01f2\u01f3\78\2\2\u01f3\u01f4\5L\'"+
		"\2\u01f4\u01f6\3\2\2\2\u01f5\u01dd\3\2\2\2\u01f5\u01e3\3\2\2\2\u01f5\u01eb"+
		"\3\2\2\2\u01f5\u01ef\3\2\2\2\u01f6C\3\2\2\2\u01f7\u01f9\5\"\22\2\u01f8"+
		"\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\5."+
		"\30\2\u01fb\u01fc\5F$\2\u01fcE\3\2\2\2\u01fd\u01ff\5T+\2\u01fe\u01fd\3"+
		"\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\7\f\2\2\u0201"+
		"\u0203\5\22\n\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3"+
		"\2\2\2\u0204\u020c\7\r\2\2\u0205\u0206\78\2\2\u0206\u0207\7Y\2\2\u0207"+
		"\u020c\7\6\2\2\u0208\u0209\78\2\2\u0209\u020a\7Z\2\2\u020a\u020c\7\6\2"+
		"\2\u020b\u01fe\3\2\2\2\u020b\u0205\3\2\2\2\u020b\u0208\3\2\2\2\u020cG"+
		"\3\2\2\2\u020d\u020e\5J&\2\u020eI\3\2\2\2\u020f\u0211\5\4\3\2\u0210\u020f"+
		"\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0217\78\2\2\u0213"+
		"\u0218\5\n\6\2\u0214\u0218\5\6\4\2\u0215\u0218\5\4\3\2\u0216\u0218\5\\"+
		"/\2\u0217\u0213\3\2\2\2\u0217\u0214\3\2\2\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u021b\5P)\2\u021a\u0210\3\2\2"+
		"\2\u021a\u0219\3\2\2\2\u021bK\3\2\2\2\u021c\u021f\5\16\b\2\u021d\u021f"+
		"\5P)\2\u021e\u021c\3\2\2\2\u021e\u021d\3\2\2\2\u021fM\3\2\2\2\u0220\u0221"+
		"\b(\1\2\u0221\u0223\5L\'\2\u0222\u0224\7\13\2\2\u0223\u0222\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u022d\3\2\2\2\u0225\u0226\f\3\2\2\u0226\u0227\7\t"+
		"\2\2\u0227\u0229\5L\'\2\u0228\u022a\7\13\2\2\u0229\u0228\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u0225\3\2\2\2\u022c\u022f\3\2"+
		"\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022eO\3\2\2\2\u022f\u022d"+
		"\3\2\2\2\u0230\u0231\7\f\2\2\u0231\u0233\5N(\2\u0232\u0234\7\t\2\2\u0233"+
		"\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\7\r"+
		"\2\2\u0236\u023a\3\2\2\2\u0237\u0238\7\f\2\2\u0238\u023a\7\r\2\2\u0239"+
		"\u0230\3\2\2\2\u0239\u0237\3\2\2\2\u023aQ\3\2\2\2\u023b\u023c\7E\2\2\u023c"+
		"S\3\2\2\2\u023d\u023e\7\16\2\2\u023eU\3\2\2\2\u023f\u0240\7:\2\2\u0240"+
		"\u0241\7:\2\2\u0241W\3\2\2\2\u0242\u0243\7:\2\2\u0243\u0244\7:\2\2\u0244"+
		"\u0245\78\2\2\u0245Y\3\2\2\2\u0246\u0277\7\"\2\2\u0247\u0277\7Z\2\2\u0248"+
		"\u0249\7\"\2\2\u0249\u024a\7\7\2\2\u024a\u0277\7\b\2\2\u024b\u024c\7Z"+
		"\2\2\u024c\u024d\7\7\2\2\u024d\u0277\7\b\2\2\u024e\u0277\7.\2\2\u024f"+
		"\u0277\7/\2\2\u0250\u0277\7\60\2\2\u0251\u0277\7\61\2\2\u0252\u0277\7"+
		"\62\2\2\u0253\u0277\7\63\2\2\u0254\u0277\7\64\2\2\u0255\u0277\7\65\2\2"+
		"\u0256\u0277\7\66\2\2\u0257\u0277\7\67\2\2\u0258\u0277\78\2\2\u0259\u0277"+
		"\79\2\2\u025a\u0277\7:\2\2\u025b\u0277\7\17\2\2\u025c\u0277\7;\2\2\u025d"+
		"\u0277\7<\2\2\u025e\u0277\7=\2\2\u025f\u0277\7>\2\2\u0260\u0277\7?\2\2"+
		"\u0261\u0277\7@\2\2\u0262\u0277\7A\2\2\u0263\u0277\7B\2\2\u0264\u0277"+
		"\5V,\2\u0265\u0277\5X-\2\u0266\u0277\7C\2\2\u0267\u0277\7D\2\2\u0268\u0277"+
		"\7\20\2\2\u0269\u0277\7\21\2\2\u026a\u0277\7\22\2\2\u026b\u0277\7\n\2"+
		"\2\u026c\u0277\7\23\2\2\u026d\u0277\7\24\2\2\u026e\u0277\7\25\2\2\u026f"+
		"\u0277\7\t\2\2\u0270\u0277\7\26\2\2\u0271\u0277\7\27\2\2\u0272\u0273\7"+
		"\4\2\2\u0273\u0277\7\5\2\2\u0274\u0275\7\7\2\2\u0275\u0277\7\b\2\2\u0276"+
		"\u0246\3\2\2\2\u0276\u0247\3\2\2\2\u0276\u0248\3\2\2\2\u0276\u024b\3\2"+
		"\2\2\u0276\u024e\3\2\2\2\u0276\u024f\3\2\2\2\u0276\u0250\3\2\2\2\u0276"+
		"\u0251\3\2\2\2\u0276\u0252\3\2\2\2\u0276\u0253\3\2\2\2\u0276\u0254\3\2"+
		"\2\2\u0276\u0255\3\2\2\2\u0276\u0256\3\2\2\2\u0276\u0257\3\2\2\2\u0276"+
		"\u0258\3\2\2\2\u0276\u0259\3\2\2\2\u0276\u025a\3\2\2\2\u0276\u025b\3\2"+
		"\2\2\u0276\u025c\3\2\2\2\u0276\u025d\3\2\2\2\u0276\u025e\3\2\2\2\u0276"+
		"\u025f\3\2\2\2\u0276\u0260\3\2\2\2\u0276\u0261\3\2\2\2\u0276\u0262\3\2"+
		"\2\2\u0276\u0263\3\2\2\2\u0276\u0264\3\2\2\2\u0276\u0265\3\2\2\2\u0276"+
		"\u0266\3\2\2\2\u0276\u0267\3\2\2\2\u0276\u0268\3\2\2\2\u0276\u0269\3\2"+
		"\2\2\u0276\u026a\3\2\2\2\u0276\u026b\3\2\2\2\u0276\u026c\3\2\2\2\u0276"+
		"\u026d\3\2\2\2\u0276\u026e\3\2\2\2\u0276\u026f\3\2\2\2\u0276\u0270\3\2"+
		"\2\2\u0276\u0271\3\2\2\2\u0276\u0272\3\2\2\2\u0276\u0274\3\2\2\2\u0277"+
		"[\3\2\2\2\u0278\u0279\t\3\2\2\u0279]\3\2\2\2R`ntz\u0083\u0088\u008c\u0091"+
		"\u0095\u009a\u009e\u00a3\u00a5\u00af\u00b6\u00ba\u00be\u00c1\u00c8\u00cf"+
		"\u00d3\u00ea\u00ee\u00f6\u00fc\u0105\u010a\u0111\u011a\u011f\u0123\u0126"+
		"\u012a\u012f\u0136\u013b\u0148\u0159\u015d\u0161\u016c\u0172\u017a\u017e"+
		"\u0184\u018a\u018f\u0195\u0199\u019d\u01a1\u01a3\u01a8\u01aa\u01b2\u01b8"+
		"\u01c2\u01c6\u01c9\u01cf\u01d9\u01dd\u01e3\u01eb\u01ef\u01f5\u01f8\u01fe"+
		"\u0202\u020b\u0210\u0217\u021a\u021e\u0223\u0229\u022d\u0233\u0239\u0276";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}