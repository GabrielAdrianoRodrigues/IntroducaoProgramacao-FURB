import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class URI1002 {

  public static void main(String[] args) {
    DecimalFormat format = new DecimalFormat("0.0000");
    Scanner teclado = new Scanner(System.in);

    double raio = teclado.nextDouble();

    double Pi = 3.14159;
    double raio2 = Math.pow(raio, 2);
    ;
    double area = raio2 * Pi;

    String areaformatada = format.format(area);
    System.out.println("A=" + areaformatada);
    teclado.close();
  }

}