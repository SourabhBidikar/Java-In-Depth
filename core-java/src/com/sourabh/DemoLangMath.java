package com.sourabh;

public class DemoLangMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num= -2.54;
		
		double res=Math.abs(num);
		
		System.out.println(res);
		
		//we can directly write it without assigning.
		System.out.println(Math.abs(-3.14));
		System.out.println(Math.abs(-9));
		
		System.out.println("------------------------");
		
		//demo of rounding
		System.out.println(Math.round(1.49)); //give 1
		System.out.println(Math.round(1.51)); //give 2
		
		//demo of floor
		System.out.println(Math.floor(2.7)); //gives 2
		System.out.println(Math.floor(2.2)); //gives 2
		
		//demo of ceil
		System.out.println(Math.ceil(2.7)); //gives 3
		System.out.println(Math.ceil(2.2)); //gives 3
		
	}

}
