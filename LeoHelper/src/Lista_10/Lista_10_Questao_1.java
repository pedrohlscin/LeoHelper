package Lista_10;

import java.util.Scanner;

public class Lista_10_Questao_1 {
    public static void main(String[] args) {
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
        if(media >= 7)
            System.out.println("O aluno obteve média " + media + " e está aprovado");
        else if(media >= 3)
            System.out.println("O aluno obteve média " + media + " e está na recuperação");
        else
            System.out.println("O aluno obteve média " + media + " e está reprovado");
    }
}
