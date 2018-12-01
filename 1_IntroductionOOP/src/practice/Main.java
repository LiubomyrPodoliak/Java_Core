package practice;

public class Main {

	public static void main(String[] args) {

		Employee employee1 = new Employee("John", 300, 2);
		employee1.salary();
		employee1.changeRate(500);

		System.out.println(employee1);

		Employee employee2 = new Employee("Oleg", 200, 2);
		employee2.salary();
		System.out.println(employee2);

		Employee employee3 = new Employee("Mary", 500, 2);
		employee3.salary();
		System.out.println(employee3);

		System.out.println("Total sum= " + Employee.totalSum);

	}

}
