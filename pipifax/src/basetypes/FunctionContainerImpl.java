package basetypes;

import java.util.ArrayList;
import java.util.List;

import structure.PipifaxFunction;

public class FunctionContainerImpl implements FunctionContainer {
	private List<PipifaxFunction> funcList;
	private FunctionContainer parent;
	private FunctionContainer funcAlias;
	private VarContainer varAlias;

	public FunctionContainerImpl(FunctionContainer parent, FunctionContainer funcAlias, VarContainer varAlias) {
		this.parent = parent;
		this.funcAlias = funcAlias;
		this.varAlias = varAlias;
		this.funcList = new ArrayList<PipifaxFunction>();
	}

	@Override
	public PipifaxFunction getFunctionByName(String name) throws Exception {
		for(PipifaxFunction current : this.funcList) {
			if(current.getName().contentEquals(name)) {
				return current;
			}
		}
		if(this.parent!=null) {
			return this.parent.getFunctionByName(name);
		} else {
			throw new Exception("Function not found");
		}
	}

	@Override
	public PipifaxFunction getOrAddFunctionByName(String name) {
		try {
			return this.getFunctionByName(name);
		} catch(Exception e) {
			PipifaxFunction newFunc = new PipifaxFunction(name, this.funcAlias, this.varAlias);
			funcList.add(newFunc);
			return newFunc;
		}
	}

}
