import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Qual é a massa inicial em Kg?");
        float massaInicial = imput.nextFloat();
        final float mascaraMassaIncial = massaInicial;
        float massaFinal = massaInicial;
        int tempo = 0;

        while (massaFinal > 0.5) {
            tempo += 50;
            massaInicial = massaInicial / 2;
            massaFinal = massaFinal - massaInicial;
        }
        System.out.println("Massa incial: " + mascaraMassaIncial + " Kg");
        System.out.println("Massa Final: " + massaFinal + " Kg");
        System.out.println("tempo: " + tempo + " Seg");
        imput.close();
    }
}
