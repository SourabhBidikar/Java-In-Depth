package com.oops;

class AA{
	int id;
	String name;
	String city;
	int age;
	int salary;
	String state;
	
	
	static int count;
	
	
	{
		count++;
	}
	
	AA(){
		
	}
	
	AA(int id,	String name, String city, int age,int salary, String state){
		this.id=id;
		this.age=age;
	}
	
	AA(int id){
		this.id=id;
	}
	
	AA(int age,int salary){
		this.age=age;
		this.salary=salary;
	}
	
}

public class NeedOfJavaBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA a1= new AA();
		AA a2= new AA(50,50000);
		AA a3= new AA();
		AA a4= new AA(15);
		
		System.out.println(AA.count);

	}

}
