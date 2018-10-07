package Lista_8;

import java.util.Scanner;

public class Lista_8_Questao_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int entrada = sc.nextInt();
        while(entrada <= 0){
            System.out.println("Número inválido\nInforme um numero positivo:");
            entrada = sc.nextInt();
        }
        double total_pessoas = (double)entrada;
        int numero_pessoas_maior_50_menor_60_quilos = 0;
        int soma_idades_menor_160_cm = 0;
        int numero_pessoas_menor_160_cm = 0;
        int numero_pessoas_olhos_azuis = 0;
        int quantidade_pessoas_ruivas_olhos_nao_azuis = 0;
        while(entrada > 0){
            int idade = sc.nextInt();
            while (idade < 1 || idade > 120){
                System.out.print("Idade inválida, informe um idade entre 1 e 120!");
                idade = sc.nextInt();
            }
            double peso = sc.nextInt();
            while (peso < 3 || peso > 300){
                System.out.print("Peso inválida, informe um peso entre 3 e 300!");
                peso = sc.nextInt();
            }
            double altura = sc.nextInt();
            while (altura < 0.5 || altura > 2.5){
                System.out.print("altura inválida, informe um altura entre 0.5 e 2.5!");
                altura = sc.nextInt();
            }
            char cor_olhos = sc.next().charAt(0);
            while (cor_olhos != 'A' && cor_olhos != 'P' && cor_olhos != 'C' && cor_olhos != 'V'){
                System.out.print("Cor inválida, informe um cor dos olhos entre A, P, C ou V!");
                cor_olhos = sc.next().charAt(0);
            }
            char cor_cabelo = sc.next().charAt(0);
            while (cor_cabelo != 'P' && cor_cabelo != 'C' && cor_cabelo != 'L' && cor_cabelo != 'R'){
                System.out.print("Cor inválida, informe um cor dos cabelos entre P, C, L ou R!");
                cor_cabelo = sc.next().charAt(0);
            }
            if(idade > 50 && peso < 60){
                numero_pessoas_maior_50_menor_60_quilos++;
            }
            if(altura < 1.5){
                soma_idades_menor_160_cm += idade;
                numero_pessoas_menor_160_cm++;
            }
            if(cor_olhos == 'A'){
                numero_pessoas_olhos_azuis++;
            }
            if(cor_cabelo == 'R' && cor_olhos != 'A'){
                quantidade_pessoas_ruivas_olhos_nao_azuis++;
            }
            entrada--;
        }
        double percentual_pessoas_olhos_azuis = (double)numero_pessoas_olhos_azuis/(double)total_pessoas;
        double media_idade_pessoas_menos_150cm = (double)soma_idades_menor_160_cm/(double)numero_pessoas_menor_160_cm;
        System.out.println("A quantidade de pessoas com idade superior a 50 anos e pesam menos que 60 kg é: " + numero_pessoas_maior_50_menor_60_quilos);
        System.out.println("A media de idade das pessoas com menos de 1,5m é: " + media_idade_pessoas_menos_150cm);
        System.out.println("O percentual de pessoas com olhos azuis é: " + percentual_pessoas_olhos_azuis);
        System.out.println("A quantidade de pessoas ruivas que não tem olhos azuis é: " + quantidade_pessoas_ruivas_olhos_nao_azuis);
    }
}
