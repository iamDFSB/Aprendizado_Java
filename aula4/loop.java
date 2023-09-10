package aula4;


public class loop {
    public static void main(String[] args) {

        // Loop For
        for(int cont=5; cont >0; cont--){
            System.out.println("Bom dia");
        }

        for(int cont=0; cont <5; cont++){
            System.out.println("Boa Noite");
        }

        // Loop While
        System.out.println("------------------------------------");
        int cont2 = 0;
        while (cont2<5) {
            System.out.printf("Posição %d\n",cont2);
            cont2+=1;
        }

        System.out.println("------------------------------------");

        // Loop Do-While
        int ne = 0;
        do {
            System.out.print("Eu amo Java ");
            System.out.printf("%d\n",ne);
            ne+=1;
        } while (ne<5);
    }
}
