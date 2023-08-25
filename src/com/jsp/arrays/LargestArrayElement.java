package com.jsp.arrays;

//Q2 find the largest elememnt in an array.


public class LargestArrayElement {
	
	public static int largestArrayElement(int a[]) {
		int largest=a[0];
		for(int i=0;i<a.length;i++) {
			if(largest<a[i]) {
				largest=a[i];
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {
		int a[]= {12,90,12,50,45,60,100};
		System.out.println(largestArrayElement(a));
	}
	
}

//output
//100
