package Task1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fact=1;int num=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter num value: ");
 num=sc.nextInt();
 for(int i=1; i<=num; i++)
 {
	 fact=fact*i;
 }
 System.out.println("Factorial is "+fact);
	}

}
