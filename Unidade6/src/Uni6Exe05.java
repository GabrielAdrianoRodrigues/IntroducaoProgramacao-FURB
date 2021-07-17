import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        new Uni6Exe05();
    }

    private Uni6Exe05() {
        String vetorM[] = new String[5];
        String vetorF[] = new String[5];
        metLer(vetorM, vetorF);
        calc(vetorM, vetorF);
    }

    private void metLer(String vetorM[], String vetorF[]) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Responda com sim , nao ou ind(Indiferente)");
        System.out.println("1-Gosta de música sertaneja?" + "\n2-Gosta de futebol?" + "\n3-Gosta de seriados?"
                + "\n4-Gosta de redes sociais?" + "\n5-Gosta da Oktoberfest?");
        System.out.println("Respostas da moça");
        for (int i = 0; i < vetorF.length; i++) {
            System.out.println("Responda a questão " + (i + 1));
            vetorF[i] = imput.next();
        }
        System.out.println("Respostas do rapaz");
        for (int i = 0; i < vetorM.length; i++) {
            System.out.println("Responda a questão " + (i + 1));
            vetorM[i] = imput.next();
        }
        imput.close();
    }

    private void calc(String vetorM[], String vetorF[]) {
        int pontos = 0;
        for (int i = 0; i < 5; i++) {
            if (vetorF[i].equals("sim") && vetorM[i].equals("sim")) {
                pontos = pontos + 3;
            } else if (vetorF[i].equals("nao") && vetorM[i].equals("sim")
                    || vetorF[i].equals("sim") && vetorM[i].equals("nao")) {
                pontos = pontos - 2;
            } else if (vetorF[i].equals("ind") || vetorM[i].equals("ind")) {
                pontos = pontos + 1;
            }
        }
        if (pontos == 15) {
            System.out.println("Casem!");
        } else if (pontos <= 14 && pontos >= 10) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (pontos <= 9 && pontos >= 5) {
            System.out.println("Talvez não dê certo :(");
        } else if (pontos <= 4 && pontos >= 0) {
            System.out.println("Vale um encontro.");
        } else if (pontos <= -1 && pontos >= -9) {
            System.out.println("Melhor não perder tempo");
        } else if (pontos == -10) {
            System.out.println("Vocês se odeiam!");
        }
    }
}
