package learn;

import java.util.Scanner;

public class MinimumMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter 3 numbers and which is minimum and which is maximum: ");
	    
	    int num1=sc.nextInt();
	    int num2=sc.nextInt();
	    int num3=sc.nextInt();
	    
	    int min=Minimum(num1,num2,num3);
	    int max=Maximum(num1,num2,num3);
	    
	    System.out.println("Minimum is: "+min+ " and  Maximum is: "+max);
	    
	    
	    sc.close();
	}
	static int Minimum(int num1,int num2,int num3)
	{
		int min=num1;
		if(num2<min)
			min=num2;
	    if(num3<min)
			min=num3;
		return min;
	}

	static int Maximum(int num1,int num2,int num3)
	{
		int max=0;
		if(num1>num2)
			max=num1;
		else
			max=num2;
		if(num3>max)
			max=num3;
//		max=Math.max(num3,Math.max(num1,num2));
		return max;
	}

}
