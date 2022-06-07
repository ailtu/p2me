package br.unicap.p2.atividade05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestInsertionSort extends TestBaseSort {

	@Override
	public BaseSort getSortingAlgorithm() {
		return new InsertionSort();
	}

	@Override
	public int[][] getValuesAscending() {
		int[][] valuesAscending = {
				// __
				{ 50, 70, 10, 30, 100, 20, 60, 40, 80, 90 },
				// __
				{ 50, 70, 10, 30, 100, 20, 60, 40, 80, 90 },
				// __
				{ 10, 50, 70, 30, 100, 20, 60, 40, 80, 90 },
				// __
				{ 10, 30, 50, 70, 100, 20, 60, 40, 80, 90 },
				// __
				{ 10, 30, 50, 70, 100, 20, 60, 40, 80, 90 },
				// __
				{ 10, 20, 30, 50, 70, 100, 60, 40, 80, 90 },
				// __
				{ 10, 20, 30, 50, 60, 70, 100, 40, 80, 90 },
				// __
				{ 10, 20, 30, 40, 50, 60, 70, 100, 80, 90 },
				// __
				{ 10, 20, 30, 40, 50, 60, 70, 80, 100, 90 },
				//
				{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 },
				{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 },
		};
		return valuesAscending;
	}

	@Override
	public int[][] getValuesDescending() {
		int[][] valuesDescending = {
				// __
				{ 50, 70, 10, 30, 100, 20, 60, 40, 80, 90 },
				// __
				{ 70, 50, 10, 30, 100, 20, 60, 40, 80, 90 },
				// __
				{ 70, 50, 10, 30, 100, 20, 60, 40, 80, 90 },
				// __
				{ 70, 50, 30, 10, 100, 20, 60, 40, 80, 90 },
				// __
				{ 100, 70, 50, 30, 10, 20, 60, 40, 80, 90 },
				// __
				{ 100, 70, 50, 30, 20, 10, 60, 40, 80, 90 },
				// __
				{ 100, 70, 60, 50, 30, 20, 10, 40, 80, 90 },
				// __
				{ 100, 70, 60, 50, 40, 30, 20, 10, 80, 90 },
				// __
				{ 100, 80, 70, 60, 50, 40, 30, 20, 10, 90 },
				//
				{ 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 },
				{ 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 },
		};
		return valuesDescending;
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