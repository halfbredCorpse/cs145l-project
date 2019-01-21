// Generated from C:/Javalib/dovahzul\dovahzul.g4 by ANTLR 4.7.2
package com.dovahzul;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dovahzulParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, VAR=12, INT=13, STR=14, TRUE=15, FALSE=16, WS=17;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_let = 2, RULE_show = 3, RULE_equation = 4, 
		RULE_add = 5, RULE_minus = 6, RULE_mult = 7, RULE_div = 8, RULE_and = 9, 
		RULE_or = 10, RULE_less = 11, RULE_greater = 12, RULE_equal = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "let", "show", "equation", "add", "minus", "mult", 
			"div", "and", "or", "less", "greater", "equal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'LOS'", "'REIN'", "'AAV'", "'AUS'", "'DUN'", "'DUR'", "'AHRK'", 
			"'ONT'", "'SAHLO'", "'LOT'", "'RO'", null, null, null, "'VAHZAH'", "'FOLAAS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"VAR", "INT", "STR", "TRUE", "FALSE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "dovahzul.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dovahzulParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==VAR );
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
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				let();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				show();
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(dovahzulParser.VAR, 0); }
		public TerminalNode INT() { return getToken(dovahzulParser.INT, 0); }
		public TerminalNode STR() { return getToken(dovahzulParser.STR, 0); }
		public TerminalNode TRUE() { return getToken(dovahzulParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(dovahzulParser.FALSE, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitLet(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(VAR);
			setState(38);
			match(T__0);
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(39);
				match(INT);
				}
				break;
			case 2:
				{
				setState(40);
				match(STR);
				}
				break;
			case 3:
				{
				setState(41);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(42);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(43);
				equation();
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

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(dovahzulParser.INT, 0); }
		public TerminalNode VAR() { return getToken(dovahzulParser.VAR, 0); }
		public TerminalNode TRUE() { return getToken(dovahzulParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(dovahzulParser.FALSE, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitShow(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__1);
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(47);
				match(INT);
				}
				break;
			case 2:
				{
				setState(48);
				match(VAR);
				}
				break;
			case 3:
				{
				setState(49);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(50);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(51);
				equation();
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

	public static class EquationContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public LessContext less() {
			return getRuleContext(LessContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitEquation(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_equation);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				add();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				minus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				mult();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				div();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				and();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				or();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				less();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(61);
				greater();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(62);
				equal();
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

	public static class AddContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(dovahzulParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(dovahzulParser.INT, i);
		}
		public List<TerminalNode> VAR() { return getTokens(dovahzulParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(dovahzulParser.VAR, i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(66);
			match(T__2);
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==INT) ) {
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

	public static class MinusContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(dovahzulParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(dovahzulParser.INT, i);
		}
		public List<TerminalNode> VAR() { return getTokens(dovahzulParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(dovahzulParser.VAR, i);
		}
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitMinus(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			match(T__3);
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==INT) ) {
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

	public static class MultContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(dovahzulParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(dovahzulParser.INT, i);
		}
		public List<TerminalNode> VAR() { return getTokens(dovahzulParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(dovahzulParser.VAR, i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(74);
			match(T__4);
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==INT) ) {
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

	public static class DivContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(dovahzulParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(dovahzulParser.INT, i);
		}
		public List<TerminalNode> VAR() { return getTokens(dovahzulParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(dovahzulParser.VAR, i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(78);
			match(T__5);
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==INT) ) {
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

	public static class AndContext extends ParserRuleContext {
		public List<TerminalNode> TRUE() { return getTokens(dovahzulParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(dovahzulParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(dovahzulParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(dovahzulParser.FALSE, i);
		}
		public List<TerminalNode> VAR() { return getTokens(dovahzulParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(dovahzulParser.VAR, i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
			match(T__6);
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
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

	public static class OrContext extends ParserRuleContext {
		public List<TerminalNode> TRUE() { return getTokens(dovahzulParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(dovahzulParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(dovahzulParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(dovahzulParser.FALSE, i);
		}
		public List<TerminalNode> VAR() { return getTokens(dovahzulParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(dovahzulParser.VAR, i);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(86);
			match(T__7);
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
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

	public static class LessContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(dovahzulParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(dovahzulParser.INT, i);
		}
		public LessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitLess(this);
		}
	}

	public final LessContext less() throws RecognitionException {
		LessContext _localctx = new LessContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_less);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(INT);
			setState(90);
			match(T__8);
			setState(91);
			match(INT);
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

	public static class GreaterContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(dovahzulParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(dovahzulParser.INT, i);
		}
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitGreater(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(INT);
			setState(94);
			match(T__9);
			setState(95);
			match(INT);
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

	public static class EqualContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(dovahzulParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(dovahzulParser.INT, i);
		}
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dovahzulListener ) ((dovahzulListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(INT);
			setState(98);
			match(T__10);
			setState(99);
			match(INT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3\5\3"+
		"&\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\67\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\3\2\16\17\4\2\16\16"+
		"\21\22\2k\2\37\3\2\2\2\4%\3\2\2\2\6\'\3\2\2\2\b\60\3\2\2\2\nA\3\2\2\2"+
		"\fC\3\2\2\2\16G\3\2\2\2\20K\3\2\2\2\22O\3\2\2\2\24S\3\2\2\2\26W\3\2\2"+
		"\2\30[\3\2\2\2\32_\3\2\2\2\34c\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2"+
		"\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#&\5\6\4\2$&\5\b\5\2%#\3\2\2\2"+
		"%$\3\2\2\2&\5\3\2\2\2\'(\7\16\2\2(.\7\3\2\2)/\7\17\2\2*/\7\20\2\2+/\7"+
		"\21\2\2,/\7\22\2\2-/\5\n\6\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2."+
		"-\3\2\2\2/\7\3\2\2\2\60\66\7\4\2\2\61\67\7\17\2\2\62\67\7\16\2\2\63\67"+
		"\7\21\2\2\64\67\7\22\2\2\65\67\5\n\6\2\66\61\3\2\2\2\66\62\3\2\2\2\66"+
		"\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\t\3\2\2\28B\5\f\7\29B\5\16"+
		"\b\2:B\5\20\t\2;B\5\22\n\2<B\5\24\13\2=B\5\26\f\2>B\5\30\r\2?B\5\32\16"+
		"\2@B\5\34\17\2A8\3\2\2\2A9\3\2\2\2A:\3\2\2\2A;\3\2\2\2A<\3\2\2\2A=\3\2"+
		"\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\13\3\2\2\2CD\t\2\2\2DE\7\5\2\2EF\t"+
		"\2\2\2F\r\3\2\2\2GH\t\2\2\2HI\7\6\2\2IJ\t\2\2\2J\17\3\2\2\2KL\t\2\2\2"+
		"LM\7\7\2\2MN\t\2\2\2N\21\3\2\2\2OP\t\2\2\2PQ\7\b\2\2QR\t\2\2\2R\23\3\2"+
		"\2\2ST\t\3\2\2TU\7\t\2\2UV\t\3\2\2V\25\3\2\2\2WX\t\3\2\2XY\7\n\2\2YZ\t"+
		"\3\2\2Z\27\3\2\2\2[\\\7\17\2\2\\]\7\13\2\2]^\7\17\2\2^\31\3\2\2\2_`\7"+
		"\17\2\2`a\7\f\2\2ab\7\17\2\2b\33\3\2\2\2cd\7\17\2\2de\7\r\2\2ef\7\17\2"+
		"\2f\35\3\2\2\2\7!%.\66A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}