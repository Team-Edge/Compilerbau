package datatypes;

import syntaxtree.*;

public class IntType extends Node implements Type{

	String name;
	int value;
	
	public IntType(Root parent, String name) {
		super(parent);
		this.name = name;
	}
	
	
	/*public IntType(String name){
		this.name = name;
	}*/
}
