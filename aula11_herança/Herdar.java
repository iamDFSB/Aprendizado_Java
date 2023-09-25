package aula11_herança;

import aula10_static.Gamer;

public class Herdar extends Gamer{
    public Herdar(String nome){
        // O super serve para pegar a função construtora da outra classe:
        super(nome);

        // Duas formas de chamar as funções da outra classe:
            // Chamando pelo extends
            super.greeting();
            // Chamando pelo import 
            greeting();
    }
}

