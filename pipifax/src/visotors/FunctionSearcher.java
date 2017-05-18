package visotors;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import antlrGen.PipifaxBaseVisitor;
import antlrGen.PipifaxParser;
import antlrGen.PipifaxParser.DeclarationContext;
import antlrGen.PipifaxParser.FuncCallContext;
import antlrGen.PipifaxParser.FunctionContext;
import antlrGen.PipifaxParser.ParamDeclContext;
import basetypes.FunctionContainer;
import basetypes.StatementContainer;
import basetypes.VarContainer;
import structure.ParamDeclaration;
import structure.PipifaxFunction;
import structure.PipifaxProgram;
import structure.PipifaxVariable;

public class FunctionSearcher extends PipifaxBaseVisitor<PipifaxProgram>{
	private ParseTree parsetree;
	private PipifaxProgram prog;
	private FunctionContainer currentFC;	
	private VarContainer currentVC;
	private StatementContainer currentSC;
	private PipifaxFunction currentFunction;
	
	
	private enum Context {
		NONE, FUNC, DECL, STATS	
	} 
	private Context con;
	
	
	public FunctionSearcher(ParseTree t) {
		this.parsetree = t;
		this.prog = null;
		this.currentFC = null;
		this.currentVC = null;
		this.currentSC = null;
		this.currentFunction = null;
		this.con = con.NONE;
		this.buildAST();
	}
	
	private void buildAST() {
		this.visit(this.parsetree);
	}
	
	@Override 
	public PipifaxProgram visitProgram(PipifaxParser.ProgramContext ctx) { 
		this.prog = new PipifaxProgram();
		this.currentFC = this.prog;
		this.currentVC = this.prog;
		return super.visitProgram(ctx);
	}
	
	
	
	
	
	@Override
	public PipifaxProgram visitFunction(FunctionContext ctx) {
		PipifaxFunction func = currentFC.getOrAddFunctionByName(ctx.ID().getText());
		this.currentVC = func;
		this.currentSC = func;
		this.currentFunction = func;
		return super.visitFunction(ctx);
	}
	
	

	@Override
	public PipifaxProgram visitParamDecl(ParamDeclContext ctx) {
		PipifaxVariable var = this.currentVC.getOrAddVarByName(ctx.ID().getText());
		boolean callByRef = false;
		if(ctx.OP_MULT() != null) {
			callByRef = true;
		}
		ParamDeclaration decl = new ParamDeclaration(var, this.currentFunction, callByRef);
		var.setDeclaration(decl);
		
		
		return super.visitParamDecl(ctx);
	}

	@Override
	public PipifaxProgram visitDeclaration(DeclarationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDeclaration(ctx);
	}

	@Override
	public PipifaxProgram visitFuncCall(FuncCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFuncCall(ctx);
	}

	public PipifaxProgram getAST() {
		return this.prog;
	}
	
	protected PipifaxProgram defaultResult() {
		return this.prog;
	}

}
