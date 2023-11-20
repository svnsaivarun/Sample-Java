package learn;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		boolean check=armstrong(num);
		System.out.println(check);

//		for(int i=0;i<1000;i++) {
//        if(armstrong(i))
//           	System.out.print(i+" ");
//     	}
		
	}
	
	static boolean armstrong(int num)
	{
		int temp=num;
		int sum=0;
		while(num>0)
		{
		int rem=num%10;
		sum=sum+rem*rem*rem;
		num=num/10;
		}		
		return temp==sum ;
	}
	
	

}
