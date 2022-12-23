package Javaconcepts;

public class SecondLargestAndSecondSmallestInArray {

	public static void main(String[] args) {

		int temp;
		int[] a= {6,8,2,4,3,1,5,7};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]);

	}

}
//note: second largest i.e. 7 
//note: second smallest i.e. 2 and change only one line i.e. (a[i]>a[j])