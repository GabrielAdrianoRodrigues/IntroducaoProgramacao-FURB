public class Uni5Exe21 {
    public static void main(String[] args) {
        
        int alturaChico = 150;
        int alturaZe = 110;
        int tempo = 0;

        while (alturaChico > alturaZe) {
            alturaChico+=2;
            alturaZe+=3;
            tempo++;
        }
        System.out.println("Serão nescesarios: "+ tempo + " anos");
    }
}
