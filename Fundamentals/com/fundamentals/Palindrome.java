package com.fundamentals;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int i=1;
		while(i==1) {
		System.out.println("\nMenu \n 1. Check for palindrome \n 2.exit");
		Scanner sc= new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
		System.out.print("Enter the number to check");
		int n=sc.nextInt();
		int rem, temp=n, sum=0;
		
	    while(n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;		
		}
	
		if(temp==sum) System.out.print("\nPalindrome");
		else System.out.print("\nNot Palindrome");
		break;
		case 2: System.exit(0);
		}
	}
	}	

}
