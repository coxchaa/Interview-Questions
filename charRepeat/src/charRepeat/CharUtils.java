package charRepeat;

import java.util.HashSet;
import java.util.Set;

public class CharUtils {
	
	public int printNumRepeatCharNoDups(String inputString) {
		Set<String> countMap = new HashSet<String>();
		int position =1;
		char[] inputStringChars = inputString.toCharArray();
		boolean toggle = false;
		
		for(char c: inputStringChars) {
			if(position<inputStringChars.length && c == inputStringChars[position] && !toggle) {
				toggle=true;
				countMap.add(c+"");
			}
			else
			{
				toggle = false;
			}
			position++;

		}
		
		System.out.println("Number of unique duplicate adjacent characters: " + countMap.size());
		return countMap.size();
		
		
	}
	
	
}
