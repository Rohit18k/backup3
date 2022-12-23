package Javaconcepts;

public class CaseConversionAndTypeConversion {

	public static void main(String[] args) {
	
		String s="Hema";
		int a=19;
		int b=90;
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());

	String ss=	String.valueOf(a);
	String sb=	String.valueOf(b);
	System.out.println(ss+sb);
	
	char[] c=s.toCharArray();
	System.out.println(c);
		
	}

}
