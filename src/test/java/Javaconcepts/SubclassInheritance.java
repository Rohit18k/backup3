package Javaconcepts;

public class SubclassInheritance implements MultipleInheritance{

	public static void main(String[] args) {
		SubclassInheritance obj=new SubclassInheritance();
obj.getData("java");
	}

	@Override
	public void getData(String name) {
		System.out.println(name);
		
	}


}
