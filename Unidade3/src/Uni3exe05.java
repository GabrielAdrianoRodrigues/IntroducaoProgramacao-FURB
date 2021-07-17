import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3exe05 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");
        
        System.out.println("Insira à quantida de frangos:");
        int qtdFrangos = imput.nextInt();
        double Chip = 4.00;
        double Anel = 3.50 * 2;
        Double GastoTotal = ((Chip + Anel) * qtdFrangos);

        System.out.println("Gasto Total: R$ " + format.format(GastoTotal));
        imput.close();

    }
}