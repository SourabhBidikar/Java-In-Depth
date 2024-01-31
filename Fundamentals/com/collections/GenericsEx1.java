package com.collections;

import java.util.ArrayList;

public class GenericsEx1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1= new ArrayList<Integer>();
		
		al1.add(10);
		al1.add(20);
		al1.add(30);
		
		//al1.add("sourabh");  error
		//al1.add(10.5);	   error
		
	}

}
