package aula8_metodos;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = 0;
        String frase,nome;

        String[] perguntas = {
            "Digite o nome do user: ",
            "Escreva uma mensagem antes de começar a somar: ",
            "Escreva o primeiro número: ",
            "Escreva o segundo número: ",
        };

        System.out.print(perguntas[0]);
        nome = scan.nextLine();
        System.out.println(nome_user(nome));

        System.out.println(perguntas[1]);
        frase = scan.nextLine();

         do{      
            System.out.print(perguntas[2]);
            int num1 = scan.nextInt();
    
            System.out.print(perguntas[3]);
            int num2 = scan.nextInt();

            sum_integer(num1,num2);
            i++;
        }while(i < 2);

        msg(frase);
        
        scan.close();
    }

    public static void sum_integer(int x, int y){
        System.out.printf("\t\nSua resposta é == %d\n",x+y);
        System.out.print("\n");
    }

    public static void msg(String mensagem) {
        System.out.println("Sua mensagem é :");
        System.out.printf("%s",mensagem);
    }

    public static String nome_user(String nome){
        String nome2 = "Seu nome é ==> "+ nome;
        return nome2;
    }
}
