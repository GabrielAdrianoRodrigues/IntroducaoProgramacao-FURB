import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Informe o n (2<n): ");
        int n = imput.nextInt();
        int sequencia = 8;

        if (n > 2) {
            System.out.print(sequencia + ",");
            for (int i = 1; i <= n; i++) {
                sequencia = sequencia + 2;
                System.out.print(sequencia + ",");
                sequencia = sequencia - 2;
                sequencia = sequencia * 2;
                if (i < n) {
                    System.out.print(sequencia + ",");
                } else {
                    System.out.print(sequencia + ".");
                }
            }
        } else {
            System.out.println("valor de n inválido");
        }
        imput.close();
    }
}
