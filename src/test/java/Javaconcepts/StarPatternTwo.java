package Javaconcepts;

public class StarPatternTwo {

	public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		for(int j=3;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		System.out.println();
	}

		for(int l=1;l<=4;l++) {
			for(int m=1;m<=l;m++) {
				System.out.print(" ");
			}
			for(int n=3;n>=l;n--) {
				System.out.print("*");
			}
			System.out.println();
			}

	}

}
