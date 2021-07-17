import java.util.Scanner;

class Uniexe16 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Valor da conta");
        int valor = imput.nextInt();
        int n100 = valor / 100;
        valor = valor % 100;
        int n10 = valor / 10;
        valor = valor % 10;
        int n1 = valor / 1;
        int minimo = n100 + n10 + n1;

        System.out.println("Minimo de notas: " + minimo);
        System.out.println("Sendo elas:");
        System.out.println(n100 + " Nota(s) de R$ 100,00");
        System.out.println(n10 + " Nota(s) de R$ 10,00");
        System.out.println(n1 + " Nota(s) de R$ 1,00");

        imput.close();
    }
}