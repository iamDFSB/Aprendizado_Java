package aula10_static;

public class Gamer {
    static int nota = 0;

    public Gamer(String nome) {
    //    System.out.printf("Sua nota é %s\n",nota);
    //    int resposta = Math.max(2,3);
    //    System.out.println(resposta); 
       System.out.printf("Seu nome é %s\n",nome);
    }
    
    public int soma(int x, int y){
        return x+y;
    }
    
    protected static void greeting(){
        System.out.println("Hello");
    }
}

