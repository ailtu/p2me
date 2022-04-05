package br.unicap.p2.atividade03.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion11 {

	@Test
	public void testMatrixInverseIdentity2by2() {
		double[][] A = { { 1, 0 }, { 0, 1 } };
		double[][] expected = A;
		double[][] actual = LinAlg.matrixInverse(A);
		for (int i = 0; i < expected.length; i++) {
			Assertions.assertArrayEquals(expected[i], actual[i], 0.0001);
		}
	}

	@Test
	public void testMatrixInverse1by1() {
		double[][] A = { { 1, 0 }, { 0, 1 } };
		double[][] expected = A;
		double[][] actual = LinAlg.matrixInverse(A);
		for (int i = 0; i < expected.length; i++) {
			Assertions.assertArrayEquals(expected[i], actual[i], 0.0001);
		}
	}

	@Test
	public void testSingularMatrix2by2() {
		double[][] A = { { -1, (double) 3 / 2 }, { (double) 2 / 3, -1 } };
		try {
			double[][] actual = LinAlg.matrixInverse(A);
			Assertions.fail("Matrix is singular but returned " + actual);
		} catch (Exception e) {
		}
	}

	@Test
	/***
	 * The adjugate is the determinant times the inverse
	 */
	public void testMatrixInverse3by3() {
		double[][] A = { { -3, 2, 5 }, { -1, 0, -2 }, { 3, -4, 1 } };
		double det = LinAlg.matrixDeterminant(A);
		double[][] inverse = LinAlg.matrixInverse(A);
		double[][] expected = LinAlg.matrixMultiplication(det, inverse);
		double[][] actual = LinAlg.matrixAdjugate(A);
		Assertions.assertEquals(expected.length, A.length);
		for (int i = 0; i < expected.length; i++) {
			Assertions.assertArrayEquals(expected[i], actual[i], 0.0001);
		}
	}
}
