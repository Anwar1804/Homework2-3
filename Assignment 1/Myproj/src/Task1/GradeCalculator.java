package Task1;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=3;
		int marks[]=new int[n];
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		int total=0;
		for(int i=0;i<n;i++)
		{
			total=marks[i]+total;
		}
		int average=total/n;
		
		if(90<=average && average<=100) {
			System.out.println("A");
		}
		else if(80<=average && average<=89)
		{
		System.out.println("B");
		}
		else if(70<=average && average<=79)
		{
		System.out.println("C");
		}
		else if(60<=average && average<=69)
		{
		System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
	}
}
