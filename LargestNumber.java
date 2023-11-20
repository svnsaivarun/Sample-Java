package learn;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);		
		int max=0;
		int num;
		System.out.println("Enter number: ");
		do {
			
			num=sc.nextInt();
			if(num==0)
				break;
			else if(num>max)
				max=num;
			
		}while(num>0);
		System.out.println(max+" is the largest number in the entered numbers.");
		
//		while(true)
//		{
//			int num=sc.nextInt();
//			if(num>max)
//				max=num;
//			
//			System.out.println(max);
//		}
		

	}

}
