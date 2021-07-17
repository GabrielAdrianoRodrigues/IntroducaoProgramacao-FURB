import java.util.Scanner;
import java.text.DecimalFormat;

public class URI1012 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.000");

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        double pi = 3.14159;

        double TRIANGULO = (A * C) / 2;
        double CIRCULO = (C * C) * pi;
        double TRAPEZIO = ((A + B) * C) / 2;
        double QUADRADO = B * B;
        double RETANGULO = A * B;

        System.out.println("TRIANGULO: " + format.format(TRIANGULO));
        System.out.println("CIRCULO: " + format.format(CIRCULO));
        System.out.println("TRAPEZIO: " + format.format(TRAPEZIO));
        System.out.println("QUADRADO: " + format.format(QUADRADO));
        System.out.println("RETANGULO: " + format.format(RETANGULO));
        teclado.close();
    }
}