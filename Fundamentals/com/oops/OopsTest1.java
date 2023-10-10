package com.oops;


class Student{
	int sId;
	String name;
	
	void playCricket() {
		System.out.println(name+" is playing cricket");
	}
	
	int getSId() {
		return sId;
	}
}


public class OopsTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student();
		s1.name="Sourabh";
		s1.sId=1;
		s1.playCricket();
		System.out.println(s1.getSId());

	}

}
