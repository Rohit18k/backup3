package Javaconcepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
	int [] a= {3,4,5,3,2,2,1};
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]&& i!=j) {
//					System.out.println(a[j]+" ");
//				}
//			}
//		}
	//}}


//this is first method i.e. Brute force method
//note: this is brute force method and it not useful when there is 3 duplicate elements..
//this is very slow method coz it traverse each element one by one...
//========================++++++++++==================
//Set<Integer> s= new HashSet<>();
//for(int no:a) {
//boolean b=s.add(no);
//	if(b==false) {
//		System.out.println(no+" ");
//	}
//}
//
//}}
//note: this is set method and it not useful when there is 3 duplicate elements..
//====================================

Map<Integer,Integer> hm=new HashMap<>();
for(Integer no:a) {
Integer count=	hm.get(no);
if(count==null) {
	hm.put(no,1);
}
else {
	count=count+1;
	hm.put(no, count);
}
}

Set<Map.Entry<Integer,Integer>> ms= hm.entrySet();
for(Map.Entry<Integer,Integer> me: ms) {
	if(me.getValue()>1) {
		System.out.println(me.getKey());
	}
}


	}}
