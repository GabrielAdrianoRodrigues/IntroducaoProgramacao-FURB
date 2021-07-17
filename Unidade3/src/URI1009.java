import java.util.Scanner;
import java.text.DecimalFormat;

public class URI1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        String nome = teclado.next();
        double SalarioFixo = teclado.nextDouble();
        double venda = teclado.nextDouble();
        double comicao = venda * 0.15;
        double salariofinal = SalarioFixo + comicao;

        System.out.println("TOTAL = R$ " + format.format(salariofinal));

        teclado.close();

    }
}