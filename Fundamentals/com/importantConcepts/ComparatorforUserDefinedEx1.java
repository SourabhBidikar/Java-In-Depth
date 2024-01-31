package com.importantConcepts;

import java.util.*;

class Student1{
	int rollNo;
	String name;
	
	
	Student1(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
		
	}
	
	@Override
	public String toString() {
		return rollNo+" "+name;
		
	}
}

//we write two comparator classes for 1.sortbyname 2.sortbyrollno and Override compare() in it.

class sortByName implements Comparator<Student1>{

	@Override
	public int compare(Student1 obj1, Student1 obj2) {
		
		return obj1.name.compareTo(obj2.name);    //as String already implements Comparable(I) which has compareTo()
	}
	
}

class sortByRollNo implements Comparator<Student1>{
	@Override
	public int compare(Student1 obj1,Student1 obj2) {
		return obj1.rollNo-obj2.rollNo;
	}
}









public class ComparatorforUserDefinedEx1 {

	public static void main(String[] args) {
		
		List<Integer> ali=new ArrayList<>();
		ali.add(5);
		ali.add(1);
		ali.add(3);
		System.out.println("AL of integers before sorting: "+ali);
		
		Collections.sort(ali);
		
		System.out.println("AL of integers after sorting: "+ali);
		System.out.println("----------------------------------------------");
		System.out.println();
		
		
		List<Student1> al = new ArrayList<>();
		
		al.add(new Student1(5, "Apurva"));
		al.add(new Student1(1, "Sourabh"));
		al.add(new Student1(3, "Rutuja"));
		
		
		System.out.println("AL<Student>"+al);
		System.out.println("----------------------------------------------");
		System.out.println();
		
		//Collections.sort(al); this directly works only on Collection with type of wrappers only not userdefined for that we have to 
		//comparator
		
		//sort by rollNo
		Collections.sort(al,new sortByRollNo());
		System.out.println("AL<Student> after being sorted based on rollNo"+al);
		System.out.println("----------------------------------------------");
		System.out.println();
		
		
		//sort by name
		Collections.sort(al,new sortByName());
		System.out.println("AL<Student> after being sorted based on name"+al);
		
		System.out.println("----------------------------------------------");
		System.out.println();
		
		
		
		
		

	}

}
