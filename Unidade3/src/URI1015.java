import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class URI1015 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.0000");

        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();
        double distanciaXY = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(format.format(distanciaXY));

        teclado.close();

    }
}