import java.util.Scanner;
import java.lang.Math;

public class Uni4Exe26 {  
  public static void main(String args[]) {
    Scanner imput = new Scanner(System.in);

    System.out.println("Calculadoras disponíveis:");
    System.out.println("T - para calcular a área de um triângulo");  
    System.out.println("Q - calcular a área de um quadrado");
    System.out.println("R - calcular a área de um retângulo");
    System.out.println("C - calcular a área de um círculo");
    System.out.println("Insíra uma letra para acessar uma calculadora");
    char letra = imput.next().charAt(0);
    letra = Character.toUpperCase(letra);

    switch (letra){
      case 'T' :
        System.out.println("Calculadora de área de um triângulo");
        System.out.println("Insíra o valor da base do triângulo");
        int baset = imput.nextInt();        
        System.out.println("Insíra o da altura do triângulo");
        int alturat = imput.nextInt();
        int areat = (baset*alturat)/2;
        System.out.println("área do triângulo = "+ areat);
        break;
      case 'Q' :
        System.out.println("Calculadora de área de um quadrado");
        System.out.println("Insíra o valor de um lado do quadrado");
        int lado = imput.nextInt();        
        double areaq = Math.pow(lado,2);
        System.out.println("área do quadrado = "+ areaq);
        break;    
      case 'R' :
        System.out.println("Calculadora de área de um retângulo");
        System.out.println("Insíra o valor da base do retângulo");
        int baser = imput.nextInt();        
        System.out.println("Insíra o da altura do retângulo");
        int alturar = imput.nextInt();
        int arear = baser*alturar;
        System.out.println("área do retângulo = "+ arear);
        break;
      case 'C' :  
        System.out.println("Calculadora de área de um círculo");
        System.out.println("Insíra o raio do círculo");
        double raio = imput.nextInt();        
        double pi = 3.14159;
        double areac = pi*(Math.pow(raio,2));
        System.out.println("área do círculo = "+ areac);
        break;
        default :
        System.out.println("Função não existente");      
    }
   
    imput.close();  
  }
}
    

