package hw1;

public class Chicken extends NonFlyingBird {

	public Chicken(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Chicken " + super.toString();
	}

}
