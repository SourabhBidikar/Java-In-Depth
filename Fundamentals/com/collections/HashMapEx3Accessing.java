package com.collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapEx3Accessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm= new HashMap<>();       //jdk 1.2
		
		hm.put(10, "sachin");
		hm.put(7, "MSD");
		hm.put(18, "Kohli");
		
		
		Collection c1=hm.values();
		
		Iterator itr1=c1.iterator();
		
		while(itr1.hasNext()) {
			String value=(String)itr1.next();
			
			System.out.println("value: "+value);
		}
		
		System.out.println("*********************************");
		Set set1=hm.keySet();
		
		Iterator itr2= set1.iterator();
		
		while(itr2.hasNext()) {
			Integer key= (Integer) itr2.next();
			System.out.println("Key: "+key);
		}
		System.out.println("*********************************");
		
		Set set2=hm.entrySet();
		
		Iterator itr3= set2.iterator();
		
		while(itr3.hasNext()) {
			Map.Entry data=(Entry) itr3.next();
			
			System.out.println("key: "+data.getKey()+" value: "+data.getValue());
			
		}
		
		
		System.out.println("*********************************");
		//we can also use enhanced for loop if we have used generics
		
		for(Map.Entry e:hm.entrySet()) {
			System.out.println("key: "+e.getKey()+" value: "+e.getValue());
		}
		
		
		
		
		
	}

}
