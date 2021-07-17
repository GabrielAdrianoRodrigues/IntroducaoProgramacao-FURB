import java.util.Scanner;

public class Uni3exe02 {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        System.out.println("Insira o valor do produto:");
        double valor = imput.nextInt();
        double desconto = (valor * 12) / 100;
        double valorDesconto = valor - desconto;

        System.out.println("Valor do desconto R$ " + desconto);
        System.out.println("Preço do par com desconto R$ " + valorDesconto);
        imput.close();
    }
}
