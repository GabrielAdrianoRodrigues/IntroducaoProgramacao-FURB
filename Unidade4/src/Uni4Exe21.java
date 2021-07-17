import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Uni4Exe21 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("Informe sua altura em metros:");
        double altura = imput.nextDouble();
        System.out.println("Informe seu peso em kg:");
        double massa = imput.nextDouble();
        double IMC = massa / Math.pow(altura, 2);

        if (IMC < 18.5) {
            System.out.println("IMC: " + format.format(IMC));
            System.out.println("Magreza");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("IMC: " + format.format(IMC));
            System.out.println("Saudável");
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("IMC: " + format.format(IMC));
            System.out.println("Sobrepeso");
        } else if (IMC >= 30.0 && IMC <= 34.9) {
            System.out.println("IMC: " + format.format(IMC));
            System.out.println("Obesidade Grau I");
        } else if (IMC >= 35.0 && IMC < +39.9) {
            System.out.println("IMC: " + format.format(IMC));
            System.out.println("Obesidade Grau II (severa)");
        } else if (IMC >= 40.0) {
            System.out.println("IMC: " + format.format(IMC));
            System.out.println("Obesidade Grau III (mórbida)");
        }

        imput.close();
    }
}