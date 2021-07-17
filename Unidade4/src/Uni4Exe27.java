import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe27 {  
  public static void main(String args[]) {
    Scanner imput = new Scanner(System.in);
    DecimalFormat format = new DecimalFormat("0.00");

   System.out.println("Informe à hora de Chegada:");
   int horasChegada = imput.nextInt();
   int minutosChegada = imput.nextInt();
   System.out.println("Informe à hora de Saída:");
   int horasSaida = imput.nextInt();
   int minutosSaida = imput.nextInt();
   if (horasSaida < horasChegada) {
     horasSaida = horasSaida + 24;
   }
   int diferencaDeHoras = horasSaida - horasChegada;
   int diferencaDeMinutos = minutosSaida-minutosChegada;
   
    if (diferencaDeMinutos>30){
      diferencaDeHoras++;
    }
   switch (diferencaDeHoras) {
     case 0 :
       int valor0 = 5;
       System.out.println("Entrada: "+horasChegada+":"+minutosChegada+" Saída: "+horasSaida+":"+minutosSaida+" Valor à ser pago: R$ "+format.format(valor0));
       break;
     case 1 :
        int valor1 = diferencaDeHoras*5;
        System.out.println("Entrada: "+horasChegada+":"+minutosChegada+" Saída: "+horasSaida+":"+minutosSaida+" Valor à ser pago: R$ "+format.format(valor1));
       break;
     case 2 :
        int valor2 = diferencaDeHoras*5;
        System.out.println("Entrada: "+horasChegada+":"+minutosChegada+" Saída: "+horasSaida+":"+minutosSaida+" Valor à ser pago: R$ "+format.format(valor2));
       break;
     case 3 :
        double valor3 = diferencaDeHoras*7.50;
        System.out.println("Entrada: "+horasChegada+":"+minutosChegada+" Saída: "+horasSaida+":"+minutosSaida+" Valor à ser pago: R$ "+format.format(valor3));
       break;
     case 4 :
        double valor4 = diferencaDeHoras*7.50;
        System.out.println("Entrada: "+horasChegada+":"+minutosChegada+" Saída: "+horasSaida+":"+minutosSaida+" Valor à ser pago: R$ "+format.format(valor4));
        break;
     default :
      if (diferencaDeHoras>5||diferencaDeHoras==5){
      int valor5 = diferencaDeHoras*10;
        System.out.println("Entrada: "+horasChegada+":"+minutosChegada+" Saída: "+horasSaida+":"+minutosSaida+" Valor à ser pago: R$ "+format.format(valor5));
     }
   }
    imput.close();
  }
}