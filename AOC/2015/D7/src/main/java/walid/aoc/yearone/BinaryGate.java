package walid.aoc.yearone;

public class BinaryGate extends Node{
	
	String type;
	Node input1, input2;
	private int storedSignal = -1;
	
	public BinaryGate(String type, Node input1, Node input2){
		super(type+input1.id+input2.id);
		this.type = type;
		this.input1 = input1;
		this.input2 = input2;
	}

	@Override
	public char signal() {
		if (storedSignal == -1){
			switch(type){
				case "AND" : storedSignal = input1.signal() & input2.signal(); break;
				case "OR" : storedSignal = input1.signal() | input2.signal(); break;
				case "LSHIFT" : storedSignal = input1.signal() << input2.signal(); break;
				case "RSHIFT" : storedSignal = input1.signal() >> input2.signal(); break;
			}
		}
		return (char) storedSignal;
	}

}
