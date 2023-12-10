package com.oops;


class Demo{
	static int a;
	static int b;
	
	static {
		System.out.println("inside Static block");
		a=10;
		b=20;
	}
	
	static void disp() {
		System.out.println("Inside static method");
		System.out.println("a="+a+" b="+b);
	}
	
	int x,y;
	
	{
		System.out.println("Inside NON-static block");
		x=25;
		y=35;
	}
	
	Demo(){
		System.out.println("Inside Constructor");
	}
	void disp1() {
		System.out.println("Inside NON-static method");
		System.out.println("x="+x+" y="+y);
	}
	
}
public class StaticKeywordEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo.disp();
		
		Demo d= new Demo();
		d.disp1();
		
	}

}
