import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int qtdprodutos , qtdvendidos , valorProd , totalDeVendas , salarioVendedor;
        String nome , NameProd;

        totalDeVendas = 0;
        salarioVendedor = 0;

        System.out.println("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
        char resposta = imput.next().charAt(0);
        resposta = Character.toUpperCase(resposta);
        
        switch (resposta) {
            case 'S':
                System.out.println("Informe a quantia de funcionários:");
                int nFunc = imput.nextInt();
                    while (nFunc != 0) {
                        System.out.println("Informe o nome do funcionário:");
                        nome = imput.next();
                        System.out.println("Informe à quantia de produtos vendidos:");
                        qtdprodutos = imput.nextInt();
                            for (int i = 0 ; i < qtdprodutos ; i++) {
                                System.out.println("Informe o nome do produto:");
                                NameProd = imput.next();
                                System.out.println("Informe a quantidade vendida:");
                                qtdvendidos = imput.nextInt();
                                System.out.println("Informe o valor do produto:");
                                valorProd = imput.nextInt();
                                totalDeVendas = totalDeVendas + (qtdvendidos * valorProd);
                                salarioVendedor = salarioVendedor + (((qtdvendidos * valorProd) * 30) / 100);
                            }   
                        System.out.println(" Nome do vendedor: "+nome+
                        "\n Salário do vendedor R$ "+salarioVendedor+"\n Foram vendidos: "+qtdprodutos+" produtos diferentes");
                        salarioVendedor = 0;
                        nFunc--;  
                    }
                    System.out.println(" Total de vendas em reais: R$ "+totalDeVendas);
                break;
            
            case 'N': 
                System.out.println("Informe o nome do funcionário");
                nome = imput.next();
                System.out.println("Informe à quantia de produtos vendidos:");
                qtdprodutos = imput.nextInt();
                    for (int i = 0 ; i < qtdprodutos ; i++) {
                        System.out.println("Informe o nome do produto:");
                         NameProd = imput.next();
                        System.out.println("Informe a quantidade vendida:");
                        qtdvendidos = imput.nextInt();
                        System.out.println("Informe o valor do produto:");
                        valorProd = imput.nextInt();
                        totalDeVendas = totalDeVendas + (qtdvendidos * valorProd);
                        salarioVendedor = salarioVendedor + (((qtdvendidos * valorProd) * 30) / 100);
                }   
                    System.out.println(" Nome do vendedor: "+nome+
                    "\n Salário do vendedor R$ "+salarioVendedor+"\n Foram vendidos: "+qtdprodutos+" produtos diferentes");
                    System.out.println(" Total de vendas em reais: R$ "+totalDeVendas);
                break;

            default :
                System.out.println("Resposta Inválida");
                break;
                    }
        imput.close();
        }
    }