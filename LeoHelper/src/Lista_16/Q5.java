package Lista_16;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int input = in.nextInt();
        while(input < 1){
            System.out.println("Informe um numero maior que 1: ");
            input = in.nextInt();
        }
        printBinario(input);
    }

    private static void printBinario(int input) {
        if(input / 2 != 0){
            printBinario(input/2);
        }
        System.out.print(input % 2);
    }
}
