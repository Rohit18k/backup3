package Javaconcepts;

public class KthLargestAndSmallestInArray {

	public static void main(String[] args) {
	int temp;
		int k=4;
		int[] a= {5,8,12,7,6,2,4};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];//5
					a[i]=a[j];//8
					a[j]=temp;//5
				}
			}
			if(i==k-1) {//4-1=3
				System.out.println(a[i]);
				break;
			}
		}
	}
  
}
//forKthsmallestarray i.e. a[i]>a[j]...
//this is slow method coz array traverse from each element one by one...
//12,8,7,6,5,4,2....