package walid.aoc.yearone;

public abstract class Node {
	
	protected String id;
	
	public Node(String id){
		this.id = id;
	}
	
	public abstract char signal();
}
