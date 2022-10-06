package vaibhav;

public class Pack {
	
	static int Max_char = 256;
	
	public static void repeat (String str, int count[]) {
		
		
		
		for(int i=0; i<str.length(); i++) {
			
			count[str.charAt(i)]++;
		}
	}
	
	public static void print(String str) {
		
		int count[] = new int[Max_char];
		repeat(str,count);
		
		for(int i=0; i<Max_char; i++) {
			
			if(count[i] > 1) {
				System.out.println((char)(i)+ " "+ count[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		
		print(str);

	}

}
