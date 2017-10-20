package walid.aoc.yearone;

public class VowelsRule implements Rule {

	@Override
	public boolean isConform(String s) {
		return s.matches(".*[aeiou].*[aeiou].*[aeiou].*");
	}

}
