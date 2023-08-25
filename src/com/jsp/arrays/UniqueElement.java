package com.jsp.arrays;

// 	Q9 WAJP to find a unique element in an array

public class UniqueElement {

	public static int uniqueElement(int a[]) {
		int unique=a[0];
		for(int i=1;i<a.length;i++) 
		{
			unique=unique^a[i];
		}
		return unique;
	}
	
	public static void main(String[] args) {
		int a[]= {3,3,2,2,4,4,5,5,6};
		System.out.println(uniqueElement(a));
	}

}


//output 
//6