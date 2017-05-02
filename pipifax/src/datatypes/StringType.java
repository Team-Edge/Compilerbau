package datatypes;

import syntaxtree.Node;
import syntaxtree.Root;

public class StringType extends Node implements Type{

	String name;
	String value;
	
	public StringType(Root parent, String name) {
		super(parent);
		this.name = name;
	}
}
