package Lista_14;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int termo;
        System.out.println("Informe um numero positivo!");
        termo = in.nextInt();
        while(termo < 0){
            System.out.println("Eu disse um numero positivo!");
            termo = in.nextInt();
        }
        printFibo(termo);
    }

    private static void printFibo(int termo) {
        for(int i = 1; i<=termo; i++)
            System.out.print(fibo(i) + ", ");
    }

    private static long fibo(int termo){
        if(termo < 2 ) {
            return termo;
        } else {
            return fibo(termo - 1) + fibo(termo-2);
        }
    }
}
