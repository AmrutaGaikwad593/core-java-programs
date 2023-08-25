package com.jsp.string;

import java.util.Scanner;

public class ReverseLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an array");
		String s=sc.nextLine();
		reverseLetter(s);
	}
		public static void reverseLetter(String s) {
		String out="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			out=c+out;
		}
		System.out.println(out);
		}
				
	}

