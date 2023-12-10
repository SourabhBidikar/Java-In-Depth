package com.oops;

public class WrapperClassesEx1 {

	public static void main(String[] args) {
		
		Integer i1= new Integer(10); 
		System.out.println(i1);   //as we are printing reference directly toString() will be called.
								  //toString() of Object class returns hashcode (address) of obj.
								  //All wrapper classes have overridden this method to print the content instead.
		
		Integer i2= new Integer("10"); //This will be treated as number 10 as the construtor of Integer ius defined that way.
		System.out.println(i2); 
		
		
//		Integer i3= new Integer("Ten"); //No CE err, will throw NumberFormatException as the constructor throws it if format is wrong instead of err
//		System.out.println(i3); 
		
		System.out.println("==========================");
		
		Character c1= new Character('a');
//		Character c1= new Character("a");  error 
		
		Boolean b1= new Boolean(true);  //true
		Boolean b2= new Boolean(false); //false
//		Boolean b1= new Boolean(False);  //err
//		Boolean b1= new Boolean(trUe);	//err
//		Boolean b1= new Boolean(TRUE);	//err
		
		
		
		Boolean b3= new Boolean("true");  //true
		Boolean b4= new Boolean("false"); //false
		Boolean b5= new Boolean("False");  //false
		Boolean b6= new Boolean("trUe");	//true
		Boolean b7= new Boolean("TRUE");	//true
		Boolean b8 = new Boolean("Sourabh"); //false
		
		//no errors when passing String values, just case insensitive for true and everything else false.
		
		//actually these constructors are deprecated
		
		System.out.println(b1+"  ");
		System.out.println(b2+"  ");
		System.out.println(b3+"  ");
		System.out.println(b4+"  ");
		System.out.println(b5+"  ");
		System.out.println(b6+"  ");
		System.out.println(b7+"  ");
		System.out.println(b8+"  ");
		
	}

}
