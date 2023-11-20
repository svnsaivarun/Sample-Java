package learn;

public class ByteAddition
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		byte a,b,c;
		a=10;
		b=20;
	  //b=120;     //if value is taken more than byte range then garbage value will prints -126
		c=(byte)(a+b);//type casting
     // c=a+b;//Unresolved compilation problem:Type mismatch: cannot convert from int to byte
	 // c=(byte)a+b;//brackets missing for a+b Unresolved compilation problem:Type mismatch: cannot convert from int to byte
		
		
		System.out.println("c value is"+c);

	}

}
