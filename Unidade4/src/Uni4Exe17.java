import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe17 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("Informe valor da renda anual");
        double rendaAnual = imput.nextDouble();
        System.out.println("Informe a quantia de dependentes");
        int dependentes = imput.nextInt();
        double valorDeDesconto = dependentes * 2;
        double valorDoDesconto = (valorDeDesconto / 100) * rendaAnual;
        double valorLiquidoAnual = rendaAnual - valorDoDesconto;
        double valorLiquidoMensal = valorLiquidoAnual / 12;

        if (valorLiquidoMensal < 2000) {
            System.out.println("O contribuente não pagara imposto");
        } else if (2000 < valorLiquidoMensal && valorLiquidoMensal < 5000) {
            double desconto1 = (5.0 / 100) * valorLiquidoMensal;
            System.out.println(
                    "O valor do imposto e de 5% oque resulta em um desconto de: R$ " + format.format(desconto1));
        } else if (5000 < valorLiquidoMensal && valorLiquidoMensal < 10000) {
            double desconto2 = (10.0 / 100) * valorLiquidoMensal;
            System.out.println(
                    "O valor do imposto e de 10% oque resulta em um desconto de: R$ " + format.format(desconto2));
        } else if (valorLiquidoMensal > 10000) {
            double desconto3 = (15.0 / 100) * valorLiquidoMensal;
            System.out.println(
                    "O valor do impost e de 15% oque resulta em um desconto de: R$ " + format.format(desconto3));
        }

        imput.close();
    }
}