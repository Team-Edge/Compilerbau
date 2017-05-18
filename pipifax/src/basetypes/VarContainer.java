package basetypes;

import structure.PipifaxVariable;

public interface VarContainer {
	
	public PipifaxVariable getVarByName(String name) throws Exception;
	public PipifaxVariable getOrAddVarByName(String name);
	public void addVariable(PipifaxVariable var);
	
}
