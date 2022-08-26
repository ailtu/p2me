package br.unicap.p2.atividade03.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion04 {
	@Test
	public void testIdentity2by2() {
		double[][] A = { { 1, 0 }, { 0, 1 } };
		double[][] expected = { { 1 } };
		double[][] actual = LinAlg.subMatrix(A, 1, 1);
		Assertions.assertArrayEquals(expected, actual);
	}

	@Test
	public void test3by3() {
		double[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		double[][] expected = { { 1, 2 }, { 7, 8 } };
		double[][] actual = LinAlg.subMatrix(A, 1, 2);
		Assertions.assertArrayEquals(expected, actual);
	}
}
