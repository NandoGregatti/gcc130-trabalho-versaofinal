// Generated from Javanes.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavanesParser}.
 */
public interface JavanesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavanesParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(JavanesParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(JavanesParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void enterFuncoes(JavanesParser.FuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void exitFuncoes(JavanesParser.FuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(JavanesParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(JavanesParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(JavanesParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(JavanesParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(JavanesParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(JavanesParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(JavanesParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(JavanesParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#tretorno}.
	 * @param ctx the parse tree
	 */
	void enterTretorno(JavanesParser.TretornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#tretorno}.
	 * @param ctx the parse tree
	 */
	void exitTretorno(JavanesParser.TretornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(JavanesParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(JavanesParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(JavanesParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(JavanesParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(JavanesParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(JavanesParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(JavanesParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(JavanesParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(JavanesParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(JavanesParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#chamada}.
	 * @param ctx the parse tree
	 */
	void enterChamada(JavanesParser.ChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#chamada}.
	 * @param ctx the parse tree
	 */
	void exitChamada(JavanesParser.ChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(JavanesParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(JavanesParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(JavanesParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(JavanesParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#cada}.
	 * @param ctx the parse tree
	 */
	void enterCada(JavanesParser.CadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#cada}.
	 * @param ctx the parse tree
	 */
	void exitCada(JavanesParser.CadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(JavanesParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(JavanesParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavanesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JavanesParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavanesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JavanesParser.ExprContext ctx);
}