package hw3;

public class Array {

	public void secondPositive(int numbers[]) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				count++;
				if (count == 2) {
					System.out.println(i);

				}
			}

		}

	}

	public void minimum(int numbers[]) {
		int min = numbers[0];
		int imin = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
				imin = i;
			}

		}
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (imin + 1) + " place");
	}

}
