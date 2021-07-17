import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Insíra um numero maior que zero");
        double valor = imput.nextDouble();

        if (valor % 1 != 0) {
            System.out.println("Existem casas decimais");
        } else {
            System.out.println("Não tem casas decimais");
        }

        imput.close();
    }
}
