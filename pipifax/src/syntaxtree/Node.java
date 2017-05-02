package syntaxtree;

public class Node extends Root{

	Root parent;
	
	public Node(Root parent){
		this.parent = parent;
		parent.addNode(this);
	}
}
