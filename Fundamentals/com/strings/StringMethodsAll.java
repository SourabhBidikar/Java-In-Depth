package com.strings;

public class StringMethodsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("Sourabh");
		
		System.out.println(s1.charAt(1));  //o
		
		String s2= s1.concat(" Bidikar");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2)); //false
		String s3="Sourabh";
		System.out.println(s1.equals(s3)); //true
		
		String s4="sourabh";
		
		System.out.println(s3.equals(s4));//false
		System.out.println(s3.equalsIgnoreCase(s4)); //true
		
		System.out.println(s1.substring(3));//rabh
		
		System.out.println(s1.substring(3,5));//ra
		
		System.out.println(s1.length()); //7
		
		System.out.println(s1.replace('S', 'B'));
		System.out.println(s1);
		
		
		
		String s5="VIRAT";
		System.out.println(s5.toLowerCase());
		
		String s6="Kohli";
		System.out.println(s6.toUpperCase());
		
		
		String s7="     Mahendra Dhoni     ";
		System.out.println(s7);
		System.out.println(s7.trim());
		
		String s8="Apurva Unkalkar";
		System.out.println(s8.indexOf('a'));
		System.out.println(s8.lastIndexOf('a'));
		
		
	}

}
