package Javaconcepts;

public class Constructor {
int a;
String b;

public Constructor(int a) {
	this.a=a;
}


public Constructor(String b) {
	this.b=b;
}

public void getdata() {
	System.out.println(this.a);
}

public void getdata1() {
	System.out.println(this.b);
}
public static void main(String args[]) {
	Constructor ob=new Constructor(3);
	Constructor ob1=new Constructor("rabbit");
	ob.getdata();
	ob1.getdata1();
}
	
}
