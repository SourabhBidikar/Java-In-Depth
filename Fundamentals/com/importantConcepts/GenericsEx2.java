package com.importantConcepts;


class Demo1<T>{
	T t;
	
	Demo1(T t){
		this.t=t;
	}
	
	
	
	T getVal() {
		return this.t;
	}
	
}

class Demo2<X,Y>{
	X x;
	Y y;
	
	;;;;
	;;;;
	
}


class Demo3<T extends Number>{
	
	T t;
	
	Demo3(T t){
		this.t=t;
	}
	
	
	
	T getVal() {
		return this.t;
	}
}


public class GenericsEx2 {

	public static void main(String[] args) {
		
		Demo1<Integer> d1= new Demo1<Integer>(10);
		
		System.out.println(d1.getVal());
		
		
		
		Demo2<Integer,String> d2 = new Demo2<>();
		
		
		
		//Demo3<String> d3= new Demo3<>();  //as our type param is restricted to have only NUmber this will give error
		
		Demo3<Integer> d3= new Demo3<>(20);   //this is possible
		
		System.out.println(d3.getVal());
		
		
	}

}
