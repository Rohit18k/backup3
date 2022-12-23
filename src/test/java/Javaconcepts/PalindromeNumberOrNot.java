package Javaconcepts;

public class PalindromeNumberOrNot {

	public static void main(String[] args) {
		int num=121;int temp=num;
		int rem;int rev=0;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
		
		if(num==rev) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not palindrome number");
		}
	}

}
//note: palindrome means if number is reversed then also the number is same i.e. 121 if reverse then wil get 121...