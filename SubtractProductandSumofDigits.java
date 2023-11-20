package learn;

import java.util.Scanner;

public class SubtractProductandSumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=0;
		int product=1,sum=0;
		while(num>0) {
			int rem=num%10;
			num=num/=10;
			product=product*rem;
			sum=sum+rem;
						
		}
        result=product-sum;
        System.out.println(result);
	}

}
