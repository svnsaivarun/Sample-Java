package learn;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		while(true)
		{
			char operator='+';
		if(operator=='+' )
		{
			//System.out.println("Enter the number");
			int num=sc.nextInt();
			if(num==0)
				break;
			else
			sum=sum+num;
		}
		System.out.println(sum);
		}
		
//		int num;
//        
//        System.out.println("Please enter number: ");
//        do{
//            num = sc.nextInt();
//            sum = sum + num;
//        }
//        while (num != 0);
//        System.out.println("Sum = " + sum);
		
	}
}
