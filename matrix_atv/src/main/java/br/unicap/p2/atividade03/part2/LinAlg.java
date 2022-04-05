package br.unicap.p2.atividade03.part2;

public class LinAlg {

    public static double[][] matrixMultiplication(double a, double[][] A) {

        int rowsSize = A.length;

        for (int i = 0; i < rowsSize; i++) {

            double[] rowI = A[i];
            int columnS = rowI.length;

            for (int j = 0; j < columnS; j++) {
                A[i][j] = a * A[i][j];
            }
        }
        return A;
    }

    public static double[][] matrixTranspose(double[][] A) {

        int row = A.length;
        int column = A[0].length;
        double[][] matrixTransp = new double[column][row];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {

                matrixTransp[i][j] = A[j][i];
            }
        }
        return matrixTransp;
    }

    public static double[][] matrixMultiplication(double[][] A, double[][] B) {

        int rowsA = A.length;
        int columnsA = A[0].length;
        int rowsB = B.length;
        int columnsB = B[0].length;
        double[][] C = new double[rowsA][columnsB];

        if (columnsA != rowsB) {

            throw new RuntimeException("Número de colunas de A diferente do numéro de linhas de B mas retornou");
        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    C[i][j] = (A[i][k] * B[k][j]) + C[i][j];
                }
            }
        }
        return C;
    }

    public static double[][] subMatrix(double[][] A, int i, int j) {

        int row = A.length - 1;
        int column = A[0].length - 1;
        double[][] S = new double[row][column];

        int subMi = 0;
        for (int a = 0; a < row + 1; a++) {
            if (a == i) {
                continue;
            }
            
            int subMj = 0;
            for (int b = 0; b < column + 1; b++) {
                if (b == j) {
                    continue;
                }
                
                S[subMi][subMj] = A[a][b];
                subMj++;
            }
            subMi++;
        }
        return S;
    }

    public static double matrixDeterminant(double[][] A) {

        int n = A.length;
        int column = A[0].length;
        double matrixDet = 0;

        if (column != n) {

            throw new RuntimeException("Matrix not squared but returned");
        }

        if (n == 1) {

            matrixDet = A[0][0];
            return matrixDet;
        }

        if (n == 2) {

            matrixDet = A[0][0] * A[1][1] - A[0][1] * A[1][0];
            return matrixDet;
        }

        for (int j = 0; j <
         A[0].length; j++) {

            matrixDet += A[0][j] * matrixCoFactor(A, 0, j);
        }
        return matrixDet;
    }

    public static double matrixCoFactor(double[][] A, int i, int j) {

        double[][] subMatrix = subMatrix(A, i, j);
        double matrixDeterminant = matrixDeterminant(subMatrix);

        return Math.pow(-1, i + j) * matrixDeterminant;
    }

    public static double[][] matrixCoFactor(double[][] A) {

        int row = A.length;
        int column = A[0].length;
        double[][] cofA = new double[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                cofA[i][j] = matrixCoFactor(A, i, j);
            }
        }
        return cofA;
    }

    public static double[][] matrixAdjugate(double[][] A) {

        if (A.length == 1) {
			
            if (A[0][0] == 0) {
			   return A;
			} 
            else {
				A[0][0] = 1;
		       return A;
			}
		}
		return matrixTranspose(matrixCoFactor(A));
	}

    public static boolean matrixIsSingular(double[][] A) {

        if (matrixDeterminant(A) == 0) {
			return true;
		}
		return false;
    }

    public static double[][] matrixInverse(double[][] A) {

        if (matrixIsSingular(A) == true) {
			
            throw new RuntimeException("Matrix is singular but returned");
		}
		double matrixDeterminant = matrixDeterminant(A);
		double[][] matrixAdjugate = matrixAdjugate(A);
		
        return matrixMultiplication(1 / matrixDeterminant, matrixAdjugate);
    }
}