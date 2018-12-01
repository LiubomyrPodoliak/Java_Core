package task1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter first digit");
		int d1 = scan.nextInt();

		System.out.println("enter second digit");
		int d2 = scan.nextInt();

		System.out.println("enter third digit");
		int d3 = scan.nextInt();

		int count = 0;

		if (d1 % 2 != 0) {
			++count;
		}

		if (d2 % 2 != 0) {
			++count;
		}

		if (d3 % 2 != 0) {
			++count;
		}

		System.out.println("Number of odd numbers " + count);

	}

}
