package br.unicap.p2.atividade02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion01 {

  @Test
	public void test01BuildVectorRepeat() {
		int n = 3;
		int i = 1;
		int[] actual = Utils.buildVectorRepeat(n, i);
		int[] expected = { 1, 1, 1 };
		Assertions.assertArrayEquals(expected, actual);
	}

	@Test
	public void test02BuildVectorRepeatZeroElements() {
		int n = 0;
		int i = 1;
		int[] actual = Utils.buildVectorRepeat(n, i);
		int[] expected = {};
		Assertions.assertArrayEquals(expected, actual);
	}
}
