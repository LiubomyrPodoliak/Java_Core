package pt1;

public class Main {

	public static void main(String[] args) {

		Animal[] animal = { new Cat("Vuntik"), new Dog("Doc"), new Dog("Rich"), new Cat("Pig") };

		for (int i = 0; i < animal.length; i++) {

			animal[i].voice();
			animal[i].feed();
		}

	}

}
