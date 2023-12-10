package com.oops;


class Demo1{
	String name="Sourabh";
	int age=26;
	
	void disp() {
		System.out.println("Name: "+name+" age: "+age);
	}
}


class Demo2 extends Demo1{
	
}


public class InhertanceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo2 d= new Demo2();
		d.disp();

	}

}
