import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int inscricao = 0;
        int altura = 0;
        int alturaT = 0;
        int qtAtle = 0;
        int mediaT = 0;
        int maior = 0;
        int menor = 0;
        int inscricaoMaio = 0;
        int inscricaoMeno = 0;

        System.out.println("Qual o número da inscrição: ");
        inscricao = imput.nextInt();
        while (inscricao != 0) {
            System.out.println("Qual a altura do/da atleta: ");
            altura = imput.nextInt();
            if (maior == 0 && menor == 0) {
                maior = altura;
                menor = altura;
            }
            qtAtle++;
            alturaT += altura;

            if (altura > maior) {
                maior = altura;
                inscricaoMaio = inscricao;
            }
            if (altura < menor) {
                menor = altura;
                inscricaoMeno = inscricao;
            }
            System.out.println("Qual o número da inscrição: ");
            inscricao = imput.nextInt();

        }
        if (qtAtle != 0) {
            mediaT = alturaT / qtAtle;
        }
        System.out.println("O número do atleta mais alto é: " + inscricaoMaio + " e sua altura é: " + maior);
        System.out.println("O número do atleta mais alto é: " + inscricaoMeno + " e sua altura é: " + menor);
        System.out.println("A altura média do grupo de atletas em CM é de: " + mediaT);
        imput.close();
    }
}
