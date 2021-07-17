import java.util.Scanner;

public class Uni3exe01 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Insira à base:");
        int base = imput.nextInt();
        System.out.println("Insira à altura:");
        int altura = imput.nextInt();

        int area = base * altura;

        System.out.println("Área:" + area + " m²");

        imput.close();
    }
}
