package com.jsp.numberprograms;

import java.util.Scanner;

public class Array {
	public static int[] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter The Values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static void displayArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
