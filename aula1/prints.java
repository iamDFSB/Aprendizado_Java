
package aula1;

// Criando variaveis com os tipos int, String e char 
// Aprendendo os prints sendo eles printf para format --- println para printar texto com quebra de linha --- print que printa texto sem quebra de linha
public class prints {
    public static void main(String[] args) {
        String nome = "Daniel";
        char carac = 'J';
        int num = 123;

        System.out.printf("Numero == %d \n",num );
        System.out.println("Bom dia");
        System.out.print("Boa noite \n");
        System.out.printf("%s\n",nome);
        System.out.printf("Caracter = %c",carac);

    }
}
