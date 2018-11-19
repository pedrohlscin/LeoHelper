package Lista_17;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero n");
        int n = in.nextInt();
        while(n < 1){
            System.out.println("Informe um numero positivo para n");
            n = in.nextInt();
        }
        System.out.println("Informe um numero k");
        int k = in.nextInt();
        while(k < 1){
            System.out.println("Informe um numero positivo para k");
            k = in.nextInt();
        }
        System.out.println("O numero de grupos distintos de " + k + " pessoas que podem ser formadas a cada " + n + " pessoas é: " + combinatoria(n,k));
    }

    private static double combinatoria(int n, int k) {
        if(1 == k)
            return n;
        else if(k == n)
            return 1.0;
        else{
            int nFat = fatorial(n);
            int kFat = fatorial(k);
            int nkFat = fatorial(n-k);
            return (double)nFat /(double)kFat*(double)nkFat;
        }
    }

    private static int fatorial(int n) {
        int prod = 1;
        while(n != 0)
            prod *= n--;
        return prod;
    }
}
