package hw1;

public class NonFlyingBird extends Bird {

	public NonFlyingBird(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);

	}

	@Override
	void fly() {
		System.out.println("This bird does not fly");

	}

}
