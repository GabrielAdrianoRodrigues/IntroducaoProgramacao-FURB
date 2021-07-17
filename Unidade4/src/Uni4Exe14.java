import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Insira o dia:");
        int dia = imput.nextInt();
        System.out.println("Insira o mes:");
        int mes = imput.nextInt();
        System.out.println("Insira o ano:");
        int ano = imput.nextInt();

        if (ano % 4 == 0 && mes == 2 && 0 < dia && dia <= 29 || ano > 0 && mes == 2 && dia > 0 && dia <= 28
                || mes > 0 && mes <= 12 && 0 < ano && dia > 0 && dia <= 31 && mes != 2 && mes != 4 && mes != 6
                        && mes != 9 && mes != 11
                || mes > 0 && mes <= 12 && 0 < ano && dia > 0 && dia <= 30 && mes != 1 && mes != 2 && mes != 3
                        && mes != 5 && mes != 7 && mes != 8 && mes != 12) {
            System.out.println("É uma data valida");
        } else {
            System.out.println("Não e uma data valida");
        }
        imput.close();
    }
}