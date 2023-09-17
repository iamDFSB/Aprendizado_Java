package aula5;

import java.util.Arrays;

public class LoopForNovo {
    public static void main(String[] args) {
        int tam = 8;
        int[] ar = {67,7,8,8,5,46,6,71};
        final int[] respostas = new int[tam];
        
        Arrays.fill(respostas,ar[1]);


        Arrays.sort(respostas);
        for(int num: respostas){
            System.out.printf(" %d - ",num);
        }
    }
}
