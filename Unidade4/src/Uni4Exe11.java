import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Informer o ano de nascimento do primeiro irmão:");
        int data1 = imput.nextInt();
        System.out.println("Informer o ano de nascimento do segundo irmão:");
        int data2 = imput.nextInt();
        System.out.println("Informer o ano de nascimento do terceiro irmão:");
        int data3 = imput.nextInt();

        if (data1 == data2 && data1 == data3 && data2 == data3) {
            System.out.println("São trigemeos");
        } else if (data1 == data2 && data1 != data3 && data2 != data3) {
            System.out.println("O primeiro e a segundo irmão são gemeos, irmãos do terceiro");
        } else if (data1 != data2 && data1 == data3 && data2 != data3) {
            System.out.println("O primeiro e o terceiro irmão são gemeos, irmãos do segundo");
        } else if (data1 != data2 && data1 != data3 && data2 == data3) {
            System.out.println("O segundo e a terceiro irmão são gemeos, irmãos do primeiro");
        } else if (data1 != data2 && data1 != data3 && data2 != data3) {
            System.out.println("Os três são apenas irmãos");
        }

        imput.close();
    }
}
