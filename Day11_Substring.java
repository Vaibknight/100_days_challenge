package vaibhav;

public class Substring {
	
	
	public static String substr(String str, int st, int ed) {
		
		String str1 = "";
		for(int i=st; i<ed; i++) {
			str1+=str.charAt(i);
		}
		return str1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HelloWorld";
		System.out.println(substr(str,0,5));
	}

}
