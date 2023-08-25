package com.jsp.string;
// Q2.  WAJP to convert lower to upper and upper to lower
public class CaseInterchange {

	public static String caseInterchange(String s)
	{
		//step 1:  convert string to char array
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char) (ch[i]+32);
			}
			else if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i]=(char) (ch[i]-32);
				}
			
		}String newSentence=new String(ch);
		return newSentence;
	}
  
	
	
	public static void main(String[] args) {
		String s="HellO Good  morning";
		System.out.println(caseInterchange(s));
	}

}

// output
// hELLo gOOD  MORNING
