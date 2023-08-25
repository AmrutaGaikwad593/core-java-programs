package com.jsp.numberprograms;

public class Neon {

	public static void main(String args[]) {
		int n=27; int square=n*n;
		int sum=0;
		while(square!=0) {
			int digit =square%10;
			sum=sum+digit;
			square=square/10;
		}
		if(sum==n) {
			System.out.println(n + " is neon number");
		}else {
			System.out.println(n+" is not neon number");

		}
	}
	}
