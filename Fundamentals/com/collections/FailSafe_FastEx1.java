package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe_FastEx1 {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
//			al.add(10);  //causes infinite loop
		}
		//above loops run infintely
		System.out.println("-----------------------------------------------");
		//Using Iterator
		
		Iterator itr1= al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
//			al.add(10);  //iterator throws ConcurrentModificationException
		}
		//so this type of iterator is called fail-fast iterator
		System.out.println("-----------------------------------------------");

		//iterators fail fast for such non-sense operations i.e. why we are using iterators over loops while
		//iterating over collections
		
		
		
		
		
		
		//-----------------------------------------------------------------
		//ex of fail safe
		CopyOnWriteArrayList cal1= new CopyOnWriteArrayList();		
		cal1.add(100);
		cal1.add(200);
		cal1.add(300);
		
		Iterator itr2=cal1.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
			cal1.add(500);   //this does not print but does not throw cany error/exception
		}
		
		//as fail safe iterators work on clone/copy of original collection so add modifies original but itertor is iterating on previous copy it has.
		//ex classes CopyOnWriteArrayList, ConcurrentHashmap, etc present in java.util.concurrent package.

	}

}
