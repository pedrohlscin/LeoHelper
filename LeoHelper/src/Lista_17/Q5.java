package Lista_17;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero x");
        int x = in.nextInt();
        while(x < 1){
            System.out.println("Informe um numero positivo para x");
            x = in.nextInt();
        }
        System.out.println("A soma da serie é: " + serie(0,x));
    }

    private static double serie(double i, int x) {
        if(i != x)
            return (double)1/(double)fatorial((int)i) + serie(i+1, x);
        return (double)1/(double)fatorial((int)i);
    }

    private static int fatorial(int n) {
        int prod = 1;
        while(n != 0)
            prod *= n--;
        return prod;
    }
}
