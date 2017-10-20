package walid.aoc.yearone;

public class RepeatedRule implements Rule {

	@Override
	public boolean isConform(String s) {
		return s.matches(".*([a-zA-Z])[a-zA-Z]\\1.*");
	}

}
