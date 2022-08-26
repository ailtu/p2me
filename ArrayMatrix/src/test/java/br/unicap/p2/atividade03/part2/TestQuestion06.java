package br.unicap.p2.atividade03.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion06 {

	@Test
	public void testElementCoFactor3by3() {
		double[][] A = { { 2, 1, 2 }, { -3, 4, 1 }, { 3, 2, 5 } };
		double expected = -1;
		double actual = LinAlg.matrixCoFactor(A, 1, 2);
		Assertions.assertEquals(expected, actual, 0.001);
	}
}
