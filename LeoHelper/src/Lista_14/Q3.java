package Lista_14;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Informe 3 valores inteiros:");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        maiorMenorPrinta(a,b,c);
    }

    private static void maiorMenorPrinta(int a, int b, int c) {
        int maior = 0, menor = 0, meio = 0;
        if(a > b && a > c){
            maior = a;
        }else if( b > a && b > c){
            maior = b;
        }else if( c > a && c > b){
            maior = c;
        }
        if(a < b && a < c){
            menor = a;
        }else if( b < a && b < c){
            menor = b;
        }else if( c < a && c < b){
            menor = c;
        }
        if (a == maior){
            if(b == menor)
                meio = c;
            else
                meio = b;
        }else if(b == maior){
            if(a == menor)
                meio = c;
            else
                meio = a;
        }else{
            if(a == menor)
                meio = b;
            else
                meio = a;
        }
        a = menor;
        b = meio;
        c = maior;
        System.out.println("Menor: " + a + ", meio: " + b + ", maior: " + c);
    }
}
