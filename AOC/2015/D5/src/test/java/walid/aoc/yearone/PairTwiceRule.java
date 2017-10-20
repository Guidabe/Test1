package walid.aoc.yearone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PairTwiceRule implements Rule{

	@Override
	public boolean isConform(String s) {
		Pattern p = Pattern.compile("([a-zA-Z][a-zA-Z]).*\\1");
		Matcher m = p.matcher(s);
		return m.find();
	}

}
