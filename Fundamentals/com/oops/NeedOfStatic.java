package com.oops;

class Example1{
	int a;
	int b;
	
	int count;
	
	public Example1() {
		count++;
	}
}

class Example2{
	int a;
	int b;
	
	static int count;
	
	public Example2(){
		count++;
	}
}

public class NeedOfStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e1= new Example1(); //count 1
		Example1 e2= new Example1();//count 1
		Example1 e3= new Example1();//count 1
		
		System.out.println(e3.count);
		
		
		Example2 e4 = new Example2();//count 1
		Example2 e5 = new Example2();//count 2
		Example2 e6 = new Example2();//count 3
		
		System.out.println(Example2.count);
	}

}
