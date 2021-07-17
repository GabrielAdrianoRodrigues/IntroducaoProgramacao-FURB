import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int n, i, num;
        double qtdPositivos, media, menorNegativo;

        System.out.println("Informe a quantia de numeros que você deseja analisar:");
        n = imput.nextInt();
        qtdPositivos = 0;
        menorNegativo = 0;
        media = 0;
        System.out.println("Digíte os respectivos numeros:");

        for (i = 1; i <= n; i++) {
            num = imput.nextInt();
            if (num > 0) {
                qtdPositivos = qtdPositivos + num;
            }
            if (num < 0 && menorNegativo == 0) {
                menorNegativo = num;
            }
            if (i >= n) {
                media = qtdPositivos / n;
            }
        }
        System.out.println("Média dos numeros posítivos: " + media);
        System.out.println("Menor numero negativo: " + menorNegativo);
        imput.close();
    }
}