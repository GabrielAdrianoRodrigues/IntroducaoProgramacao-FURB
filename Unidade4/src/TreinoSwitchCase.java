import java.util.Scanner;

class TreinoSwitchCase {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Insira à primeira letra do seu sexo:");
        char sexo = imput.next().charAt(0);
        sexo = Character.toUpperCase(sexo);

        int contF = 0;
        int contM = 0;
        int contI = 0;

        switch (sexo) {
        case 'F':
            contF++;
            break;
        case 'M':
            contM++;
            break;
        default:
            contI++;
        }

        System.out.println("Quantia de pessoas com sexo Feminino " + contF);
        System.out.println("Quantia de pessoas com sexo Masculino " + contM);
        System.out.println("Quantia de pessoas com sexo Não Identificado " + contI);

        imput.close();
    }
}