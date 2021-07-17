import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite um número a ser decomposto: ");
        int n = imput.nextInt();

        int fa = 2;
        while (n > 1){
            while (n % fa == 0){
                System.out.println("Número: "+ n);
                System.out.println("Decomposição: "+fa);

                System.out.print(n+" / "+fa+" = ");
                n = n / fa;
                
            }
            fa++;
        }
        System.out.print(n);
        imput.close();
    }
}
