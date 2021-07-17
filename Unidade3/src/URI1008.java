import java.util.Scanner;
import java.text.DecimalFormat;

public class URI1008 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");
        int Numero = teclado.nextInt();
        int QuantidadeDehorasTrabalhadas = teclado.nextInt();
        double ValorGanhoPorHora = teclado.nextDouble();

        double Salario = (QuantidadeDehorasTrabalhadas * ValorGanhoPorHora);

        System.out.println("NUMBER = " + Numero);
        System.out.println("SALARY = U$ " + format.format(Salario));
        teclado.close();
    }
}