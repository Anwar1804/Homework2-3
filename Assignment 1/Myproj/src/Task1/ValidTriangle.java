package Task1;

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr angles: ");
		int ang1=sc.nextInt();
		int ang2=sc.nextInt();
		int ang3=sc.nextInt();
		int total=ang1+ang2+ang3;
		if(total==180)
		{
			System.out.println("Is a valid Triangle");
		}
		else
			System.out.println("Invalid Triangle");
 }

}
