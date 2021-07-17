import java.util.Scanner;

public class Uni3exe03 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Insira o valor gasto:");
        double ValorPago = imput.nextDouble();
        System.out.println("Insira o preço do combustivel por litro");
        double PrecoPorLitroDeCombustivel = imput.nextDouble();

        double Litros = ValorPago / PrecoPorLitroDeCombustivel;

        System.out.println("Litros obtidos " + (int) Litros);

        imput.close();
    }
}
