package Lista_8;

import java.util.Scanner;

public class Lista_8_Questao_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        int qtd_prematuros = 0, total = 0, total_masc_prem = 0, total_fem_prem = 0, total_dias_prem_incubadora = 0, maior_numero_dias_incubadora=0;
        while(continua){
            total++;
            System.out.println("Informe M para masculino e F para feminino");
            char sexo = sc.next().charAt(0);
            while(sexo != 'M' && sexo != 'F'){
                System.out.println("Sexo inválido, informe M para masculino e F para feminino");
                sexo = sc.next().charAt(0);
            }

            System.out.println("Informe S para prematuro e N para Não-prematuro");
            char prematuro = sc.next().charAt(0);
            while(prematuro != 'S' && prematuro != 'F'){
                System.out.println("Entrada inválida, Informe S para prematuro e N para Não-prematuro");
                prematuro = sc.next().charAt(0);
            }
            int qtd_dias_incubadora = -1;
            if(prematuro == 'S'){
                System.out.println("Informe a quantidade de dias na incubadora:");
                qtd_dias_incubadora = sc.nextInt();
                while(qtd_dias_incubadora < 1){
                    System.out.println("Quantidade de dias inválida, informe no mínimo 1");
                    qtd_dias_incubadora = sc.nextInt();
                    total_dias_prem_incubadora =+ qtd_dias_incubadora;
                }
            }

            if(prematuro == 'S'){
                if(sexo == 'M'){
                    total_masc_prem++;
                }else{
                    total_fem_prem++;
                }
                if(qtd_dias_incubadora > maior_numero_dias_incubadora){
                    maior_numero_dias_incubadora = qtd_dias_incubadora;
                }
                qtd_prematuros += 1;
            }

            System.out.println("Para continuar digite C, para encerrar digite E");
            char entrada = sc.next().charAt(0);
            if(entrada == 'C')
                continua = true;
            else
                continua = false;
        }
        System.out.println("O percentual de prematuros é: " + ((double)qtd_prematuros/(double)total));
        System.out.println("O percentual de prematuros do sexo masculino é: " + ((double)total_masc_prem/(double)qtd_prematuros));
        System.out.println("O percentual de prematuros do sexo feminino é: " + ((double)total_fem_prem/(double)qtd_prematuros));
        System.out.println("A media de dias que os prematuros passam na incubadora é: " + (double)total_dias_prem_incubadora/(double)qtd_prematuros);
        System.out.println("O maior numero de dias na incubadora foi " + maior_numero_dias_incubadora);
    }
}
