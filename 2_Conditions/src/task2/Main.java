package task2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day of week");
		int dayOfWeek = scanner.nextInt();

		switch (dayOfWeek) {
		case 1: {
			System.out.println("��������");
			System.out.println("Mondey");
			System.out.println("Le lundi");
			break;
		}
		case 2: {
			System.out.println("³������");
			System.out.println("Tuesday");
			System.out.println("Mardi");
			break;
		}
		case 3: {
			System.out.println("������");
			System.out.println("Wednesday");
			System.out.println("Le mercredi");
			break;
		}
		case 4: {
			System.out.println("������");
			System.out.println("Thursday");
			System.out.println("Jeudi");
			break;
		}
		case 5: {
			System.out.println("�'������");
			System.out.println("Friday");
			System.out.println("Vendredi");
			break;
		}
		case 6: {
			System.out.println("������");
			System.out.println("Saturday");
			System.out.println("Samedi");
			break;
		}
		case 7: {
			System.out.println("�����");
			System.out.println("Sunday");
			System.out.println("Le dimanche");
			break;
		}

		default: {
			System.out.println("Week has 7 day");
			break;
		}

		}
	}

}
