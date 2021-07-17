import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

class URI1036 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00000");

        double A = imput.nextDouble();
        double B = imput.nextDouble();
        double C = imput.nextDouble();
        double delta = Math.pow(B, 2) - (4 * A * C);

        if (A == 0 || B == 0 || C == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double r1 = ((-1 * B) + (Math.sqrt(delta))) / (2 * A);
            double r2 = ((-1 * B) - (Math.sqrt(delta))) / (2 * A);
            System.out.println("R1 = " + format.format(r1));
            System.out.println("R2 = " + format.format(r2));
        }

        imput.close();
    }
}