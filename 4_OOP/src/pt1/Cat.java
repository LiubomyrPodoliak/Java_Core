package pt1;

public class Cat implements Animal {

	private String carName;

	public Cat(String carName) {
		this.carName = carName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public void voice() {
		System.out.println(carName + " voice");

	}

	@Override
	public void feed() {
		System.out.println("feed " + carName);

	}

}
