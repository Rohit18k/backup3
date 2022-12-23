package Javaconcepts;

public class NumberPrimeOrNot {

	public static void main(String[] args) {
	int num=8; //2,3,4,5,6..
	int temp=0; //1,7
	
	for(int i=2;i<=6;i++) {
		if(num%i==0) {
			temp=temp+1;
		}
	}
	
	if(temp==0) {
		System.out.println("prime number");
	}
	else {
		System.out.println("not prime number");
		}
	
}
}
