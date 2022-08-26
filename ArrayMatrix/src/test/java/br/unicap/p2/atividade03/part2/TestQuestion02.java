package br.unicap.p2.atividade03.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion02 {

	@Test
	public void testTransposeIdentity() {
		double[][] a = { { 1, 0 }, { 0, 1 } };

		double[][] expected = { { 1, 0 }, { 0, 1 } };
		double[][] actual = LinAlg.matrixTranspose(a);
		Assertions.assertArrayEquals(expected, actual);
	}

	@Test
	public void testTranspose3by3() {
		double[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		double[][] expected = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
		double[][] actual = LinAlg.matrixTranspose(a);

		Assertions.assertArrayEquals(expected, actual);
	}
}
