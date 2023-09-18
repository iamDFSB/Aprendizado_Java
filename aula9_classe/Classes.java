package aula9_classe;

import java.util.Scanner;

// Biblio para utilizar o sleep:

public class Classes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do Jogador: ");
        String nome = scan.nextLine();
        
        System.out.print("Você deseja lutar? [Y]sim [N]não ");
        char resposta = scan.nextLine().charAt(0);

        
        if (resposta == 'Y') {
            
            System.out.println("Vamos lá então!!");
            int[] contador= {1,2,3};
            
            for(int i:contador){
                System.out.printf("\t%d\n",i);
            }
            
            System.out.println("\tLUTEM!!");
            
            // Flag para ajudar no Loop-while
            boolean flag = true;
            
            while(flag==true){
                
                System.out.print("Escolha sua quantidade de poder entre 0 e 10: ");
                
                
                int power = scan.nextInt();
                
            
                // Verificação do poder do jogador:
                if (power < 0 || power >10){
                    System.out.println("Essa forma está errada, por favor tente novamente!");
                    continue;
                    
                }else{
                    System.out.println("Poder armazenado com sucesso!!");
                    
                    // Fazendo um objeto:
                    Jogador obj = new Jogador(power,nome);
                    
                    System.out.printf("%s, o nome do seu rival era : %s\n",nome,obj.rival);
                    break;
                }
            }
            
        }else{
            
            // Mensagem Final
            System.out.println("Ok, muito obrigado :)");
            
            // Para terminar o código:
            System.exit(0);
        }
        
        // Fechando o Scanner:
        scan.close();
        
        // Forma errada, pois a variável poder_rival é privada:
        /*System.out.println(obj.poder_rival); ==> Isn't visible*/
        
    }
}
