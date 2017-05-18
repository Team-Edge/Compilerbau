package basetypes;

import structure.PipifaxFunction;

public interface FunctionContainer {

	public PipifaxFunction getFunctionByName(String name) throws Exception;
	
	public PipifaxFunction getOrAddFunctionByName(String name);
	
}
