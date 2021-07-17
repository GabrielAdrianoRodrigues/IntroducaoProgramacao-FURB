import java.util.Scanner;
import java.text.DecimalFormat;

class Uni03exe12 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("Insira a quantia de horas trabalhadas:");
        int QtdDeHoras = imput.nextInt() * 10;
        System.out.println("Insira a quantia de dependentes:");
        int QtdDeDependentes = imput.nextInt() * 60;
        int salario = QtdDeHoras + QtdDeDependentes;
        double descontos = (salario * 8.5 / 100) + (salario * 5 / 100);
        double liquido = salario - descontos;

        System.out.println("Sálario Bruto: R$ " + format.format(salario));
        System.out.println("Sálario Liquido: R$ " + format.format(liquido));
        imput.close();
    }
}