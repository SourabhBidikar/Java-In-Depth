package com.strings;

public class ImmutableString {

	public static void main(String[] args) {
	
		/*
		 * Strings in Java are specified as immutable once a String is generated, its
		 * content cannot be changed and hence changing content will lead to the
		 * creation of a new String.
		 */
		
		String s1= "Sourabh";
		System.out.println("s1="+s1);
		s1.concat("Bidikar");   //new object is created with no reference to it.So it is deleted by garbage collector.
		System.out.println("s1="+s1);
		
		//we can store this reference in a new string object but original string is not modified.
		String s2= s1.concat("Bidikar"); 
		System.out.println("s2="+s2);
		
		
		//StringBuilder class 
		//string created with StringBuilder class is mutable
		
		StringBuilder sb1= new StringBuilder("Virat");
		System.out.println("sb1="+sb1);  //same string object is modified
		sb1.append("kohli");
		System.out.println("sb1="+sb1);
		
	}

}
