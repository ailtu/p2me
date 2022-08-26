package br.unicap.p2.atividade05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestSelectionSort extends TestBaseSort {

	@Override
	public BaseSort getSortingAlgorithm() {
		return new SelectionSort();
	}

	@Override
	public int[][] getValuesAscending() {
		int[][] values = {
				{ 50, 70, 10, 30, 100, 20, 60, 40, 80, 90 },
				{ 10, 70, 50, 30, 100, 20, 60, 40, 80, 90 },
				{ 10, 20, 50, 30, 100, 70, 60, 40, 80, 90 },
				{ 10, 20, 30, 50, 100, 70, 60, 40, 80, 90 },
				{ 10, 20, 30, 40, 100, 70, 60, 50, 80, 90 },
				{ 10, 20, 30, 40, 50, 70, 60, 100, 80, 90 },
				{ 10, 20, 30, 40, 50, 60, 70, 100, 80, 90 },
				{ 10, 20, 30, 40, 50, 60, 70, 100, 80, 90 },
				{ 10, 20, 30, 40, 50, 60, 70, 80, 100, 90 },
				{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 },
				{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 },
		};
		return values;
	}

	@Override
	public int[][] getValuesDescending() {
		int[][] values = {
				{ 50, 70, 10, 30, 100, 20, 60, 40, 80, 90 },
				{ 100, 70, 10, 30, 50, 20, 60, 40, 80, 90 },
				{ 100, 90, 10, 30, 50, 20, 60, 40, 80, 70 },
				{ 100, 90, 80, 30, 50, 20, 60, 40, 10, 70 },
				{ 100, 90, 80, 70, 50, 20, 60, 40, 10, 30 },
				{ 100, 90, 80, 70, 60, 20, 50, 40, 10, 30 },
				{ 100, 90, 80, 70, 60, 50, 20, 40, 10, 30 },
				{ 100, 90, 80, 70, 60, 50, 40, 20, 10, 30 },
				{ 100, 90, 80, 70, 60, 50, 40, 30, 10, 20 },
				{ 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 },
				{ 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 },
		};
		return values;
	}

	@Override
	@ParameterizedTest
	@ValueSource(ints = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 })
	public void testSortAscendingIteration(int maxIterations) {
		super.testSortAscendingIteration(maxIterations);
	}

	@Override
	@ParameterizedTest
	@ValueSource(ints = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 })
	public void testSortDescendingIteration(int maxIterations) {
		super.testSortDescendingIteration(maxIterations);
	}
}