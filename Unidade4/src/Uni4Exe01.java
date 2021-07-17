import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com as horas trabalhadas no mês: ");
        int horasMes = teclado.nextInt();
        
        System.out.println("Entre com o valor pago por hora: ");
        float valorHora = teclado.nextInt();
        float salarioTotal = horasMes * valorHora;
        
        if (horasMes > 160) { 
            float salarioExtra = (horasMes - 160) * (valorHora / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }
        System.out.println("O salário total é: " + salarioTotal);
        teclado.close();
    }
}