package Javaconcepts;

public class MaximumCharacterInString {

	public static void main(String[] args) {
	           //  012345   
		String s= "abbccc";
		
		int[] array=new int[127];		

		for(int i=0;i<s.length();i++) {
			
			array[s.charAt(i)]=array[s.charAt(i)]+1;
		}
		
		int max=-1;
		char c=' ';
		for(int i=0;i<s.length();i++) {
			if(max<array[s.charAt(i)]) {
				max=array[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		System.out.println(c);
		
		
		//note: interview question very very important
	}

}
