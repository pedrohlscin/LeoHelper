package Lista_16;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        double input = in.nextDouble();
        System.out.println("Informe uma potencia: ");
        int potencia = in.nextInt();
        while (potencia < 1) {
            System.out.println("Informe um numero maior que 0 para ser a potência: ");
            potencia = in.nextInt();
        }
        System.out.println("O numero " + input + " elevado a " + potencia + " é igual a: " + potenciacao(input,potencia));
    }

    private static double potenciacao(double input, int potencia) {
        if(potencia == 1)
            return input;
        return input *= potenciacao(input, potencia - 1);
    }
}
