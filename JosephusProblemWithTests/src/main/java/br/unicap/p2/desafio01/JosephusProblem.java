package br.unicap.p2.desafio01;

public class JosephusProblem {

    public static int[] solve(int m, int n) {

        int[] positions = new int[n];
        int[] seqEliminated = new int[n];
        int countEliminated = 0;
        int currentPos = -1;

        while (countEliminated < n) {
            countEliminated = moveNext(positions, n, m, currentPos);
        }

        seqEliminated[countEliminated] = currentPos;
        positions[currentPos] = -1;
        countEliminated++;

        return seqEliminated;
    }

    public static int moveNext(int[] positions, int n, int m, int currentPos) {

        int leaps = 0;

        while (leaps < m) {
            currentPos++;
            currentPos = currentPos % m;
            boolean isDead = positions[currentPos] == -1;

            if (isDead) {
                continue;
            }
            leaps++;
        }
        return currentPos;
    }
}