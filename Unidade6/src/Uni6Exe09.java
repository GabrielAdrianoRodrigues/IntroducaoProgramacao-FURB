import java.util.Scanner;

public class Uni6Exe09 {
    
    private Uni6Exe09() {
        Scanner imput = new Scanner(System.in);
        int matriz[][] = new int[3][30];
        double media = 0;

        metRespostas(matriz, imput);
        media = Media(matriz);
        System.out.println("A média do cinema é de: "+media);
        MediaHomem(matriz);
        NotaMulherJovem(matriz);
        notaMediaMulheres50(matriz);
    }

    private void metRespostas(int matriz[][], Scanner imput) {
        for (int i = 0; i < 30; i++) {
            System.out.println("Qual o seu sexo\n1 - Feminino\n2 - Masculino\n");
            matriz[0][i] = imput.nextInt();
            System.out.println("Qual à sua nota para o cinema?");
            matriz[1][i] = imput.nextInt();
            System.out.println("Qual é a sua idade?");
            matriz[2][i] = imput.nextInt();
            System.out.println("\033[H\033[2J");
        }
        imput.close();
    }

    private double Media(int matriz[][]) {
        double media = 0;
        for (int i = 0; i < 30; i++) {
            media = media + matriz[1][i];
        }
        media /= 30.0;
        return media;
    }

    private void MediaHomem(int matriz[][]) {
        double mediaHomens = 0;
        double contHomens = 0;
        boolean naoExiste = true;
        for (int i = 0; i < 30; i++ ) {
            if (matriz[0][i] == 2 && naoExiste) {
                mediaHomens = mediaHomens + matriz[1][i];
                contHomens++;
                naoExiste = false;
            } else if  (matriz[0][i] == 2) {
            mediaHomens = mediaHomens + matriz[1][i];
            contHomens++;
           }
        }
        if (naoExiste) {
            System.out.println("Não houveram homens nesta pequisa.");
        } else {
        mediaHomens /= contHomens;
        System.out.println("A média das notas dos homens é de: " + mediaHomens);
        }
    }
    
    private void NotaMulherJovem(int matriz[][]) {
        int nota = 0;
        int idadeMulherMaisJovem = 0;
        boolean naoExiste = true;
        for (int i = 0; i < 30 ; i++) {
            if (matriz[0][i] == 1 && naoExiste) {
                idadeMulherMaisJovem = matriz[2][i];
                nota = matriz[1][i];
                naoExiste = false;
            } 
            if (matriz[0][i] == 1) {
                if (idadeMulherMaisJovem > matriz[2][i]) {
                    idadeMulherMaisJovem = matriz[2][i];
                    nota = matriz[1][i];
                }
            }
        }
        if (naoExiste) {
            System.out.println("Não houveram mulheres na pesquisa.");
        } else {
            System.out.println("A nota atríbuida pela mulher mais jovem é: "+nota);
        }
    }
    
    private void notaMediaMulheres50(int matriz[][]) {
        int contMulheres50 = 0;
        double mediaTotal = Media(matriz); 
        boolean naoExiste = true;
        for (int i = 0; i < 30; i++) {
            if (matriz[0][i] == 1 && matriz[2][i] > 50 && naoExiste && matriz[1][i] > mediaTotal) {
                contMulheres50++;
                naoExiste = false;
            } else if (matriz[0][i] == 1 && matriz[2][i] > 50 && matriz[1][i] > mediaTotal) {
                contMulheres50++;
            }
        }
        if (naoExiste) {
            System.out.println("Não existem mulheres com mais de 50 anos nesta pesquisa");
        } else {
            System.out.println("A quantidade de mulheres com mais de 50 anos que deram nota superior a média: "+contMulheres50);
        }
    }
    public static void main(String[] args) {
        new Uni6Exe09();
    }
}