package learn;

import java.util.Scanner;

public class Caluclator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int result=0;
		
		while(true)
		{
			System.out.print("Enter the operator: ");
			char operator=sc.next().charAt(0);
		if(operator=='+' || operator=='-' || operator=='*' || operator=='/' || operator=='%')
		{

			System.out.println("Enter the numbers");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			
			if(operator=='+')
				result=num1+num2;
			if(operator=='-')
				result=num1-num2;
			if(operator=='*')
				result=num1*num2;
			if(operator=='/')
				result=num1/num2;
			if(operator=='%')
				result=num1%num2;
		}
		else if(operator=='X' || operator == 'x') {
			break;			
		}
		else {
			System.out.println("Not a valid operator");
		}
		System.out.println(operator+" "+result);

	}
	}
}
