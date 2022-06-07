package br.unicap.p2.atividade05;

public abstract class BaseSort {

    public abstract void sort(int[] items, boolean ascending, int maxIterations);

    public void sort(int[] items, boolean ascending) {
        sort(items, ascending, Integer.MAX_VALUE);
    }

    public void swap(int[] items, int i, int j) {
        int tempValue = items[i];
        items[i] = items[j];
        items[j] = tempValue;
    }

    public boolean needsChange(boolean ascending, int i, int j) {

        int cmp = i - j;
        boolean isAscending = cmp > 0;
        boolean isDescending = cmp < 0;
        boolean needsChange = (ascending && isDescending) || (!ascending && isAscending);
        return needsChange;
    }
}