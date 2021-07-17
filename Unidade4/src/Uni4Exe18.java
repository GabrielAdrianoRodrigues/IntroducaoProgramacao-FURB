import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe18 {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("Informe o dia atual:");
        int diaDoPagamento = imput.nextInt();
        System.out.println("Informe o dia do vencimento sendo que a data maxima seria ao 10 dia do mês:");
        int diaDoVencimento = imput.nextInt();
        System.out.println("Informe o valor da prestação:");
        double valorDaPrestacao = imput.nextDouble();
        int ate5dias = diaDoVencimento + 5;
        boolean maisque5 = diaDoPagamento > ate5dias;

        if (diaDoPagamento <= diaDoVencimento && diaDoPagamento != 0 && diaDoPagamento < 31 && diaDoVencimento < 0
                && diaDoVencimento > 10) {
            double valorDoDesconto = (valorDaPrestacao / 10.0) * 100;
            valorDaPrestacao = valorDaPrestacao - valorDoDesconto;
            System.out.println("valor à ser pago: R$ " + format.format(valorDaPrestacao));
            System.out.println("Deseja pagar a prestação com 10% de desconto?");
            String con = imput.next();

            if (con == "sim") {
                System.out.println("O pagamento foi efetuado e está em dia.");
            } else if (con == "nao") {
                System.out.println("Aguardamos até seu retorno.");
            }
        } else if (diaDoPagamento > diaDoVencimento && diaDoPagamento <= ate5dias && diaDoPagamento != 0
                && diaDoPagamento < 31 && diaDoVencimento < 0 && diaDoVencimento > 10) {
            System.out.println("valor à ser pago: R$ " + format.format(valorDaPrestacao));
            System.out.println("Deseja pagar a prestação");
            String conf = imput.next();

            if (conf == "sim") {
                System.out.println("O pagamento está em dia.");
            } else if (conf == "nao") {
                System.out.println("Aguardamos seu retorno.");
            } else if (diaDoPagamento > diaDoVencimento && maisque5 == true && diaDoPagamento != 0
                    && diaDoPagamento < 31 && diaDoVencimento > 0 && diaDoVencimento > 10) {
                int diasDeAtraso = diaDoPagamento - (diaDoVencimento + 5);
                double valorDaMulta = ((valorDaPrestacao / 2.0) * 100) * diasDeAtraso;
                valorDaPrestacao = valorDaPrestacao + valorDaMulta;
                System.out.println(
                        "Fora da data limite será acrescentado 2% por dia de atraso então o valor à ser pago é de: R$ "
                                + format.format(valorDaPrestacao));
                String confir = imput.next();

                if (confir == "sim") {
                    System.out.println("O pagamento está em dia.");
                } else if (confir == "nao") {
                    System.out.println("Aguardamos seu retorno.");
                } else {
                    System.out.println("Informações erradas.");
                }

                imput.close();
            }
        }
    }
}