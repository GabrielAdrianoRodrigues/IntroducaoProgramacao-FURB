public class Uni5Exe03 {
    public static void main(String[] args) {

        double soma = 0;

        for (int cont = 1; cont < 100; cont++) {
            soma = soma + 1 / (double) cont;
        }
        System.out.println("A soma resulta em: " + soma);
    }
}
