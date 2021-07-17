import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int p = 0;
        int n = 0;
        boolean v = true;
        String esp = "";

        while (v){
            System.out.println("Qual o dia da semana que começa o mês: ");
            p = imput.nextInt();
            if (p >= 1 && p <= 7){
                while (n <= 28 || n >= 32){
                    System.out.println("Quantos dias o mês possui?");
                    n = imput.nextInt();
                    if (n <= 28 && n >= 32){
                        System.out.println("Valor inválido");        
                    }
                }
                System.out.println(" D  S  T  Q  Q  S  S");
                for (int count0 = 1; count0 < p; count0++){
                    esp = esp+"   ";
                }
                for (int count = 1; count <= n; count++){
                    if(count < 10){
                    if (p <= 7){
                        esp = esp+" " + count + " ";
                        p++;
                    } else {
                        esp = esp + "\n";
                        p = 1;
                        count--;
                    }
                } else {
                    if (p <= 7){
                        esp = esp+ count + " ";
                        p++;
                    } else {
                        esp = esp + "\n";
                        p = 1;
                        count--;
                    }
                }
                }
                v = false;
            } else {
                System.out.println("Valor inválido");
            }
        }
        System.out.println(esp);
        imput.close();
    }
}
