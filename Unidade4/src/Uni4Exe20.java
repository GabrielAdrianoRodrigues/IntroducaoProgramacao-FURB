import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe20 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.0");

        System.out.println("Informe à primeira prova:");
        double notaProva1 = imput.nextInt();
        System.out.println("Informe à segunda prova:");
        double notaProva2 = imput.nextInt();
        System.out.println("Informe à terceira prova:");
        double notaProva3 = imput.nextInt();
        System.out.println("Informe à media do exercícios");
        double notaExercicios = imput.nextInt();
        double media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;

        if (media >= 9.0) {
            System.out.println("Conceito A");
            System.out.println("Média de aproveitamento " + format.format(media));
            System.out.println("Aprovado");
        } else if (media >= 7.5 && media < 9.0) {
            System.out.println("Conceito B");
            System.out.println("Média de aproveitamento " + format.format(media));
            System.out.println("Aprovado");
        } else if (media >= 6.0 && media < 7.5) {
            System.out.println("Conceito C");
            System.out.println("Média de aproveitamento " + format.format(media));
            System.out.println("Aprovado");
        } else if (media >= 4.0 && media < 6.0) {
            System.out.println("Conceito D");
            System.out.println("Média de aproveitamento " + format.format(media));
            System.out.println("Reprovado");
        } else if (media < 4.0) {
            System.out.println("Conceito E");
            System.out.println("Média de aproveitamento " + format.format(media));
            System.out.println("Reprovado");
        }

        imput.close();
    }
}