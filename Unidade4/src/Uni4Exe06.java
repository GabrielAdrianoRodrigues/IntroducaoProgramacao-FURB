import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Insíra uma letra:");
        char letra = imput.next().charAt(0);
        letra = Character.toUpperCase(letra);

        if (letra == 'F') {
            System.out.println("Femino");
        } else {
            if (letra == 'M') {
                System.out.println("Masculino");
            } else {
                if (letra == 'I') {
                    System.out.println("Não identificado");
                } else {
                    System.out.println("Entrada incorreta");
                }
            }
        }
        imput.close();
    }
}