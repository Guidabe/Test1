package walid.aoc.yearone;

/**
 * Hello world!
 *
 */
public class LookAndSay 
{
	public static String say(String input){
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i=0 ; i< input.length() ; i++){
			if(i+1<input.length()){		
				if (input.charAt(i) == input.charAt(i+1)){
					count++;
				}
				else{
					sb.append(String.valueOf(count)+input.charAt(i));
					count = 1;
				}
			}
			else{
				sb.append(String.valueOf(count)+input.charAt(i));
			}
				
		}
		return sb.toString();
	}

}
