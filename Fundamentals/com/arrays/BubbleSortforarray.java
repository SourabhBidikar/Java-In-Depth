package com.arrays;

public class BubbleSortforarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {90,80,75,72,64,31,25,22,5,2,4,1,3};
		System.out.println("array= ");
		for(int elem:a) {
			System.out.print(elem+" ");
		}

		int temp;
		for(int i=0;i<a.length-1;i++) {
			boolean swapped=false;
			
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped=true;
				}
			}
			
			if(swapped==false) break;
		}
		
		System.out.println("\narray after sorting= ");
		for(int elem:a) {
			System.out.print(elem+" ");
		}
		
	}

}
