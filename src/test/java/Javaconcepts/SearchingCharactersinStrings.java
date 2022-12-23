package Javaconcepts;

public class SearchingCharactersinStrings {

	public static void main(String[] args) {
		
		String s="heema";
		
	System.out.println(s.indexOf('m'));	
	System.out.println(s.indexOf("ee"));
	System.out.println(s.lastIndexOf('a'));
	System.out.println(s.contains("m"));
	System.out.println(s.startsWith("h"));
	System.out.println(s.endsWith("a"));
	System.out.println(s.charAt(4));
	}

}
