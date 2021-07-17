import java.util.Scanner;

public class Uni6Exe06 {       
    public static void main(String[] args) throws Exception {
        new Uni6Exe06();
    }
    private Uni6Exe06() {
        Scanner imput = new Scanner(System.in);
        System.out.println("Informe o tamanho de vetor:");
        int vetorQtd = imput.nextInt();
        double vetor[] = new double[vetorQtd];
        vetorLer(vetor , imput);
        boolean achou = vetorPesquisa(vetor, imput);
        if (achou) {
            System.out.println("Encontrou");
        }
        imput.close();
    }

    private void vetorLer(double vetor[] , Scanner imput){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor ["+i+"]: ");
            vetor[i] = imput.nextDouble();
        }    
    }
    private boolean vetorPesquisa(double vetor[] , Scanner imput) {
        System.out.println("Informe o valor a ser pesquisado:");
        double valorPesquisa = imput.nextDouble();
        for (int i = 0; i < vetor.length; i++) {
            if (valorPesquisa == vetor[i]) {
                return true;
            }
        }    
        return false;
    }
}
