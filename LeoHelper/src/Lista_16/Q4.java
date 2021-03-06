package Lista_16;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int i, j, k;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor para i, outro para j e outro para k: ");
        i = in.nextInt();
        j = in.nextInt();
        k = in.nextInt();
        while(i < 1){
            System.out.println("Informe um valor para i que seja no minimo 1: ");
            i = in.nextInt();
        }
        while(j < i){
            System.out.println("Informe um valor para j que seja no minimo maior que " + i + ": ");
            j = in.nextInt();
        }
        while(k < 1){
            System.out.println("Informe um valor para k que seja no minimo 1: ");
            k = in.nextInt();
        }
        System.out.println("A soma do valor é: " + somaSerie(i,j,k));
    }

    private static int somaSerie(int i, int j, int k) {
        if(i <= j){
            return i + somaSerie(i+k, j, k);
        }
        return 0;
    }

}