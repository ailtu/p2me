package br.unicap.p2.atividade02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion03 {

	@Test
	public void test05DotProduct() {
		int[] a = Utils.buildVectorRepeat(3, 1);
		int[] b = Utils.buildVectorSequence(3, 3);
		try {
			int actual = Utils.dotProduct(a, b);
			int expected = 12;
			Assertions.assertEquals(expected, actual, 0.001);
		} catch (Exception e) {
			Assertions.fail(e.getMessage());
		}
	}

	@Test
	public void test06DotProductDifferentSizes() {
		int sizeA = 3;
		int sizeB = 4;

		int[] a = Utils.buildVectorRepeat(sizeA, 1);
		int[] b = Utils.buildVectorSequence(sizeB, 1);

		try {
			int result = Utils.dotProduct(a, b);
			Assertions.fail("Vectors with different sizes but returned " + result);
		} catch (Exception e) {

		}
	}
}
