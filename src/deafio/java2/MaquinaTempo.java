package deafio.java2;

import java.io.IOException;
import java.util.Scanner;

public class MaquinaTempo {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        if (a + b == c || a + c == b ||  b + c == a  || a == b ||  b == c   || c == a   )
            System.out.println("S");
        else
            System.out.println("N");
    }

}
