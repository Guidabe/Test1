package walid.aoc.yearone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BannedRule implements Rule {

	@Override
	public boolean isConform(String s) {
		Pattern p = Pattern.compile("ab|cd|pq|xy");
		Matcher m = p.matcher(s);
		return !m.find();
	}

}
