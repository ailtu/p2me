package br.unicap.p2.atividade03.part3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion01 {

	@Test
	public void testApartmentCostSquared() {

		double[][] expected = { { 12500.0 }, { 7500.0 }, { 250.0 } };

		double[][] actual = DataScience.question01();
		int size = expected.length;
		for (int i = 0; i < size; i++) {
			Assertions.assertArrayEquals(expected[i], actual[i], 0.001);
		}
	}
}
