package learn;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the year we will say whether it is Leap Year or not: ");
		int year=sc.nextInt();
		
		/*
		Every year that is exactly divisible by four is a leap year, except for years that are 
		exactly divisible by 100, but these centurial years are leap years if they are exactly
		 divisible by 400
		(ex:year-2200 is not a leap year.)
		*/
		if(year%400==0 || (year%4==0 && year%100!=0))
			System.out.println("Yes!! "+year+" is a Leap Year.");
		else
			System.out.println(year+" is not a Leap Year");

	}

}
