package com.jsp.arrays;

public class SelectionSort {

	public static void sort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}
	}
	
	public static void main(String[] args) {
		int a[]= {71,18,7,74,63,48,23};
		sort(a);
	}
}

//output
//7 18 23 48 63 71 74 
