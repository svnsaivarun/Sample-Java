package learn;

import java.util.Scanner;

public class GreetingMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter your name ");
		String name=sc.nextLine();
		
		System.out.println("Hello!! "+name.toUpperCase()+" Good to see you here");

	}

}
