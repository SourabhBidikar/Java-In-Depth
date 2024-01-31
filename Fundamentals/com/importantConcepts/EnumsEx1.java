package com.importantConcepts;


enum Result{
	PASS, FAIL,NR;   //y default these are--> static final
}

enum Gender{
	MALE,FEMALE,OTHERS;
}

public class EnumsEx1 {

	public static void main(String[] args) {
		
		Gender g1= Gender.MALE;
		
		System.out.println(g1);
		
	
	}

}
