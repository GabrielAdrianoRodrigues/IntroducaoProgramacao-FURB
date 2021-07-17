import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        String prod;
        double pc, pv, percLucro;
        double pctotal = 0;
        double pvtotal = 0;
        double totalLucro = 0;
        int lucro1 = 0;
        int lucro2 = 0;
        int lucro3 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Nome do Produto:");
            prod = imput.next();
            System.out.println("Preço de compra:");
            pc = imput.nextDouble();
            System.out.println("Preço de venda:");
            pv = imput.nextDouble();
            percLucro = (pv - pc) / pc * 100;
            if (percLucro < 10) {
                lucro1++;
            }
            if (10 <= percLucro && percLucro <= 20) {
                lucro2++;
            }
            if (percLucro > 20) {
                lucro3++;
            }
            for (int j = 1; j <= 20; j++) {
                pctotal = pctotal + pc;
                pvtotal = pvtotal + pv;
                totalLucro = (pvtotal - pctotal) / pctotal * 100;
            }
        }
        System.out.println("Quantia de produtos com menos de 10% de lucro: "+lucro1);
        System.out.println("Quantia de produtos entre 10%  e 20% de lucro: "+lucro2);
        System.out.println("Quantia de produtos com mais de 20% de lucro: "+lucro3);
        System.out.println("Valor total do preço de compra: R$ "+pctotal);
        System.out.println("Valor total do preço de venda: R$ "+pvtotal);
        System.out.println("Valor total d0 % de lucro: "+totalLucro+" %");
        imput.close();
    }
}
