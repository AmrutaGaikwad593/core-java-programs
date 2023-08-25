package com.jsp.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int a[]) 
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j] > a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}
	}
	
	public static void main(String[] args) {
	int a[]= {71,20,14,50,77,30,100};
	Arrays.sort(a);
	bubbleSort(a);
	}
}

//output
//14 20 30 50 71 77 100 
