package charRepeat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharUtils {
	
	public int printNumRepeatCharNoDups(String inputString) {
		
		if(inputString == null  || inputString.length()<2) {
			//Log statement
			System.out.println("Number of unique duplicate adjacent "
								+ "characters for string \"" 
								+ inputString + "\": 0");
			return 0;
		}
		
		Set<String> countMap = new HashSet<String>();
		char[] inputStringChars = inputString.toCharArray();
		
		char current = inputStringChars[0];
		
		for(int i =0; i<inputStringChars.length-1;i++) {
			
			char next = inputStringChars[i+1];
			
			if(current==next) {
				countMap.add(current+"");
			}
			
			current = next;
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
