package walid.aoc.yearone;

public class UnaryGate extends Node {

	String type;
	Node input;
	private int storedSignal = -1;
	
	public UnaryGate(String type, Node input){
		super(type+input.id);
		this.input = input;
		this.type = type;
	}
	
	@Override
	public char signal() {
		if (storedSignal == -1){			
			switch(type){
				case "NOT": storedSignal = ~input.signal(); break;
			}
		}
		return (char) storedSignal;
	}

}
