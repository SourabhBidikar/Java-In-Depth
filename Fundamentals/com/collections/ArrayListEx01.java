package com.collections;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {

		
		
		/*
		 * add(Obj); 
		 * add(index,obj); 
		 * addAll(Collection);
		 * addAll(index, Collection);
		 */
		
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		
		
		//homogenious type of data allowed. everything is stored as object in any collecyion (AutoBoxing)
		System.out.println(al1);
		
		
		
		ArrayList al2 = new ArrayList();
		
		al2.add("sourabh");
		al2.add(27);
		al2.add('b');
		al2.add(187.87);
		
		//heterogenous data is also allowed
		System.out.println(al2);
		
		ArrayList al3= new ArrayList();
		al3.addAll(al2);
		
		System.out.println(al3);
		
		ArrayList al4= new ArrayList();
		al4.add(11);
		al4.add(12);
		al4.add(14);
		
		System.out.println("***********************");
		System.out.println("Existing data: "+al4);
		
		al4.add(2,13);
		System.out.println("After adding at 2nd index "+al4);
		al4.add(0,10);
		System.out.println("after adding at front "+al4);
		al4.add(15);
		System.out.println("after adding at rear end "+al4+" always recommended as it is efficient");
		

	}

}
