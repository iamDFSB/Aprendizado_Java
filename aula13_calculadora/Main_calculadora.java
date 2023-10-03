package aula13_calculadora;

/***
 * 
 * @author Daniel Felipe Santana Batista
 */

import java.util.Scanner;

public class Main_calculadora {
    public static int[] questions(){
        Scanner scan = new Scanner(System.in);
        // Definindo o primeiro valor:
        System.out.print("Determine o primeiro numero: ");
        int n1 = scan.nextInt();
        
        // Definindo o segundo valor:
        System.out.print("Determine o segundo numero: ");
        int n2 = scan.nextInt();

        // Definindo a operação:
        System.out.println("soma[1], mult[2], divi[3] ou sub[4]: ");
        int oper = scan.nextInt();
        scan.close();

        int[] numbers = {n1,n2,oper};

        return numbers;
    }
    // Perguntar da soma:
    public static int pergunta_soma(int n1,int n2){
        Metodo_operacao resultado = new Metodo_operacao(n1,n2);
        return resultado.soma();
    }

    public static void main(String[] args) {
        int i = 0; 
        while(i==3){
            int[] exec = questions();
            int n1 = exec[0];
            int n2 = exec[1];
            int oper = exec[2];

            switch (oper) {
                case 1:
                    pergunta_soma(n1, n2);
                    break;
            
                default:
                    System.out.println("Essa não existe");
                    break;
                }
            i+=1;
         
        
            }  
    }
}
 
