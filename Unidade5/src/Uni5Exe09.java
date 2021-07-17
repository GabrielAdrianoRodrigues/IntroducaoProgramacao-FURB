import java.util.Scanner;

public class Uni5Exe09 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    String alunoNome;
    int alunoIdade;
    String alunoIdade18 = "Aluno c/ 18 anos: \n";
    int alunoQtdMaior20 = 0;

    System.out.println("Informe qtd. alunos: ");
    int alunoQtd = imput.nextInt();
    for (int alunoAtual = 1; alunoAtual <= alunoQtd; alunoAtual++) {
      System.out.println("Informe o nome: ");
      alunoNome = imput.next();
      System.out.println("Informe a idade: ");
      alunoIdade = imput.nextInt();
      if (alunoIdade == 18) {
        // System.out.println("   " + alunoNome + " tem 18 anos.");
        alunoIdade18 = alunoIdade18 + alunoNome + "\n";
      }
      if (alunoIdade > 20) {
        alunoQtdMaior20++;
      }
    }
    System.out.println(alunoIdade18);
    System.out.println("Qtd. alunos maior que 20 anos: " + alunoQtdMaior20);

    imput.close();
  }
}