// Generated from ./Pipifax_antlr/Pipifax.g4 by ANTLR 4.7
package antlrGen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PipifaxParser}.
 */
public interface PipifaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(PipifaxParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(PipifaxParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PipifaxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PipifaxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PipifaxParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PipifaxParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#optParamList}.
	 * @param ctx the parse tree
	 */
	void enterOptParamList(PipifaxParser.OptParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#optParamList}.
	 * @param ctx the parse tree
	 */
	void exitOptParamList(PipifaxParser.OptParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(PipifaxParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(PipifaxParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void enterParamDecl(PipifaxParser.ParamDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void exitParamDecl(PipifaxParser.ParamDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(PipifaxParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(PipifaxParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PipifaxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PipifaxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#ifInstruction}.
	 * @param ctx the parse tree
	 */
	void enterIfInstruction(PipifaxParser.IfInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#ifInstruction}.
	 * @param ctx the parse tree
	 */
	void exitIfInstruction(PipifaxParser.IfInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(PipifaxParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(PipifaxParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PipifaxParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PipifaxParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(PipifaxParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(PipifaxParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(PipifaxParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(PipifaxParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PipifaxParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PipifaxParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#varAccess}.
	 * @param ctx the parse tree
	 */
	void enterVarAccess(PipifaxParser.VarAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#varAccess}.
	 * @param ctx the parse tree
	 */
	void exitVarAccess(PipifaxParser.VarAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PipifaxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PipifaxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(PipifaxParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(PipifaxParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(PipifaxParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(PipifaxParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#invExpression}.
	 * @param ctx the parse tree
	 */
	void enterInvExpression(PipifaxParser.InvExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#invExpression}.
	 * @param ctx the parse tree
	 */
	void exitInvExpression(PipifaxParser.InvExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(PipifaxParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(PipifaxParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#sumExpression}.
	 * @param ctx the parse tree
	 */
	void enterSumExpression(PipifaxParser.SumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#sumExpression}.
	 * @param ctx the parse tree
	 */
	void exitSumExpression(PipifaxParser.SumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(PipifaxParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(PipifaxParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#bracExpression}.
	 * @param ctx the parse tree
	 */
	void enterBracExpression(PipifaxParser.BracExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#bracExpression}.
	 * @param ctx the parse tree
	 */
	void exitBracExpression(PipifaxParser.BracExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#innerExpression}.
	 * @param ctx the parse tree
	 */
	void enterInnerExpression(PipifaxParser.InnerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#innerExpression}.
	 * @param ctx the parse tree
	 */
	void exitInnerExpression(PipifaxParser.InnerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(PipifaxParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(PipifaxParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#optArgList}.
	 * @param ctx the parse tree
	 */
	void enterOptArgList(PipifaxParser.OptArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#optArgList}.
	 * @param ctx the parse tree
	 */
	void exitOptArgList(PipifaxParser.OptArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(PipifaxParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(PipifaxParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PipifaxParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PipifaxParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PipifaxParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PipifaxParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(PipifaxParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(PipifaxParser.CastContext ctx);
}