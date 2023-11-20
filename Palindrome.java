package learn;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value 1 or 2 ");
		int num1=sc.nextInt();
		
		if(num1==1) {
		System.out.println("Enter a value I'll tell you whether it is palindrome or not: ");
		int num=sc.nextInt();		
		int result=0;
		int temp=num;
		while(num>0)
		{
			int rem=num%10;
			num/=10; 
			result=result*10+rem;			
		}
		
		if(result==temp)
			System.out.println("Yes!! "+temp+"  is a palindrome.");
		else
			System.out.println(temp+" is not a palindrome");
		}
		else if(num1==2)
		{
			String s=sc.next();
			String reverse="";
			int length=s.length();
			
			for(int i=length-1;i>=0;i--)
			{
				reverse=reverse+s.charAt(i);
			}
			if(s.equals(reverse))
				System.out.println("Yes!! "+s+" is a palindrome.");
			else
				System.out.println(s+" is a not a palindrome.");
		}
		else
			System.out.println("Not valid.Enter 1 or 2");
		
	}

}
