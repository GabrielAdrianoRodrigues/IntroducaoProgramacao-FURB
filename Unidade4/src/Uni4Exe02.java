import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Insíra um valor maior que zero:");
        int valor = imput.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Valor Par");
        } else {
            System.out.println("valor impar");
        }

        imput.close();
    }
}
