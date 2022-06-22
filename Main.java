import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fases, tentativas;
      
        System.out.print("Informe a fase do jogar: ");
        fases = teclado.nextInt();
        System.out.print("Informe quantidade de tentativas do jogar: ");
        tentativas = teclado.nextInt();

        teclado.close();

        float porcentagem;
        porcentagem = (float)tentativas/(float)fases;
        System.out.printf("O jogador completou com %.2f%% de tentativas", (porcentagem * 100));
  
    }
}