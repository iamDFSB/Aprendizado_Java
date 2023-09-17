package aula7_matriz;

// Biblioteca para escolher números aleatórios:
import java.security.SecureRandom;
import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Escolha uma quantidade de linhas para a matriz: ");
        final int linha = scan.nextInt();

        // final int linha = 5;
        System.out.print("\nEscolha uma quantidade de colunas para a matriz: ");
        final int coluna = scan.nextInt();

        scan.close();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for(int j = 0; j< coluna; j++){
                matriz[i][j] = new SecureRandom().nextInt(100);
            }
        }

        // Forma com o loop for normal:

        // for (int i = 0; i < linha; i++) {
        //     System.out.printf("\n\tLinha => %d:\n",i+1);
        //     for(int j = 0; j< coluna; j++){
        //         System.out.printf("%2d |",matriz[i][j]);
        //     }
        // }

        // Forma com o loop for próprio para array
        for(int[] x: matriz){
            for(int y: x){
                System.out.printf("%2d |",y);
            }
            System.out.println("\n");
        }

    }
}
