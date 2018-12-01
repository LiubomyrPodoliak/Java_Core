package hw1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] month = { 31, 30, 28 };

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of month which you want to see");
		int monthNumber = scanner.nextInt();

		switch (monthNumber) {
		case 1: {
			System.out.println(Month.JANUARY + " " + month[0]);
			break;
		}

		case 2: {
			System.out.println(Month.FEBRUARY + " " + month[2]);
			break;
		}
		case 3: {
			System.out.println(Month.MARCH + " " + month[0]);
			break;
		}
		case 4: {
			System.out.println(Month.APRIL + " " + month[1]);
			break;
		}
		case 5: {
			System.out.println(Month.MAY + " " + month[0]);
			break;
		}
		case 6: {
			System.out.println(Month.JUNE + " " + month[1]);
			break;
		}
		case 7: {
			System.out.println(Month.JULY + " " + month[0]);
			break;
		}
		case 8: {
			System.out.println(Month.AUGUST + " " + month[0]);
			break;
		}
		case 9: {
			System.out.println(Month.SEPTEMBER + " " + month[1]);
			break;
		}
		case 10: {
			System.out.println(Month.OCTOBER + " " + month[0]);
			break;
		}
		case 11: {
			System.out.println(Month.NOVEMBER + " " + month[1]);
			break;
		}
		case 12: {
			System.out.println(Month.DECEMBER + " " + month[0]);
			break;
		}

		default:
			System.out.println("Year has 12 months");
			break;
		}

	}

}
