package com.sourabh.oops;

public class DemoSuperUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Two t1 = new Two();
		t1.show();

	}

}


class One{
	
	void m1() {
		System.out.println("In class one");
	}
}

class Two extends One{

	void m1() {
		System.out.println("In class two");
	}
	
	void show() {
		m1();  //calls m1 of class Two //this keyword is automatically applied here 
		
		super.m1();  //calls m1 of class One
	}
	
	
}

