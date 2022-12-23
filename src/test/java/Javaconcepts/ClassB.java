package Javaconcepts;

public class ClassB extends ClassA{

	public void dog() {
		System.out.println("dog barks");
	}
	
	public static void main(String[] args) {
		ClassB obj=new ClassB();
				obj.dog();
				obj.animal();
	}

}
