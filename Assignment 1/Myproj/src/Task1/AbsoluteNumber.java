package Task1;

import java.util.Scanner;

public class AbsoluteNumber {

	public static void main(String[] args) {
		int num=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=sc.nextInt();
		if(num<0) {
		System.out.println("Absolute number: "+num*-1);
		}
		else
		{
			System.out.println("Absolute number: "+num);
		}
	}

}
