package Javaconcepts;

public class Junior extends Senior{

	@Override
	public void apple() {
	System.out.println("this fruit is tasty");
		
	}
	public static void main(String[] args) {
		Junior obj=new Junior() ;
obj.apple();
obj.banans();
	}

}
