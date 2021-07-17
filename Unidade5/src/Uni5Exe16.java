import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Informe seu sexo sendo:");
        System.out.println("f = Feminino");
        System.out.println("m = Masculino");
        char sexo = imput.next().charAt(0);
        sexo = Character.toUpperCase(sexo);
        int altura, contF, contM, mediaF, mediaM, alturaFTotal, alturaMTotal;
        contF = 0;
        contM = 0;
        alturaFTotal = 0;
        alturaMTotal = 0;
        mediaF = 0;
        mediaM = 0; 

        while (sexo != '0') {
            System.out.println("Informe à altura:");
            altura = imput.nextInt();
            switch (sexo) {
                case 'F':
                    contF++;
                    alturaFTotal = alturaFTotal + altura;
                    break;
                case 'M':
                    contM++;
                    alturaMTotal = alturaMTotal + altura;
                    break;
                default:
                    break;
            }
            System.out.println("Informe seu sexo");
            sexo = imput.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
        }
        if (contF > 0) {
        mediaF = alturaFTotal / contF;
        }
        if (contM > 0) {
        mediaM = alturaMTotal / contM;
        }
        System.out.println("Média da altura feminina do grupo: " + mediaF);
        System.out.println("Média da altura masculina do grupo: " + mediaM);
        imput.close();
    }
}
