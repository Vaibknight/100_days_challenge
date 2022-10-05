package vaibhav;

public class Strings {
	
 public static String phone(String arr[], String s) {
	
	 
	String output = "";
	
	int n = s.length();
	
	for(int i=0; i<n;i++) {
		
		if(s.charAt(i) == ' ') {
			
			output = output + "0";
			
		}
		
		else {
			int position = s.charAt(i) - 'A';
			output = output + arr[position];
		}
	}
	
	return output;
	 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "GEEKSFORGEEKS";
		
		String arr[] = {"2", "22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","8","88","888","9","99","999"};
		
		System.out.println(phone(arr,s));
	}

}
