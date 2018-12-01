package pt2;

import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Map<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(1, new Employee("Vova"));
        employeeMap.put(2, new Employee("Mary"));
        employeeMap.put(3, new Employee("Gosha"));
        employeeMap.put(4, new Employee("John"));
        employeeMap.put(5, new Employee("Bob"));
        employeeMap.put(6, new Employee("Alisa"));
        employeeMap.put(7, new Employee("Max"));

        Set<Map.Entry<Integer, Employee>> set = employeeMap.entrySet();

        // show all
        System.out.println("All Employee");
        for (Map.Entry<Integer, Employee> i : set) {
            System.out.println(i);
        }

        // find by id
        System.out.println("enter id you want to see name");
        int id = Main.scanner.nextInt();


        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        } else {
            System.out.println("You can not find this id");
        }


        //find by name
        System.out.println("Enter name");
        String inputName = scanner.next();

        for (Map.Entry<Integer, Employee> i : set) {

            if (i.getValue().getName().equals(inputName)) {
                Integer findInteger = i.getKey();
                System.out.println(findInteger);
            }

        }


    }
}
