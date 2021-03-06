import java.util.Scanner;

public class Uni6Exe07 {

    private Uni6Exe07() {
        Scanner imput = new Scanner(System.in);
        int vetQtd;
        do {
            System.out.println("Informe qtd. vetor: ");
            vetQtd = imput.nextInt();
        } while (vetQtd < 1 || vetQtd > 20);

        int vet[] = new int[vetQtd];

        vetInserir(vet, imput);
        vetOrdenar(vet);
        vetImprimir(vet);

        imput.close();
    }

    private void vetInserir(int vet[], Scanner imput) {
        int valor = 0;
        System.out.println("Informe vet[" + 0 + "]:  ");
        valor = imput.nextInt();
        vet[0] = valor;
        int posFim = 1;

        while (posFim < vet.length) {
            System.out.println("Informe vet[" + posFim + "]:  ");
            valor = imput.nextInt();
            int j = 0;
            while (j < posFim) {
                if (valor == vet[j]) {
                    break;
                }
                j++;
            }
            if (j == posFim) { // inseriu
                vet[posFim] = valor;
                posFim++;
            }
        }
    }

    private void vetOrdenar(int vet[]) {
        int bolha;
        for (int i = 0; i < vet.length - 1; i++) {
            if (vet[i] > vet[i + 1]) {
                bolha = vet[i];
                vet[i] = vet[i + 1];
                vet[i + 1] = bolha;
                i = -1;
            }
        }
    }

    private void vetImprimir(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("vet[" + i + "]: " + vet[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe07();
    }

}