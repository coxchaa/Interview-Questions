package com.order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OrderNumber implements Comparable<OrderNumber>{
	private String Data;
	
	public OrderNumber(String s){
		Data = s;
	}
	
	public String getData() {
		return this.Data;
	}

	@Override
	public int compareTo(OrderNumber o) {
		String inputString = o.Data;
		
		ArrayList<String> thisStringList = new ArrayList<String>();
		ArrayList<String> inputStringList = new ArrayList<String>();
		
		Matcher matcher = Pattern.compile("\\d+|\\D+").matcher(this.Data);
		while (matcher.find())
		{
			thisStringList.add(matcher.group());
		}
		
		matcher = Pattern.compile("\\d+|\\D+").matcher(inputString);
		while (matcher.find())
		{
			inputStringList.add(matcher.group());
		}
		
		int s2Count = 0;
		for(String thisStringListIt: thisStringList) {
			//System.out.println(s);
			if(Character.isDigit(thisStringListIt.charAt(0))) {
				Integer sInt = new Integer(thisStringListIt);
				if(inputString.length()<s2Count+1) {
					return 1;
				}
				if(Character.isDigit(inputStringList.get(s2Count).charAt(0))) {
					Integer s2Int = new Integer(inputStringList.get(s2Count));
					if(!(s2Int.compareTo(sInt)==0)) {
						return sInt.compareTo(s2Int);
					}
				}
			}
			else {
				if(inputString.length()<s2Count+1) {
					return 1;
				}
				if(Character.isDigit(inputStringList.get(s2Count).charAt(0))) {
					return 1;
				}
				else {
					if(!(thisStringListIt.compareTo(inputStringList.get(s2Count))==0)) {
						return thisStringListIt.compareTo(inputStringList.get(s2Count));
					}
				}
			}
			s2Count++;
		}
		
		if(s2Count==0) {
			return -1;
		}
		
		return 0;
		

	}

}
