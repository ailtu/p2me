package br.unicap.p2.atividade02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion02 {

	@Test
	public void test03BuildVectorSequence() {
		int n = 3;
		int i = 1;
		int[] actual = Utils.buildVectorSequence(n, i);
		int[] expected = { 1, 2, 3 };
		Assertions.assertArrayEquals(expected, actual);
	}

	@Test
	public void test04BuildVectorSequenceZeroElements() {
		int n = 0;
		int i = 1;
		int[] actual = Utils.buildVectorSequence(n, i);
		int[] expected = {};
		Assertions.assertArrayEquals(expected, actual);
	}

}
