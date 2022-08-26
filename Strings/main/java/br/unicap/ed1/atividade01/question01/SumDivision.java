package br.unicap.ed1.atividade01.question01;

public class SumDivision {

    static double sum(double addend1, double addend2) {

        return addend1 + addend2;
    }

    static double divide(double dividend, double divisor) {

        if (divisor == 0) {
            return 0;
        }
        return dividend / divisor;
    }
}