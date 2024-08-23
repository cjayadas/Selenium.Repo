package HomeAssignment.Week1.Day2;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the desired Range :");
		int n=sc.nextInt();
		int i=0, j=1,nextTerm;
		System.out.println("Fibonacci series is :");
		
		//Creating a loop to generate the Fibonacci series within the specified range.
		for (int c=0;c<n;c++)
		{
			if(c<=1)
				nextTerm=c;
				else
				{
					
					nextTerm=i+j;
					i=j;
					j=nextTerm;
				}
				System.out.println(nextTerm);
		}
	}
}

