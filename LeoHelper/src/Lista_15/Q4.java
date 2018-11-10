package Lista_15;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int x;
            System.out.println("Informe o valor de x");
            x = in.nextInt();
            while(x <= 0){
                System.out.println("Informe um valor positivo para x");
                x = in.nextInt();
            }
            int n;
            System.out.println("Informe o valor de n");
            n = in.nextInt();
            while(n <= 0){
                System.out.println("Informe um valor positivo para n");
                n = in.nextInt();
            }
            System.out.println("O valor do somatório é: " + calculaSomatorio(x, n));
            System.out.println("Deseja calcular outro somatório?\nS - para continuar\nN - para sair");
            char op = in.next().charAt(0);
            if(op == 'N' || op == 'n')
                break;
        }
    }

    private static double calculaSomatorio(int x, int n) {
        double somatorio = 0;
        int pares = 0, impares = 1;
        for(int i = 1; i <= n; i++){
            double numerador = potenciacao(x, pares);
            double divisor = fatorial(impares);
            double parcial = numerador/divisor;
            if(i % 2 == 0)
                somatorio -= parcial;
            else
                somatorio += parcial;
            pares += 2;
            impares += 2;
        }
        return somatorio;
    }

    private static double fatorial(int fator) {
        if(fator < 2)
            return fator;
        else
            return fator * fatorial(fator - 1);
    }

    private static double potenciacao(int x, int expoente) {
        double potencia = x;
        for(int i = 1; i < expoente; i++){
            potencia *= x;
        }
        return potencia;
    }
}
