package Javaconcepts;

public class ReplacingAndRemovingCharactersInStrings {

	public static void main(String[] args) {

		String s="this is demo";
		
System.out.println(s.replace("is","was"));
System.out.println(s.replaceFirst("is","was"));	
System.out.println(s.replaceAll("is","was"));
System.out.println(s.replaceAll("is(.)","was")); //it will replace all is with was and replace space as well
System.out.println(s.replaceAll("is(.*)","was")); //it will replace first is with was and delete other characters in string
//note://. & .* is a regex expression
	}

}
