package Lista_10;

import java.util.Scanner;

public class Lista_10_Questao_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int total_votantes = 0, total_nao_votantes=0;
        while (i < 100) {
            System.out.println("Informe a idade");
            int idade = sc.nextInt();
            while(idade < 0 || idade > 120){
                System.out.println("idade inválida, informe a idade entre 0 e 120");
                idade = sc.nextInt();
            }
            if(idade > 18 && idade <= 90){
                System.out.println("Esta pessoa tem " + idade + " e pode votar!");
                total_votantes += 1;
            }else{
                System.out.println("Esta pessoa tem " + idade + " e não pode votar!");
                total_nao_votantes += 1;
            }
            i++;
        }
        System.out.println("O percentual de votantes é: " + (double)total_votantes/100);
        System.out.println("O percentual de não votantes é: " + (double)total_nao_votantes/100);
    }
}
