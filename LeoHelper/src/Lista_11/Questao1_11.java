package Lista_11;

import java.util.Scanner;

public class Questao1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero n: ");
        int n = sc.nextInt();
        double soma = 0;
        while(n <= 0){
            System.out.println("Informe um numero maior que zero: ");
            n = sc.nextInt();
        }
        int impares = 1;
        for(int i = 1; i <= n; i++) {
            if(i%2==0)
                soma -= 1 / (Math.pow(impares, 3));
            else
                soma += 1 / (Math.pow(impares, 3));
            impares += 2;
        }
        System.out.println(soma);
    }
}
