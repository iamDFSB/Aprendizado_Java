package aula10_static;

public class Classe_static{

    public static void main(String[] args) {
        Gamer objeto = new Gamer("Daniel");

        // Utilizando chamada de função com static, (não precisa declarar objeto pra chamar)
        int resposta = Gamer.soma(2,3);
        System.out.println(resposta);
        System.out.println(objeto);
        System.out.printf("Sua nota é %d\n",Gamer.nota);

        // double resposta_f = 0.5725843272778209d;

        // int num = (int) (resposta_f*101);
        // double num1 = Math.round(resposta_f*100);
        
        // System.out.println(num);
        // System.out.println(num1);
        // System.out.println(resposta_f);
        // System.out.println(57.25843272778209 *1);
        

        Gamer.greeting();
    }
}