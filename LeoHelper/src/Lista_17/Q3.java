package Lista_17;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero x");
        int x = in.nextInt();
        while(x < 1){
            System.out.println("Informe um numero positivo para x");
            x = in.nextInt();
        }
        System.out.println("Informe um numero y");
        int y = in.nextInt();
        while(y < 1){
            System.out.println("Informe um numero positivo para y");
            y = in.nextInt();
        }
        System.out.println("O MDC de " + x + " e " + y + " é: " + mdc(x,y));
    }

    private static double mdc(int x, int y) {
        if(x > y)
            return mdc(x-y,y);
        else if(x == y)
            return x;
        else
            return mdc(y,x);
    }
}
