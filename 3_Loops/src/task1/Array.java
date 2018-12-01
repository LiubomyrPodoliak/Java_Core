package task1;

public class Array {

	public void maxNumber(int numbers[]) {

		int maxDigit = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > maxDigit) {
				maxDigit = numbers[i];
			}
		}
		System.out.println("Max number = " + maxDigit);
	}

	public void sumNumbers(int numbers[]) {

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("Sum positive numbers = " + sum);

	}

	public void amountOfNegative(int numbers[]) {
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				count++;
			}
		}
		System.out.println("Amount of negative numbers = " + count);
	}
	
	public void moreAmount(int numbers[]) {
		int countPlus = 0;
		int countMinus = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				++countMinus;
			} else if (numbers[i] > 0) {
				++countPlus;
			}
		}

		if (countPlus > countMinus) {
			System.out.println("Amount of positive number is more than negative");
		} else {
			System.out.println("Amount of negative number is more than positive");
		}
	}
	

}
