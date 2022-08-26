package br.unicap.p2.atividade03.part1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion01 {

	@Test
	public void testInterestZeroInterestRatesZeroPeriods() {
		double initialAmount = 10000;
		int numPeriods = 0;
		double[] interestRates = {};
		double[][] actual = CompoundInterest.calculate(initialAmount, numPeriods, interestRates);
		double[][] expected = { {} };
		for (int i = 0; i < expected.length; i++) {
			Assertions.assertArrayEquals(expected[i], actual[i], 0.0001);
		}
	}

	@Test
	public void testInterestThreeInterestRatesZeroPeriods() {
		double initialAmount = 10000;
		int numPeriods = 0;
		double[] interestRates = { .1, .11, .12 };
		double[][] actual = CompoundInterest.calculate(initialAmount, numPeriods, interestRates);
		double[][] expected = { { 10000, 10000, 10000 } };
		for (int i = 0; i < expected.length; i++) {
			Assertions.assertArrayEquals(expected[i], actual[i], 0.0001);
		}
	}

	@Test
	public void testInterestOneInterestRateOnePeriod() {
		double initialAmount = 10000;
		int numPeriods = 1;
		double[] interestRates = { .10 };
		double[][] actual = CompoundInterest.calculate(initialAmount, numPeriods, interestRates);
		double[][] expected = { { 10000 }, { 11000 } };
		for (int i = 0; i < expected.length; i++) {
			Assertions.assertArrayEquals(expected[i], actual[i], 0.0001);
		}
	}

	@Test
	public void testInterestOneInterestRateTwoPeriod() {
		double initialAmount = 10000;
		int numPeriods = 2;
		double[] interestRates = { .10 };
		double[][] actual = CompoundInterest.calculate(initialAmount, numPeriods, interestRates);
		double[][] expected = { { 10000 }, { 11000 }, { 12100 } };
		for (int i = 0; i < expected.length; i++) {
			Assertions.assertArrayEquals(expected[i], actual[i], 0.0001);
		}
	}
}
