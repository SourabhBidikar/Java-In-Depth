package com.oops;


final class Test{      //final so that no one inherits and makes changes to modify me
	
	int i;
	Test(int i){
		this.i=i;
	}
	
	Test modify(int i) {
		if(this.i==i) return this;
		
		else return new Test(i);
	}
}


public class ImmutableUserDefinedClass {

	public static void main(String[] args) {
		
		Test t1= new Test(10);
		Test t2=t1.modify(10);
		Test t3= t1.modify(20);
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		System.out.println(t2==t3);

	}

}
