import java.util.Scanner;
import java.lang.Math;

class Uni03exe10 {
  public static void main(String args[]) {
    Scanner imput = new Scanner(System.in);

    System.out.println("Insira o cateto 1:");
    int cateto1 = imput.nextInt();
    System.out.println("Insira o cateto 2:");
    int cateto2 = imput.nextInt();
    double hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
    hipotenusa = Math.pow(hipotenusa, 2);

    System.out.println("Comprimento da hipotenusa de um triângulo: " + hipotenusa);
    imput.close();
  }
}
