package com.sourabh.oops;

public class DemoThisKeyword {

	public static void main(String[] args) {
		T t = new T(1);
		t.show();

	}

}


class T{
	int id;
	
	T(){
		//this(50);			//or like this use 3)   to call current class constructor
		System.out.println("no-arg constructor");
	
	}
	
	T(int i){
		this();        //use 3)   to call current class constructor
		System.out.println("parameterised constructor");
	}
	
	void setId(int id) {
		this.id= id;// use 1) to invoke current class instance variable
	}
	void display() {
		System.out.println("this is display");
	}
	
	void show() {
		this.display(); // use 2)invoke current class method. (if we don't add this compiler will add)
	}
	
	void m1(T t1) {
		
	}
	
	void m2() {
		m1(this); //use 4) can be used to pass arg in a method call. (here m1()).
	}
	
	//use 5 and 6 see in book or video
}