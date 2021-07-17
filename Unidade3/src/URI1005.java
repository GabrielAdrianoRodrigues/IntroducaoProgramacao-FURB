import java.util.Scanner;
import java.text.DecimalFormat;

public class URI1005 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00000");
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();

        double MEDIA = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.println("MEDIA = " + format.format(MEDIA));
        teclado.close();  
    }
}
