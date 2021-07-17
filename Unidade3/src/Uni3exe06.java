import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3exe06 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        int preco = 25;
        int prato = 750;
        System.out.println("Insira o peso:");
        double peso = imput.nextDouble();
        double PesoComidaGramas = peso * 1000;
        double pesoTotal = PesoComidaGramas + prato;
        double valorTotal = (pesoTotal / 1000) * preco;

        System.out.println("Valor a pagar: R$" + format.format(valorTotal));
        imput.close();
    }
}
