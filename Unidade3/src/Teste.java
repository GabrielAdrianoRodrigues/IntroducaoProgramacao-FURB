import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        double numero = imput.nextDouble();

        if (numero>0&&numero<100){
            System.out.println("entre 0 e 100");
        }else {
            System.out.println("nao esta entre 0 e 100");
        }
      imput.close();
    }
}
