package pt1;

public class Dog implements Animal {

	private String dogName;

	public Dog(String dogName) {
		super();
		this.dogName = dogName;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	@Override
	public void voice() {
		System.out.println(dogName + " voice");

	}

	@Override
	public void feed() {
		System.out.println("feed " + dogName);

	}

}
