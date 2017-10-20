package walid.aoc.yearone;

public class DoubleRule implements Rule {

	@Override
	public boolean isConform(String s) {
		return s.matches(".*([a-zA-Z])\\1.*");
	}

}
