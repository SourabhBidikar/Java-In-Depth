package com.collections;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		
		HashMap hm= new HashMap();       //jdk 1.2
		
		hm.put(10, "sachin");
		hm.put(7, "MSD");
		hm.put(18, "Kohli");
		
		System.out.println(hm);
		
		System.out.println(hm.get(10));
		
		//hashmap doesn't store according to order of insertion so for this we use
		LinkedHashMap lhm= new LinkedHashMap();    //jdk 1.4
		lhm.put(10, "sachin");
		lhm.put(7, "MSD");
		lhm.put(18, "Kohli");
		
		System.out.println(lhm);  //maintains order of insertion
		
		
		
		
		
		
		
		//view //entryset //values //keyset    to access we don't directly have iterator so use these function to get values in form of 
		//collection classes so you can then apply iterators on it
		
		Collection c1= hm.values();  //gives values
		Iterator itr1= c1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Set set1= hm.keySet();     //gives keys
		Iterator itr2= set1.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
		
		Set es= hm.entrySet();  //gives entryset that is key,value
		
		Iterator itr3= es.iterator();
		
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}

	}

}
