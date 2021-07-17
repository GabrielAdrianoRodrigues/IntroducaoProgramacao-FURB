import java.util.Scanner;
import java.text.DecimalFormat;

public class URI1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        int codpec1 = teclado.nextInt();
        int qntpec1 = teclado.nextInt();
        double valorpec1 = teclado.nextDouble();

        int codpec2 = teclado.nextInt();
        int qntpec2 = teclado.nextInt();
        double valorpec2 = teclado.nextDouble();

        double total = qntpec1 * valorpec1 + qntpec2 * valorpec2;
        System.out.println("VALOR A PAGAR: R$ " + format.format(total));

        teclado.close();
    }
}
