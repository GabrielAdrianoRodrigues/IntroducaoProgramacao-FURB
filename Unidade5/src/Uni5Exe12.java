import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int cont , linhas , triangulo , i;
        System.out.println("Digite quantas linhas desejás que o triângulo de Floyd tenha :");
        linhas = imput.nextInt();
        triangulo= 1;

        for (cont = 1; cont <= linhas ; cont++) {
            for (i = 1 ; i <= cont ; i++) {
                System.out.print("\t" + triangulo);
                triangulo++;
            }
            System.out.println();
        }
        imput.close();
    }
}
