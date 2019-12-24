package com.order;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OrderNumber implements Comparable<OrderNumber>{
	private String Data;
	ArrayList<String> thisStringList = new ArrayList<String>();
	
	public OrderNumber(String s){
		Data = s;
		
		Matcher matcher = Pattern.compile("\\d+|\\D+").matcher(this.Data);
		ArrayList<String> tmpStringList = new ArrayList<String>();
		while (matcher.find())
		{
			tmpStringList.add(matcher.group());
		}
		
		for(String st: tmpStringList) {
			if(Character.isDigit(st.charAt(0))){
				thisStringList.add(st);
			}
			else {
				for(Character c: st.toCharArray()) {
					thisStringList.add(c.toString());
				}
			}
		}
	}
	
	public String getData() {
		return this.Data;
	}

	@Override
	public int compareTo(OrderNumber o) {
		if(o == null)
			return -1;
		
		if(this.Data.isEmpty() && o.Data.isEmpty())
			return 0;
		else if(this.Data.isEmpty())
			return 1;
		else if(o.Data.isEmpty())
			return -1;
		
		int loopSize = Math.min(this.thisStringList.size(), o.thisStringList.size());
		
		for(int i = 0; i<loopSize; i++) {
			String c1 = this.thisStringList.get(i);
			String c2 = o.thisStringList.get(i);
			if(Character.isDigit(c1.charAt(0))){
				if(Character.isDigit(c2.charAt(0))) {
					//both digits
					Integer i1 = Integer.parseInt(c1);
					Integer i2 = Integer.parseInt(c2);
					if(!i1.equals(i2))
						return i1.compareTo(i2);
				}
				else
					return 1;
			}
			else if (Character.isDigit(c2.charAt(0))){
				return -1;
			}
			else {
				//both strings
				if(!c1.equals(c2)) {
					return c1.compareTo(c2);
				}
			}
		}
		return 0;

	}

}
