package com.jsp.arrays;

//  Q10. WAJP to rotate the array twice from left?

		
public class LeftRotate {

	public static int[] leftRotate(int a[],int n) 
	{
		
		for(int i=0;i<n;i++)
		{
			int first=a[0]; 
			int j=0;
			for(j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[j]=first;
		}
		return a;
	}
	
	public static void main(String[] args) {
		int a[]= {3,3,1,1,2,2,4,4};
		int b[]=leftRotate(a, 4);
		
		for(int n:b) {
			System.out.print(n+" ");
		}
	}	   
}

// output
// 2 2 4 4 3 3 1 1 
