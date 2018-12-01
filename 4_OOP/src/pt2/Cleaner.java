package pt2;

public class Cleaner extends Staff {

	public Cleaner(String name) {
		super(name);

	}

	static String TYPE_PERSON = "Cleaner";

	@Override
	public void salary() {
		System.out.println("salary 200");

	}

	@Override
	public void print() {
		System.out.println("I am " + TYPE_PERSON);

	}

}
