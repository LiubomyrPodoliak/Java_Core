package task1;

public class Main {

	public static void main(String[] args) {

		int[] numbers = { 1, -2, -5, -6, 10, 50, 7, -8, -9, -6 };

		Array array = new Array();

		// MaxNumber
		array.maxNumber(numbers);

		// Sum numbers

		array.sumNumbers(numbers);
		// Amount of negative

		array.amountOfNegative(numbers);

		// What numbers are more negative of positive

		array.moreAmount(numbers);
	}

}
