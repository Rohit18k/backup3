package Javaconcepts;

public class MaxAndMinValuesInArray {

	public static void main(String[] args) {
	
		int [] a= {4,3,5,2,1,6};
		
		int max=a[0];
		for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
		}
System.out.println(max);
		
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];//1				
			}		
		}
		
		System.out.println(min);	
		
	}

}
//note: program for both min and max values 