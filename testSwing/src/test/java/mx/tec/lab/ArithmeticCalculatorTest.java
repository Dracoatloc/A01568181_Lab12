package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticCalculatorTest {
	TestSwingApplication application = new TestSwingApplication();
	@Test
	void Given_5and7_When_Sum_Then_12() {
		//Given 5 and 7
		int a = 5;
		int b = 7;
		int expectedResult = 12;
		
		//When operation is Sum
		int actualResult = ArithmeticCalculator.sum(a, b);
		
		//Then result is 12
		assertEquals(expectedResult, actualResult);
	}
}
