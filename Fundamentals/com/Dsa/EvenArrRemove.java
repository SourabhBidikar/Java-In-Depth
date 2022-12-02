package com.Dsa;

public class EvenArrRemove {

	public static void main(String[] args) {
		EvenArrRemove e = new EvenArrRemove();
		
		e.removeEven(new int[] {1,2,3,4,78,90,66,54,33,13,12,3});
		
		//this is way to provide array as argument without storing it in a array variable first.
		
		

	}
	
	
	
	
	
void removeEven(int[] arr) {
		
		System.out.println("Array provided:");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
		int oddCount=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]%2!=0)
				oddCount++;
		}
		
		int[] res= new int[oddCount] ;
		
		int odd=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]%2!=0) {
				res[odd]=arr[i];
				odd++;
			}
			
		}
		
		System.out.println("\nArray after removing even:");
		for(int r:res) {
			System.out.print(r+" ");
		}
	
	}

}


