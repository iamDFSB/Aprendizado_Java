package aula11_herança.execsuper;

public class Veiculo {
    private String modelo = "";
    private int ano = 0;

    public Veiculo(String modelo,int ano){
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void info(){
        System.out.printf("Seu modelo é %s\n",this.modelo);
        System.out.printf("Seu ano é %d\n",this.ano);
    }
}
