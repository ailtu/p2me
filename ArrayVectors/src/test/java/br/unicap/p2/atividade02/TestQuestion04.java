package br.unicap.p2.atividade02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion04 {

	@Test
	public void test07IsPalindromeTrue() {
		int[] a = { 1, 5, 5, 1 };
		boolean result = Utils.isPalindrome(a);
		Assertions.assertTrue(result);
	}

	@Test
	public void test08IsPalindromeFalse() {
		int[] a = { 1, 5, 4, 1 };
		boolean result = Utils.isPalindrome(a);
		Assertions.assertTrue(!result);
	}

	@Test
	public void test09IsPalindromeUnit() {

		int[] a = { 1 };
		boolean result = Utils.isPalindrome(a);
		Assertions.assertTrue(result);
	}

}
