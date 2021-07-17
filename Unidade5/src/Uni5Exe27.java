import java.util.Scanner;

public class Uni5Exe27 {
   public static void main(String[] args) {
      Scanner imput = new Scanner(System.in);

      int dia, totalMat, totalTar, TotalMax, func, diaMax, totalP;
      double salario;
      diaMax = 0;
      totalMat = 0;
      totalTar = 0;
      func = 0;
      totalP = 0;
      TotalMax = 0;
      salario = 0;

      System.out.println("Informe o dia do mês:");
      dia = imput.nextInt();

      if (dia > 0 && dia <= 30) {
         System.out.println("Qual foi a quantia de peças produzidas durante a manhã?");
         totalMat = imput.nextInt();
         System.out.println("Qual foi a quantia de peças produzidas durante a tarde?");
         totalTar = imput.nextInt();
         if (TotalMax == 0) {
            TotalMax = totalP;
            diaMax = dia;
         }
         if (dia > 0 && dia <= 15) {
            totalP = totalMat + totalTar;
            if (totalMat > 30 && totalTar > 30 && totalP > 100) {
               salario = totalP * 0.8;
               System.out.println("O Sálario desse funcionario será de: R$ " + salario);
               if (totalMat > totalTar) {
                  System.out.println("Este funcionario produzio mais no periodo da manhã: " + totalMat + " peças");
               } else {
                  System.out.println("Este funcionario produzio mais no periodo da tarde: " + totalTar + " peças");
               }
            } else {
               salario = totalP * 0.5;
               System.out.println("O Sálario desse funcionario será de: R$ " + salario);
               if (totalMat > totalTar) {
                  System.out.println("Este funcionario produzio mais no periodo da manhã: " + totalMat + " peças");
               } else {
                  System.out.println("Este funcionario produzio mais no periodo da tarde: " + totalTar + " peças");
               }
            }
         } else if (dia >= 16 && dia <= 30) {
            salario = salario + ((double) totalMat * 0.4) + ((double) totalTar * 0.3);
            System.out.println("O Sálario desse funcionario será de: R$ " + salario);
            if (totalMat > totalTar) {
               System.out.println("Este funcionario produzio mais no periodo da manhã: " + totalMat + " peças");
            } else {
               System.out.println("Este funcionario produzio mais no periodo da tarde: " + totalTar + " peças");
            }
         }
         System.out.println("Novo funcionário: (1.sim 2.não)?");
         func = imput.nextInt();
         switch (func) {
            case 1:
               func = 1;
               break;
            case 2:
               func = 2;
               break;
            default:
               System.out.println("informação errada o programa ira reiniciar.");
               break;
         }
      } else {
         System.out.println("Dia inválido");
      }

      while (func != 2) {
         if (func != 2) {
            System.out.println("Informe o dia do mês:");
            dia = imput.nextInt();

            if (dia > 0 && dia <= 30) {
               System.out.println("Qual foi a quantia de peças produzidas durante a manhã?");
               totalMat = imput.nextInt();
               System.out.println("Qual foi a quantia de peças produzidas durante a tarde?");
               totalTar = imput.nextInt();
               totalP = totalMat + totalTar;
               if (dia == diaMax) {
                  TotalMax = TotalMax + totalP;
               }
               if (TotalMax < totalP) {
                  TotalMax = totalP;
                  diaMax = dia;
               }
               if (dia > 0 && dia <= 15) {
                  totalP = totalMat + totalTar;
                  if (totalMat > 30 && totalTar > 30 && totalP > 100) {
                     salario = totalP * 0.8;
                     System.out.println("O Sálario desse funcionario será de: R$ " + salario);
                     if (totalMat > totalTar) {
                        System.out
                              .println("Este funcionario produzio mais no periodo da manhã: " + totalMat + " peças");
                     } else {
                        System.out
                              .println("Este funcionario produzio mais no periodo da tarde: " + totalTar + " peças");
                     }
                  } else {
                     salario = totalP * 0.5;
                     System.out.println("O Sálario desse funcionario será de: R$ " + salario);
                     if (totalMat > totalTar) {
                        System.out
                              .println("Este funcionario produzio mais no periodo da manhã: " + totalMat + " peças");
                     } else {
                        System.out
                              .println("Este funcionario produzio mais no periodo da tarde: " + totalTar + " peças");
                     }
                  }
               } else if (dia >= 16 && dia <= 30) {
                  salario = salario + ((double) totalMat * 0.4) + ((double) totalTar * 0.3);
                  System.out.println("O Sálario desse funcionario será de: R$ " + salario);
                  if (totalMat > totalTar) {
                     System.out.println("Este funcionario produzio mais no periodo da manhã: " + totalMat + " peças");
                  } else {
                     System.out.println("Este funcionario produzio mais no periodo da tarde: " + totalTar + " peças");
                  }

               }
               System.out.println("Novo funcionário: (1.sim 2.não)?");
               func = imput.nextInt();
               switch (func) {
                  case 1:
                     func = 1;
                     break;
                  case 2:
                     func = 2;
                     break;
                  default:
                     System.out.println("informação errada o programa ira reiniciar.");
                     break;
               }
            } else {
               System.out.println("Dia inválido");
            }
         }
      }
      System.out.println("O dia que foi produzido a maior quantia de peças: " + diaMax);
      imput.close();
   }
}