package com.jsp.numberprograms;

import java.util.Scanner;

public class PrimeNo {
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter no");
//	int n=sc.nextInt();
//	if(isPrime(n)) {
//		System.out.println(n+ " prime");
//	}
//	else {
//		System.out.println(n+" not Prime");
//	}
//}
//public static boolean isPrime(int n) {
//	if(n<=1) {
//		return false;
//	}
//	for(int i=2;i<=n/2;i++) {
//		if(n%i==0) {
//			return false;
//		}
//	}
//	return true;
//}
//}

	
	
	
	
	
	public static void isPrimeNumber(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			
		}if(count==2) {
			System.out.println(n+" is prime number");
		}else {
			System.out.println(n+" is  not prime number");
		}
			
			
		
	}
	
	public static void main(String[]args) {
		
	 isPrimeNumber(0);
	
	}
	
}


