package learn;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int num=sc.nextInt();
		
		if(num==0||num==1)
			System.out.println("neither prime nor composite");
		
		int c=2;
		
		while(c*c<=num)
		{
			if(num%c==0)
			{
				System.out.println(num+" is a composite number"/*+c*/);
				return;
					
			}
			//else
			c++;
		}
		if(2<num)//we should not use c to check here as c value is getting increased in above loop.  
			System.out.print(num+" is prime");
    
	}

}
