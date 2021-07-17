public class Uni5Exe11 {
    public static void main(String[] args) {
        
        int i , bisk , total;
        bisk = 1;
        total = 0;

        for (i = 1 ; i <= 16 ; i++) {
            total = total + bisk;
            bisk = bisk * 3 ;
        }
        System.out.println("Por dia à maquina quebra "+ total + " biscoitos por dia.");
    }
}
