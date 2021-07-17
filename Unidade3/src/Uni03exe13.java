import java.util.Scanner;
import java.text.DecimalFormat;

class Uni03exe13 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("Insira a altura da parede em metros:");
        double altura = imput.nextInt();
        System.out.println("Insira o comprimente da parede em metros:");
        double comprimento = imput.nextInt();
        double area = altura * comprimento;
        double preco = 12.50 * 9 * area;

        System.out.println("Valor gasto para colocar azulejo na parede: R$ " + format.format(preco));
        imput.close();
    }
}