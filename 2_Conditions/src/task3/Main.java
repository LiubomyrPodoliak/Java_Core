package task3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter country");
		String country = scanner.next();

		switch (country) {
		case "Nigeria": {
			System.out.println(Ñontinent.AFRICA);
			break;
		}
		case "McMurdo_Station": {
			System.out.println(Ñontinent.ANTARCTICA);
			break;
		}
		case "China": {
			System.out.println(Ñontinent.ASIA);
			break;
		}
		case "Ukraine": {
			System.out.println(Ñontinent.EUROPA);
			break;
		}
		case "USA": {
			System.out.println(Ñontinent.NORTH_AMERICA);
			break;
		}
		case "Australia": {
			System.out.println(Ñontinent.AUSTRALIA);
			break;
		}
		case "Brazil": {
			System.out.println(Ñontinent.SOUTH_AMERICA);
			break;
		}

		default: {
			System.out.println("Contry does not exist");
			break;
		}

		}

	}

}
