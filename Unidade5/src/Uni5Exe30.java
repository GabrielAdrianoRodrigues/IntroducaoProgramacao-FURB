import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    String n1 = "";
    String n2 = "";
    String n3 = "";
    int somaEntraram = 0;
    int somaNaoEntraram = 0;


    System.out.println("Número: ");
    int n = imput.nextInt();
    System.out.println("Decremento: ");
    int k = imput.nextInt();
    System.out.println("Tamnho da mochila: ");
    int m = imput.nextInt();
    int resto = m;

    while (n > 0){
        n1 = n1 + n+ " ";
        if (n <= resto){
            resto = resto - n;
            n2 = n2 + n+" ";
            somaEntraram = somaEntraram + n;
        } else {
            n3 = n3 + n+ " ";
            somaNaoEntraram = somaNaoEntraram + n;
        }
        n = n - k;
        
    }
    System.out.println("Elementos a serem colocados na mochila: "+n1);
    System.out.println("Elementos que entraram na mochila: "+n2);
    System.out.println("Elementos que ficaram de fora da mochila: "+n3);
    System.out.println("Soma dos elementos que entraram: "+somaEntraram);
    System.out.println("Soma dos elementos que não entraram: "+somaNaoEntraram);
    imput.close();
    }
}
