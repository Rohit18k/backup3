package Javaconcepts;

public class ReverseString {

	public static void main(String[] args) {
	           // 0123 
		String s="hema";
		String rev="";
		for(int i=3;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}


