import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);

        int resp = 0;
        int dias = 0;
        float diaria = 0;
        int enc = 0;
        String nome = "";



        do {
            System.out.println("Deseja qual opção:\n(1)Encerrar a conta de um hóspede\n(2)Verificar número de contas encerradas\n(3)Sair");
            resp = imput.nextInt();

            switch(resp){
                case 1:
                    System.out.println("Qual o nome do hóspede?");
                    nome = imput.next();
                    System.out.println("Quantos dias o hóspede ficou no hotel?");
                    dias = imput.nextInt();
                    if (dias > 15){
                        diaria = 50f + (5*dias);
                    } else if (dias == 15){
                        diaria = 50f + (6.5f*dias);
                    } else {
                        diaria = 50f + (7.5f * dias);
                    }
                    System.out.println("O/A "+nome+" ficou "+dias+" dias e tera que pagar: R$"+diaria);
                    enc++;
                    break;
                case 2:
                    System.out.println("Total de contas encerradas: "+enc);
                    break;
                default: break;
            }

        } while(resp != 3);
        imput.close();
    }
}
