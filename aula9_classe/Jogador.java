package aula9_classe;

import java.security.SecureRandom;
public class Jogador {
    // Modificador de acesso:
    public String rival = "Zé do Pastel";

    // Escolher a qunatidade do poder do Rival aleatoriamente:
    private int poder_rival = new SecureRandom().nextInt(10);

    // Função de Verificação dos poderes e suas forças:
    public String verificar(int power) {

        if (power > this.poder_rival){
            return "Parabéns você venceu!! %s\n";
        }else{
            return "AAA que pena, você perdeu %s :(\n";
        }
    }
    
    // Função Construtora:
    public Jogador(int power,String nome){

        System.out.printf(verificar(power),nome);
        System.out.printf("O poder do seu rival era: %d\n", poder_rival);
        
    }
    
}
