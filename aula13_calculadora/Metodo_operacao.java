package aula13_calculadora;

public class Metodo_operacao {
    private int x = 0;
    private int y = 0;

    public Metodo_operacao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int soma(){
        return this.x + this.y;
    }

    public double divisao(){
        double n1 = this.x;
        double n2 = this.y;
        return n1/n2;
    }

    public int mult(){
        return this.x*this.y;
    }

    public int subt(){
        return this.x-this.y;
    }

}
