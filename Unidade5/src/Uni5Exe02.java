public class Uni5Exe02 {
    public static void main(String[] args) {

        int numerosPares = 0;
        int numeroImpares = 0;

        for (int cont = 1; cont <= 100; cont++) {
            if ((cont % 2) == 0) {
                numerosPares = numerosPares + cont;
            } else {
                numeroImpares = numeroImpares + cont;
            }
        }
        System.out.println("A soma dos pares resultam em: " + numerosPares);
        System.out.println("A soma dos ímpares resultam em: " + numeroImpares);
    }
}
