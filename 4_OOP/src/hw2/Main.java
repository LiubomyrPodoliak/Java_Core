package hw2;

public class Main {

	public static void main(String[] args) {

		Employee[] employees = new Employee[4];

		employees[0] = new SalariedEmployee("John", 1, 2000);
		employees[1] = new ContractEmployee("Oleg", 500, 2, 2);
		employees[2] = new SalariedEmployee("Ihor", 1, 1000);
		employees[3] = new ContractEmployee("Vova", 300, 4, 1);
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}

		Employee.sortEmployees(employees);
	}

}
