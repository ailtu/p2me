package br.unicap.p2.atividade05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public abstract class TestBaseSort {

	public abstract BaseSort getSortingAlgorithm();

	public abstract int[][] getValuesAscending();

	public abstract int[][] getValuesDescending();

	private void testSortIteration(int maxIterations, int[][] values, boolean ascending) {
		BaseSort sortAlgorithm = getSortingAlgorithm();
		sortAlgorithm.sort(values[0], ascending, maxIterations);
		Assertions.assertEquals(Arrays.toString(values[maxIterations]), Arrays.toString(values[0]));
	}

	public void testSortAscendingIteration(int maxIterations) {
		int[][] valuesAscending = getValuesAscending();
		testSortIteration(maxIterations, valuesAscending, true);
	}

	public void testSortDescendingIteration(int maxIterations) {
		int[][] valuesDescending = getValuesDescending();
		testSortIteration(maxIterations, valuesDescending, false);
	}

	@Test
	public void testSwap0And9(){
		BaseSort sortAlgorithm = getSortingAlgorithm();
		int[] values = { 50, 70, 10, 30, 100, 20, 60, 40, 80, 90 };
		int i = 0;
		int j = 9;
		sortAlgorithm.swap(values, i, j);
		int[] expected = { 90, 70, 10, 30, 100, 20, 60, 40, 80, 50 };
		assertEquals(Arrays.toString(expected), Arrays.toString(values));
	}

	@Test
	public void testSwap4And5(){
		BaseSort sortAlgorithm = getSortingAlgorithm();
		int[] values = { 50, 70, 10, 30, 100, 20, 60, 40, 80, 90 };
		int i = 4;
		int j = 5;
		sortAlgorithm.swap(values, i, j);
		int[] expected = { 50, 70, 10, 30, 20, 100, 60, 40, 80, 90 };
		assertEquals(Arrays.toString(expected), Arrays.toString(values));
	}

	@Test
	public void testSwap(){
		BaseSort sortAlgorithm = getSortingAlgorithm();
		int[] values = { 50, 70, 10, 30, 100, 20, 60, 40, 80, 90 };
		int i = 0;
		int j = 9;
		sortAlgorithm.swap(values, i, j);
		int[] expected = { 90, 70, 10, 30, 100, 20, 60, 40, 80, 50 };
		assertEquals(Arrays.toString(expected), Arrays.toString(values));
	}

	@Test
	public void testNeedsChangeAscendingTrueWhenValuesAscending(){
		BaseSort sortAlgorithm = getSortingAlgorithm();
		boolean ascending = true;
		int[] values = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int i = 5;
		int j = 4;
		boolean actual = sortAlgorithm.needsChange(ascending, values[i], values[j]);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void testNeedsChangeAscendingTrueWhenValuesDescending(){
		BaseSort sortAlgorithm = getSortingAlgorithm();
		boolean ascending = true;
		int[] values = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
		int i = 5;
		int j = 4;
		boolean actual = sortAlgorithm.needsChange(ascending, values[i], values[j]);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void testNeedsChangeAscendingFalseWhenValuesAscending(){
		BaseSort sortAlgorithm = getSortingAlgorithm();
		boolean ascending = false;
		int[] values = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int i = 5;
		int j = 4;
		boolean actual = sortAlgorithm.needsChange(ascending, values[i], values[j]);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void testNeedsChangeAscendingFalseWhenValuesDescending(){
		BaseSort sortAlgorithm = getSortingAlgorithm();
		boolean ascending = false;
		int[] values = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
		int i = 5;
		int j = 4;
		boolean actual = sortAlgorithm.needsChange(ascending, values[i], values[j]);
		boolean expected = false;
		assertEquals(expected, actual);
	}
}