package com.jsp.numberprograms;

import java.util.Scanner;

public class PerfectNo {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter no");
//		int n=sc.nextInt();
//		if(isPerfect(n)) {
//			System.out.println(n+" is perfect no ");
//		}
//		else {
//			System.out.println(n+" is not perfect no");
//		}
//	}
//	public static boolean isPerfect(int n) {
//		int sum=0;
//		for(int i=1;i<=n/2;i++) {
//			if(n%i==0) {
//				sum=sum+i;
//			}
//		}
//		return sum==n;
//	}
//
//}




	public static void isPerfectNumber(int n) {
		int sum=0;
		for (int i=1;i<=n;i++) {
			if (n%i==0) 
				sum=sum+i;

		}

		if(sum==n)	
		{
			System.out.println(n+" is a perfect number");
		}else 
		{
			System.out.println(n+ " is not perfect number");

		}
		
	
}

public static void main(String[]args) {
	
 isPerfectNumber(27);


}
}
