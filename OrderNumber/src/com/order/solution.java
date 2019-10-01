package com.order;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
    	Set<Integer> m = new HashSet<Integer>();
    	for(int i=0; i<A.length; i++) {
    		m.add(new Integer(A[i]));
    	}
    	for(int i=1; i<1000000;i++) {
    		if(m.add(new Integer(i)))
    			return i;
    	}
    	
    	return 1;
    }
}
