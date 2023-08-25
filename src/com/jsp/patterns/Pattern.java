package com.jsp.patterns;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
	}}
	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n=sc.nextInt();


//		int n=7,sp=n-1, st=1;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=sp;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=st;j++)
//			{
//				if(j==1||j==st)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			if(i<=n/2)
//			{
//				sp--;
//				st=st+2;
//			}
//			else 
//			{
//				sp++;
//				st=st-2;
//			}
//			System.out.println();
//			
//			      *
//			     * *
//			    *   *
//			   *     *
//			    *   *
//			     * *
//			      *
//		}
//	}}
//		int n=7, sp=n/2,st=1;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=sp;j++)
//			{
//				System.out.print(" ");
//			}
//			int k=sp+1;
//			for(int j=1;j<=st;j++)
//			{
//				System.out.print(k);
//				if(j<=st/2)
//				{
//					k++;
//				}
//				else {
//					k--;
//				}
//			}
//			if(i<=n/2)
//			{
//				sp--;
//				st=st+2;
//			}
//			else
//			{
//				sp++;
//				st=st-2;
//			}
//			System.out.println();
//			
//			    4
//			   343
//			  23432
//			 1234321
//			  23432
//			   343
//			    4
//
//		}
//	}}

//		int n=7,sp=n-1, st=1; int k=1;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=sp;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=st;j++)
//			{
//				System.out.print(k%2);
//     			k++;
//			}
//			if(i<=n/2)
//			{
//				sp--;
//				st=st+2;
//			}
//			else
//			{
//				sp++;
//				st=st-2;
//			}
//			System.out.println();
//			
//   			  1
//			     010
//			    10101
//			   0101010
//			    10101
//			     010
//			      1
//
//		}
//	}
// }

//		int n=7, sp=n-1, st=1;
//		for(int i=1;i<=n;i++)
//		{
//			for (int j=1;j<=sp;j++) 
//			{
//				System.out.print(" ");
//			}
//			int k=1;
//			for(int j=1;j<=st;j++)
//			{
//				System.out.print(k);
//				if(j<=st/2) 
//				{
//					k++;
//				}
//				else 
//				{
//					k--;
//				}
//			}	
//			if(i<=n/2)
//				{
//					sp--;
//					st=st+2;
//				}
//				else
//				{
//					sp++;
//					st=st-2;
//				}
//			System.out.println();
//			
//			  1
//		     121
//		    12321
//		   1234321
//		    12321
//		     121
//		      1
//		}
//	}
//}
//		int n=7, sp=n-1, st=1;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=sp;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=st;j++)
//			{
//				System.out.print("*");
//			}
//				if(i<=n/2)
//				{
//					sp--;
//					st=st+2;
//				}
//				else
//				{
//					sp++;
//					st=st-2;
//				}
//				System.out.println();
//			
//			     	  *
//				     ***
//				    *****
//				   *******
//				    *****
//				     ***
//				      *
//			}	
//		}
//	}	
//	int n=5, sp=0, st=n*2-1;	
//		
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=sp;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=1;j<=st;j++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//		sp++;
//		st=st-2;
//		
//		*********
//		 *******
//		  *****
//		   ***
//		    *
//	}

		
//============= not done wrong program ===========
//		int n=5, sp=n-1;
//		for(int i=1;i<=n;i++)
//			{
//				for(int j=1;j<=sp;j++)
//				{
//					System.out.print(" ");
//				}
//				  char ch='A';
//				for(int j=1;j<=i;j++)
//				{
//					System.out.print(ch);
//					ch++;
//				}
//				char ch1='D';
//				for(int j=i-1;j<=i;j++)
//				{
//					System.out.print(ch); 
//					ch++;
//				}
//				System.out.println();
//				sp--;
//			   
//				A
//			   ABA
//			  ABCBA
//			 ABCDCBA
//========	ABCDEDCBA  NOT DONE  ===========
//			}
//	}}

//char ch1='C';
//for(int j=2;j<=i;j++)
//{
//	System.out.print(ch);
//	ch++;
//}

//	int n=5, sp=n-1;
//	
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=sp;j++)
//		{
//			System.out.print(" ");
//		}
//		  char ch='A';
//		for(int j=1;j<=i;j++)
//		{
//			System.out.print(ch);
//			ch++;
//		}
//		 char ch1='C';
//		for(int j=2;j<=i;j++)
//		{
//			System.out.print(ch);
//			ch++;
//		}
//		System.out.println();
//		sp--;
//		
//	     A
//	    ABC
//	   ABCDE
//	  ABCDEFG
//	 ABCDEFGHI
//


		
//		int n=5, sp=n-1;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=sp;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) 
//			{
//				System.out.print(j);
//				
//				if(j<i)
//				{
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//			sp--;
			
//		     1
//		    1*2
//		   1*2*3
//		  1*2*3*4
//		 1*2*3*4*5

			
//=================================07/06/23======================================
		
//		int n=5, st=1, sp=n-1;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=sp;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=i;j>=1;j--)
//			{
//				System.out.print(j);
//			}
//			for(int j=2;j<=i;j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//			sp--;
//			st++;
//			
//		     1
//		    212
//		   32123
//		  4321234
//		 543212345
//		}
//	


//		int n=5, st=1, sp=n-1;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=sp;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=st;j++)
//			{
//				System.out.print(j);
//			}
//			for(int j=i-1;j>0;j--)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//			sp--;
//     		st++;
//     		
//     	    1
//     	   121
//     	  12321
//     	 1234321
//     	123454321
//		}
//		
//	}}
//		int n=5, st=1, sp=n-1;
//		int k=1;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=sp;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=st;j++)
//			{
//				System.out.print(k%2);
//				k++;
//			}
//			System.out.println();
//			sp--;
//			st=st+2;
//			
//		     1
//		    010
//		   10101
//		  0101010
//		 101010101
//
//		}
//		
//	}}
//		int n=5, st=1, sp=n-1;
//		
//		for(int i=1;i<=n;i++) 
//		{
//			for(int j=1;j<=sp;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=st;j++)
//			{
//				System.out.print(i%2);
//			}
//			System.out.println();
//			sp--;
//			st=st+2;
//			
//			    1
//			   000
//			  11111
//			 0000000
//			111111111
//
//		}
//	}}
		
//		int n=5; int st=1; int sp=n-1;       
//		for(int i=1;i<=n;i++)
//			{
//				for(int j=1;j<=sp;j++)
//				{
//				   System.out.print(" ");
//				}
//				for(int j=1;j<=st;j++)
//				{
//					System.out.print("*");
//				}
//				System.out.println();
//				sp--;
//				st=st+2;
//				
//			     *
//			    ***
//			   *****
//			  *******
//			 *********
//
//			}
//		}
//	}
// ======================================06/06/23================================
		
//		int n=5;
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//  }
//}

		
//	int n=5, sp=n-1;
//	for(int i=1;i<=n;i++)
//	{
//		int k=i;
//		for(int j=1;j<=sp;j++)
//		{
//			System.out.print(" ");
//		}
//		for (int j=1;j<=i;j++)
//		{
//			System.out.print(k);
//			k++;
//		}
//		System.out.println();
//		sp--;
//		
//		    1
//		   23
//		  345
//		 4567
//		56789
		
	
//		int n=5, sp=n-1;
//		for(int i=1;i<=n;i++)
//		{
//			for (int j=1;j<=sp;j++) 
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			sp--;
//			
//			    *
//			   **
//			  ***
//			 ****
//			*****
//		}
//		
//	}
//   }
 
		
//		int n=5; int sp=0;
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=1;j<=sp;j++) 
//			{
//				System.out.print(" ");
//			}
//	         for(int j=1;j<=i;j++)
//	         {
//	        	 System.out.print(j);
//	         }
//	         System.out.println();
//	         sp++;
//	         
//	         12345
//	          1234
//	           123
//	            12
//	             1

		

//	 }
//		}
//	

//		 int n=5;  int sp=0;
//		 for(int i=n;i>=1;i--)
//		 {
//			 for(int j=1;j<=sp;j++)
//			 {
//				 System.out.print(" ");
//			 }
//			 for(int j=i;j>=1;j--)
//			 {
//				 System.out.print(j);
//			 }
//			 System.out.println();
//			 sp++;
//			 
//			 54321
//		   	  4321
//			   321
//			    21
//			     1
		
		
//		int n=5; int sp=0;
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=1;j<=sp;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//				
//			}
//			System.out.println();
//			sp++;
//			
//			*****
//			 ****
//			  ***
//			   **
//			    *
			
		

//		for(int i=1;i<=n;i++)
//		{
//			for(int j=n;j>=i;j--)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//			
//			5 4 3 2 1 
//			5 4 3 2 
//			5 4 3 
//			5 4 
//		    5
		
//		int n=5; 
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//				{
//					System.out.print(j+" ");
//				}
//			System.out.println();
//			1 2 3 4 5 
//			1 2 3 4 
//			1 2 3 
//			1 2 
//			1 
//		}}}


//		int n=5; 
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//				{
//					System.out.print("* ");
//				}
//			System.out.println();
//			
//			* * * * * 
//			* * * * 
//			* * * 
//			* * 
//			* 
//		}}}
	
//		int n=5; 
//		for(int i=1;i<=n;i++)
//		{
//			int k=i;
//			for(int j=1;j<=i;j++)
//				{
//					System.out.print(k+" ");
//					k=k+n-j;
//				}
//			System.out.println();
//			
//			1 
//			2 6 
//			3 7 10 
//			4 8 11 13 
//			5 9 12 14 15 
//
//			}
//				}
//		}

//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//				{
//					if(j==1||i==j||i==n)
//					{
//						System.out.print("* ");
//					}
//					else
//					{
//						System.out.print("# ");
//					}
//				}
//			System.out.println();
//						}
//		}}
//		* 
//		* * 
//		* # * 
//		* # # * 
//		* * * * * 
//				}
//		}

//		int n=5;
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=i;j<=n;j++)
//				{
//					System.out.print(j+" ");
//				}
//			System.out.println();
//			5 
//			4 5 
//			3 4 5 
//			2 3 4 5 
//			1 2 3 4 5 
//
//			}
//				}
//		}


//		int n=5;
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=n;j>=i;j--)
//				{
//					System.out.print(j+" ");
//				}
//			System.out.println();
//			5 
//			5 4 
//			5 4 3 
//			5 4 3 2 
//			5 4 3 2 1 
//			
//			}
//				}
//		}
		
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=i;j>=1;j--)
//				{
//					System.out.print(j+" ");
//				}
//			System.out.println();
//			
//			1 
//			2 1 
//			3 2 1 
//			4 3 2 1 
//			5 4 3 2 1 
//			}
//				}
//		}
		
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//				{
//					System.out.print(j%2);
//				}
//			System.out.println();
//			1
//			10
//			101
//			1010
//			10101
//
//			
//			}
//				}
//		}

//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//				{
//					System.out.print(i%2);
//				}
//			System.out.println();
//			
//			1
//			00
//			111
//			0000
//			11111
//
//			}
//				}
//		}

		
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			int temp=i;
//			int count=n;
//			for(int j=1;j<=n;j++)
//			{
//				if(count==n) 
//				{
//					System.out.print(i+" ");
//				}
//				else
//				{
//					temp=temp+count;
//					System.out.print(temp+" ");
//				}count--;
//			}System.out.println();
//			
//			1 5 8 10 11 
//			2 6 9 11 12 
//			3 7 10 12 13 
//			4 8 11 13 14 
//			5 9 12 14 15 
//		}
//	}}
//		int n=5;
//	   for(int i=1;i<=n;i++) 
//	   {
//		   for(int j=1;j<=i;j++) 
//		   {
//			   System.out.print(" ");
//		   }
//		   System.out.println();
//	   
//		   
//	   for(int i1=n-1;i1>=1;i1--)
//	   {
//		   for(int j=1;j<=i;j++)
//		   {
//			   System.out.print("* ");
//		   }
//		   System.out.println();
//	   }
//	   }
//	}
//}
//	
//	
//	
//	}}
//		for(int i=1;i<=n;i++) {
//			int k=i;
//			for(int j=1;j<=k;j++) {
//				System.out.print(k+" ");
//				k=k+n-j;
//			}
//			System.out.println();
//		}
// 
//				}
//			}
		
		
		
		/*	for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=n;j++) {
				System.out.print(ch +" ");
				ch++;
			}
			System.out.println(" ");
		}
	}
}
A B C D  
A B C D  
A B C D  
A B C D  

		
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
}
5 4 3 2 1  
5 4 3 2 1  
5 4 3 2 1  
5 4 3 2 1  
5 4 3 2 1  

		
		
		
		
		for(int i=n;i>=1;i--) 
		{
 			for(int j=n;j>=i;j--) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		5 
		5 4 
		5 4 3 
		5 4 3 2 
		5 4 3 2 1 
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
		1
		12
		123
		1234
		12345  
		
		   
		   for(int i=1;i<=n;i++)
		     {
			for(int j=i;j<=n;j++)
			{
				System.out.print(i+"");
			}
			System.out.println();
		}     
		
		11111
        2222
        333
        44
        5
		  
		  
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"");
			}
			System.out.println();
		}
		1
		22
		333
		4444
		55555   
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
		54321
		5432
		543
		54
		5     
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
		
		7654321
		765432
		76543
		7654
		765
		76
		7   
		
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
		
		7
		76
		765
		7654
		76543
		765432
		7654321 
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"");
			}
			System.out.println();
		}
		
		1
		22
		333
		4444
		55555
		666666
		7777777  
		
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
		
		5
		45
		345
		2345
		12345   
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		1
		12
		123
		1234
		12345  
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;i>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}  
		
		
		int sp=0;
		for(int i=n;i>=1;i--) 
		{
			for(int j=1;j<=sp;j++) 
			{
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
			sp++;
		} */
//		int n=4;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				if(i==1||i==n||j==1||j==n) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print(" "
//							+ ""
//							+ "  ");
//				}
//			}
//			System.out.println();	
//		}
//	}
//}
//		* * * * * * * 
//		* *       * * 
//		*   *   *   * 
//		*     *     * 
//		*   *   *   * 
//		* *       * * 
//		* * * * * * *    
//		
////		int k=1;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//				j++;
//			
//				if(j==10) {
//					j=1;
//				}	
//			}
//			System.out.println();
//		}
//
//		}
	
	















