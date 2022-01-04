package desafio.iniciante;

import java.util.Scanner;

public class Feira {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);


        int a = leitor.nextInt();
        int b = leitor.nextInt();

        //digite o seu código
        // a soma de a + b precisa estar entre parenteses
        // para indicar qiue é uma soma matematica e não uma contatenação
        System.out.println("X = " + (a+b) );
    }

}
