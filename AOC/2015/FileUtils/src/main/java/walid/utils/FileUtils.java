package walid.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Hello world!
 *
 */
public class FileUtils 
{

    public static File getResourceFile(String filePath){

    	ClassLoader classLoader = FileUtils.class.getClassLoader();
    	return new File(classLoader.getResource(filePath).getFile());
    }
    
    public static String readFileToString(String filePath)
    	    throws java.io.IOException{

    	File file = getResourceFile(filePath);

        StringBuffer fileData = new StringBuffer(1000);
        try(BufferedReader reader = new BufferedReader(
                new FileReader(file))){
        	
	        char[] buf = new char[1024];
	
	        int numRead=0;
	        while((numRead=reader.read(buf)) != -1){
	            String readData = String.valueOf(buf, 0, numRead);
	            fileData.append(readData);
	            buf = new char[1024];
	        }

        }
        return fileData.toString();
    }
}
