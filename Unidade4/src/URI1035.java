import java.util.Scanner;

class URI1035 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);

        int A = imput.nextInt();
        int B = imput.nextInt();
        int C = imput.nextInt();
        int D = imput.nextInt();
        
        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        imput.close();
    }
}