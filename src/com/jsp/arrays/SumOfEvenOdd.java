package com.jsp.arrays;

//Q1. find sum of odd and even no.

public class SumOfEvenOdd {

	public static void sumOfEvenOdd(int a[]){
		int countodd=0;
		int counteven=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
			{
				counteven=counteven+a[i];
			}
			else 
			{
			    countodd=countodd+a[i]; 
			}
	}
	System.out.println(countodd);
	System.out.println(counteven);
}

		public static void main(String[] args) {
			int a[]= {1,2,3,4,5,6,7};
			sumOfEvenOdd(a);
			
		}
}

//output
//16
//12