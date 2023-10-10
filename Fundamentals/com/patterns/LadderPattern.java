package com.patterns;

public class LadderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		for(int i=1;i<=n;i++) {
			System.out.println("*\t*");
			System.out.println("*\t*");
		
			if(i<n) {
				System.out.println("*********");
			}	
		}
	}
	
}
