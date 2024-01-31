package com.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class JavaGenericsEx1 {

	public static void main(String[] args) {

		ArrayList al= new ArrayList();
		al.add("sachin");
		al.add(new Integer(10));

		
		String s1= (String) al.get(0);   //typecasting is required as get() method returns object type
//		String s2= (String) al.get(1);   //classCastException during runtime
		
		//as collections are not typesafe we have concept of generics
		
		ArrayList<String> al2= new ArrayList<String>();
		
		al2.add("sachin");
//		al2.add(new Integer(10));  this gives CE: so we cannot add anything other than given Object type only
		
		String s3= al2.get(0);    //type-casting also not required
		
		
		//Also can be written in better way as
		
	
//		<String>==><T> ==> Type parameter
//		List ==>Base Parameter
		
		List<String> al3= new ArrayList<String>();  //valid
		
		Collection<String> al4 =new ArrayList<String>();  //valid
		
		ArrayList<String> al5= new ArrayList<String>();  //valid
		
//		ArrayList<Object> al6= new ArrayList<String>();  //invalid as base param can have parent-child NOT possible for Type param
		
		
//		ArrayList<int> al7 = new ArrayList<int>();   //invalid as we cannot have primitive type as type param
		
		
		
		
		
	}

}
