package hw2;

public class Main {

	public static void main(String[] args) {

		Dog dog1 = new Dog("Doc", BREED.BULLDOG, 4);
		Dog dog2 = new Dog("Doc", BREED.DOBERMAN, 7);
		Dog dog3 = new Dog("Rich", BREED.SPANIEL, 3);

		
		Dog dog = new Dog();
		// verify if is not presented two dogs with same name
		dog.dogEquals(dog1, dog2, dog3);
	
		// oldest dog
		dog.ageOfOldest(dog1, dog2, dog3);

	}

}
