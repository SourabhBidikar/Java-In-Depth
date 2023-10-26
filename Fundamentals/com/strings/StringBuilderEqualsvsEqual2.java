package com.strings;

public class StringBuilderEqualsvsEqual2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1= new StringBuilder("Sachin");
		StringBuilder s2= new StringBuilder("Sachin");
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//false
		
		/*
		 * StringBuilder class .equals() compare the reference(memory loc/ address of
		 * object) not the content of StringBuilder.
		 */
		
		
	}

}
