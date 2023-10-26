package com.strings;

public class reverseWithoutmethods {

	public static void main(String[] args) {
		// for iNeuron to norueNi
		String s1="iNeuron";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		
		System.out.println(s2);
		
		//ineuron java ==> norueni avaj 
		String s3="ineuron java";
		String s4="";
		
		String[] ar= s3.split(" ");
		
		for(String elem:ar) {
			for(int i=elem.length()-1;i>=0;i--) {
				s4=s4+elem.charAt(i);
			}
			s4=s4+" ";
		}
		
		System.out.println(s4);
		
		
		//ineuron java ==> java ineuron
		String[] ar2=s3.split(" ");
		String s5="";
		
		for(int i=ar2.length-1;i>=0;i--) {
			for(int j=0;j<ar2[i].length();j++) {
				s5=s5+ar2[i].charAt(j);
			}
			s5=s5+" ";
		}
		System.out.println(s5);
	}
		
}
