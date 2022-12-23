package Javaconcepts;

public class MethodOverloadingPolymorphism {

	public void A() {
		
	System.out.println("a is best");
	}
	
	
	public void A(int a) {
		int b=a;
		System.out.println(b);
		}
	
	public static void main(String args[]) {
	MethodOverloadingPolymorphism obj=new MethodOverloadingPolymorphism();
obj.A();
obj.A(10);
	
	
	
}
}