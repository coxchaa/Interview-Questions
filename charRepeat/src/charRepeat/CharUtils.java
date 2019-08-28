package charRepeat;

import java.util.HashSet;
import java.util.Set;

public class CharUtils {
	
	public int printNumRepeatCharNoDups(String inputString) {
		
		if(inputString == null) {
			System.out.println("Number of unique duplicate adjacent characters for string null: 0");
			return 0;
		}
		
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
		
		System.out.println("Number of unique duplicate adjacent characters for string \"" + inputString + "\": " + countMap.size());
		return countMap.size();
		
		
	}
	
	
}
