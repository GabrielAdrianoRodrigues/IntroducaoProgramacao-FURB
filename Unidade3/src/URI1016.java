import java.util.Scanner;

public class URI1016 {
    public static void main(String[] args) {
        /* Código de Zueira que o URI aceitou
          
         Scanner teclado = new Scanner(System.in); int km = teclado.nextInt();
          
          int tempo = km *2;
          
          
          
          System.out.println(tempo + " minutos");
          
          teclado.close();
         */

        Scanner teclado = new Scanner(System.in);
        int km = teclado.nextInt();
        int tempo = ((60 * km) / 30);

        System.out.println(tempo + " minutos");

        teclado.close();

    }
}
