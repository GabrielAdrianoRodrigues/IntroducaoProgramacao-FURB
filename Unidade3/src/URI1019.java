import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int totalsegundos = teclado.nextInt();
        int qtdhoras = totalsegundos / 3600;
        totalsegundos = totalsegundos % 3600;
        int minutos = totalsegundos / 60;
        int segundos = totalsegundos % 60;

        System.out.println(qtdhoras + ":" + minutos + ":" + segundos);

        teclado.close();

    }
}
