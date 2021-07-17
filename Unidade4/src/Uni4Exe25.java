import java.util.Scanner;

public class Uni4Exe25 {  
  public static void main(String args[]) {
    Scanner imput = new Scanner(System.in);

    System.out.println("Calculadoras disponíveis:");
    System.out.println("1 - Soma de dois números");  
    System.out.println("2 - Diferença entre dois números");
    System.out.println("3 - Produto entre dois números");
    System.out.println("4 - Divisão entre dois números");
    System.out.println("Insíra um numero de 1 à 4 para acessar uma calculadora");
    int numero = imput.nextInt();

    switch (numero){
      case 1 :
        System.out.println("Calculadora de soma");
        System.out.println("Insíra o primeiro valor da soma");
        int soma1 = imput.nextInt();        
        System.out.println("Insíra o segundo valor da soma");
        int soma2 = imput.nextInt();
        int somafinal = soma1+soma2;
        System.out.println("Resultado da soma = "+ somafinal);
        break;
      case 2 :
        System.out.println("Calculadora de Diferença");
        System.out.println("Insíra o primeiro valor da Diferença");
        int diferenca1 = imput.nextInt();        
        System.out.println("Insíra o segundo valor da soma");
        int diferenca2 = imput.nextInt();
        int diferencafinal = diferenca1-diferenca2;
        System.out.println("Resultado da diferença = "+ diferencafinal);
        break;    
      case 3 :
        System.out.println("Calculadora de produto");
        System.out.println("Insíra o primeiro valor do produto");
        int produto1 = imput.nextInt();        
        System.out.println("Insíra o segundo valor do produto");
        int produto2 = imput.nextInt();
        int produtofinal = produto1*produto2;
        System.out.println("Resultado da diferença = "+ produtofinal);
        break;
      case 4 :  
        System.out.println("Calculadora de divisão");
        System.out.println("O denominador não pode ser zero");
        System.out.println("Insíra o primeiro valor da divisão");
        int divisao1 = imput.nextInt();        
        System.out.println("Insíra o denominador da divisão");
        int divisao2 = imput.nextInt();
        if (divisao2 != 0) {
        int divisaofinal = divisao1/divisao2;
        System.out.println("Resultado da divisão = "+ divisaofinal);
        } else {
          System.out.println("Impossível efetuar à divisão");
        }
        break;
        default :
        System.out.println("Função não existente");      
    }
   
    imput.close();  
  }
}