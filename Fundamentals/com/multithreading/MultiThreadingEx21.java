package com.multithreading;



class ThreadB extends Thread{
	int total=0;
	
	@Override
	public void run() {
		
		synchronized (this) {
			System.out.println("child thread started calculation");
			for(int i=0;i<=100;i++) {
				total=total+i;
				
			}
			System.out.println("child give notification call");
			this.notify();
		}
	}
}


public class MultiThreadingEx21 {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadB b=new ThreadB();
		b.start();
		
		synchronized (b) {
			System.out.println("main thread calling wait() and waiting for notification");
			b.wait();
			System.out.println("main thread got notified");
			System.out.println(b.total);
		}

	}

}
