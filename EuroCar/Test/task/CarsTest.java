package task;

import static org.testng.Assert.assertEquals;

import java.util.Calendar;

//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CarsTest {

	

// add
	@DataProvider(name = "test1")
	public static Object[][] getAgeTest1() {

		int currentYear = Calendar.getInstance().get(Calendar.YEAR);

		return new Object[][] { { 2010, currentYear - 2010 }, { 2011, 7 } };
	}

	@Test(dataProvider = "test1")
	public void getAgeTest1(int birhYear, int expectedResult) {

		Car car = new Car(birhYear);

		System.out.println("birthYear = " + birhYear + " expected age" + expectedResult);
		assertEquals(expectedResult, car.getAge());
	}

}
