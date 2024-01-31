package com.importantConcepts;

import java.util.TreeSet;


/*
 * interface Comaparable{
 *  public abstract int compareTo(T t);
 * 
 * }
 */

//all wrapper and String class implement it



public class ComparableInterfaceEx1 {

	public static void main(String[] args) {
		
		TreeSet<String> ts= new TreeSet<String>();
		ts.add("A");
		ts.add("Z");
		ts.add("K");
		System.out.println(ts);
		
		
		
		//internally something like this happens
		System.out.println("A".compareTo("Z"));   //-25
		System.out.println("Z".compareTo("K"));	//15
		System.out.println("Z".compareTo("Z"));		//0
		
		//System.out.println("A".compareTo(null));   //NullPointerException:   so null value not allowed in TreeSet
		
		
		
		/* return type of compareTo() is int
		 * obj1.compareTo(obj2); 
		 * => return negative (-) value if obj1 needs to come before obj2 
		 * => return positive (+) value if obj1 needs to come after obj2
		 * =>returns 0 value if obj1 and obj2 are equal
		 */
		
		
		

	}

}
