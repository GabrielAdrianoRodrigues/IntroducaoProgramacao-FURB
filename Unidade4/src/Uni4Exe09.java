import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
         
        System.out.println("Informe o primeiro numero:");
        int numero1 = imput.nextInt();
        System.out.println("Informe o segundo numero:");
        int numero2 = imput.nextInt();

        if (numero1%numero2 == 0 || numero2%numero1 == 0 ){
            System.out.println("São numeros multiplos");
        } else {
            System.out.println("Não são numeros multiplos");
        }

        imput.close();
    }
}
