package learn;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number to check whether it is Even or Odd:");
      
      int num=sc.nextInt();
      
      if(num%2==0)
    	  System.out.println(num+" is a Even number");
      else
    	  System.out.println(num+" is a Odd number");
    	  
		
	}

}
