package rotation;

public class Rotator {
	public static Boolean isRotation(String s1,String s2) {
		StringBuilder sb = new StringBuilder(s1.toUpperCase());
		
		Boolean ret = new Boolean(false);
		if(s1.length()!= s2.length()) {
			return ret.FALSE;
		}
		
		if(sb.append(s1.toUpperCase()).indexOf(s2.toUpperCase())>-1) {
			return ret.TRUE;
		}
		
		
		return ret;
	}
	
	public static Boolean isRotation2(String s1,String s2) {
		
		if(s1.length()!= s2.length()) {
			return Boolean.FALSE;
		}
		
		int marker=0;
		String uppers1 = s1.toUpperCase();
		String uppers2 = s2.toUpperCase();
		
		for(int i=0; i<s2.length();i++) {
			if(uppers1.charAt(marker)==uppers2.charAt(i)) {
				marker++;
			}
			else {
				marker=0;
			}
		}
		
		if(s1.substring(marker).equalsIgnoreCase(s2.substring(0,s2.length()-marker))) {
			return Boolean.TRUE;
		}
		else
			return Boolean.FALSE;
	}
}
