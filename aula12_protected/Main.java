package aula12_protected;

import aula10_static.Gamer;

public class Main {
    public static void main(String[] args) {
        Gamer gamer  = new Gamer("Jo");

        // Deu errado pq o método está protected, ou seja não está no mesmo package.
            //Gamer.greeting(); /*Output => The method greeting() from the type Gamer is not visible*/

        // Deu certo pois o método é public: 
        gamer.soma(0, 0); /* Output =>Success */

    }
}
