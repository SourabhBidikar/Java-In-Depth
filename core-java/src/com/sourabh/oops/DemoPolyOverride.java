package com.sourabh.oops;

public class DemoPolyOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1= new Test();
		t1.show();
		
		Abc abc1 = new Abc();
		abc1.show();
	}

}


class Test{
	
	 void show() {
		System.out.println("in test method");
	}
	
}

class Abc extends Test{
	
	
	 void show() {
		 super.show(); //will give "in test method " as o/p
		System.out.println("in Abc method");
	}
	

}