package com.oops;


class Branch{
	int bid;
	String branchName;
	
	Branch(){
		
	}
	
	Branch(int bid,String branchName){
		this.bid=bid;
		this.branchName=branchName;
	}
}


class Student12{
	int sid;
	String name;
	int age;
	Branch branch;
	
	Student12(){
		
	}
	
	Student12(int sid, String name, int age, Branch branch){
		this.sid=sid;
		this.name=name;
		this.age=age;
		this.branch=branch;
	}
	
	public void dispStudent() {
		System.out.println("Student details:  ");
		System.out.println("id: "+sid+" name: "+name+" age: "+age+" branch id: "+branch.bid+" branch name: "+branch.branchName);
	}
}


public class HasAManytoOneDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Branch branch=  new Branch(3,"CSE"); 
			
			Student12 s1= new Student12(1,"Sourabh",26,branch);
			Student12 s2= new Student12(2,"Apurva",25,branch);
			Student12 s3= new Student12(3,"rutu",17,branch);
			
			s1.dispStudent();
			s2.dispStudent();
			s3.dispStudent();
			
			
	}

}
