package basetypes;

import java.util.ArrayList;
import java.util.List;

import structure.PipifaxVariable;

public class StatementContainerImpl implements StatementContainer {
	private VarContainerImpl vars;
	private VarContainer varParent;
	private VarContainer alias;
	private List<Statement> statList;
	private StatementContainer statParent;

	public StatementContainerImpl(StatementContainer statParent, VarContainer varParent, VarContainer alias) {
		this.varParent = varParent;
		this.alias = alias;
		this.vars=new VarContainerImpl(varParent, alias);
		this.statList = new ArrayList<Statement>();
	}

	@Override
	public PipifaxVariable getVarByName(String name) throws Exception {
		return vars.getVarByName(name);
	}

	@Override
	public PipifaxVariable getOrAddVarByName(String name) {
		return vars.getOrAddVarByName(name);
	}

	@Override
	public void addStatement(Statement stat) {
		this.statList.add(stat);	
	}

	@Override
	public StatementContainer getParent() {
		return statParent;
	}

	@Override
	public void addVariable(PipifaxVariable var) {
		this.vars.addVariable(var);	
	}

}
