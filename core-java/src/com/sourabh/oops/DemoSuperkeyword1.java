package com.sourabh.oops;

public class DemoSuperkeyword1 {

	public static void main(String[] args) {

			F f1= new F();
			
			f1.show(30);
	}

}


class E{
	int a=10;
}

class F extends E{
	int a=20;
	
	void show(int a) {
		System.out.println(a);        //30
		System.out.println(this.a);		//20
		System.out.println(super.a);	//10
	}
}