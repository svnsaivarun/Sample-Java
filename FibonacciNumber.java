package learn;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the term needed in Fibonacci Series: ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		
		int count=2;
		
		while(count<=n) {
			int temp=b;
			b=b+a;
			a=temp;
			//to print series
			System.out.print(" "+b+" ");
			count++;
		}
		//print nth number in Fibonacci series
		//System.out.println(b);

	}

}
