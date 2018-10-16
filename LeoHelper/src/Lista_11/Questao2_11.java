package Lista_11;

import java.util.Scanner;

public class Questao2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        System.out.println("Informe um valor positivo e zero para encerrar: ");
        int entrada = sc.nextInt();
        while(entrada != 0){
            while(entrada < 0){
                System.out.println("Informe um valor positivo e zero para encerrar: ");
                entrada = sc.nextInt();
            }
            if(entrada == 0)
                break;
            if(entrada > maior)
                maior = entrada;
            if(entrada < menor)
                menor = entrada;
            System.out.println("Informe um valor positivo e zero para encerrar: ");
            entrada = sc.nextInt();
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
