package com.jsp.string;

//Q1.  WAJP to count the word's in string
public class NumberOfWords {

	
	public static  int countWord(String a) {
			int count;
			if(a.charAt(0)==' ') 
			{
				count=0;
			}
			else
			{
				count=1;
			}
			for(int i=0;i<a.length();i++)
			{
				
				if(a.charAt(i)==' ' && a.charAt(i+1)!= ' ')
				{
						count++;
				}
			}return count;
	}
	
	public static void main(String[] args) {
		String s="  Hii Good Morning";
		System.out.println("The count of word is "+countWord(s));
	}
}

// output
// The count of word is 3
