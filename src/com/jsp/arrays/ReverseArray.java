package com.jsp.arrays;

//Q5 WAJP to reverse of array 
	
public class ReverseArray {

	public static int[] reverseArray(int a[]) {
		int b[]=new int[a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[k]=a[i];
	        k++;
		}
		return b;
	}
	
	public static void main(String[] args) {
		int a[]= {1,4,5,7,8,3};
		int b[]=reverseArray(a);
//		for(int i=0;i<a.length;i++) {
//			System.out.print(b[i]+" ");
			    
//			         OR
//		foreach loop
		
//		for(int c:b) {
//			System.out.print(c+" ");
//		}		
//		}
	}		
}

// output
// 3 8 7 5 4 1 
