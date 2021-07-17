import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Insíra a quantia de numeros que deseja comparar:");
        int n, numeros, maior, menor;
        n = imput.nextInt();
        maior = 0;
        menor = 0;
        System.out.println("Digíte os numeros:");

        for (int i = 0; i < n; i++) {
            numeros = imput.nextInt();
            if (i == 0) {
                maior = numeros;
                menor = numeros;
            }
            if (numeros > maior) {
                maior = numeros;
            }
            if (numeros < menor ) {
                menor = numeros;
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        imput.close();
    }
}