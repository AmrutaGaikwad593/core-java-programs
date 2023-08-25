package com.jsp.string;
// Q3.WAJP to sum of digit int string

public class SumTheNumber {

	public static int sumTheNumber(String s) 
	{
		int sum=0;
		String num="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
		}
		int number=Integer.parseInt(num);
		while(number>0)
		{
			sum=sum+number%10;
			number=number/10;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		String s="xyzabc12lmn1324";
		System.out.println(sumTheNumber(s));
	}
}


// output
// 13