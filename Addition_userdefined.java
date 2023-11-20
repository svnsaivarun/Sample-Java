package learn;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Addition_userdefined
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		int a,b;
		float c,d;		
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Enter a value");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter b value");
		b=Integer.parseInt(br.readLine());
		System.out.println("Enter c value");
		c=Float.parseFloat(br.readLine());
		
		d=a+b+c;
		
		System.out.println("d values is "+d);
		System.out.println("d values is %f "+d);

	}

}
