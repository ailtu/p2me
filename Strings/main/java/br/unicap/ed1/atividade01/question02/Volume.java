package br.unicap.ed1.atividade01.question02;

public class Volume {

    static String getName(int volume) {

        if (volume <= 0) {
            return "Min Volume";
        }

        else if (volume > 0 && volume <= 25) {
            return "Low Volume";
        }

        else if (volume > 25 && volume <= 75) {
            return "Medium Volume";
        }

        else if (volume >= 76 && volume < 100) {
            return "High Volume";
        }

        else if (volume >= 100) {
            return "Max Volume";
        }
        return null;
    }
}