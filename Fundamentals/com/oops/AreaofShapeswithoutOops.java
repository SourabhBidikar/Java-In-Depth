package com.oops;

import java.util.Scanner;

class Rectangle{
	double length;
	double breadth;
	double area;
	
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		length=sc.nextFloat();
		System.out.println("Enter breadth of rectangle");
		breadth=sc.nextFloat();
	}
	
	void compute() {
		area= length*breadth;
	}
	
	void disp() {
		System.out.println("Area is:"+area);
	}
}

class Square{
	double length;
	double area;
	
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of Square");
		length=sc.nextFloat();
		
	}
	
	void compute() {
		area= length*length;
	}
	
	void disp() {
		System.out.println("Area is:"+area);
	}
}
class Circle{
	double radius;
	double area;
	
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter radius of Circle");
		radius=sc.nextFloat();
		
	}
	
	void compute() {
		
		final double pi=3.141;
		area= pi*radius*radius;
	}
	
	void disp() {
		System.out.println("Area is:"+area);
	}
}


public class AreaofShapeswithoutOops {

	public static void main(String[] args) {
		
		Rectangle rc= new Rectangle();
		Circle ci= new Circle();
		Square sq = new Square();
		rc.input();
		rc.compute();
		rc.disp();
		
		ci.input();
		ci.compute();
		ci.disp();
		
		sq.input();
		sq.compute();
		sq.disp();

	}

}
