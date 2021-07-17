import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int contD , contE;

        System.out.println("Informe os quem marcou o ponto:");
        char pontos = imput.next().charAt(0);
        pontos = Character.toUpperCase(pontos);
        contD = 0;
        contE = 0;

        while (contD < 5 || contE < 5 && (contD%contE) < 2 || (contE%contD) < 2 ) {
            switch (pontos) {
                case 'E' :
                    contE++;
                  break;
                
                case 'D' :
                    contD++;
                  break;
                default :
                  break;
            }
            System.out.println("Informe os quem marcou o ponto:");
            pontos = imput.next().charAt(0);
            pontos = Character.toUpperCase(pontos);
        }
        imput.close();
    }
}
