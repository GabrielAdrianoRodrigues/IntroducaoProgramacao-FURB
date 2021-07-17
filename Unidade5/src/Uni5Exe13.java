import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int qtdParadas;
        double valorODO, qtdEnchido, inicialODO, totalKm, totalEnchido ,
        autonomiaMedia , autonomiaPorParada;

        System.out.println("Qual e a quantia inicial do Odômetro:");
        inicialODO = imput.nextDouble();
        System.out.println("Quantas paradas foram relizadas");
        qtdParadas = imput.nextInt();
        totalKm = 0;
        totalEnchido = 0;
        autonomiaMedia = 0;
        autonomiaPorParada = 0;
        

        for (int i = 1; i <= qtdParadas; i++) {
            System.out.println("Valor atual do Odômetro");
            valorODO = imput.nextDouble();
            System.out.println("Quantos litros foram necessarios para encher o tanque:");
            qtdEnchido = imput.nextDouble();
            for (int j = 1; j <= qtdParadas; j++) {
                totalKm = totalKm + (valorODO - inicialODO);
                totalEnchido = totalEnchido + qtdEnchido;
                autonomiaMedia = totalKm / totalEnchido;
            }
            autonomiaPorParada = (valorODO - inicialODO) / qtdEnchido;
            System.out.println("A autonomia até está parada foi de: "+ autonomiaPorParada +" Km/L");
            inicialODO = valorODO;
        }
        System.out.println("A autonomia média foi de: "+ autonomiaMedia + " Km/L");
        imput.close();
    }
}