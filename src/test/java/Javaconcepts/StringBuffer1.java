package Javaconcepts;


public class StringBuffer1 {

	public static void main(String[] args) {
	


		StringBuffer sb= new StringBuffer();
		System.out.println(sb.capacity()); //16
		
		StringBuffer sb1= new StringBuffer("hema");
		System.out.println(sb1.capacity()); //20
		
		StringBuffer sb2= new StringBuffer(8);
		System.out.println(sb2.capacity()); //8
		
		StringBuffer sb3= new StringBuffer(1000);
		System.out.println(sb3.capacity()); //1000
	
		//note: above all are constructors
		
		StringBuffer sb4= new StringBuffer();
		sb4.append("hello world hema sahoo");//21 
		System.out.println(sb4.capacity());
//		//note: capacity is by deafult 16 but it increases in case of more string values passed in the constructor.
//	//	formula for calculate capacity is = 16* 2 +2
//		 length use to give length of characters currently in stringbuffer object
//		 capacity use to provide how many characters it can store in stringbuffer object
	
	

		StringBuffer sb5= new StringBuffer("hema sahoo");
		StringBuffer sb6= new StringBuffer("hema sahoo");
		System.out.println(sb5.append("daughter"));
		System.out.println(sb5.charAt(6));
		System.out.println(sb5.delete(1, 7)); //end-1
		System.out.println(sb5.equals(sb6));//string buffer check the object references not object values 
		StringBuffer sb7= sb5.append("daughter");
		System.out.println(sb5.equals(sb7));
	
		System.out.println(sb5.indexOf("h"));
		System.out.println(sb5.lastIndexOf("o"));
		System.out.println(sb5.insert(2,"lulia"));//it will insert before 2 index
   System.out.println(sb5.replace(2, 7,"dug")); //it will replace from 2 index to endindex -1 i.e. 6
		System.out.println(sb5.reverse());
		System.out.println(sb5.subSequence(3, 6));		
		System.out.println(sb5.substring(3,6));
	
		sb5.setCharAt(2,'a');
		System.out.println(sb5);
        sb5.setLength(3);
    	System.out.println(sb5);
    	
    	sb5.ensureCapacity(100);
	System.out.println(sb5.capacity());	
		
		sb5.ensureCapacity(100);
		sb5.trimToSize();
		System.out.println(sb5.capacity());

	}

}
