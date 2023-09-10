package aula2;

public class condition {
    public static void main(String[] args) {
        // Decisões if else, switch case e if one-line

        String nome = "Daniel";
        int num = 1;

        // if normal
        if (nome == "ner") {
            System.out.println("Acertou");
        }

        // switch case
        switch (num) {
            case 1:
                System.out.println("Número é 1");
                break;
            case 2:
                System.out.println("Número é 2");
                break;
        
            case 3:
                System.out.println("Número é 3");
                break;
        
            default:
                System.out.println("Não tem resposta");
                break;
        }

        // if one-line
        String sobrenome = nome == "Dani" ? "Jorge" : "Mateus";
        
        System.out.printf("O sobrenome é: %s\n",sobrenome);
        System.out.printf("%s\t%s",nome,sobrenome);
    }
}
