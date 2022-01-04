package desafio.iniciante;

import java.util.Scanner;

// Solução 1 - com IF() Else
/*public class DDD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 61){
            System.out.printf("Brasilia\n");
        }
        else if(a == 71){
            System.out.printf("Salvador\n");
        }
        else if(a == 11){
            System.out.printf("Sao Paulo\n");
        }
        else if(a ==  21     ){
            System.out.printf("Rio de Janeiro\n");
        }
        else if(a == 32){
            System.out.printf("Juiz de Fora\n");
        }
        else if( a == 19 ){
            System.out.printf("Campinas\n");
        }
        else if(a == 27 ){
            System.out.printf( "Vitoria\n"                               );
        }
        else if(a == 31){
            System.out.printf("Belo Horizonte\n");
        }
        else{
            System.out.printf("DDD nao cadastrado\n");
        }
    }
}*/

// Solução 2 - Switch case
public class DDD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a ) {
            case 61:
                System.out.printf("Brasilia\n");
                break;
            case 71 :
                System.out.printf("Salvador\n");
                break;
            case 11:
                System.out.printf("Sao Paulo\n");
                break;
            case 21:
                System.out.printf("Rio de Janeiro\n");
                break;
            case 32:
                System.out.printf("Juiz de Fora\n");
                break;
            case 19:
                System.out.printf("Campinas\n");
                break;
            case 27:
                System.out.printf( "Vitoria\n");
                break;
            case 31:
                System.out.printf("Belo Horizonte\n");
                break;
            default:
                System.out.printf("DDD nao cadastrado\n");
        }
    }
}