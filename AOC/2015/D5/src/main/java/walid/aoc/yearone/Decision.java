package walid.aoc.yearone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import walid.utils.*;

/**
 * Decision Class
 *
 */
public class Decision 
{
	private List<String> strings = new ArrayList<String>();	
	private File inputFile;
	private List<Rule> rules;

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}
		
	public void load(String inputPath) throws IOException{
		strings.clear();
		inputFile = FileUtils.getResourceFile(inputPath);
		
		String line = "";
		try(BufferedReader buf = new BufferedReader(new FileReader(inputFile))){
			while((line = buf.readLine()) != null){
				strings.add(line);
			}
		}
	}
	
	public long nbNice(){
		return strings.stream().filter(s->rules.stream().allMatch((r)->r.isConform(s))).count();
	}
	
	
}
