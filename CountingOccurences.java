package learn;
import java.util.Scanner;

public class CountingOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int num1=num;
		System.out.println("Enter a value: ");
		int check=sc.nextInt();
		
		int count=0;
		
		while(num>0) {
			
		int rem=num % 10;
		if(rem==check) {
			count++;
		}
		num/=10;//num=num/10;
		

	}
System.out.println(check+" is occuring "+count+" times in "+num1);
}
}