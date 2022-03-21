package vetornotasmelhorado;
import java.util.Scanner;
public class VetorNotasMelhorado {
public static void main(String[] args) {
       
    String[] nome = new String[5];
    /* a quantidade de valores colocados dentro do índice,
       será a quantidade de alunos cadastrados
    
    ENTÃO: nome = new String[50]
           o cadastro será executado 50 vezes.
    
           nome = new String[10]
           o cadastro será executado 10 vezes. */
    double[] priNota = new double[nome.length]; 
            double[] segNota = new double[nome.length];
                    double[] media = new double[nome.length];
                            
    // chamada do  procedimento
    entradaDados(nome, priNota, segNota, media);
}
    public static void entradaDados(String[] nome, double[] priNota, double[] segNota, double[] media) {
    Scanner in = new Scanner(System.in);
    
    // recebe dados e os processa
    System.out.println("Digite o nome do Aluno: ");
    for (int i = 0; i <= nome.length -1; i++) {
        
        System.out.print("Nome: ");
        nome[i] = in.next();
        
        System.out.println("Agora informe as notas de " + nome[i]);
        System.out.print("1° Nota: ");   
        priNota[i] = in.nextDouble();
        while (priNota[i] > 10 && priNota[i] < 0){ // verifica se a nota é válida
           System.out.println("Nota Inválida! Digite novamente: ");
           priNota[i] = in.nextDouble();
}
        System.out.print("2° Nota: ");
        segNota[i] = in.nextDouble();
        while(segNota[i] > 10 && segNota[i] < 0) {
            System.out.println("Notan Inválida, Digite Novamente: ");
            segNota[i] = in.nextDouble();
}
}   
    // soma e depois divide as notas por 5
    for (int i = 0; i <= media.length -1; i++) {
        media[i] = (priNota[i] * 2 + segNota[i]*3)/5;
} 
    // chama o procedimento de exibição de dados
    saidaMediaAlunos(nome, media);   
}    
    // função para retornar média da turma
    public static double mediaTurma(double[] media) {
    double soma = 0, medGeral;
    
    for(int i = 0; i < media.length; i++) {
    soma += media[i];
}    
    medGeral = soma/media.length;   
    return medGeral;
}    
    // alunos a baixo da média
    public static double alunoAbaixoMedia(double[] media) {
    double porcentagem = 0, conta = 0;
  
    for (int i = 0; i < media.length; i++) {
        if (media[i] <= 6.9) {
        conta++;
}
    porcentagem = conta / media.length * 100.f; 
}   return porcentagem;
}   
    // alunos acima da média
    public static double alunoAcimaMedia(double[] media) {
    double porcAc = 0, medGe = 0;
        
    for (int i = 0; i < media.length; i++) {
        if (media[i] > medGe){
        porcAc++;
}
}    return porcAc;
}    
    // maior média
    public static double maiorMedia(double[] media){
    double mMed = 0;
    
    for(int i = 0; i < media.length; i++){
        if(media[i] > mMed){
        mMed = media[i];
}
}   return mMed;
}
    // procedimento onde todos as médias são exibidas
    public static void saidaMediaAlunos(String[] nome, double[] media) {
    System.out.println();
    System.out.println("= MÉDIA DOS ALUNOS =");
    System.out.println();
    System.out.printf("Média da Turma %.1f\n" , mediaTurma(media));
    System.out.printf("Alunos abaixo da Média %.1f\n" , alunoAbaixoMedia(media));
    System.out.printf("Alunos acima da Média %.1f\n" , alunoAcimaMedia(media));
    System.out.printf("A Maior Média é: %.1f\n" , maiorMedia(media));
    System.out.println();
    
    for(int i = 0; i <= nome.length -1; i++){
        System.out.println("O Aluno " + nome[i] + " obteve a média " + media[i]);
}
}
}