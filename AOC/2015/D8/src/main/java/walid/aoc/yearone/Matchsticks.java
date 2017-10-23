package walid.aoc.yearone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import walid.utils.FileUtils;

/**
 * Day 8: Matchsticks
 *
 */
public class Matchsticks 
{
	public int space(File file) throws IOException{
		int count = 0;
		try(BufferedReader buf = new BufferedReader(new FileReader(file))){
			String line;
			while ((line = buf.readLine()) != null){
				count += line.length();
				for (int i = 0 ; i < line.length() ; i++){
					char x = line.charAt(i);
					switch (x){
						case '\\':
							switch(line.charAt(i+1)){
								case 'x': i+=3; break;
								case '"': 
								case '\\': i+=1; break;
							}
							break;
						case '"' : continue;
					}
					count--;
				}
			}
		}
		return count;
	}

	public int space2(File file) throws IOException{
		int count = 0;
		try(BufferedReader buf = new BufferedReader(new FileReader(file))){
			String line;
			while ((line = buf.readLine()) != null){
				count -= line.length() - 2;
				for (int i = 0 ; i < line.length() ; i++){
					char x = line.charAt(i);
					switch (x){
						case '\\':
						case '"' : count++;
					}
					count++;
				}
			}
		}
		return count;
	}
}
