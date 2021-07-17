import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
         
        System.out.println("Informe a idade de Marquinho");
        int idade1 = imput.nextInt();
        System.out.println("Informe a idade de Zezinho");
        int idade2 = imput.nextInt();
        System.out.println("Informe a idade de Luluzinha");
        int idade3 = imput.nextInt();
    
        if (idade1 < idade2 && idade1 < idade3) {
            System.out.println("Marquinhos é o caçula");
        } else if (idade2 < idade1 && idade2 < idade3){
            System.out.println("Zezinho é o caçula");
        } else if (idade3 < idade1 && idade3 < idade1 ) {
            System.out.println("Luluzinha é a caçula");
        }

      imput.close();
    }
}
