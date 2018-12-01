package hw;

import java.util.Calendar;
import java.util.Scanner;

public class Person {

	private String name;
	private int birthYear;

	public Person() {

	}

	public Person(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int age() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);

		return currentYear - birthYear;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter birth");
		birthYear = sc.nextInt();
	}

	public void output() {
		System.out.println("Person [name=" + name + ", birthYear=" + birthYear + "]" + " Person [age=" + age() + "]");
	}
	public String changeName(String newName) {
		
		name=newName;
		return name;
	}

}
