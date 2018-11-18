package Lista_16;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int input = in.nextInt();
        while(input < 1){
            System.out.println("Informe um numero maior que 1: ");
            input = in.nextInt();
        }
        System.out.println(printSoma(input));
    }

    private static int printSoma(int input) {
        if(input != 0){
            return input + printSoma(input-1);
        }
        return input;
    }
}
