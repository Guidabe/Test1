package walid.aoc.yearone;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

/**
 * Hello world!
 *
 */
public class MD5Lookup 
{
	private String key;
	private MessageDigest md;

	public MD5Lookup(String key){
		this.key = key;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String digest(){
		byte[] digest = md.digest(key.getBytes());
		return DatatypeConverter.printHexBinary(digest);
	}
	
	public int find(String expr){
		for (int iter = 0;iter != Integer.MAX_VALUE;++iter){
			byte[] digest = md.digest((key+iter).getBytes());
			String digestString = DatatypeConverter.printHexBinary(digest);
			if (expr.equals(digestString.substring(0, expr.length()))){
				return iter;
			}
		}
		return 0; 
	}
}
