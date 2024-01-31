package com.multithreading;


//class level lock static synchronised methods
//if one thread executing one static sync method other static sync cannot be executed because of class level lock.
//but other sync or normal instance methods can be executed
//if one sync method is executing then other sync method cannot be executed because of object level lock
//but other static sync or normal instance methods can be executed 

//class level lock and object level lock have no relation

//normal instance methods don't follow lock concept at all

class X2{
	
	public  static synchronized void displayChars() {
		try{
			for(int i=65;i<70;i++) {
			System.out.println((char)i);
			Thread.sleep(2000);
			
			}
		}
		catch(InterruptedException ie) {
			
		}
	}
	
	public  static synchronized void displayNums() {
		try{
			for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(2000);
			
			}
		}
		catch(InterruptedException ie) {
			
		}
	}
}



class MyThread201 extends Thread{
	
	X2 x;
	public MyThread201(X2 x) {
		this.x=x;
	}
	public void run() {
		x.displayNums();
	}
}

class MyThread202 extends Thread{
	
	X2 x;
	public MyThread202(X2 x) {
		this.x=x;
	}
	public void run() {
		x.displayChars();
	}
}

public class MultiThreadingEx20 {

	public static void main(String[] args) {
		
		X2 x= new X2();
		MyThread201 t1= new MyThread201(x);
		MyThread202 t2= new MyThread202(x);
		
		t1.start();
		t2.start();

	}

}
