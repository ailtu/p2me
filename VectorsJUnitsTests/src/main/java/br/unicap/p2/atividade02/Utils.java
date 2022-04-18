package br.unicap.p2.atividade02;

public class Utils {

    static int[] buildVectorRepeat(int repetitions, int value) {

        int[] repeatV = new int[repetitions];

        for (int i = 0; i < repetitions; i++) {
            repeatV[i] = value;
        }
        return repeatV;
    }

    static int[] buildVectorSequence(int sequenceSize, int startValue) {

        int[] vetSeq = new int[sequenceSize];

        for (int i = 0; i < sequenceSize; i++) {
            vetSeq[i] = startValue++;
        }
        return vetSeq;
    }

    static int dotProduct(int[] a, int[] b) throws Exception {

        int product = 0;

        if (a.length != b.length) {
            throw new Exception("Vectors with different sizes but returned");

        } else {
            for (int i = 0; i < b.length; i++) {
                product += a[i] * b[i];

            }
            return product;
        }
    }

    static boolean isPalindrome(int[] aSequence) {

        int j = aSequence.length;
        boolean k = false;

        for (int i = 0; i < aSequence.length; i++) {

            j--;

            if (aSequence[i] == aSequence[j]) {
                k = true;

            } else {
                k = false;
                break;
            }
        }

        if (k == false) {
            return false;

        } else {
            return true;
        }
    }

    public static double calculateCableBridge(double bridgeLenght, int numSteelCables) {

        double sum = 0;
        double halfBridgeLength = bridgeLenght / 2;
        double mCableHeight = 1 / 20 * halfBridgeLength;
        double cableLenght = Math.sqrt(Math.pow(halfBridgeLength, 2) + Math.pow(mCableHeight, 2));

        double[] vet = calculateCablesSupportRod(numSteelCables, mCableHeight, halfBridgeLength);

        if (numSteelCables > 1) {

            for (int i = 0; i < vet.length; i++) {
                sum += vet[i];
            }
            cableLenght = sum;
        }
        return cableLenght * 4;
    }

    public static double[] calculateCablesSupportRod(int numSteelCables, double supportRodHeight, double halfBridgeLenght) {

        int cont = 1;
        double[] vet = new double[numSteelCables];
        double[] bridgeFraction = new double[numSteelCables];
        double[] heightFraction = new double[numSteelCables];

        for (int i = 0; i < numSteelCables; i++) {

            bridgeFraction[i] = (halfBridgeLenght / numSteelCables) * cont;
            heightFraction[i] = (supportRodHeight / numSteelCables) * cont;
            vet[i] = Math.sqrt(Math.pow(bridgeFraction[i], 2) + Math.pow(heightFraction[i], 2));

            cont++;
        }
        return vet;
    }
}