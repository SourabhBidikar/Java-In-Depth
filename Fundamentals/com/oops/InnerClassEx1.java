package com.oops;

class OuterClass {
	
	
	 class InnerClass {  //INNER CLASS	
		 	
		 	public void show() {
		 		System.out.println("in show in inner class");
		 	}
		 
	}
	 
	 
	InnerClass in = new InnerClass();
	//in.show();// this won't work as calling a method is an action
	//an action can be performed only inside a method in java
	
	public void outerShow() {
		System.out.print("In outer show calling ");
		in.show();
	}
	
	
	static class InnerClass2{
		
	}
}

public class InnerClassEx1 {

	public static void main(String[] args) {

		
		OuterClass o1= new OuterClass(); //creating normal outer class object o1
		o1.outerShow();

		OuterClass.InnerClass i1= new OuterClass().new InnerClass(); //creating inner class object i1
		i1.show();
		
		
		OuterClass.InnerClass2 i2= new OuterClass.InnerClass2();  //if inner class is static

//		int ans=OuterClass.InnerClass.add(5, 6);
//		System.out.println(ans);
	}

}































