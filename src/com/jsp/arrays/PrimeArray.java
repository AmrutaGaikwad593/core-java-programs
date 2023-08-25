package com.jsp.arrays;

//Q7 WAJP to count the number of prime no present in an array?

public class PrimeArray {
	
	public static boolean isPrime(int n) {
		if(n==1) 
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,11};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(isPrime(a[i])) 
			{
				count++;
			}
		}
		System.out.println(count);
	}
}

//output 
// 5
