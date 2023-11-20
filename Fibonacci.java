package learn;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0,s=1,t=0;
		System.out.print(f+" "+s);
		for(int i=2;i<20;i++)
		{
			t=f+s;
			
			f=s;
			s=t;
			System.out.print(" "+t);
		}

	}

}
