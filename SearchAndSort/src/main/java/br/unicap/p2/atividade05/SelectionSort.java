package br.unicap.p2.atividade05;

public class SelectionSort extends BaseSort {

    @Override
    public void sort(int[] items, boolean ascending, int maxIterations) {

        int values = items.length;
        int currentIteration = 0;

        for (int i = 0; i < values - 1 && currentIteration < maxIterations; i++) {
            int minOrMax = findMinOrMax(items, ascending, i);
            swap(items, i, minOrMax);
            currentIteration++;
        }
    }

    private int findMinOrMax(int[] items, boolean ascending, int i) {

        int minOrMaxValue = i;

        for (int j = i + 1; j < items.length; j++) {

            boolean isAscending = items[minOrMaxValue] < items[j];
            boolean isDescending = items[minOrMaxValue] > items[j];

            boolean needsChange = (isAscending && !ascending) || (isDescending && ascending);

            if (needsChange) {
                minOrMaxValue = j;
            }
        }
        return minOrMaxValue;
    }
}