package Javaconcepts;

public class StringMethods {

	public static void main(String[] args) {
	
		String name="hema";
		String name1=" ";
		String name2=null;
	System.out.println(name.length());
		
		int i=name.length();
		if(i==0) {
			System.out.println("name is empty");
		}
		else {
			System.out.println("name is not empty");
		}
		//note: if name is null then null pointer exception will be thrown
		
	String email="hema@gmail.com";
		String email1="";
	System.out.println(email.isEmpty());
	if(email.isEmpty()==true) {
		System.out.println("email is empty");
	}
	else {
		System.out.println("email is not empty");
	}
		
	String password=" 13 hema ";	
	String password1="  ";	
	System.out.println(password.trim());
	System.out.println(password.trim().length());
	if(password1.trim().length()==0) {
		System.out.println("password is empty");
	}
	else {
		System.out.println("password is not empty");
	}
		
	}

}
