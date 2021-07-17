import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Informe a altura de 20 pessoas em centímetros:");
        double altura;
        double soma = 0;
        double media;

        for (int i = 1; i <= 20; i++) {
            altura = imput.nextInt();
            soma += altura;
            if (i == 20) {
                media = soma / 5;
                System.out.println("Altura média: " + media + " cm");
            }
        }
        imput.close();
    }
}
