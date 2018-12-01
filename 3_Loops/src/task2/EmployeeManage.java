package task2;

public class EmployeeManage {

	public void enterYearToSeeCar(Employee[] employees) {

		
	}

	public void employeesFromDepartment(Employee[] employees) {
		System.out.println("Enter department number(1 or 2)");
		
		int depNumber = Main.scanner.nextInt();

		if (depNumber == 1 || depNumber == 2) {
			for (int i = 0; i < employees.length; i++) {

				if (depNumber == 1 || depNumber == 2) {
					if ((employees[i].getDepartmentNumber() == depNumber)) {

						System.out.println(employees[i]);
					}
				}

			}
		} else {
			System.out.println("Please enter 1 or 2");
		}

	}
	
	public void employeesOrder(Employee[] employees) {
		Employee tmp;
		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].getSalary() < employees[j].getSalary()) {
					tmp = employees[i];

					employees[i] = employees[j];

					employees[j] = tmp;
				}
			}
		}
		System.out.println("Sorted employees in descending");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
	}
	

}
