package com.jsp.arrays;

//Q6  count the pair which sum is 7

public class SumPair {
	public static int sumPair(int a[],int sum) {
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println("("+a[i]+","+a[j]+")");
					count++;
				}
			}
		}
		if(count>0) {
			return count;
		}
		else {
			return 0;
		}
		
	}
	public static void main(String[] args) {
		int a[]= {1,3,6,2,5,4,3,2,4};
		System.out.println(sumPair(a, 7));
	}
}

// output
//(1,6)(3,4)(3,4)(2,5)(5,2)(4,3)(3,4)
//7

