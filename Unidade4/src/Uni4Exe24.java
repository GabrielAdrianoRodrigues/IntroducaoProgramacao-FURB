import java.util.Scanner;

public class Uni4Exe24 {  
  public static void main(String args[]) {
    Scanner imput = new Scanner(System.in);
 
    System.out.println("Menu de opções");
    System.out.println("1 = escreve os 3 valores em ordem crescente");
    System.out.println("2 = escreve os 3 valores em ordem decrescente");
    System.out.println("3 = escreve os 3 valores de forma que o maior valor fique no meio");
    System.out.println("Insíra qual ação deseja executar");
    int acao = imput.nextInt();
   
  switch(acao) {
    case 1 :
      System.out.println("Insíra os valores");
      int valor1 = imput.nextInt();
      int valor2 = imput.nextInt();
      int valor3 = imput.nextInt();
      if (valor1>valor2&&valor1>valor3&&valor2>valor3){
        System.out.println(valor1+" "+valor2+" "+valor3);
      } else  if (valor2>valor1&&valor2>valor1&&valor3>valor1){
        System.out.println(valor2+" "+valor3+" "+valor1);
      } else  if (valor3>valor1&&valor3>valor2&&valor2>valor1){
        System.out.println(valor3+" "+valor2+" "+valor1);
      } else  if (valor1>valor2&&valor1>valor3&&valor3>valor1){
        System.out.println(valor1+" "+valor3+" "+valor2);
      } else  if (valor2>valor1&&valor2>valor3&&valor1>valor3){
        System.out.println(valor2+" "+valor1+" "+(valor3));
      } else  if (valor3>valor2&&valor3>valor1&&valor1>valor2){
        System.out.println(valor1+" "+valor2+" "+(valor3));
      }  
      break;
    case 2 :
       System.out.println("Insíra os 3 valores");
       int valor4 = imput.nextInt();
       int valor5 = imput.nextInt();
       int valor6 = imput.nextInt();      
       if (valor4<valor5&&valor4<valor6&&valor5<valor6){
         System.out.println(valor4+" "+valor5+" "+valor6);
       } else if (valor4<valor5&&valor4<valor6&&valor6<valor5) {
        System.out.println(valor4+" "+valor6+" "+valor5);
       } else if (valor5<valor4&&valor5<valor6&&valor4<valor6) {
        System.out.println(valor5+" "+valor6+" "+valor4);
       } else if (valor5<valor4&&valor5<valor6&&valor4<valor5) {
        System.out.println(valor5+" "+valor4+" "+valor6);
       } else if (valor6<valor5&&valor6<valor4&&valor5<valor6) {
        System.out.println(valor6+" "+valor4+" "+valor5);
       } else if (valor6<valor5&&valor6<valor4&&valor4<valor5) {
        System.out.println(valor6+" "+valor5+" "+valor4);
       }              
       break;
    case 3 :
       System.out.println("Insíra os valores desejádos");
       int valor7 = imput.nextInt();
       int valor8 = imput.nextInt();
       int valor9 = imput.nextInt();
       if (valor7>valor8&&valor7>valor9) {
         System.out.println(valor9+" "+valor7+" "+valor8);
       } else if (valor8>valor7&&valor8>valor9) {
         System.out.println(valor9+" "+valor8+" "+valor7);
       } else if (valor9>valor7&&valor9>valor8) {
         System.out.println(valor7+" "+valor9+" "+valor8);
       }  
      break;
      default :
       System.out.println("Ação inexistente");
      }
     
    imput.close();  
  }
}