package Javaconcepts;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
          int a=10, b=20; 
a=a+b;//30
b=a-b;//10
a=a-b;//20

           System.out.println(a);
           System.out.println(b);
		
//note: this is without temp variable
        int  temp=a;
        a=b;//20
        b=temp;
        System.out.println(a);
        System.out.println(b);
        //note: this is with temp variable
	}

}
