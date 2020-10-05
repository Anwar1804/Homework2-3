package Task1;

import java.util.Scanner;

public class OddEven
{ 
	public static void main(String[] args) {
		int num=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is a even number");
		}
		else
		{
			System.out.println(num+" is Odd Number ");
		}
	}

}
