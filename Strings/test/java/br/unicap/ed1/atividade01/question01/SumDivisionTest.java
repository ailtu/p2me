package br.unicap.ed1.atividade01.question01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumDivisionTest {
	
	@Test
	public void sumZeroWithZero() {
		double actual = SumDivision.sum(0, 0);
		double expected = 0;
		Assertions.assertEquals(expected, actual, 0.001);
	}

	@Test
	public void sumAnyWithZero() {
		double n = 15;
		double actual = SumDivision.sum(n, 0);
		double expected = n;
		Assertions.assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void sumTwoNonZeroNumbers() {
		double x1 = 10;
		double x2 = 20;
		double actual = SumDivision.sum(x1, x2);
		double expected = 30;
		Assertions.assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void divideTwoNonZeroNumbers() {
		double x1 = 10;
		double x2 = 20;
		double actual = SumDivision.divide(x1, x2);
		double expected = 0.5;
		Assertions.assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void divideZeroByZero() {
		double x1 = 0;
		double x2 = 0;
		double actual = SumDivision.divide(x1, x2);
		double expected = 0;
		Assertions.assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void divideAnyNumberByZero() {
		double x1 = 10;
		double x2 = 0;
		double actual = SumDivision.divide(x1, x2);
		double expected = 0;
		Assertions.assertEquals(expected, actual, 0.001);
	}
}
