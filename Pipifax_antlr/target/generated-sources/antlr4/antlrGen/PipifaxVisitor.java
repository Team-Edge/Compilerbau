// Generated from ./Pipifax_antlr/Pipifax.g4 by ANTLR 4.7
package antlrGen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PipifaxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PipifaxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(PipifaxParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PipifaxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(PipifaxParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#optParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptParamList(PipifaxParser.OptParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(PipifaxParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#paramDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDecl(PipifaxParser.ParamDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(PipifaxParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PipifaxParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#ifInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfInstruction(PipifaxParser.IfInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(PipifaxParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(PipifaxParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(PipifaxParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#arrayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(PipifaxParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PipifaxParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#varAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAccess(PipifaxParser.VarAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PipifaxParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(PipifaxParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(PipifaxParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#invExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvExpression(PipifaxParser.InvExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(PipifaxParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#sumExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpression(PipifaxParser.SumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#multExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(PipifaxParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#bracExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracExpression(PipifaxParser.BracExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#innerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerExpression(PipifaxParser.InnerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(PipifaxParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#optArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptArgList(PipifaxParser.OptArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(PipifaxParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PipifaxParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PipifaxParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(PipifaxParser.CastContext ctx);
}