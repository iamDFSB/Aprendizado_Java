package aula9_classe;

public class Jogador {
    // Modificador de acesso
    public String nome = "Daniel";
    // Função Construtora:
    public Jogador(int x, int y) {

        System.out.println("A soma dos números é: ");
        System.out.printf("%d\n",soma(x,y));
    }
    public static int soma(int x, int y) {
        return x+y;
    }
}
