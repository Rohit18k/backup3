package Javaconcepts;

public class StarPattern {

	public static void main(String[] args) {
	
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//note: i=row and j=column & row=1, col=1 i.e. row and columns are equal
		
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("*");				
			}
			System.out.println();
		}
		//note: row =1, col=4;
		
}}
