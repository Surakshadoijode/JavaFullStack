package day2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c1=new Calculator();
		assertEquals(5, c1.add(2, 3));
	}

	@Test
	public void testSub() {
		Calculator c1=new Calculator();
		assertEquals(-1, c1.sub(2, 3));
	}

}
