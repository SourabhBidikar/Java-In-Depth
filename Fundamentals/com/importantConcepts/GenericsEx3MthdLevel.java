package com.importantConcepts;
import java.util.*;

class Ex1{
	
	
	void m1(ArrayList<Integer> list) {
		
	}
	
	
	void m2(ArrayList<?> list) {  //if we know argument would be ArrayList type but we don't know what type in AL
		
		//so we have GenericMethod with Wild Card Pattern
		
		
	}
	
	void m3(ArrayList<? extends Number> list) {
		
		
	}
	
	
	
	
	
}


public class GenericsEx3MthdLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex1 ex= new Ex1();
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		
		ex.m2(al);
	}

}
