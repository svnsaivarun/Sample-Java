package learn;

import java.util.Scanner;

public class LargestNumberof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		//Solution 1
//		if(a>b && a>c) System.out.println(a+"(a) is big ");
//		else if(b>c) System.out.println(b+"(b) is big ");
//		else System.out.println(c+"(c) is big");
		
		//Solution 2
//		int max=a;
//		if(b>max) max=b;
//		if(c>max) max=c;
//		
//		System.out.println(max+" is big");
			
		//Solution 3
		int max=Math.max(c, Math.max(a, b));
		System.out.println(max+" is big");
	}

}
