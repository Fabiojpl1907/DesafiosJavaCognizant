package desafio.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Elfo {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int A = leitor.nextInt() + leitor.nextInt();
        //TODO: Complete o If com a condição que soluciona o problema.
        // a soma do tempo necessário para os brinquedos (A)
        // deve ser menor ou igual ao tempo disponivel
        // se for maior deixa para outro dia
        if (   A > N       )
            System.out.println("Deixa para amanha!");
        else
            System.out.println("Farei hoje!");
    }


}
