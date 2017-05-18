package structure;

import basetypes.StatementContainer;
import basetypes.VarDeclaration;

public class ParamDeclaration extends VarDeclaration {
	private boolean callByRef;

	public ParamDeclaration(PipifaxVariable var, StatementContainer parent, boolean callByRef) {
		super(var, parent);
		this.callByRef = callByRef;
	}
	
	public boolean isReference() {
		return this.callByRef;
	}

}
