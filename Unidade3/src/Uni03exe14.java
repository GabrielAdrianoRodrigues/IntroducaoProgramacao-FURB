import java.util.Scanner;

class Uni03exe14 {
  public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Latas:");
    double qtdlatas = teclado.nextDouble();
    System.out.println("Garrafas de 600ml:");
    double qtdgarrafa600 = teclado.nextDouble();
    System.out.println("Garrafas de 2 litros:");
    double qtdgarrafa2l = teclado.nextDouble();

    double lata = 350 * qtdlatas;
    double garrafa600ml = 600 * qtdgarrafa600;
    double garrafa2L = (2 * 1000) * qtdgarrafa2l;

    double total = (lata + garrafa600ml + garrafa2L) / 1000;

    System.out.println("Quantia de litros comprados: " + total + " Litros");
    teclado.close();
  }
}