package vaibhav;

import java.util.*;

public class Helloworld {

	
	
	public static int subString(String str) {
		
		int res = 0;
		
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length();j++) {
				if(repeat(str,i,j)) {
					res = Math.max(res,j-i+1);
					
				}
			}
		}
		return res;
	}
	
	public static boolean repeat(String str, int start, int end) {
		
		int[] chars = new int[128];
		
		for (int i = start; i <= end; i++) {
            char c = str.charAt(i);
            chars[c]++;
            if (chars[c] > 1) {
                return false;
            }
		}
		return true;
	}
	
	public static void main (String[] args) {
		
		String str = "pwwkew";
		
	
		System.out.println(subString(str));
		
		
	
		
	}
	
}

	


