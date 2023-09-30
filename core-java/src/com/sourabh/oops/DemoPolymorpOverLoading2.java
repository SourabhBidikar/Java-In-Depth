package com.sourabh.oops;
public class DemoPolymorpOverLoading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoPolymorpOverLoading2 d =new DemoPolymorpOverLoading2();
		
		d.show();
		d.show(1);
		d.show(1,2);
		d.show("abc",4.5f);
		d.show(4.5f,"abc");
		
		d.main(5); //main method can be overloaded


	}
	
	
	public static void main(int a) {
		
		System.out.println("main method overloaded");
	}
	
	void show()
	{
		System.out.println("nothing");
	}
	

	/*
	 * we cannot overload by chnaging return type:
	 * int show(){
	 * 	return 1;
	 * }
	 */
	
	void show(int a) {
		System.out.println("a: "+a);
		
	}
	

	void show(int a,int b) {
		System.out.println("\na: "+a+" b: "+b);
		
	}
	
	void show(String str, float f) {
		System.out.println("\nString: "+str+" f: "+f);
		
	}
	
	void show(float f, String str) {
		System.out.println("\n f: "+f+"String: "+str);
		
	}
}
