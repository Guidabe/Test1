package walid.aoc.yearone;

public class Value extends Node {

	private char signal;
	
	Value(char signal){
		super(String.valueOf(signal));
		this.signal = signal;
	}

	@Override
	public char signal() {
		return signal;
	}

}
