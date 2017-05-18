package basetypes;

import java.util.ArrayList;
import java.util.List;

import structure.PipifaxVariable;

public class VarContainerImpl implements VarContainer {
	private List<PipifaxVariable> varList;
	private VarContainer parent;
	private VarContainer alias;

	public VarContainerImpl(VarContainer parent, VarContainer alias) {
		this.parent = parent;
		this.alias = alias;
		this.varList = new ArrayList<PipifaxVariable>();
	}

	@Override
	public PipifaxVariable getVarByName(String name) throws Exception {
		for(PipifaxVariable current : this.varList) {
			if(current.getName().contentEquals(name)) {
				return current;
			}
		}
		if(this.parent!=null) {
			return this.parent.getVarByName(name);
		} else {
			throw new Exception("Function not found");
		}
	}

	@Override
	public PipifaxVariable getOrAddVarByName(String name) {
		try {
			return this.getVarByName(name);
		} catch(Exception e) {
			PipifaxVariable newVar = new PipifaxVariable(name, this.alias);
			this.varList.add(newVar);
			return newVar;
		}
	}

	@Override
	public void addVariable(PipifaxVariable var) {
		this.varList.add(var);	
	}


}
