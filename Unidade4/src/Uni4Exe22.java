import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);

        System.out.println(
                "Informe qual curso superior você está cursando sendo eles 1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação:");
        int curso = imput.nextInt();

        switch (curso) {
        case 1:
            System.out.println("O titulos será de Bacharel em Ciência da Computação");
            break;
        case 2:
            System.out.println("O titulos será de Licenciado em Computação");
            break;
        case 3:
            System.out.println("O titulos será de Bacharel em Sistemas de Informação");
            break;
        default:
            System.out.println("Valor informado não existente");
            break;
        }

        imput.close();
    }
}
