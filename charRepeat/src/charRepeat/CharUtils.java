package charRepeat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharUtils {
	
	public int printNumRepeatCharNoDups(String inputString) {
		
		if(inputString == null) {
			//Log statement
			System.out.println("Number of unique duplicate adjacent characters for string null: 0");
			return 0;
		}
		
		Set<String> countMap = new HashSet<String>();
		int position =1;
		char[] inputStringChars = inputString.toCharArray();
		
		for(char c: inputStringChars) {
			if(position<inputStringChars.length && c == inputStringChars[position]) {
				countMap.add(c+"");
			}
			position++;

		}
		
		//Log statement
		System.out.println("Number of unique duplicate adjacent "
							+ "characters for string \"" 
							+ inputString + "\": " 
							+ countMap.size());
		
		return countMap.size();
		
		
	}
	
	public Map<String,Integer> printNumRepeatCharCountDups(String inputString) {
		Map<String,Integer> retMap = new HashMap<String,Integer>();
				
		//TO DO: Implement		
				
		return retMap;
	}
	
	
}
