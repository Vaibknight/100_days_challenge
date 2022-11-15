package vaibhav;

public class Strings {
	
 public static String parent(String s) {
	 int n = s.length();
	 String res = "";
	 
	 for(int i=0; i<s.length(); i++) {
		 
		 if(i<n-1 && s.charAt(i)== s.charAt(i+1)) {
			 
			 continue;
		 }
		 
		 else {
			 res= res+s.charAt(i);
		 }
	 }
	 
	 return res;
	 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabb";
		System.out.println(parent(s));
	}

}
