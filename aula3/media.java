package aula3;
import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // int nota1=0, nota2=0, nota3=3,nota4=0;
        float nota =0;
        float soma_w = 0;
        int i = 1;
        final int  MEDIA_BASE = 6;

        while(i<=4){
            System.out.printf("Digite sua %dº nota: ",i);
            nota = scan.nextFloat();

            soma_w += nota;
            i+=1;
        }

        // System.out.print("Digite a sua primeira nota: ");
        // nota1 = scan.nextInt();

        // System.out.print("Digite a sua segunda nota: ");
        // nota2 = scan.nextInt();

        // System.out.print("Digite a sua terceira nota: ");
        // nota3 = scan.nextInt();

        // System.out.print("Digite a sua quarta nota: ");
        // nota4 = scan.nextInt();

        // int soma = nota1+nota2+nota3+nota4;

        System.out.printf("Sua soma é %.2f\n",soma_w);

        float media = soma_w/4;
        System.out.printf("Sua média é => %.2f\n",media);

        scan.close();

        if(media>MEDIA_BASE && media<7){
            System.out.println("PASSOU, foi por pouco");
        }
        else if (media>MEDIA_BASE) {
            System.out.println("Parabéns vc passou de Ano com uma nota alta");
        }
        else if (media<MEDIA_BASE){
            System.out.println("Sinto muito mas vc reprovou :(");
        }
        else{
            System.out.println("Algo deu errado");
        }


    }
}
