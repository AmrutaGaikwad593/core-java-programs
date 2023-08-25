package com.jsp.string;

import java.util.ArrayList;

//Q5. WAJP to reverse a each word in a string

public class ReverseWord {
	
	
	
	

	public static void reverseWord(String s) 
	{

		String str[]=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i] +" ");
		}
	}
	
	public static void main(String[] args) {
		String s="hii good morning";
		reverseWord(s);
	}
}


// output
// morning good hii 


//Q6. WAJP to reverse each word of the string
//Q7. WAJP to 
//Q8. WAJP
//Q9. WAJP
