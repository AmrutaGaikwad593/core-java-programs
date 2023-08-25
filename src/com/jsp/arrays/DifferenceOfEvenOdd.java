package com.jsp.arrays;

//Q4. WAJP to find diffrernce bwt odd and even no

public class DifferenceOfEvenOdd {

	public static int sumOddEven(int a[]){
		int sumeven=0;
		int sumodd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
			{
				sumeven=sumeven+a[i];
			}
			else
			{
				sumodd=sumodd+a[i];
			}
		}
		if(sumeven>sumodd)
		{
			return sumeven-sumodd;
		}
		else {
			return sumodd-sumeven;
		}
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		System.out.println(sumOddEven(a));
	}
}

//output
//3
