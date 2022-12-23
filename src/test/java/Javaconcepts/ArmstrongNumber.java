package Javaconcepts;

public class ArmstrongNumber {

	public static void main(String[] args) {
	int num=153;
	int t1=num;
	int length=0;
	while(t1!=0) {
		length=length+1;//3
		t1=t1/10;
	}
		
		int t2=num;
		int rem;
		int arms=0;
		while(t2!=0) {
			int multi=1;
			rem=t2%10;
			for(int i=1;i<=length;i++) {
			multi=multi*rem;//27
		}
			
			arms=arms+multi;//27+125+1=153
		     t2=t2/10;
	}

		if(arms==num) {
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not armstrong");
		}
}
}