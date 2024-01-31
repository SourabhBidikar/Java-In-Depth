package com.collections;

import java.util.*;

class Student{
	private String name;
	private int age;
	private String city;

	public Student(String name, int age, String city) {
		
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return name+" "+city+" "+age;
	}
}


public class HashMapEx2Complex {

	public static void main(String[] args) {
		
		Student s1= new Student("Rohan", 20,"Mumbai");
		Student s2= new Student("Rohan", 21,"Banglore");
		Student s3= new Student("Rahul", 20,"Delhi");
		
		HashMap hm= new HashMap();
		
		hm.put(1,s1);
		hm.put(2,s2);
		hm.put(3,s3);
		
		Collection c1=hm.values();
		
		Iterator itr=c1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	
		
		/*without overriding toString in Student we would get:
		 * 	com.collections.Student@26f0a63f
			com.collections.Student@4926097b
			com.collections.Student@762efe5d
		 */
		
		/* as we are overriding toString to return name,city and age we are getting:
		 * 
		 * 	Rohan Mumbai 20
			Rohan Banglore 21
			Rahul Delhi 20
		 * 
		 */
		System.out.println("****************************************************");
		
		Set mySet= hm.keySet();
		
		Iterator itr2=mySet.iterator();
		
		while(itr2.hasNext()) {
			System.out.println("keys: "+itr2.next());
		}
		System.out.println("****************************************************");
		
		Set myBothData=hm.entrySet();
		
		Iterator itr3=myBothData.iterator();
		
		while(itr3.hasNext()) {
			Map.Entry e= (Map.Entry)itr3.next();
			
			System.out.println("key: "+e.getKey()+" value: "+e.getValue());
		}
	}
	

}
