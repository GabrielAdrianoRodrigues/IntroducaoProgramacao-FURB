import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        float valorT = 0;

        System.out.println("Qual o valor da compra: ");
        float valor = imput.nextInt();
        while (valor != 0) {
            if (valor > 500f) {
                valor = valor * 0.80f;
                System.out.println("O valor a ser pago é: " + valor);
                valorT = valorT + valor;
            } else if (valor <= 500f) {
                valor = valor * 0.85f;
                System.out.println("O valor a ser pago é: " + valor);
                valorT = valorT + valor;
            }
            System.out.println("Qual o valor da compra: ");
            valor = imput.nextInt();
        }
        System.out.println("O valor total da loja foi de: " + valorT);
        imput.close();
    }
}
