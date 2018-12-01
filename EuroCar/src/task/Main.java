package task;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Car car = new Car();
		car.inputCar();
		System.err.println(car);

	}

}
