package pt2;

public class Main {

	public static void main(String[] args) {

		Person[] person = { new Student("Vova"), new Teacher("Olya"), new Cleaner("Andriy") };

		for (int i = 0; i < person.length; i++) {
			System.out.println(person[i].getName());
			person[i].print();

			if (person[i] instanceof Staff) {

				Staff staff = (Staff) person[i];
				staff.salary();
			}

		}

	}

}
