package com.java8features;


interface Idemo1{
	
	static void statMthd1() {
		System.out.println("Inside static method");
	}
	
	
	default void defMthd1() {
		System.out.println("in Default method");
	}
	
	public abstract void normMthd1() ;
	
	

}


class Demo1 implements Idemo1{
	
	public void normMthd1() {
		System.out.println("In normal method");
	}
	
	/*the default method gets inherited and need 
	 * not be compulsorily overriden and implemented
	 */
	
	/* static method in interface is not inherited in 
	 * implementing class
	 */
	
}




public class defaultMthdsinInterface {

	public static void main(String[] args) {
		
			Demo1 demo = new Demo1();
			demo.normMthd1();
			demo.defMthd1();
			
			Idemo1.statMthd1();  //only can be called with the help of Interface name
			//not its implementing class' objects
			
		
	}

}
