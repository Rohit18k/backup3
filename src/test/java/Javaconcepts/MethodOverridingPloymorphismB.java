package Javaconcepts;

public class MethodOverridingPloymorphismB extends MethodOverridingPolymorphismA{

	
	public void scanComputer() {
		super.scanComputer();
		System.out.println("it is bad");
	}


	
	public static void main(String[] args) {
		MethodOverridingPloymorphismB obj= new MethodOverridingPloymorphismB();
		obj.scanComputer();

	}

}

//this is compile time polymorphism