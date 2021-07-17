import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3exe04 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.00");
        Scanner imput = new Scanner(System.in);

        System.out.println("Insira à primeira nota:");
        double nota1 = imput.nextDouble();
        System.out.println("Insira à segunda nota:");
        double nota2 = imput.nextDouble();
        System.out.println("Insira à terceira nota:");
        double nota3 = imput.nextDouble();

        double media = ((nota1 * 5) / 10 + ((nota2 * 3) / 10) + ((nota3 * 2) / 10));

        System.out.println("Media: " + format.format(media));

        imput.close();
    }
}
