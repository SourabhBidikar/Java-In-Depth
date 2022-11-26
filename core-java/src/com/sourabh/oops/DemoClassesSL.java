package com.sourabh.oops;

public class DemoClassesSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1= new Student("Sourabh",106);
		Student s2=new Student();
		s2.Name="Appu";  //sets data members
		s2.RollNo=108;
		
		System.out.println("name:"+s1.Name+"\nRoll no:"+s1.RollNo);
		System.out.println("name:"+s2.Name+"\nRoll no:"+s2.RollNo);
		
		Teacher t1= new Teacher("Reshma",1); //for private data members can set while creating
		Teacher t2= new Teacher();
		/*t2.Name="Sandeep"; for private data members cannot access and set like this.
		t2.IdNo=2;*/
		
		/*System.out.println("\n\nTeacher name:"+t1.Name+"\nID: "+t1.IdNo);
		System.out.println("Teacher name:"+t2.Name+"\nID: "+t2.IdNo);
		also cannot access for printing or any other operation like this*/
		
		//for both this we will need getters and setters
		
		t2.setName("Sandeep");
		t2.setID(2);
		
		System.out.println("\n\nTeacher name:"+t1.getName()+"\nID: "+t1.getID());
		System.out.println("Teacher name:"+t2.getName()+"\nID: "+t2.getID());
		
		
		
	}

}


class Student{
	 String Name;
	 int RollNo;
	 
	Student(){
		
	}
	 
	public Student(String name, int rollNo) {
		Name = name;
		RollNo = rollNo;
	} 
}


class Teacher{
	private String Name;
	private int IdNo;
	
	Teacher(){
		
	}
	
	Teacher(String name,int idNo){
		Name=name;
		idNo=IdNo;
	}
	
	String getName()
	{
		return Name;
	}
	
	int getID()
	{
		return IdNo;
	}
	
	void setName(String name)
	{
		Name=name;
	}
	
	void setID(int id)
	{
		IdNo=id;
	}
}