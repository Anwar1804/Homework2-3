package Task1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,i,temp=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=sc.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
			temp=temp+1;
			}
		}
		
		if(temp>0)
		{
			System.out.println("is not a prime");
		}
		else
		{
			System.out.println("A prime");
		}
	}

}
