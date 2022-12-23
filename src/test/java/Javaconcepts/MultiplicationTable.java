package Javaconcepts;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
//	int num=2;
	for(int i=1;i<=10;i++) {
		System.out.println(num*i);// it will print 2...
	System.out.println(num+"*"+i+"="+num*i);//it will print 2*1=2
	}

	}

}
//note: using scanner class also we can print table
