package br.unicap.p2.atividade05;

public class InsertionSort extends BaseSort {

    @Override
    public void sort(int[] items, boolean ascending, int maxIterations) {

        int currentIteration = 0;

        for (int i = 1; i < items.length && currentIteration < maxIterations; i++) {
            for (int j = i; j > 0; j--) {
                if (needsChange(ascending, items[j], items[j - 1])) {
                    swap(items, j, j - 1);
                }
            }
            currentIteration++;
        }
    }
}