package Lista_16;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int input = in.nextInt();
        while(input < 1 || input % 2 != 0){
            System.out.println("Informe um numero maior que 0 e par: ");
            input = in.nextInt();
        }
        System.out.println("A sequencia de pares é");
        printPares(input);
    }

    private static void printPares(int input) {
        if(input >= 2)
            printPares(input - 2);
        System.out.print(" " + input);
    }
}