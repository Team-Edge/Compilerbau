package structure;

import basetypes.VarContainer;
import basetypes.VarDeclaration;

public class PipifaxVariable {
	private String name;
	private VarContainer container;
	private Datatype type;
	private VarDeclaration declaration;
	private boolean isReference;

	
	public PipifaxVariable(String name, VarContainer container) {
		this.name = name;
		this.container = container;
		this.isReference = false;
	}

	public String getName() {
		return name;
	}

	public VarContainer getContainer() {
		return container;
	}

	public Datatype getType() {
		return type;
	}

	public void setType(Datatype type) {
		this.type = type;
	}

	public VarDeclaration getDeclaration() {
		return declaration;
	}

	public void setDeclaration(VarDeclaration declaration) {
		this.declaration = declaration;
		this.isReference = declaration.isReference();
	}
	
	public boolean isReference() {
		return this.isReference;
	}
	
}
