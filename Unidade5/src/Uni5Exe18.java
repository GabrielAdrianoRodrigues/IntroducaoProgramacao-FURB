import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int cont4 = 0;
        int cont5 = 0;
        int cont9 = 0;
        int cont12 = 0;

        System.out.println("Qual canal estava assistindo?");
        int canal = imput.nextInt();

        while (canal != 0) {
            switch (canal) {
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
                case 9:
                    cont9++;
                    break;
                case 12:
                    cont12++;
                    break;
                default:
                    break;
            }
            System.out.println("Qual canal estava assistindo?");
            canal = imput.nextInt();
        }
        System.out.println("A média do canal 4 foi de: " + ((cont4 * 100) / 4) + "%");
        System.out.println("A média do canal 5 foi de: " + ((cont5 * 100) / 4) + "%");
        System.out.println("A média do canal 9 foi de: " + ((cont9 * 100) / 4) + "%");
        System.out.println("A média do canal 12 foi de: " + ((cont12 * 100) / 4) + "%");
        imput.close();

    }

}
