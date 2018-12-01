package pt2;

public class Teacher extends Staff {

	public Teacher(String name) {
		super(name);
	}

	static String TYPE_PERSON = "Teacher";

	@Override
	public void print() {
		System.out.println("I am " + TYPE_PERSON);

	}

	@Override
	public void salary() {
		System.out.println("salary 3000");
	}

}
