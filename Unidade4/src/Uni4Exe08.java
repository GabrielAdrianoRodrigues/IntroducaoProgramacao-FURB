import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        char letra = imput.next().charAt(0);
        letra = Character.toUpperCase(letra);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("É uma vogal");
        } else {
            System.out.println("É uma consoante");
        }

        imput.close();
    }
}
