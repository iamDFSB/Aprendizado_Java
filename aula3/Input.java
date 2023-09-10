package aula3;
import java.util.Scanner;


public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Adicionar em String
        System.out.println("Adicione seu nome: ");
        String nome = scan.next();
        System.out.printf("\tSeu nome é %s\n",nome);

        // Adicionar em float
        System.out.println("Adicione seu peso: ");
        float peso = scan.nextFloat();
        System.out.printf("\tSeu peso é %.2f\n",peso);

        // Adiconar em int
        System.out.println("Adicione sua idade: ");
        int num = scan.nextInt();
        System.out.printf("\tSua idade é %s",num);
        scan.close();
    }
}
