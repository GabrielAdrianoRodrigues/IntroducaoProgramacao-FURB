import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        /*System.out.println("A cor é azul?");
        boolean sim = imput.nextBoolean();

        if (sim == true) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }*/

        System.out.println("A cor é azul?");
        String resposta = imput.next();
        

        if (resposta == "true") {
            System.out.println("Sim");
        } else if (resposta == "false") {
            System.out.println("Não");
        }
        imput.close();
    }
}
