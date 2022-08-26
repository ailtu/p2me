package br.unicap.p2.atividade03.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestQuestion07 {

	@Test
	public void test3by3() {
		double[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		double expected = 0;
		double actual = LinAlg.matrixDeterminant(A);
		Assertions.assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void test4by4() {
		double[][] A = { { 4, 5, -3, 0 }, { 2, -1, 3, 1 }, { 1, -3, 2, 1 }, { 0, 2, -2, 5 } };
		double expected = 210;
		double actual = LinAlg.matrixDeterminant(A);
		Assertions.assertEquals(expected, actual, 0.0001);
	}
}
