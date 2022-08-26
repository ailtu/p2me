package br.unicap.p2.atividade03.part3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion02 {

	@Test
	public void testApartmentCostNotSquared() {

		double[][] expected = { { 50000 }, { 25000 }, { 10 }, { 100000 } };

		double[][] actual = DataScience.question02();
		int size = expected.length;
		for (int i = 0; i < size; i++) {
			Assertions.assertArrayEquals(expected[i], actual[i], 0.001);
		}
	}
}
