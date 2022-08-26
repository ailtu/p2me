package br.unicap.p2.atividade03.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestQuestion05 {

	@Test
	public void testNotSquared() {
		double[][] A = { { 1, 0, 0 }, { 0, 1, 0 } };
		try {
			double actual = LinAlg.matrixDeterminant(A);
			Assertions.fail("Matrix not squared but returned " + actual);
		} catch (Exception e) {

		}
	}

	@Test
	public void testIdentity() {
		double[][] A = { { 1, 0 }, { 0, 1 } };
		double expected = 1;
		double actual = LinAlg.matrixDeterminant(A);
		Assertions.assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testNonZero2by2() {
		double[][] A = { { -1, (double) 3 / 2 }, { (double) 1, -1 } };

		double expected = (double) -1 / 2;
		double actual = LinAlg.matrixDeterminant(A);
		Assertions.assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testZero2by2() {
		double[][] A = { { -1, (double) 3 / 2 }, { (double) 2 / 3, -1 } };

		double expected = 0;
		double actual = LinAlg.matrixDeterminant(A);
		Assertions.assertEquals(expected, actual, 0.0001);
	}

	
}
