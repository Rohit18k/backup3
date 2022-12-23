package Javaconcepts;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name");
	String name= s.next();
	System.out.println(name);
	System.out.println("Enter gender");
	char gender= s.next().charAt(0);
	System.out.println(gender);
System.out.println("Enter age");
int age=s.nextInt();
System.out.println(age);
System.out.println("enter phonenumber");
long number=s.nextLong();
System.out.println(number);
	}

}
