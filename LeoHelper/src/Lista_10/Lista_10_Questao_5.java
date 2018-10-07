package Lista_10;

import java.util.Scanner;

public class Lista_10_Questao_5 {
    public static void main(String[] args) {
        int numero = 30;
        int numero_aprovados = 0;
        int numero_reprovados = 0;
        int numero_recuperacao = 0;
        double total_media = 0;
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
                numero_recuperacao++;
                System.out.println("O aluno obteve média " + media + " e está na recuperação");
            }else {
                numero_reprovados++;
                System.out.println("O aluno obteve média " + media + " e está reprovado");
            }
            total_media += media;
        }
        System.out.println("Numero de aprovados: " + numero_aprovados);
        System.out.println("Numero de reprovados: " + numero_reprovados);

        System.out.println("Percentual de aprovados: " + (double)numero_aprovados/30.);
        System.out.println("Percentual de recuperação: " + (double)numero_recuperacao/30.);
        System.out.println("Percentual de reprovados: " + (double)numero_reprovados/30.);

        System.out.println("A media da turma foi: " + total_media/30.);
    }
}
