import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
      
        System.out.println("Insíra dois valores:");
        int valor1 = imput.nextInt();
        int valor2 = imput.nextInt();

        if (valor1 > valor2) {
            System.out.println("O primeiro valor é maior");
        } else {
            System.out.println("o segundo valor é maior");
        }
        
        imput.close();
    }
}
 