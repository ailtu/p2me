package br.unicap.p2.atividade05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestBubbleSort extends TestBaseSort {

	@Override
	public BaseSort getSortingAlgorithm() {
		return new BubbleSort();
	}

	@Override
	public int[][] getValuesAscending() {
		int[][] valuesAscending = {
				//
				{ 50, 70, 10, 30, 100, 20, 60, 40, 80, 90 },
				// __
				{ 10, 50, 70, 20, 30, 100, 40, 60, 80, 90 },
				// __
				{ 10, 20, 50, 70, 30, 40, 100, 60, 80, 90 },
				// __
				{ 10, 20, 30, 50, 70, 40, 60, 100, 80, 90 },
				// __
				{ 10, 20, 30, 40, 50, 70, 60, 80, 100, 90 },
				// __
				{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 },
				// __
				{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 },
				// __
				{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 },
				// __
				{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 },
				// __
				{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 },
				// __
				{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 },
		};

		return valuesAscending;
	}

	@Override
	public int[][] getValuesDescending() {
		int[][] valuesDescending = {
				//
				{ 50, 70, 10, 30, 100, 20, 60, 40, 80, 90 },
				// __
				{ 100, 50, 70, 10, 30, 90, 20, 60, 40, 80 },
				// __
				{ 100, 90, 50, 70, 10, 30, 80, 20, 60, 40 },
				// __
				{ 100, 90, 80, 50, 70, 10, 30, 60, 20, 40 },
				// __
				{ 100, 90, 80, 70, 50, 60, 10, 30, 40, 20 },
				// __
				{ 100, 90, 80, 70, 60, 50, 40, 10, 30, 20 },
				// __
				{ 100, 90, 80, 70, 60, 50, 40, 30, 10, 20 },
				// __
				{ 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 },
				// __
				{ 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 },
				// __
				{ 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 },
				// __
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