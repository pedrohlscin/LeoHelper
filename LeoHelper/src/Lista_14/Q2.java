package Lista_14;

import java.util.Scanner;

public class Q2 {
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
        if(a > b && a > c){
            System.out.println("O maior é: " + a);
        }else if( b > a && b > c){
            System.out.println("O maior é: " + b);
        }else if( c > a && c > b){
            System.out.println("O maior é: " + c);
        }else{
            System.out.println("Os numeros são iguais!");
        }
        if(a < b && a < c){
            System.out.println("O menor é: " + a);
        }else if( b < a && b < c){
            System.out.println("O menor é: " + b);
        }else if( c < a && c < b){
            System.out.println("O menor é: " + c);
        }else{
            System.out.println("Os numeros são iguais!");
        }
    }
}
