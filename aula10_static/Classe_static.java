package aula10_static;


/**
 * Classe_static
 */
public class Classe_static {

    public static void main(String[] args) {
        Gamer objeto = new Gamer();

        // Utilizando chamada de função com static, (não precisa declarar objeto pra chamar)
        int resposta = Gamer.soma(2,3);
        System.out.println(resposta);
        System.out.println(objeto);
        System.out.printf("Sua nota é %d",Gamer.nota);
    }
}