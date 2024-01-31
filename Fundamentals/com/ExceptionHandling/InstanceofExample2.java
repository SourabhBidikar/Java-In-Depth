package com.ExceptionHandling;

public class InstanceofExample2 {

	public static void main(String[] args) {
		
		
		//ex1
		Thread t=new Thread();
		
		System.out.println(t instanceof Thread);         //true
		System.out.println(t instanceof Runnable);       //true
		System.out.println(t instanceof Object);         //true
		
//		System.out.println(t instanceof String);      //compileTimeError as no relation between Thread type object and String 
		
		
//      Because Thread class extends Object class as well as implements Runnable interface
		
		
		
		//ex2
		Object o= new Thread();

		System.out.println(o instanceof Thread);         //true
		System.out.println(o instanceof Runnable);       //true
		System.out.println(o instanceof Object);  		//true
		System.out.println(o instanceof String);        //false    //Relation between Object type and String but here it is not given type
		
		
		
		//ex3
		
		System.out.println(null instanceof Object);    //always false
	}

}
