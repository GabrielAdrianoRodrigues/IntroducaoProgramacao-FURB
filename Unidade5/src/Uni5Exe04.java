public class Uni5Exe04 {
    public static void main(String[] args) {

        double soma = 0;
        double numerador = 3;
        double denominador = 2;
        double acrescimo = 4;

        for (int cont = 1; cont <= 20; cont++) {
            soma = soma + numerador / denominador;
            numerador += 2;
            denominador = denominador + acrescimo;
            acrescimo += 2;
        }
        System.out.println("O resultado da soma é: " + soma);
    }
}
