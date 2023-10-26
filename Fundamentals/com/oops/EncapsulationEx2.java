package com.oops;

class Student2{
	private int age;
	private String name;


	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}


public class EncapsulationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1= new Student2();
		s1.setAge(26);
		s1.setName("Sourabh");

		
		System.out.println(s1.getName()+"'s age is "+s1.getAge());


	}

}
