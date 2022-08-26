package br.unicap.p2.atividade05;

public class BubbleSort extends BaseSort {

    @Override
    public void sort(int[] items, boolean ascending, int maxIterations) {

        int currentIteration = 0;

        for (int i = 0; i < items.length - 1 && currentIteration < maxIterations; i++) {
            for (int j = items.length - 1; j > 0; j--) {
                if (needsChange(ascending, items[j], items[j - 1])) {
                    swap(items, j, j - 1);
                }
            }
            currentIteration++;
        }
    }
}