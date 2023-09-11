package aula5;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Uma forma de criar um array sem os index e depois colocá-los:
        final int tam = 3;
        int [] ar = new int[tam];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;

        for (int i =0; i<ar.length; i++){
            System.out.printf("%d\n",ar[i]);
        }
// ---------------------------------------------------------------------------------

        // Uma forma de criar um array, já com os valores listados:

        int[] numeros = {1,2,3,45,6,74};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>10) {
                System.out.printf("O valor --> %d é maior que 10\n",numeros[i]);
                continue;
            }

            System.out.printf("Número =>> %d\n",numeros[i]);

        }
// ---------------------------------------------------------------------------------

        // Prova

        char[] gabarito = {'A','C','C'};
        char[] resposta = new char[gabarito.length];
        int pontos = 0;


        System.out.println("Começou a prova: Escolha as questões A, B ou C");
        
        String[] question = {"1) Quanto é 2 + 2 = ?", 
                             "2) Quanto é 40 + 28 = ?", 
                             "3) Quanto é 5 x 9 = ?"};
                             
        String[] alternative = {"A) 4\nB) 22\nC) 45\n ", 
                                "A) 57\nB) 78\nC) 68\n ", 
                                "A) 48\nB) 55\nC) 45\n "};

        
        for (int i = 0; i < question.length; i++) {

            System.out.printf("%s\n",question[i]);
            System.out.printf("%s",alternative[i]);

            System.out.print("Insira a resposta aqui: ");
            char response = scan.nextLine().charAt(0);
            resposta[0] = response;
            
            if(response != 'A' && response != 'B' && response != 'C'){
                System.out.println("\tEssa resposta não vale, questão anulada");
                
            }else if (response == gabarito[i]){
                System.out.println("\tAcertouuu <3");
                pontos+=1;
    
            }else{
                System.out.println("\tErrou :( ");
            }
        }
       
    
        scan.close();

        System.out.printf("Pontuação => %d\n", pontos);

        // Aprovação do Aluno

        int minimo = 2;

        if (pontos < minimo){
            System.out.println("Reprovado");
        }else{
            System.out.println("Aprovado");
        }



    }
}
