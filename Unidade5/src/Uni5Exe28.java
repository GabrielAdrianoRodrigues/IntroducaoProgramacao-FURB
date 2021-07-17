import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int voto, contN, contCPM, contSk, contJ, contT;
        char resp;

        contN = 0;
        contCPM = 0;
        contSk = 0;
        contJ = 0;
        contT = 0;
        resp = 's';

        System.out.println("Código" + " Conjunto" + "\n 1 " + "    Nenhum de nós" + "\n 2 " + "    CPM22" + "\n 3 "
                + "    Skank" + "\n 3 " + "    JotaQuest");
        System.out.println("Informe seu voto:");
        voto = imput.nextInt();

        while (resp != 'N') {
            contT++;
            switch (voto) {
                case 1:
                    contN++;
                    break;
                case 2:
                    contCPM++;
                    break;
                case 3:
                    System.out.println("Voce deseja votar em qual das 2 banda j(Jota Quest) ou s(Skank)");
                    char voto3 = imput.next().charAt(0);
                    voto3 = Character.toUpperCase(voto3);
                    switch (voto3) {
                        case 'J':
                            contJ++;
                            break;
                        case 'S':
                            contSk++;
                        default:
                            System.out.println("Banda fora de catálago o voto irá para as 2");
                            contJ++;
                            contSk++;
                            break;
                    }
            }
            System.out.println("mais um voto: s (SIM) / n (NÃO)?");
            resp = imput.next().charAt(0);
            resp = Character.toUpperCase(resp);
            switch (resp) {
                case 'S':
                    resp = 'S';
                    break;
                case 'N':
                    resp = 'N';
                    break;
                default:
                    System.out.println("Esta banda nao existe no catálogo reensira a o voto;");
                    voto = imput.nextInt();
                    break;
            }
            if (resp != 'N') {
                System.out.println("Digíte seu voto:");
                voto = imput.nextInt();
            }
        }
        if (contCPM > contJ && contCPM > contSk) {
            System.out.println("A banda campeã foi o CPM22 ");
        } else if (contJ > contCPM && contJ > contSk) {
            System.out.println("A banda campeã foi o JotaQuest ");
        } else if (contSk > contCPM && contSk > contJ) {
            System.out.println("A banda campeã foi o Skank ");
        }
        System.out.println("No total " + contT + " pessoas votaram " + contN + " Sendo delas não votaram em ninguém");
        System.out.println("O percentural de voto para cada banda foi: " + "\nCPM22: " +((contCPM/(contN+contSk+contJ+contCPM))*100)
                + " %" + "\nSkank: " +((contSk/(contN+contSk+contJ+contCPM))*100) + " %" + "\nJotaQuest: " +((contJ/(contN+contSk+contJ+contCPM))*100)
                + " %" + "\nVotos Nulos: " +((contN/(contN+contSk+contJ+contCPM))*100)+ " %");
        imput.close();
    }
}
