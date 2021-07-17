import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        double limite , pesoPx;

        System.out.println("deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
        char resposta = imput.next().charAt(0);
        resposta = Character.toUpperCase(resposta);

        switch (resposta) {
            case 'S':
                System.out.println("Informe o limite diário em Kg:");
                limite = imput.nextDouble();
                pesoPx = 0;
                int cont = 0;
                    while (limite > 0) {
                        System.out.println("Informe o peso do peixe em gramas:");
                        cont++;
                        pesoPx = imput.nextDouble();
                        pesoPx = pesoPx / 1000;
                        limite =  limite - pesoPx;
                    }
                System.out.println("Foram obtidos: "+cont+" peixes");
              break;
                    
            case 'N':
                System.out.println("Informe o limite diário em Kg:");
                limite = imput.nextDouble();
                pesoPx = imput.nextDouble();
                System.out.println(" limite diário:"+limite+"Kg\n o peixe pesa: "+(pesoPx/1000)+"Kg\n ainda faltam: "
                +(limite-(pesoPx/1000))+" Kg");
              break;
            
            default :
                System.out.println("Resposta Inválida");
        }
      System.out.println("Fim");
      imput.close();
    }
}
