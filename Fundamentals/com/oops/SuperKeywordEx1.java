package com.oops;


class SuperEx1{
	
	int age=15;
	
	public void disp() {
		System.out.println("In parent age="+age);
	}
}

class SuperEx2 extends SuperEx1{
	
	int age=25;
	
	public void disp() {
		System.out.println("In child age="+age);
		System.out.println("In child using super keyword age="+super.age);
	}
}



public class SuperKeywordEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperEx1 s1 = new SuperEx1();
		SuperEx2 s2= new SuperEx2();
		
		s1.disp();
		s2.disp();
	}

}
