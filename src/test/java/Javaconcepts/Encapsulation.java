package Javaconcepts;

public class Encapsulation {

	private int age;
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
		
	}

	public static void main(String[] args) {
	
		Encapsulation obj=new Encapsulation();
		obj.setAge(31);
		System.out.println(obj.getAge());
	}

}
