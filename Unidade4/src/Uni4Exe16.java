import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);

        System.out.println(
                "Será somado a idade do homem mais velho e da mulher mais nova e multiplicado a idade do homem mais novo e da mulher mais velha");
        System.out.println("Insira a idade da primeira mulher");
        int mulher1 = imput.nextInt();
        System.out.println("Insira a idade da segunda mulher");
        int mulher2 = imput.nextInt();
        System.out.println("Insira a idade do primeiro homem");
        int homem1 = imput.nextInt();
        System.out.println("Insira a idade do segundo homem");
        int homem2 = imput.nextInt();

        if (homem1 > homem2 && mulher1 > mulher2) {
            int soma = homem1 + mulher2;
            int produto = homem2 * mulher1;
            System.out.println("A soma do primeiro homem com a segunda mulher resulta em: " + soma
                    + " e o produto do segundo com homem com a primeira mulher resulta em: " + produto);
        } else if (homem1 < homem2 && mulher1 < mulher2) {
            int soma2 = homem2 + mulher1;
            int produto2 = homem1 * mulher2;
            System.out.println("A soma do segundo homem com a primeira mulher resulta em: " + soma2
                    + " e o produto do primeiro com homem com a segunda mulher resulta em: " + produto2);
        } else if (homem1 > homem2 && mulher1 < mulher2) {
            int soma3 = homem1 + mulher1;
            int produto3 = homem2 * mulher2;
            System.out.println("A soma do primeiro homem com a primeira mulher resulta em: " + soma3
                    + " e o produto do segundo com homem com a segunda mulher resulta em: " + produto3);
        } else if (homem1 < homem2 && mulher1 > mulher2) {
            int soma4 = homem2 + mulher2;
            int produto4 = homem1 * mulher1;
            System.out.println("A soma do segundo homem com a segunda mulher resulta em: " + soma4
                    + " e o produto do primeiro com homem com a primeira mulher resulta em: " + produto4);
        }
        
        imput.close();
    }
}