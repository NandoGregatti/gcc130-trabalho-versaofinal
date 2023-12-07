// Generated from Javanes.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavanesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ATR=6, OPEQ=7, OPREL=8, OPBIN=9, 
		OPLOG=10, OPAND=11, OPOR=12, OPIMPL=13, NOT=14, NEG=15, AP=16, FP=17, 
		SEJA=18, EM=19, SE=20, SENAO=21, ENQUANTO=22, CADA=23, RETORNA=24, BOOL=25, 
		STRING=26, TIPOS=27, TIPOR=28, FUNC=29, NUM=30, ID=31, EXP=32, ATRARIT=33, 
		MULMODDIV=34, ADDSUB=35, OPARIT=36, COM=37, WS=38, ErrorChar=39;
	public static final int
		RULE_programa = 0, RULE_funcoes = 1, RULE_funcao = 2, RULE_parametro = 3, 
		RULE_parametros = 4, RULE_bloco = 5, RULE_tretorno = 6, RULE_corpo = 7, 
		RULE_instrucao = 8, RULE_condicional = 9, RULE_declaracao = 10, RULE_retorno = 11, 
		RULE_chamada = 12, RULE_args = 13, RULE_atribuicao = 14, RULE_cada = 15, 
		RULE_enquanto = 16, RULE_expr = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "funcoes", "funcao", "parametro", "parametros", "bloco", 
			"tretorno", "corpo", "instrucao", "condicional", "declaracao", "retorno", 
			"chamada", "args", "atribuicao", "cada", "enquanto", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'{'", "'}'", "';'", "'='", null, null, null, null, 
			"'&&'", "'||'", "'->'", "'!'", "'--'", "'('", "')'", "'seja'", "'em'", 
			"'se'", "'senao'", "'enquanto'", "'cada'", "'retorna'", null, null, null, 
			"'nada'", "'func'", null, null, "'**'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "ATR", "OPEQ", "OPREL", "OPBIN", 
			"OPLOG", "OPAND", "OPOR", "OPIMPL", "NOT", "NEG", "AP", "FP", "SEJA", 
			"EM", "SE", "SENAO", "ENQUANTO", "CADA", "RETORNA", "BOOL", "STRING", 
			"TIPOS", "TIPOR", "FUNC", "NUM", "ID", "EXP", "ATRARIT", "MULMODDIV", 
			"ADDSUB", "OPARIT", "COM", "WS", "ErrorChar"
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
	public String getGrammarFileName() { return "Javanes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavanesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public FuncoesContext funcoes() {
			return getRuleContext(FuncoesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			funcoes();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncoesContext extends ParserRuleContext {
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public FuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitFuncoes(this);
		}
	}

	public final FuncoesContext funcoes() throws RecognitionException {
		FuncoesContext _localctx = new FuncoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(38);
				funcao();
				}
				}
				setState(43);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(JavanesParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(JavanesParser.ID, 0); }
		public TerminalNode AP() { return getToken(JavanesParser.AP, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavanesParser.FP, 0); }
		public TretornoContext tretorno() {
			return getRuleContext(TretornoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(FUNC);
			setState(45);
			match(ID);
			setState(46);
			match(AP);
			setState(47);
			parametros();
			setState(48);
			match(FP);
			setState(49);
			tretorno();
			setState(50);
			bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavanesParser.ID, 0); }
		public TerminalNode TIPOS() { return getToken(JavanesParser.TIPOS, 0); }
		public TerminalNode BOOL() { return getToken(JavanesParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(JavanesParser.STRING, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(53);
			match(T__0);
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(56);
				parametro();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(57);
					match(T__1);
					setState(58);
					parametro();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__2);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2178154496L) != 0)) {
				{
				{
				setState(67);
				instrucao();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TretornoContext extends ParserRuleContext {
		public TerminalNode TIPOS() { return getToken(JavanesParser.TIPOS, 0); }
		public TerminalNode TIPOR() { return getToken(JavanesParser.TIPOR, 0); }
		public TerminalNode BOOL() { return getToken(JavanesParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(JavanesParser.STRING, 0); }
		public TretornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tretorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterTretorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitTretorno(this);
		}
	}

	public final TretornoContext tretorno() throws RecognitionException {
		TretornoContext _localctx = new TretornoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tretorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public InstrucaoContext instrucao() {
			return getRuleContext(InstrucaoContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_corpo);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				bloco();
				}
				break;
			case SEJA:
			case SE:
			case ENQUANTO:
			case CADA:
			case RETORNA:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				instrucao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public CadaContext cada() {
			return getRuleContext(CadaContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instrucao);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				declaracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				condicional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				chamada();
				setState(84);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				atribuicao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				cada();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				enquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				retorno();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(JavanesParser.SE, 0); }
		public TerminalNode AP() { return getToken(JavanesParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavanesParser.FP, 0); }
		public List<CorpoContext> corpo() {
			return getRuleContexts(CorpoContext.class);
		}
		public CorpoContext corpo(int i) {
			return getRuleContext(CorpoContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(JavanesParser.SENAO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(SE);
			setState(93);
			match(AP);
			setState(94);
			expr(0);
			setState(95);
			match(FP);
			setState(96);
			corpo();
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(97);
				match(SENAO);
				setState(98);
				corpo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode SEJA() { return getToken(JavanesParser.SEJA, 0); }
		public TerminalNode ID() { return getToken(JavanesParser.ID, 0); }
		public TerminalNode ATR() { return getToken(JavanesParser.ATR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(SEJA);
			setState(102);
			match(ID);
			setState(103);
			match(ATR);
			setState(104);
			expr(0);
			setState(105);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNA() { return getToken(JavanesParser.RETORNA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(RETORNA);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3322003456L) != 0)) {
				{
				setState(108);
				expr(0);
				}
			}

			setState(111);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChamadaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavanesParser.ID, 0); }
		public TerminalNode AP() { return getToken(JavanesParser.AP, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavanesParser.FP, 0); }
		public ChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitChamada(this);
		}
	}

	public final ChamadaContext chamada() throws RecognitionException {
		ChamadaContext _localctx = new ChamadaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_chamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ID);
			setState(114);
			match(AP);
			setState(115);
			args();
			setState(116);
			match(FP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3322003456L) != 0)) {
				{
				setState(118);
				expr(0);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(119);
					match(T__1);
					setState(120);
					expr(0);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavanesParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ATR() { return getToken(JavanesParser.ATR, 0); }
		public TerminalNode ATRARIT() { return getToken(JavanesParser.ATRARIT, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ID);
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==ATR || _la==ATRARIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(130);
			expr(0);
			setState(131);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CadaContext extends ParserRuleContext {
		public TerminalNode CADA() { return getToken(JavanesParser.CADA, 0); }
		public TerminalNode AP() { return getToken(JavanesParser.AP, 0); }
		public TerminalNode ID() { return getToken(JavanesParser.ID, 0); }
		public TerminalNode EM() { return getToken(JavanesParser.EM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavanesParser.FP, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public CadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterCada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitCada(this);
		}
	}

	public final CadaContext cada() throws RecognitionException {
		CadaContext _localctx = new CadaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(CADA);
			setState(134);
			match(AP);
			setState(135);
			match(ID);
			setState(136);
			match(EM);
			setState(137);
			expr(0);
			setState(138);
			match(FP);
			setState(139);
			corpo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(JavanesParser.ENQUANTO, 0); }
		public TerminalNode AP() { return getToken(JavanesParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavanesParser.FP, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitEnquanto(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ENQUANTO);
			setState(142);
			match(AP);
			setState(143);
			expr(0);
			setState(144);
			match(FP);
			setState(145);
			corpo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(JavanesParser.NUM, 0); }
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JavanesParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(JavanesParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(JavanesParser.ID, 0); }
		public TerminalNode NOT() { return getToken(JavanesParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEG() { return getToken(JavanesParser.NEG, 0); }
		public TerminalNode AP() { return getToken(JavanesParser.AP, 0); }
		public TerminalNode FP() { return getToken(JavanesParser.FP, 0); }
		public TerminalNode EXP() { return getToken(JavanesParser.EXP, 0); }
		public TerminalNode MULMODDIV() { return getToken(JavanesParser.MULMODDIV, 0); }
		public TerminalNode OPBIN() { return getToken(JavanesParser.OPBIN, 0); }
		public TerminalNode ADDSUB() { return getToken(JavanesParser.ADDSUB, 0); }
		public TerminalNode OPEQ() { return getToken(JavanesParser.OPEQ, 0); }
		public TerminalNode OPREL() { return getToken(JavanesParser.OPREL, 0); }
		public TerminalNode OPAND() { return getToken(JavanesParser.OPAND, 0); }
		public TerminalNode OPOR() { return getToken(JavanesParser.OPOR, 0); }
		public TerminalNode OPIMPL() { return getToken(JavanesParser.OPIMPL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavanesListener ) ((JavanesListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(148);
				match(NUM);
				}
				break;
			case 2:
				{
				setState(149);
				chamada();
				}
				break;
			case 3:
				{
				setState(150);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(151);
				match(BOOL);
				}
				break;
			case 5:
				{
				setState(152);
				match(ID);
				}
				break;
			case 6:
				{
				setState(153);
				match(NOT);
				setState(154);
				expr(11);
				}
				break;
			case 7:
				{
				setState(155);
				match(NEG);
				setState(156);
				expr(10);
				}
				break;
			case 8:
				{
				setState(157);
				match(AP);
				setState(158);
				expr(0);
				setState(159);
				match(FP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(164);
						match(EXP);
						setState(165);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(167);
						match(MULMODDIV);
						setState(168);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(170);
						match(OPBIN);
						setState(171);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(173);
						match(ADDSUB);
						setState(174);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(176);
						_la = _input.LA(1);
						if ( !(_la==OPEQ || _la==OPREL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(177);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(179);
						match(OPAND);
						setState(180);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(182);
						match(OPOR);
						setState(183);
						expr(3);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(185);
						match(OPIMPL);
						setState(186);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0005\u0001(\b\u0001\n\u0001\f\u0001+\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004<\b\u0004\n\u0004\f\u0004?\t\u0004"+
		"\u0003\u0004A\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005E\b\u0005\n\u0005"+
		"\f\u0005H\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007P\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b[\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\td\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"n\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0005\rz\b\r\n\r\f\r}\t\r\u0003\r\u007f\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00a2\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00bc\b\u0011\n\u0011\f\u0011\u00bf\t\u0011\u0001\u0011\u0000\u0001\""+
		"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"\u0000\u0004\u0001\u0000\u0019\u001b\u0001\u0000"+
		"\u0019\u001c\u0002\u0000\u0006\u0006!!\u0001\u0000\u0007\b\u00cc\u0000"+
		"$\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004,\u0001"+
		"\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b@\u0001\u0000\u0000"+
		"\u0000\nB\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000\u000eO\u0001"+
		"\u0000\u0000\u0000\u0010Z\u0001\u0000\u0000\u0000\u0012\\\u0001\u0000"+
		"\u0000\u0000\u0014e\u0001\u0000\u0000\u0000\u0016k\u0001\u0000\u0000\u0000"+
		"\u0018q\u0001\u0000\u0000\u0000\u001a~\u0001\u0000\u0000\u0000\u001c\u0080"+
		"\u0001\u0000\u0000\u0000\u001e\u0085\u0001\u0000\u0000\u0000 \u008d\u0001"+
		"\u0000\u0000\u0000\"\u00a1\u0001\u0000\u0000\u0000$%\u0003\u0002\u0001"+
		"\u0000%\u0001\u0001\u0000\u0000\u0000&(\u0003\u0004\u0002\u0000\'&\u0001"+
		"\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,-\u0005\u001d\u0000\u0000-.\u0005\u001f\u0000\u0000./\u0005"+
		"\u0010\u0000\u0000/0\u0003\b\u0004\u000001\u0005\u0011\u0000\u000012\u0003"+
		"\f\u0006\u000023\u0003\n\u0005\u00003\u0005\u0001\u0000\u0000\u000045"+
		"\u0005\u001f\u0000\u000056\u0005\u0001\u0000\u000067\u0007\u0000\u0000"+
		"\u00007\u0007\u0001\u0000\u0000\u00008=\u0003\u0006\u0003\u00009:\u0005"+
		"\u0002\u0000\u0000:<\u0003\u0006\u0003\u0000;9\u0001\u0000\u0000\u0000"+
		"<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@8\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000A\t\u0001\u0000\u0000\u0000BF\u0005"+
		"\u0003\u0000\u0000CE\u0003\u0010\b\u0000DC\u0001\u0000\u0000\u0000EH\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u0004\u0000"+
		"\u0000J\u000b\u0001\u0000\u0000\u0000KL\u0007\u0001\u0000\u0000L\r\u0001"+
		"\u0000\u0000\u0000MP\u0003\n\u0005\u0000NP\u0003\u0010\b\u0000OM\u0001"+
		"\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\u000f\u0001\u0000\u0000"+
		"\u0000Q[\u0003\u0014\n\u0000R[\u0003\u0012\t\u0000ST\u0003\u0018\f\u0000"+
		"TU\u0005\u0005\u0000\u0000U[\u0001\u0000\u0000\u0000V[\u0003\u001c\u000e"+
		"\u0000W[\u0003\u001e\u000f\u0000X[\u0003 \u0010\u0000Y[\u0003\u0016\u000b"+
		"\u0000ZQ\u0001\u0000\u0000\u0000ZR\u0001\u0000\u0000\u0000ZS\u0001\u0000"+
		"\u0000\u0000ZV\u0001\u0000\u0000\u0000ZW\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\u0011\u0001\u0000\u0000"+
		"\u0000\\]\u0005\u0014\u0000\u0000]^\u0005\u0010\u0000\u0000^_\u0003\""+
		"\u0011\u0000_`\u0005\u0011\u0000\u0000`c\u0003\u000e\u0007\u0000ab\u0005"+
		"\u0015\u0000\u0000bd\u0003\u000e\u0007\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000d\u0013\u0001\u0000\u0000\u0000ef\u0005\u0012"+
		"\u0000\u0000fg\u0005\u001f\u0000\u0000gh\u0005\u0006\u0000\u0000hi\u0003"+
		"\"\u0011\u0000ij\u0005\u0005\u0000\u0000j\u0015\u0001\u0000\u0000\u0000"+
		"km\u0005\u0018\u0000\u0000ln\u0003\"\u0011\u0000ml\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0005\u0005\u0000"+
		"\u0000p\u0017\u0001\u0000\u0000\u0000qr\u0005\u001f\u0000\u0000rs\u0005"+
		"\u0010\u0000\u0000st\u0003\u001a\r\u0000tu\u0005\u0011\u0000\u0000u\u0019"+
		"\u0001\u0000\u0000\u0000v{\u0003\"\u0011\u0000wx\u0005\u0002\u0000\u0000"+
		"xz\u0003\"\u0011\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u007f\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000~v\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u001b\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u001f\u0000\u0000\u0081\u0082\u0007\u0002\u0000\u0000\u0082\u0083"+
		"\u0003\"\u0011\u0000\u0083\u0084\u0005\u0005\u0000\u0000\u0084\u001d\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u0017\u0000\u0000\u0086\u0087\u0005"+
		"\u0010\u0000\u0000\u0087\u0088\u0005\u001f\u0000\u0000\u0088\u0089\u0005"+
		"\u0013\u0000\u0000\u0089\u008a\u0003\"\u0011\u0000\u008a\u008b\u0005\u0011"+
		"\u0000\u0000\u008b\u008c\u0003\u000e\u0007\u0000\u008c\u001f\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0005\u0016\u0000\u0000\u008e\u008f\u0005\u0010"+
		"\u0000\u0000\u008f\u0090\u0003\"\u0011\u0000\u0090\u0091\u0005\u0011\u0000"+
		"\u0000\u0091\u0092\u0003\u000e\u0007\u0000\u0092!\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0006\u0011\uffff\uffff\u0000\u0094\u00a2\u0005\u001e\u0000"+
		"\u0000\u0095\u00a2\u0003\u0018\f\u0000\u0096\u00a2\u0005\u001a\u0000\u0000"+
		"\u0097\u00a2\u0005\u0019\u0000\u0000\u0098\u00a2\u0005\u001f\u0000\u0000"+
		"\u0099\u009a\u0005\u000e\u0000\u0000\u009a\u00a2\u0003\"\u0011\u000b\u009b"+
		"\u009c\u0005\u000f\u0000\u0000\u009c\u00a2\u0003\"\u0011\n\u009d\u009e"+
		"\u0005\u0010\u0000\u0000\u009e\u009f\u0003\"\u0011\u0000\u009f\u00a0\u0005"+
		"\u0011\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u0093\u0001"+
		"\u0000\u0000\u0000\u00a1\u0095\u0001\u0000\u0000\u0000\u00a1\u0096\u0001"+
		"\u0000\u0000\u0000\u00a1\u0097\u0001\u0000\u0000\u0000\u00a1\u0098\u0001"+
		"\u0000\u0000\u0000\u00a1\u0099\u0001\u0000\u0000\u0000\u00a1\u009b\u0001"+
		"\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a2\u00bd\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\n\b\u0000\u0000\u00a4\u00a5\u0005 \u0000"+
		"\u0000\u00a5\u00bc\u0003\"\u0011\t\u00a6\u00a7\n\u0007\u0000\u0000\u00a7"+
		"\u00a8\u0005\"\u0000\u0000\u00a8\u00bc\u0003\"\u0011\b\u00a9\u00aa\n\u0006"+
		"\u0000\u0000\u00aa\u00ab\u0005\t\u0000\u0000\u00ab\u00bc\u0003\"\u0011"+
		"\u0007\u00ac\u00ad\n\u0005\u0000\u0000\u00ad\u00ae\u0005#\u0000\u0000"+
		"\u00ae\u00bc\u0003\"\u0011\u0006\u00af\u00b0\n\u0004\u0000\u0000\u00b0"+
		"\u00b1\u0007\u0003\u0000\u0000\u00b1\u00bc\u0003\"\u0011\u0005\u00b2\u00b3"+
		"\n\u0003\u0000\u0000\u00b3\u00b4\u0005\u000b\u0000\u0000\u00b4\u00bc\u0003"+
		"\"\u0011\u0004\u00b5\u00b6\n\u0002\u0000\u0000\u00b6\u00b7\u0005\f\u0000"+
		"\u0000\u00b7\u00bc\u0003\"\u0011\u0003\u00b8\u00b9\n\u0001\u0000\u0000"+
		"\u00b9\u00ba\u0005\r\u0000\u0000\u00ba\u00bc\u0003\"\u0011\u0002\u00bb"+
		"\u00a3\u0001\u0000\u0000\u0000\u00bb\u00a6\u0001\u0000\u0000\u0000\u00bb"+
		"\u00a9\u0001\u0000\u0000\u0000\u00bb\u00ac\u0001\u0000\u0000\u0000\u00bb"+
		"\u00af\u0001\u0000\u0000\u0000\u00bb\u00b2\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b5\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be#\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\r)=@FOZcm{~\u00a1\u00bb\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}