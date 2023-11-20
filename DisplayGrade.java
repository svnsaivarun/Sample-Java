package learn;

import java.util.Scanner;

public class DisplayGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter you marks to know you Grade: ");
		int marks=sc.nextInt();
		String grade=Grade(marks);
		System.out.println("Your grade is: "+grade);
		sc.close();

	}
	
	static String Grade(int marks)
	{
		String grade="";
		if(marks>90 && marks<=100)
			grade="AA";
		else if(marks>80 && marks<90)
			grade="AB";
		else if(marks>70 && marks<80)
			grade="BB";
		else if(marks>60 && marks<70)
			grade="BC";
		else if(marks>50 && marks<60)
			grade="CD";		
		else if(marks>40 && marks<50)
			grade="AB";
		else if(marks<=40)
			grade="Fail";	
		else
			grade=("Enter marks between 0-100");
		
		return grade;
	}

}
