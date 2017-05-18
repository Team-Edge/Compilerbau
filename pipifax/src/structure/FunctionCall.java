package structure;

import basetypes.Statement;
import basetypes.StatementContainer;

public class FunctionCall implements Statement {
	private PipifaxFunction func;
	private StatementContainer parent;

	public FunctionCall(PipifaxFunction func, StatementContainer parent) {
		this.parent = parent;
		this.func = func;
	}

	@Override
	public StatementContainer getParent() {
		return this.parent;
	}

}
