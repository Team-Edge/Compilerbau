package structure;

import basetypes.FunctionContainer;
import basetypes.FunctionContainerImpl;
import basetypes.VarContainer;
import basetypes.VarContainerImpl;

public class PipifaxProgram implements VarContainer, FunctionContainer {
	private FunctionContainerImpl funcContainer;
	private VarContainerImpl varContainer;

	public PipifaxProgram() {
		this.funcContainer = new FunctionContainerImpl(null, this, this);
		this.varContainer = new VarContainerImpl(null, this);
	}

	public PipifaxFunction getFunctionByName(String name) throws Exception {
		return funcContainer.getFunctionByName(name);
	}

	public PipifaxFunction getOrAddFunctionByName(String name) {
		return funcContainer.getOrAddFunctionByName(name);
	}

	public PipifaxVariable getVarByName(String name) throws Exception {
		return varContainer.getVarByName(name);
	}

	public PipifaxVariable getOrAddVarByName(String name) {
		return varContainer.getOrAddVarByName(name);
	}

	@Override
	public void addVariable(PipifaxVariable var) {
		this.varContainer.addVariable(var);		
	}

}
