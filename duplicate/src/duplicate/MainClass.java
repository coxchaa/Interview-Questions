package duplicate;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainClass {
	public static ArrayList<String> testStrings = new ArrayList();

	public static void main(String[] args) {
		testStrings.add("dkdkdfhdudheuhfdhdatieihssheiee");
		testStrings.add("djfjddjqojofbvghfohfhqfhqhfhqgfvkfwhqvo8bdkjfkd");
		testStrings.add("kkksjfifhihqfonf;lwdfhiqfhfqfhbnvqhqkj");
		testStrings.add("hwwgwhfeirytqfhvgqg73782ihrfwhq7h");
		
		for(String testString: testStrings){
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
			}
		}
	}

}
