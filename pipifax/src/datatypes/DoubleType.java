package datatypes;

import syntaxtree.Node;
import syntaxtree.Root;

public class DoubleType extends Node implements Type{

	String name;
	double value;
	
	public DoubleType(Root parent, String name) {
		super(parent);
		this.name = name;
	}
}
