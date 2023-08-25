package com.jsp.arrays;

//Q3 WAJP to find difference between largest and smaller element in an array

public class DiffLargestSmallest {

	public static void diffLargestSmallest(int a[]) {
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			else if(min> a[i]) {
				min=a[i];
			}
		}
		System.out.println("difference is "+(max-min));
		
	}
		public static void main(String[] args) {
			int a[]= {5,7,4,9};
			diffLargestSmallest(a);
		}
	}
// output
//difference is 5

