import java.util.Scanner;

public class Uni6Exe03 {
  public static void main(String[] args) {
    new Uni6Exe03();
  }

  private Uni6Exe03() {
    double vetor[] = new double[12];
    metLer(vetor);
    metAjus(vetor);
    vetorLer(vetor);
  }

  private void metLer(double vetor[]) {
    Scanner imput = new Scanner(System.in);
    System.out.println("Informe o valor de 12 vetores partindo do numero 0");
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Informe o elemento " + (i + 1) + " vetor[" + i + "]: ");
      vetor[i] = imput.nextDouble();
    }

    imput.close();
  }

  private void metAjus(double vetor[]) {
    for (int i = 0; i < vetor.length; i++) {
      if ((vetor[i] % 2) == 0) {
        vetor[i] = vetor[i] + ((vetor[i] * 2.0) / 100);
      } else {
        vetor[i] = vetor[i] + ((vetor[i] * 5.0) / 100);
      }
    }
  }

  private void vetorLer(double vetor[]) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("vetor[" + i + "]: " + vetor[i]);
    }
  }
}
