package com.sourabh.oops;

public class DemoEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee();
		
		e1.setEmpId(1);
		System.out.println("Employee id of e1 is: "+e1.getEmpId());

	}

}



class Employee{
	
	private int empId;  //1)instance variables should be private so that any progam cannot access them.
	
	
	
	//2)public getter and setter methods to modify and access data
	public void setEmpId(int empId) {
		//encapsulation helps in providing such validations
		//if it is not satisfied it is set to default which is 0 or we can provide.
		
		if(empId>0) {
			this.empId=empId;
		}
	}
	
	public int getEmpId() {
		return this.empId;
	}
	
}