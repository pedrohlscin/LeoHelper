package Lista_16;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int input = in.nextInt();
        while(input < 1){
            System.out.println("Informe um numero maior que 1: ");
            input = in.nextInt();
        }
        System.out.println("Informe um outro numero para multiplicar: ");
        int input2 = in.nextInt();
        while(input2 < 1){
            System.out.println("Informe um numero maior que 1: ");
            input2 = in.nextInt();
        }
        System.out.println("A multiplicação é: " + multiplicaRecursivo(input, input2));
    }

    private static int multiplicaRecursivo(int input, int input2) {
        if(input2 != 0){
            return input += multiplicaRecursivo(input, input2-1);
        }
        return 0;
    }
}
