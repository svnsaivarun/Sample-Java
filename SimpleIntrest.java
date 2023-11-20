package learn;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Principal : ");
		int Principal=sc.nextInt();
		System.out.print("Enter Time : ");
		int Time=sc.nextInt();
		System.out.print("Enter Rate of intrest : ");
		int rate=sc.nextInt();
		
		int SimpleIntrest=(Principal*Time*rate)/100;
		
		System.out.println("Simple Intrest for Principal Amount "+Principal+" with tenure of "+Time+
				                " Years and rate of intrest percent " +rate+ " is " +SimpleIntrest);
		
	}

}
