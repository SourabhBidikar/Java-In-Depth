package com.sourabh;

public class DemoForEach {

	public static void main(String[] args) {
		
		int nums[]= {12,13,14,16};
		
		//to traverse using  for loop
		System.out.println("traverse using  for loop");
		for(int i=0;i<4;i++)
		{
			System.out.println(nums[i]);
		}
		
		
		//to traverse using for-each
		System.out.println("---------------------------------");
		System.out.println("traverse using  for-each loop");
		
		for(int x:nums)
		{
			System.out.println(x);
		}
	}

}
