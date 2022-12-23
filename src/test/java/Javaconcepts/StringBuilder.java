package Javaconcepts;

public class StringBuilder {

	public static void main(String[] args) {
		
		
		//it is same as StringBuffer only difference is it is not thread safe and has non synchronized methods
		//StringBuffer has synchronized methods and thread safe
		
		/*
		Difference between  string, stringBuffer , stringBuilder
		Storage: 
		String store its vlue in heap memory and scp
		SBuffer store its value in heap memory
		Sbuilder store its value in heap memory
		
		Objects:
		String objects are immutable
		Sbuufer objects are muttable
		Sbuilder objects are muttable
		
		
		Thread safe:
		String is not thread safe
		SBuffer is thread safe
		Sbuilder is not thread safe
		
		
		Memoryallocate:
		String occupy more memory coz of immutability
		sbuffer occupy less memory coz of muttablity
		sbuilder occupy less memory coz of muttablity
		
		performance:-
		String performance is low 
		sbuffer performance is fast
		sbuilder performance is super fast 
		
		Uses:-
		String use when data is not changing frequently
		sbuffer use when data is changing frequently
		sbuilder use when data is changing frequently
		*/

	}

}
