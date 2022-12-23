package Javaconcepts;

public class FibonoccaiSeriesByRecursion {

	static int a=0,b=1,c;
	public static void main(String[] args) {
		FibonoccaiSeriesByRecursion obj=new FibonoccaiSeriesByRecursion();
		obj.fiborecursion(10);
	}

	public void fiborecursion(int i) {
	
		if(i>=1) {
		c=a+b;
		System.out.println(c);
			a=b;
			b=c;
			fiborecursion(i-1);
	
	}
		
	}
		
		
	
}
