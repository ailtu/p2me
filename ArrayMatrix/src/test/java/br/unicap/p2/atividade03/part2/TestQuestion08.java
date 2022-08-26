package br.unicap.p2.atividade03.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion08 {
	@Test
	public void testMatrixCoFactor3by3() {
		double[][] A = { { -3, 2, 5 }, { -1, 0, -2 }, { 3, -4, 1 } };
		double[][] expected = { { -8, -5, 4 }, { -22, -18, -6 }, { -4, -11, 2 } };
		double[][] actual = LinAlg.matrixCoFactor(A);
		for (int i = 0; i < expected.length; i++) {
			Assertions.assertArrayEquals(expected[i], actual[i], 0.001);
		}
	}
}