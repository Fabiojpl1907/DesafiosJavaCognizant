package deafio.java2;

public class Tela {

    public static void main(String[] args) {

      // ao todo a tela te 7 linhas
      for( int x = 1 ; x <=7 ; x++) {

          // se vai desenhar a 1ª ou a 7ª
          // é uma linha tracejada
          if( x == 1 || x == 7 ) {

              if( x ==7)  System.out.print("\n"); // para que a 7ª linha fique abaixo da 6º

              for(int i = 1 ; i <= 39 ; i++ ){
                  System.out.print("-");
              }

          } else {
                  // ir a linha de baixo a cada nova linha
                  System.out.print("\n");
                  for (int i = 1; i <= 39; i++) {
                      if (i == 1 || i == 39) System.out.print("|");
                      else System.out.print(" ");
                  }
          }
      }
    }
}

