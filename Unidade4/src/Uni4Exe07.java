import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");
        
        System.out.println("Insíra o peso da carta em gramas:");
        double PesoDaCarta = imput.nextDouble();

        if (PesoDaCarta <= 50) {
            System.out.println("O selo custara  R$ 0,45");
        } else if (PesoDaCarta > 50) {
            PesoDaCarta = ((((PesoDaCarta - 50) / 20) * 0.45)+ 0.45);            
            System.out.println("O selo custara R$ " + format.format(PesoDaCarta));
        }

        imput.close();
    }
}