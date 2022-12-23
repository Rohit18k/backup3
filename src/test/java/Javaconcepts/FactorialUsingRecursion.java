package Javaconcepts;

public class FactorialUsingRecursion {
	int fact=1;
	public static void main(String[] args) {
	
		int num=8;
		FactorialUsingRecursion obj=new FactorialUsingRecursion();
int 	rev=obj.calFact(num);
	System.out.println(rev);

	}

	public int calFact(int num) {
		
	if(num>1) {         
		fact=fact*num;
		calFact(num-1);
	}  
	return fact;
	}
	
}
