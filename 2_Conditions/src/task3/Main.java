package task3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter country");
		String country = scanner.next();

		switch (country) {
		case "Nigeria": {
			System.out.println(�ontinent.AFRICA);
			break;
		}
		case "McMurdo_Station": {
			System.out.println(�ontinent.ANTARCTICA);
			break;
		}
		case "China": {
			System.out.println(�ontinent.ASIA);
			break;
		}
		case "Ukraine": {
			System.out.println(�ontinent.EUROPA);
			break;
		}
		case "USA": {
			System.out.println(�ontinent.NORTH_AMERICA);
			break;
		}
		case "Australia": {
			System.out.println(�ontinent.AUSTRALIA);
			break;
		}
		case "Brazil": {
			System.out.println(�ontinent.SOUTH_AMERICA);
			break;
		}

		default: {
			System.out.println("Contry does not exist");
			break;
		}

		}

	}

}
