package Javaconcepts;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s="mam";
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i) ; //k
		}
System.out.println(rev); 

	if(s.equals(rev)) {
		System.out.println("palindrome string");
	}
	else {
		System.out.println("not palindrome string");
	}
		
		

}

}
