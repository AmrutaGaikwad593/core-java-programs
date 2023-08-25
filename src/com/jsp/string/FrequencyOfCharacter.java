package com.jsp.string;
//Q4. WAJP to check the frequency of character in string

public class FrequencyOfCharacter {

	
	public static void frequencyOfChar(String s)
	{
		int count[]=new int[128];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				count[ch-65]++;
			}
			else if(ch>='a'  && ch<='z')
			{
				count[ch-97]++;
			}
		}
//		to print
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)(97+i)+" repets ----> "+count[i]+ " times");
			}
		}
	}
	
	
	public static void main(String[] args) {
		String s="Java Programming";
		frequencyOfChar(s);
	}
}

//  output
//  a repets ----> 3 times
//  g repets ----> 2 times
//  i repets ----> 1 times
//  j repets ----> 1 times
//  m repets ----> 2 times
//  n repets ----> 1 times
//  o repets ----> 1 times
//  p repets ----> 1 times
//  r repets ----> 2 times
//  v repets ----> 1 times

