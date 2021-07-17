import java.util.Scanner;

class Uni03exe15 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Insira um valor ate 3 digítos:");
        int valor = imput.nextInt();
        int centena = valor / 100;
        valor = valor % 100;
        int dezena = valor / 10;
        valor = valor % 10;
        int unidade = valor / 1;

        System.out.println(centena+" Centena(s) "+dezena+" Dezena(s) "+unidade+" Unidade(s)");
        imput.close();
    }
}