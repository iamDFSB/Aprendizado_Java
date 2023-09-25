package aula11_herança.execsuper;

public class Car extends Veiculo {
    private boolean tem_carta = true;
    
    public Car(String modelo,int ano){
        // Chamando função construtora com  o super:
        super(modelo,ano);
    }
    
    public boolean get_confirm_carta(){
        return this.tem_carta;
    }   

    public void info(){
        // Chamando funções com o super:
        super.info();
        System.out.printf("Você tem carteira: %b\n",tem_carta);
    }


}
