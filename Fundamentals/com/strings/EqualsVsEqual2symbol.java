package com.strings;

public class EqualsVsEqual2symbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "sachin";
		String s2="sachin";
		
		//both s1 and s2 point to same object. There is only  one object
		
		System.out.println(s1==s2);   //true
		System.out.println(s1.equals(s2)); //true

		String s3= "Virat";
		String s4= new String("Virat");
		
		//s3 and s4 are two different string objects with same content 
		
		System.out.println(s3==s4);   //false as different memory location
		System.out.println(s3.equals(s4)); //true as content is same 
		
		
		/*
		 * The main difference between "==" and "equals" in Java is that
		 *  "==" compares the memory location of two objects, 
		 *  "equals" compares the contents of two objects.
		 */
		
	
		
	}

}
