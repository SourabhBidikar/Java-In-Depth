package com.sourabh;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) Implicit type conversion (by compiler/JVM)
		
		int i=5;
		double d=i;
		System.out.println("i="+i);
		System.out.println("d="+d);
		//------------------------------
		
		//2.explicit type conversion (by programmer)
		
		double x = 34.26;
		//int y= x; this will give error 
		int y= (int)x;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}

}
