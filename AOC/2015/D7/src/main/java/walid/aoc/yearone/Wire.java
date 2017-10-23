package walid.aoc.yearone;

public class Wire extends Node {
	
	private Node input;
	
	private int storedSignal = -1;
	
	public Wire(String id){
		super(id);
	}

	@Override
	public char signal() {
		if (storedSignal == -1){		
			storedSignal = input.signal();
		}
		return (char) storedSignal;
	}
	
	public void setInput(Node input){
		this.input = input;
	}
}
