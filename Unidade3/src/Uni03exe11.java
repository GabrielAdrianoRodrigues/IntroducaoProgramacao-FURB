import java.util.Scanner;


class Uni03exe11 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Insira a temperatura em Celsius:");
        double celsius = imput.nextDouble();
        double Fahrenheit = (9.0/5) * celsius + 32;

        System.out.println("Graus em Fahrenheit: " + Fahrenheit + "°");
        imput.close();
    }
}