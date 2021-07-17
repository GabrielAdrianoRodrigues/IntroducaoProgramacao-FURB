import java.util.Scanner;
import java.lang.Math;

class Uni03exe09 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Insira à altura:");
        int altura = imput.nextInt();
        System.out.println("Insira o raio:");
        int raio = imput.nextInt();
        double pi = 3.14159;
        double volume = pi * Math.pow(raio, 2) * altura;

        System.out.println("Volume da lata de óleo: " + volume + "m²");
        imput.close();
    }
}