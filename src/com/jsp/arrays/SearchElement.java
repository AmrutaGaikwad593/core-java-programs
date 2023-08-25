package com.jsp.arrays;

//Q11. WAJP to search the element in an array...

public class SearchElement {

	public static int searchElement(int a[],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				return i+1;
			}
		}
		return n;
		
		
	}
	
	public static void main(String[] args) {
		
		int a[]= {3,1,5,2,2,5,4};
		int p=searchElement(a, 4);
		System.out.println("index of is "+p);
	}
}


//output
//index of is 7