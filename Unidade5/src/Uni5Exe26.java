import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        
        int valorMax , distancia , contN , contD , contT;
        float valor;
        contD = 0;
        contN = 0;
        contT = 0;

        System.out.println("Qual o valor maximo que Afonso deseja pagar?");
        valorMax = imput.nextInt();
        System.out.println("Informe o valor do pedágio:");
        valor = imput.nextFloat();
        System.out.println("Informe a distância em Km do trecho:");
        distancia = imput.nextInt();

        while (valor > 0) {
            if (valor > valorMax) {
                contN++;
            }
            if (distancia > 150 && valor < valorMax) {
                contD++;
            }
           contT++;
           System.out.println("Informe o valor do pedágio ou um numero negativo para encerrar:");
           valor = imput.nextFloat();
           if (valor > 0) {
           System.out.println("Informe a distância em Km do trecho:");
           distancia = imput.nextInt();
           }
        }
        System.out.println("Total de pedágios com valor negado: "+contN+
        "\nQuantos excedem a distância de 150km: "+contD+
        "\nQuantos pedágios foram registrados: "+contT);
        imput.close();
    }
}
