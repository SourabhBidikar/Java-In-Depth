package com.patterns;

public class EquilateralTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		for(int i=1;i<=n;i++){
			
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}