package br.unicap.p2.atividade03.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion03 {

	@Test
	public void testColumnADifferentLinesB() {
		double[][] A = { { 1 }, { 1 } };
		double[][] B = { { 1, 0 }, { 0, 1 } };

		try {
			double[][] actual = LinAlg.matrixMultiplication(A, B);
			Assertions.fail("Número de colunas de A diferente do numéro de linhas de B mas retornou " + actual);
		} catch (Exception e) {

		}
	}

	@Test
	public void testMatrixIdentity2by2() {
		double[][] A = { { 1, 0 }, { 0, 1 } };
		double[][] B = { { 1, 0 }, { 0, 1 } };
		double[][] expected = { { 1, 0 }, { 0, 1 } };
		double[][] actual = LinAlg.matrixMultiplication(A, B);
		Assertions.assertArrayEquals(expected, actual);
	}

	@Test
	public void testMatrixIdentity3by3() {
		double[][] A = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		double[][] B = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		double[][] expected = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		double[][] actual = LinAlg.matrixMultiplication(A, B);
		Assertions.assertArrayEquals(expected, actual);
	}
}