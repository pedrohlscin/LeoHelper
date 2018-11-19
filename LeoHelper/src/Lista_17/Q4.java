package Lista_17;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero x");
        int x = in.nextInt();
        while(x < 1){
            System.out.println("Informe um numero positivo para x");
            x = in.nextInt();
        }
        System.out.println("Abaixo segue a sequencia de Fibonacci:");
        printUntilNFibo(x);
    }

    private static void printUntilNFibo(int x) {
        for(int i = 0; i <= x; i++)
            System.out.print(" " +fibo(i));
    }

    private static long fibo(int i) {
        if(i < 3)
            return 1;
        return fibo(i-1) + fibo(i-2);
    }
}
