package Javaconcepts;

public class ArraysDescription {

	public static void main(String[] args) {
		int[][] a= {{10,20,30},{40,50}}; 
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");		
			}
			System.out.println();
		}
	}

}
/*
1=> array declare: int [] a, int a[], int []a, int[]a;
2=>array creation: int[] a=new int[3] // define size when create array
int[] a=new int[-3] //it will compile but during runtime it will error i.e.. negativearrayindexexception..
int[] a=new int[0] //it will compile and run successfully..
3=>array initialization: a[0]=12; //this will first assign zero value in index 0 and after that it will set 12 at index 0.
int[] a={10,20,30};& int[] a=new int[] {10,20,30}//it will directly assign values in following index....
4=>array reterive: for(int i=0;i<3;i++){
s.o.p(a[i]);
}
foreach(int x: a){
s.o.p(i);
}
//note: this is for 1dimensional array
*/
/*

1=>array declare: int[][] a, int a[][], int[] []a;int [][]a;
int[][] a, b; int[][] a,b[];//3d ; int[][]a, []b;//a will compile but b will give compile error  
2=>array create: int[][] a=new int[2][3];//matrix array in which columns are eual in both rows
int[][] a=new int[2][];//jagged array in which columns are not same
a[0]=new int[3];
a[1]=new int[2];
3=>array initialization: a[0][0]=10,a[0][1]=20; int[][] a={{10,20,30},{40,50,60}}
a[0]=new int[4];
a[1]=new int[9];
a[0][1]=30;
4.array reterive:-
	int[][] a= {{10,20,30},{40,50,60}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");		
			}
			System.out.println();
		}

//note:this for 2 dimensional array and 3 dimensional array
*/







