package aula8_metodos;

public class Lista_de_Valores {
    public static void main(String[] args) {
        System.out.println("Sua resposta é: ");

        // Multiplicando listas
        System.out.printf("%d\n",multiplica(1,2,3,4,5,6));

        // Fatorial para int
        System.out.printf("%d\n",transforma(6));

        // Fatorial para Double
        System.out.printf("%.2f",transforma_f(6.2));
    }  
    // Fatorial de Int: 
    public static int transforma(int num){
        // int[] lista_num = new int[tam+1];
        int result = 1;
        for(int i = 1; i<=num; i++){
            result*=i;
        }
        return result;
    }

    // Evitando Sobrecarga
    // Fatorial de Double:
    public static Double transforma_f(Double num){
        Double result = 1.0;
        for(int i = 1; i<=num; i++){
            result*=i;
        }
        return result;
    }

    // Lista de Valores:
    public static int multiplica(int... numeros) {
        int res = 1;
        for(int n:numeros){
            res *= n;
        }
        return res;
    }
}
