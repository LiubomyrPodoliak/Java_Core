package pt2;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}

	static String TYPE_PERSON = "Student";

	@Override
	public void print() {
		System.out.println("I am " + TYPE_PERSON);
	}

}
