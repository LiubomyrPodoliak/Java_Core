package practice;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EmployeeTest {

	private int rate;
	private int hours;

	private int expected;
	private Employee employee;

	public EmployeeTest(int rate, int hours, int expected) {
		super();
		this.rate = rate;
		this.hours = hours;
		this.expected = expected;
	}

	@Before
	public void initialize() {
		employee = new Employee(rate, hours);

	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] { { 100, 2, 200 }, { 500, 1, 500 }, { 600, 2, 1200 }

		});
	}

	@Test
	public void testSalary() {
		System.out.println("rate = " + rate + " hours= " + hours + " expectet salary " + expected);

		assertEquals(expected, employee.salary());
	}

//	@Test
//	public void testSalary() {
//		// arrange
//		Employee employee = new Employee("Ola", 50);
//		// actual
//		int actual = employee.salary();
//		// assert
//		assertEquals(0, actual);
//
//	}
//
//	@Test
//	public void testChangeRate() {
//		Employee employee = new Employee("Ola", 150);
//		assertEquals(50, employee.changeRate(50));
//	}
//
//	@Test
//	public void testBonuses() {
//		Employee employee = new Employee("Ola", 50, 2);
//		assertEquals(10, employee.bonuses());
//	}

}
