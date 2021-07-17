import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {
        new Uni6Exe04();
    }

    private Uni6Exe04() {
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetorSoma[] = new int[10];
        metLer(vetor1, vetor2);
        vetorSoma(vetor1, vetor2, vetorSoma);
        vetorLer(vetorSoma);
    }

    private void metLer(int vetor1[], int vetor2[]) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Informe 3 valores do primeiro vetor partindo do vetor[0]");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Informe o elemento " + (i + 1) + " vetor[" + i + "]: ");
            vetor1[i] = imput.nextInt();
        }
        System.out.println("Informe 3 valores do primeiro vetor partindo do vetor[0]");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Informe o elemento " + (i + 1) + " vetor[" + i + "]: ");
            vetor2[i] = imput.nextInt();
        }
        imput.close();
    }

    private void vetorSoma(int vetor1[], int vetor2[], int vetorSoma[]) {
        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
    }

    private void vetorLer(int vetorSoma[]) {
        System.out.println("Valores da soma dos vetores");
        for (int i = 0; i < vetorSoma.length; i++) {
            System.out.println("vetor[" + i + "]: " + vetorSoma[i]);
        }
    }
}
