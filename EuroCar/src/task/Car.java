package task;

import java.util.Calendar;

public class Car {

	private String brand;
	private String model;
	private int price;
	private double engineVolume;
	private int birthYear;
	private TypeEngine typeEngine;

	public Car() {

	}

	public Car(String brand, String model, int price, double engineVolume, int birthYear, TypeEngine typeEngine) {

		this.brand = brand;
		this.model = model;
		this.price = price;
		this.engineVolume = engineVolume;
		this.birthYear = birthYear;
		this.typeEngine = typeEngine;
	}

	public Car(int birthYear) {

		this.birthYear = birthYear;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public TypeEngine getTypeEngine() {
		return typeEngine;
	}

	public void setTypeEngine(TypeEngine typeEngine) {
		this.typeEngine = typeEngine;
	}

	public void inputCar() {
		System.out.println("Enter car brand");
		brand = Main.scanner.next();

		System.out.println("Enter car model");
		model = Main.scanner.next();

		System.out.println("Enter car price");
		price = Main.scanner.nextInt();

		System.out.println("Enter engine volume");
		engineVolume = Main.scanner.nextDouble();

		System.out.println("Enter car birth year");
		birthYear = Main.scanner.nextInt();

		System.out.println("Enter 1 for choose DIESEL type of engine or 2 for choose  Petrol type of engine");
		int n = Main.scanner.nextInt();

		if (n == 1) {
			typeEngine = TypeEngine.DIESEL;

		} else if (n == 2) {
			typeEngine = TypeEngine.PETROL;
		} else {
			System.out.println("Please choose only one or two");
		}

	}

	public int getAge() {

		int age = 0;

		int currentYear = Calendar.getInstance().get(Calendar.YEAR);

		age = currentYear - birthYear;
		return age;

	}

	public int getCoefficientAge() {

		int coefficientAge = getAge();

		if (coefficientAge >= 15) {
			coefficientAge = 15;
		}

		return coefficientAge;
	}

	public int getBaseRate() {
		int baseRate = 0;

		if (typeEngine == TypeEngine.DIESEL) {
			if (engineVolume < 3) {
				baseRate = 75;
			} else {
				baseRate = 150;
			}

		} else if (typeEngine == TypeEngine.PETROL) {
			if (engineVolume < 3) {
				baseRate = 50;
			} else {
				baseRate = 100;
			}
		}

		return baseRate;

	}

	public double calculateRate() {

		double rate = getBaseRate() * engineVolume * getCoefficientAge();

		return rate;

	}

	public double calculatetax() {

		double tax = (price + calculateRate()) * 0.1;

		return tax;

	}

	public double calculateVAT() {

		double vat = (price + calculateRate() + calculatetax()) * 0.2;

		return vat;

	}

	public double getTotalMoneyFees() {

		double totalMoneyFees = calculateRate() + calculatetax() + calculateVAT();

		return totalMoneyFees;
	}

	public double getTotalMoney() {

		double sum = price + calculateRate() + calculatetax() + calculateVAT();

		return sum;
	}

	@Override
	public String toString() {
		return " Car [brand=" + brand + ", model=" + model + ", price=" + price + ", engineVolume=" + engineVolume
				+ ", year=" + birthYear + ", type=" + birthYear + "]" + "\n Car rate=" + calculateRate()
				+ "\n Total Money of all fees=" + getTotalMoneyFees() + "\n You will pay fot the car ="
				+ getTotalMoney();
	}

}
