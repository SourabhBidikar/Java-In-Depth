package com.importantConcepts;

import java.util.*;


class MyComparator implements Comparator<Object>{
	
	@Override
	public int compare(Object obj1, Object obj2) {
		
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		
		//for demo 
		System.out.println("comparator called for "+i1+" and "+i2);  //compare is called everytime
		
		if(i1<i2) {
			return +1;
		}
		else if(i1>i2) {
			return -1;
		}
		else {
			return 0;
		}
		
		
		// -i1.compareTo(i2);     //this also works as we are negating what compareTo from comparable gives us
	}
}

public class ComparatorTreeSetEx1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts1= new TreeSet<Integer>();  //by default Treeset internally uses compareTo from Comparable(I) to 
													//sort in natural order as integer data is homogenous and Integer implements Comparable
		ts1.add(10);
		ts1.add(4);
		ts1.add(3);
		ts1.add(9);
		
		System.out.println(ts1);
		System.out.println("--------------------------------------------");
		//----------------------------------------------------------------------------------------------
		
		
		TreeSet<Integer> ts2= new TreeSet<Integer>(new MyComparator());    //however it has a constructor that takes Comparator to sort based on user needs
										
		ts2.add(10);
		ts2.add(4);
		ts2.add(3);
		ts2.add(9);
		
		System.out.println(ts2);
		System.out.println("--------------------------------------------");
		
		
		

	}

}
