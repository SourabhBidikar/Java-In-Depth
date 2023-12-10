package com.oops;

abstract class Person{
	Integer age;
	String name;
	Float height;
	
	Person(Integer age,String name,Float height){
		this.age=age;
		this.height=height;
		this.name=name;
	}
}

class Student11 extends Person{
	
	Integer marks;
	String course;
	
	Student11(Integer age, String name, Float height,Integer marks, String course){
		super(age,name,height); 
		this.marks=marks;
		this.course=course;
	}
}

public class InheritanceConstructorEx1 {

	public static void main(String[] args) {
		
		Person stud1=  new Student11(25,"Sourabh",5.6f,95,"Cse");

	}

}
