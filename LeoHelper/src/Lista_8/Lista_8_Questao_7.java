package Lista_8;

import java.util.Scanner;

public class Lista_8_Questao_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int entrada = sc.nextInt();
        while(entrada <= 0){
            System.out.println("Número inválido\nInforme um numero positivo:");
            entrada = sc.nextInt();
        }
        int lim_sup = entrada, lim_inferior = 1;
        double soma = 0;
        for(int i = 1; i <= entrada; i++){
            soma += (double)lim_inferior++/(double)lim_sup--;
        }
        System.out.println("O valor de H é: " + soma);
    }
}
