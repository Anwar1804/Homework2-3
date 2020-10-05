package Task1;

import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args)
	{
		int sum=0,i,num=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter natural number: ");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of Natural Number is :"+sum);
	}

}
