import java.util.Scanner;

public class Uni4Exe13 {  
  public static void main(String args[]) {
    Scanner imput = new Scanner(System.in);

   System.out.println("Gostaria de observar a tabela de cartas?sim/nao");
    String resposta = imput.next();
   
    if (resposta == "sim") {
      System.out.println("1 = as");
      System.out.println("11 = valete");
      System.out.println("12 = rainha");
      System.out.println("13 rei");
      System.out.println("as outras cartas correspondem aos seus respectivos numeros");
    } else if (resposta == "nao"){
      System.out.println("Entendido");
    } else {
      System.out.println("Resposta inválida");
    }

    System.out.println("Insíra a primeira carta");
    int carta1 = imput.nextInt();
    System.out.println("Insíra a segunda carta");
    int carta2 = imput.nextInt();
    System.out.println("Insíra a terceira carta");
    int carta3 = imput.nextInt();
    int quantiaDeCartasBoas = 0;
   
   if(carta1 == 1 || carta1 == 2 || carta1 == 3) {
     quantiaDeCartasBoas++;
   }
   if(carta2 == 1 || carta2 == 2 || carta2 == 3) {
     quantiaDeCartasBoas++;
   }
  if(carta3 == 1 || carta3 == 2 || carta3 == 3) {
     quantiaDeCartasBoas++;
   }

   if (quantiaDeCartasBoas == 1) {
     System.out.println("TRUCO");
   } else  if (quantiaDeCartasBoas == 2) {
     System.out.println("SEIS");
   } else if (quantiaDeCartasBoas == 3) {
     System.out.println("NOVE");
   }
     
    imput.close();  
  }
}