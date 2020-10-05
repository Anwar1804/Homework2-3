package Task1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%100==0 || year%4==0 || year%400==0)
		{
			System.out.println("Is a leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}

	}

}
