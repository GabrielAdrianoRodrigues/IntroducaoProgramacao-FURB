import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Insíra o primeiro lado do triângulo:");
        int lado1 = imput.nextInt();
        System.out.println("Insíra o segundo lado do triângulo:");
        int lado2 = imput.nextInt();
        System.out.println("Insíra o terceiro lado do triângulo:");
        int lado3 = imput.nextInt();

        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Triângulo equilatero");
            } else if (lado1 == lado2 && lado1 != lado3 && lado2 != lado3
                    || lado1 != lado2 && lado1 != lado3 && lado2 == lado3
                    || lado1 != lado2 && lado1 == lado3 && lado2 != lado3) {
                System.out.println("Triângulo isósceles");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("Triângulo escaleno");
            } else {
                System.out.println("Não forma um triângulo");
            }
        }

        imput.close();
    }
}
