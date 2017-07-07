package duplicate;

import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.KeyStore;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.crypto.SecretKey;

public class MainClass {
	public static String testString = "dkdkdfhdudheuhfdhdatieihssheiee";

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
		for(int i=0; i<testString.length();i++){
			if(!lhm.containsKey(testString.charAt(i)+"")){
				lhm.put(testString.charAt(i)+"", new Integer(1));
			}
			else
			{
				Integer tmp = lhm.get(testString.charAt(i)+"")+1;
				lhm.put(testString.charAt(i)+"",tmp);
			}
		}
		for (Map.Entry<String, Integer> entry : lhm.entrySet()) {
		    if(entry.getValue().intValue()==1){
		    	System.out.println(entry.getKey());
		    	break;
		    }
			FileInputStream fs;        
			BigInteger gi;
		}
	}

}
