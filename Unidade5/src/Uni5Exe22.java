public class Uni5Exe22 {
    public static void main(String[] args) {
        
        int anoContratado = 1995;
        double salarioInicial = 2000;
        double aumento = ((salarioInicial * 1.5) / 100)*2; //regra de 3

        while (anoContratado < 2021) {
            salarioInicial = salarioInicial + aumento;
            anoContratado++;
        }
        System.out.println("O salário atual é de: R$ "+salarioInicial);
    }
}
