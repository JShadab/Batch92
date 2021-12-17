package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import p1.Calculator;

public class CalculatorTest {

	@Test
	public void testSum() {

		Calculator calculator = new Calculator();
		int result = calculator.sum(5, 10);

		assertEquals(15, result);
	}

	@Test
	public void testDivisionForAll() {

		Calculator calculator = new Calculator();
		int result = calculator.division(10, 5);

		assertEquals(2, result);
	}

	@Test
	public void testDivisionForZero() {

//		ArithmeticException exception = assertThrows(ArithmeticException.class, new Executable() {
//
//			@Override
//			public void execute() throws Throwable {
//
//				Calculator calculator = new Calculator();
//				calculator.division(10, 0);
//
//			}
//		});

		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {

			Calculator calculator = new Calculator();
			calculator.division(10, 0);

		});

		assertEquals("/ by zero", exception.getMessage());
	}

}
