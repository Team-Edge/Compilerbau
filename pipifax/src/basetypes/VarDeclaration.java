package basetypes;

import structure.PipifaxFunction;
import structure.PipifaxVariable;

public class VarDeclaration implements Statement {
	private PipifaxVariable var;
	private StatementContainer parent;
	
	public VarDeclaration(PipifaxVariable var, StatementContainer parent) {
		this.parent = parent;
		this.var = var;
	}

	@Override
	public StatementContainer getParent() {
		return parent;
	}

	public PipifaxVariable getVar() {
		return var;
	}
	
	public boolean isReference() {
		return false;
	}
	
}
