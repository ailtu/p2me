package br.unicap.p2.atividade03.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion09 {

	@Test
	public void test02MatrixAdjugateOne1by1() {
		double[][] A = { { 2 } };
		double[][] expected = { { 1 } };
		double[][] actual = LinAlg.matrixAdjugate(A);
		for (int i = 0; i < expected.length; i++) {
			Assertions.assertArrayEquals(expected[i], actual[i], 0.0001);
		}
	}

	@Test
	public void test03MatrixAdjugate2by2() {
		double[][] A = { { 1, 2 }, { 3, 4 } };
		double[][] expected = { { 4, -2 }, { -3, 1 } };
		double[][] actual = LinAlg.matrixAdjugate(A);
		for (int i = 0; i < expected.length; i++) {
			Assertions.assertArrayEquals(expected[i], actual[i], 0.0001);
		}
	}

	@Test
	public void test04MatrixAdjugate3by3() {
		double[][] A = { { -3, 2, 5 }, { -1, 0, -2 }, { 3, -4, 1 } };
		double[][] expected = { { -8, -22, -4 }, { -5, -18, -11 }, { 4, -6, 2 } };
		double[][] actual = LinAlg.matrixAdjugate(A);
		for (int i = 0; i < expected.length; i++) {
			Assertions.assertArrayEquals(expected[i], actual[i], 0.0001);
		}
	}
}
