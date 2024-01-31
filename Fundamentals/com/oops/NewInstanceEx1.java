package com.oops;

class Teacher{
	static {
		System.out.println("Static block in Teacher");
	}
	
	Teacher(){
		System.out.println("In teacher constructor");
	}
}

class Students extends Teacher{
	Students(){
		System.out.println("In student class constructor");
	}
}

public class NewInstanceEx1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		String className=args[0];  //argument should be passed as com.oops.Teacher
		Class c= Class.forName(className);
		
		Object obj= c.newInstance();
		
		Teacher t1=(Teacher) obj;
		
		
		
		
}
}