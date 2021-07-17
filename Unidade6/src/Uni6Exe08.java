import java.util.Scanner;

public class Uni6Exe08 {
    
    private Uni6Exe08(){
        Scanner imput = new Scanner(System.in);
        
        int vetQtd = 0;
        do {
            System.out.println("Informe o tamanho do vetor ate no maximo 20 posições: ");
            vetQtd = imput.nextInt();
        } while (vetQtd < 1 && vetQtd > 20 );
        
        double vet[] = new double[vetQtd];
        vetInserir(vet, imput);
        vetIndentificar(vet);
        imput.close();
    }
    
    private void vetInserir(double vet[], Scanner imput) {
        for (int i = 0 ; i < vet.length ; i++) {
            System.out.println("Informe o valor do vetor ["+i+"] :");
            vet[i] = imput.nextDouble();
        }
    }
    
    private void vetIndentificar (double vet[]) {
        double repetidos[] = new double[vet.length];
        double numero = 0;
        int frequencia = 0;
        int contRepetidos = 0;
        boolean teste = true;
        for (int i = 0; i < vet.length; i++) {
            numero = vet[i];
            for (int j = 0; j < repetidos.length; j++) {
                if (numero == repetidos[j]) {
                    teste = false;
                }    
            }
            if (teste) {
                repetidos[contRepetidos] = vet[i];
                contRepetidos++;
                frequencia = 0;
                for (int c = i; c < vet.length; c++ ) {
                    if (vet[c] == numero) {
                        frequencia++;
                    }
                }
                System.out.println("valor: " + numero + " Frequência: " + frequencia + "\n\n");
            }
            teste = true;
        }
    }
    public static void main(String[] args) {
        new Uni6Exe08();
    }
}