package Lista_10;

import java.util.Scanner;

public class Lista_10_Questao_3 {
    public static void main(String[] args) {
        int numero = 30;
        int numero_aprovados = 0;
        int numero_reprovados = 0;
        while (numero >= 0){
            Scanner sc = new Scanner(System.in);
            double n1, n2;
            System.out.println("Informe a nota 1:");
            n1 = sc.nextDouble();
            while(n1 < 0 && n1 > 10){
                System.out.println("Informe a nota 1 entre 0 e 10:");
                n1 = sc.nextDouble();
            }
            System.out.println("Informe a nota 2:");
            n2 = sc.nextDouble();
            while(n2 < 0 && n2 > 10){
                System.out.println("Informe a nota 2 entre 0 e 10:");
                n2 = sc.nextDouble();
            }
            double media = ((double)n1 + (double)n2)/2;
            if(media >= 7) {
                numero_aprovados++;
                System.out.println("O aluno obteve média " + media + " e está aprovado");
            }else if(media >= 3) {
                System.out.println("O aluno obteve média " + media + " e está na recuperação");
            }else {
                numero_reprovados++;
                System.out.println("O aluno obteve média " + media + " e está reprovado");
            }
        }
        System.out.println("Numero de aprovados: " + numero_aprovados);
        System.out.println("Numero de reprovados: " + numero_reprovados);
    }
}
