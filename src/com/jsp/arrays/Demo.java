package com.jsp.arrays;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<>();
		
	}

}
	
//	Q11. WAJP to search the element in an array...
//
//	public static int searchElement(int a[],int n)
//	{
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]==n)
//			{
//				return i+1;
//			}
//		}
//		return n;
//		
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		int a[]= {3,1,5,2,2,5,4};
//		int p=searchElement(a, 4);
//		System.out.println("index of is "+p);
//	}
//}
//	
//	Q10.  WAJP to rotate the array twice from left?
//	
//	public static int[] leftRotate(int a[],int n) 
//	{
//		
//		for(int i=0;i<n;i++)
//		{
//			int first=a[0]; 
//			int j=0;
//			for(j=0;j<a.length-1;j++)
//			{
//				a[j]=a[j+1];
//			}
//			a[j]=first;
//		}
//		return a;
//	}
//	
//	public static void main(String[] args) {
//		int a[]= {3,3,1,1,2,2,4,4};
//		int b[]=leftRotate(a, 4);
//		
//		for(int n:b) {
//			System.out.print(n+" ");
//		}
//		   
//		     o/p ==  2 2 4 4 3 3 1 1 
//	}
//}
//	
//15/05/23	Q9 WAJP to find a unique element in an array
//	
//	public static int uniqueElement(int a[]) {
//		int unique=a[0];
//		for(int i=1;i<a.length;i++) 
//		{
//			unique=unique^a[i];
//		}
//		
//		return unique;
//	}
//	
//	public static void main(String[] args) {
//		int a[]= {3,3,2,2,4,4,5,5,6};
//		System.out.println(uniqueElement(a));
//	}
//        o/p ==== 6
//}	
	
	
//	Q8  WAJP to to check the if the number is xylem or phelom each present in an array?
	
//	Q7 WAJP to count the number of prime no present in an array?
	

//Q6  count the pair which sum is 7
	
//	public static int sumPair(int a[],int sum) {
//		int count=0;
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]+a[j]==sum)
//				{
//					System.out.println("("+a[i]+","+a[j]+")");
//					count++;
//				}
//			}
//		}
//		if(count>0) {
//			return count;
//		}
//		else {
//			return 0;
//		}
		
//	}
//	public static void main(String[] args) {
//		int a[]= {1,3,6,2,5,4,3,2,4};
//		System.out.println(sumPair(a, 7));
		
//		(1,6)(3,4)(3,4)(2,5)(5,2)(4,3)(3,4)
//		
//		7
//
//	}
//	}
		
//	Q5 WAJP to reverse of array 
	
//	public static int[] reverseArray(int a[]) {
//		int b[]=new int[a.length];
//		int k=0;
//		for(int i=a.length-1;i>=0;i--)
//		{
//			b[k]=a[i];
//	        k++;
//		}
//		return b;
//	}
//	
//	public static void main(String[] args) {
//		int a[]= {1,4,5,7,8,3};
//		int b[]=reverseArray(a);
//		for(int i=0;i<a.length;i++) {
//			System.out.println(b[i]+" ");
//			    
//			         OR
//		foreach loop
		
//		for(int c:b) {
//			System.out.print(c+" ");
//		}
//			
//		}}
//		
//		3 
//		8 
//		7 
//		5 
//		4 
//		1 
//
//	}
//}
	
//	Q4. 14/06/2023  to find diffrernce bwt odd and even no
	
//	public static int sumOddEven(int a[]){
//		int sumeven=0;
//		int sumodd=0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2==0)
//			{
//				sumeven=sumeven+a[i];
//			}
//			else
//			{
//				sumodd=sumodd+a[i];
//			}
//		}
//		if(sumeven>sumodd)
//		{
//			return sumeven-sumodd;
//		}
//		else {
//			return sumodd-sumeven;
//		}
//	}
//	
//	public static void main(String[] args) {
//		int a[]= {1,2,3,4,5,6};
//		System.out.println(sumOddEven(a));
	
//	o/p
//	    3
//	}
//}

	

//	Q3 WAJP to find difference between largest and smaller element in an array;
	
//	public static void diffLargestSmalest(int a[]) {
//		int min=a[0];
//		int max=a[0];
//		for(int i=0;i<a.length;i++) {
//			if(max<a[i]) {
//				max=a[i];
//			}
//			else if(min> a[i]) {
//				min=a[i];
//			}
//		}
//		System.out.println("difference is "+(max-min));
//		
//	}
//		public static void main(String[] args) {
//			int a[]= {5,7,4,9};
//			diffLargestSmalest(a);
//		}
//	}

	
//Q2 find the largest elememnt in an array.
//
//	public static int largestArrayElement(int a[]) {
//		int largest=a[0];
//		for(int i=0;i<a.length;i++) {
//			if(largest<a[i]) {
//				largest=a[i];
//			}
//		}
//		return largest;
//	}
//	
//	public static void main(String[] args) {
//		int a[]= {12,90,12,50,45,60,100};
//		System.out.println(largestArrayElement(a));
//	}
	
	
	
//Q1. find sum of odd and even no.

//	public static void sumOfEvenOdd(int a[]){
//		int countodd=0;
//		int counteven=0;
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2==0)
//			{
//				counteven=counteven+a[i];
//			}
//			else 
//			{
//			    countodd=countodd+a[i]; 
//			}
//	}
//	System.out.println(countodd);
//	System.out.println(counteven);
//}
//
//		public static void main(String[] args) {
//			int a[]= {1,2,3,4,5,6,7};
//			sumOfEvenOdd(a);
//			
//		}
//}
	
	
	

