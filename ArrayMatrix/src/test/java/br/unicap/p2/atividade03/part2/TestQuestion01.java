package br.unicap.p2.atividade03.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion01 {

	@Test
	public void testElementIdentity2by2() {
		double a = 2;
		double[][] A = { { 1, 0 }, { 0, 1 } };
		double[][] expected = { { 2, 0 }, { 0, 2 } };
		double[][] actual = LinAlg.matrixMultiplication(a, A);
		Assertions.assertArrayEquals(expected, actual);
	}
}
