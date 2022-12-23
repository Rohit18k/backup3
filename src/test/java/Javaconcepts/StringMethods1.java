package Javaconcepts;

public class StringMethods1 {

	public static void main(String[] args) {

String s1="Hema";
String s2="hema";

System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.isEmpty());

	

	String s11="a"; //unicode = 97
	String s21="A"; //unicode= 65
	
	System.out.println(s11.compareTo(s21));
	
	System.out.println(s11.compareToIgnoreCase(s21));
	
	
	String s13="hema";
    String s14="sahoo";
	
    System.out.println(s13+s14);
    
    System.out.println(s13+10+20);
    System.out.println(10+20+s13);
    System.out.println(s13+20/10);
  //  System.out.println(s13+10-5); it will giver error 
    System.out.println(s13.concat(s14));
    System.out.println(String.join(";",s13,s14));//it is a static method thats why using with String class
 
		String s= "this is demo";
		
	System.out.println(s.subSequence(2, 9)); // it will provide value from 2index to 9-1 i.e. 8 index value
	System.out.println(s.substring(6));
	System.out.println(s.substring(0, 12)); //it will provide value from 0index to 12-2 i.e. 1 index value

    
}
}