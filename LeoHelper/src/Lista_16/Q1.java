package Lista_16;

import java.util.Scanner;

public class Q1 {

    public static void printOrdenadoRecursivamente(int n){
        if(n > 1){
            printOrdenadoRecursivamente(n-1);
        }
        System.out.print(" " + n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int input = in.nextInt();
        while(input < 1){
            System.out.println("Informe um numero maior que 1: ");
            input = in.nextInt();
        }
        printOrdenadoRecursivamente(input);
    }
}
