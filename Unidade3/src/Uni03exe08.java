import java.util.Scanner;
import java.text.DecimalFormat;

class Uni03exe08 {
  public static void main(String args[]) {
    Scanner imput = new Scanner(System.in);
    DecimalFormat format = new DecimalFormat("0.00");

    System.out.println("Câmbio do dia:");
    double CambioDoDia = imput.nextDouble();
    System.out.println("Quantia de Dólares");
    double QtdDolares = imput.nextDouble();
    double QtdReais = QtdDolares * CambioDoDia;

    System.out.println("Total de Reais: R$ " + format.format(QtdReais));
    imput.close();
  }
}