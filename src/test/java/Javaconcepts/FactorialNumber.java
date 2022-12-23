package Javaconcepts;

public class FactorialNumber {

	public static void main(String[] args) {
	
		int num=6;  
		int fact=1;
		//6*5*4*3*2*1=720
		for(int i=6;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	
	}
	
	
	

}
//note: we can use two for loop :-for(int i=6;i>=1;i--), for(int i=1;i<=6;i++)
//note: factorial means //6*5*4*3*2*1=720