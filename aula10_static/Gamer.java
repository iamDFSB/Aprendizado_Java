package aula10_static;



public class Gamer {
    static int nota = 0;

    public Gamer() {
    //    System.out.printf("Sua nota é %s\n",nota);
       int resposta = Math.max(2,3);
       System.out.println(resposta); 
    }
    public static int soma(int x, int y){
        return x+y;
    }
}
