package com.jsp.arrays;

import java.util.Arrays;

import com.jsp.numberprograms.Array;

// rules to binaysearch
//1. Array Should be sorted first

//Q WAJP on binary sort

public class BinarySearch {

	public static void binarySearch(int a[]) 
	{
		int low=0;
		int high=a.length;
		int key=65;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==key)
			{
				System.out.println(mid+1);
				break;
			}
			else if(a[mid]< key)
			{
				low=mid+1;
			}
			else if(a[mid] > key)
			{
				high=mid-1;
			}
//			else
//			{
//				System.out.println("Element not found");
//			}
		}
		
	}
	
	public static void main(String[] args) {
		int a[]= {14,10,50,75,65,48,11};
		Arrays.sort(a);
		binarySearch(a);
	}
}
