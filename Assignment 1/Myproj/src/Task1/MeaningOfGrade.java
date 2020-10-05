package Task1;

import java.util.Scanner;

public class MeaningOfGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a grade: ");
		char c=sc.next().charAt(0);
		switch(c) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Deficient");
			break;
		case 'F':
			System.out.println("Failing");
			break;
			default:
				System.out.println("Enter valid input");
		}

	}

}
