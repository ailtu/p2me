package br.unicap.p2.atividade03.part1;

public class CompoundInterest {

    static double[][] calculate(double initialAmount, int numPeriods, double[] interestRates) {

        int column = interestRates.length;
        int row = numPeriods + 1;
        int rowG1, contWhile = 0;
        double[][] matrix = new double[row][column];

        for (int i = 0; i < row; i++) {

            rowG1 = i + 2;
            while (contWhile < column) {

                matrix[0][contWhile] = initialAmount;
                interestRates[contWhile] += 1;

                if (row > 1) {

                    matrix[1][contWhile] = matrix[0][contWhile] * interestRates[contWhile];
                }
                contWhile++;
            }

            if (row > 2) {
                for (int j = 0; j < column; j++) {
                    if (matrix[row - 1][column - 1] != 0) {
                        break;
                    }
                    matrix[rowG1][j] = (matrix[rowG1 - 1][j] / matrix[rowG1 - 2][j]) * matrix[rowG1 - 1][j];
                }
            }
        }
        return matrix;
    }
}