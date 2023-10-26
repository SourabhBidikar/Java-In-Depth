package com.oops;

class Student1{
	private int age;
	private String name;
	private String city;
	
	void setAge(int a) {
		age=a;
	}
	
	int getAge() {
		return age;
	}
	
	void setName(String n) {
		name=n;
	}
	
	String getName() {
		return name;
	}
	
	void setCity(String c) {
		city=c;
	}
	
	String getCity() {
		return city;
	}
}


public class EncapsulationEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1= new Student1();
		s1.setAge(26);
		s1.setName("Sourabh");
		s1.setCity("Belgaum");
		
		System.out.println(s1.getName()+"'s age is "+s1.getAge()+" and he lives in "+s1.getCity());
	}
}
