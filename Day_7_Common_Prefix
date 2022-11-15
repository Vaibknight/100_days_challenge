package vaibhav;

import java.util.Arrays;

public class Day7 {

	 public static String longestCommonPrefix(String[] strs) {
	        
	        StringBuilder s = new StringBuilder();
	        
	        Arrays.sort(strs);
	        
	        char[] first  = strs[0].toCharArray();
	        char[] last  = strs[strs.length-1].toCharArray() ;
	        
	        
	        for(int i=0 ; i<first.length-1; i++){
	            if(first[i] != last[i])
	                break;
	            
	            s.append(first[i]);
	        }
	        return s.toString();
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs [] = {"flower","flow","flight"};
		
		System.out.println(longestCommonPrefix(strs));
	}

}
