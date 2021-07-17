import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int numeros;
        System.out.println("Insíra 20 numeros e veja se o mesmo e par ou ímpar:");

        for (int cont = 1; cont <= 20; cont++) {
            numeros = imput.nextInt();
            if ((numeros % 2) == 0) {
                System.out.println(numeros + " É par");
            } else {
                System.out.println(numeros + " É impar");
            }
        }

        imput.close();
    }

}