import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Insira a quantia de meses:");
        int mes = imput.nextInt();

        if (mes >= 0 && mes <= 12) {
            System.out.println("Reajuste salárial de 5%");
        } else if (mes >= 13 && mes <= 48) {
            System.out.println("Reajuste salárial de 7%");
        }
        imput.close();
    }
}
