package structure;

import java.util.ArrayList;
import java.util.List;

import basetypes.FunctionContainer;
import basetypes.Statement;
import basetypes.StatementContainer;
import basetypes.VarContainer;
import basetypes.VarContainerImpl;

public class PipifaxFunction implements VarContainer, StatementContainer {
	private String name;
	private FunctionContainer parent;
	private List<ParamDeclaration> params;
	private StatementContainer implementation;
	

	
	public PipifaxFunction(String name, FunctionContainer funcParent, VarContainer varParent) {
		this.name = name;
		this.parent = funcParent;
		this.params = new ArrayList<ParamDeclaration>();
	}

	public String getName() {
		return name;
	}

	public FunctionContainer getContainer() {
		return parent;
	}

	public PipifaxVariable getVarByName(String name) throws Exception {
		return implementation.getVarByName(name);
	}

	public PipifaxVariable getOrAddVarByName(String name) {
		return implementation.getOrAddVarByName(name);
	}

	@Override
	public StatementContainer getParent() {
		return null;
	}

	@Override
	public void addStatement(Statement stat) {
		this.implementation.addStatement(stat);
	}

	public void addParam(ParamDeclaration param) {
		this.params.add(param);
		this.implementation.addVariable(param.getVar());
	}

	@Override
	public void addVariable(PipifaxVariable var) {
		this.implementation.addVariable(var);		
	}
	
}
