package walid.aoc.yearone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import walid.utils.FileUtils;

/**
 * Hello world!
 *
 */
public class LightGrid 
{
	//private boolean[][] lights = new boolean[1000][1000];
	private int[][] lights = new int[1000][1000];
	
	public void light(String input) throws IOException{
		File file = FileUtils.getResourceFile(input);
		try(BufferedReader buf = new BufferedReader(new FileReader(file))){
			String line = "";
			while((line = buf.readLine()) != null){
				String[] tokens = line.split(" ");
				int[] rec = new int[4];
				int iter = 0; 
				if (tokens.length == 5){
					for(String coor : tokens[2].split(",")){
						rec[iter++] = Integer.parseInt(coor);
					}
					for(String coor : tokens[4].split(",")){
						rec[iter++] = Integer.parseInt(coor);
					}
					for(int i=rec[0];i<=rec[2]; i++){
						for(int j=rec[1];j<=rec[3]; j++){						
							switch(tokens[1]){
								case "on": 
									//lights[i][j] = true;
									lights[i][j] ++;
									break;
								case "off": 
									//lights[i][j] = false;
									if(lights[i][j] != 0) lights[i][j]--;
									break;
							}
						}
					}
				}
				else if (tokens.length == 4){
					for(String coor : tokens[1].split(",")){
						rec[iter++] = Integer.parseInt(coor);
					}
					for(String coor : tokens[3].split(",")){
						rec[iter++] = Integer.parseInt(coor);
					}
					for(int i=rec[0];i<=rec[2]; i++){
						for(int j=rec[1];j<=rec[3]; j++){
							//lights[i][j] = !lights[i][j];
							lights[i][j] +=2;
						}
					}
				}
			}
		}	
	}
	
	public int nbLitLights(){
		int count = 0;
		for(int i=0;i<lights.length; i++){
			for(int j=0;j<lights[i].length; j++){
				//if(lights[i][j]) count++;
				count += lights[i][j];
			}
		}
		return count;	
	}
}
