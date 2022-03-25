package vetornotas;
import java.util.Scanner;
public class VetorNotas {

    public static void main(String[] args) {

        String[] nome = new String[5];
        double[] priNota = new double[nome.length];
        double[] segNota = new double[nome.length];
        double[] media = new double[nome.length];

        entra_dados(nome, priNota, segNota, media);
    }

    public static void entra_dados(String[] nome, double[] priNota, double[] segNota, double[] media) {
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i <= nome.length - 1; i++) {      
            System.out.print("Digite o nome do Aluno: ");
            nome[i] = in.next();
            System.out.println("Agora informe as 2 notas " + nome[i]);
            System.out.print("1° Nota: ");
            priNota[i] = in.nextDouble();
            System.out.print("2° Nota: ");
            segNota[i] = in.nextDouble();
        }
        
        for (int i = 0; i <= media.length - 1; i++) {
            media[i] = (priNota[i] * 2 + segNota[i] * 3) / 5;
        }
        saida_media(nome, media);
    }

    public static void saida_media(String[] nome, double[] media) {
       
        System.out.println();
        System.out.println("SAÍDA MÉDIA DOS ALUNOS");
        for (int i = 0; i <= nome.length -1; i++) {
            System.out.println("@ Alun@ " + nome[i] + " obteve a média " + media[i]);
        }
    }
}