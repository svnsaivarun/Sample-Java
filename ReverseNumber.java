package learn;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int result=0;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			
			result=result*10+rem;
			
		}
		System.out.print(result);

	}

}
