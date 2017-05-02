package datatypes;

import syntaxtree.Node;
import syntaxtree.Root;

public class ArrayType extends Node implements Type{

	String name;
	double value;
	
	public ArrayType(Root parent, String name) {
		super(parent);
		this.name = name;
	}
}
