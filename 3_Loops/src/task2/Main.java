package task2;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Employee[] employees = new Employee[5];

		employees[0] = new Employee("John", 1, 2000);
		employees[1] = new Employee("Oleg", 2, 3000);
		employees[2] = new Employee("Ihor", 1, 1000);
		employees[3] = new Employee("Vova", 2, 4000);
		employees[4] = new Employee("Olya", 1, 5000);

		EmployeeManage employeeManage = new EmployeeManage();
		employeeManage.employeesFromDepartment(employees);

		System.out.println();
		// descending order
		employeeManage.employeesOrder(employees);

	}

}
