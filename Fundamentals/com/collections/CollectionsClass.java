package com.collections;
import java.util.*;

public class CollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al1= new ArrayList();
		
		al1.add(50);
		al1.add(41);
		al1.add(2);
		al1.add(55);
		al1.add(2);
		al1.add(2);
		
		
		System.out.println(al1);
		
		Collections.sort(al1);
		
		System.out.println(al1);
		
		
		int index=Collections.binarySearch(al1,50);
		System.out.println("50 present at: "+index);
		
		Collections.shuffle(al1);
		System.out.println(al1);
		
		int freq=Collections.frequency(al1, 2);
		System.out.println("frequency of 2: "+freq);
	}

}
