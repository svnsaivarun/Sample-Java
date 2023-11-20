package learn;

import java.util.Scanner;

public class AlphabetCaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z')
			System.out.println("Lower Case");
		else if(ch>='A' && ch<='Z')
			System.out.println("Upper Case");
		else
			System.out.println("Not a character");

	}

}
