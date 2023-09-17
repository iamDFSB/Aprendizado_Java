package aula6;

// import java.lang.reflect.Array;
import java.util.Arrays;

public class sequencias {
    public static void main(String[] args) {

        String nome = "iygig Daniel Felipe";

        // Mudando a forma de visualização da string, para todas minúsculas ou todas maiúsculas 
        System.out.printf("Upper case: %s\n",nome.toUpperCase());
        System.out.printf("Lower case %s\n",nome.toLowerCase());
        // System.out.printf("%s\n",nome.strip());

        // ----------------------------------------------------------------------------------------

        // Concatenar Strings

        String nome2  = "Fernando";
        String sobrenome = " Julio";
        System.out.printf("%s\n",nome2.concat(sobrenome));
        
        // ----------------------------------------------------------------------------------------

        // Mudando o tipo da variavel

        int num = 23;
        float num2 = (float) num;
        System.out.println(num2);

        // ----------------------------------------------------------------------------------------

        // Vendo a posição do index
        System.out.printf("Posição do 'Daniel' na variavel é: %d",sobrenome.indexOf("Fer"));

        // ----------------------------------------------------------------------------------------

        // Copiando um array em outro array
        int[] lista_num = {78,3,3};
        int[] lista_input = new int[3];

        System.arraycopy(lista_num, 0, lista_input, 0, lista_num.length);

        for(int n:lista_input){
            System.out.printf("%d\n",n);
        }

        // ----------------------------------------------------------------------------------------

        // Verificando se as listas são iguais

        boolean res = Arrays.equals(lista_num,lista_input);

        Arrays.sort(lista_num);
        Arrays.sort(lista_input);


        System.out.printf("%s\n",res ? "Verdadeiro": "Falso");

        // ----------------------------------------------------------------------------------------

        // Verificando se contém um elemento em uma lista
        System.out.printf("%s",Arrays.binarySearch(lista_num,78) > 0 ? "Verdadeiro1":"Falso2");



    }    
        

}
 