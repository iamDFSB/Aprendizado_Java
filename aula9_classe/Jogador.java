package aula9_classe;

import java.security.SecureRandom;

public class Jogador {
    // Modificador de acesso:
    public String rival = "Zé do Pastel";
    private int vidas = 12;

    // Escolher a qunatidade do poder do Rival aleatoriamente:
    private int poder_rival = new SecureRandom().nextInt(10);

    // Função de Verificação dos poderes e suas forças:
    public String verificar(int power) {

        if (power > this.poder_rival) {

            return "Parabéns você venceu!! %s\n";

        }else if(power == this.poder_rival){

            return "Opaa, empatou\n";

        }else{
            return "AAA que pena, você perdeu %s :(\n";
        }
    }

    // Aplicando o método Get em variáveis privadas:
    public int getVidas() {
        return this.vidas;
    }

    // Aplicando o método Set em variáveis privadas:
    public void setVidas(int vida_nova){

        if(vida_nova > 10 || vida_nova < 0){

            System.out.println("Impossivel ser esse valor");

        }else{
            this.vidas = vida_nova;
        }
    }

    // Função Construtora:
    public Jogador(int power, String nome) {

        System.out.printf(verificar(power), nome);
        System.out.printf("O poder do seu rival era: %d\n", poder_rival);

    }

}
