package com.importantConcepts;
import java.util.*;

class CustomComparator implements Comparator<String>{
	@Override
	public int compare(String s1,String s2) {
		return -(s1.compareTo(s2));
	}
}

public class ComparatorTreeSetEx2 {

	public static void main(String[] args) {
		
		
		TreeSet set1= new TreeSet();
		set1.add("Zebra");
		set1.add("Apple");
		set1.add("Mango");
		set1.add("Ball");
		
		System.out.println(set1);
		System.out.println("---------------------------------");
		System.out.println();
		TreeSet set2= new TreeSet(new CustomComparator());
		set2.add("Zebra");
		set2.add("Apple");
		set2.add("Mango");
		set2.add("Ball");
		System.out.println(set2);

	}

}
