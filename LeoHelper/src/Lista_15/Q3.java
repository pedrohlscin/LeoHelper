package Lista_15;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Tecle 0 para sair, 1 para calcular o valor da diária!");
            int input = in.nextInt();
            if (input == 0)
                break;
            int dia, mes, ano;
            System.out.println("Informe o dia da retirada");
            dia = in.nextInt();
            System.out.println("Informe o mês da retirada");
            mes = in.nextInt();
            System.out.println("Informe o ano da retirada");
            ano = in.nextInt();
            if (!dataValida(dia, mes, ano)) {
                System.out.println("Data de retirada inválida");
                continue;
            }
            int dia_dev, mes_dev, ano_dev;
            System.out.println("Informe o dia da devolução");
            dia_dev = in.nextInt();
            System.out.println("Informe o mês da devolução");
            mes_dev = in.nextInt();
            System.out.println("Informe o ano da devolução");
            ano_dev = in.nextInt();
            if (!dataValida(dia_dev, mes_dev, ano_dev)) {
                System.out.println("Data de devolução inválida");
                continue;
            }
            int valorPagar = calcularTotalDiarias(dia, mes, ano, dia_dev, mes_dev, ano_dev);
            System.out.println("Valor a pagar: " + valorPagar);
        }
    }

    private static int calcularTotalDiarias(int dia, int mes, int ano, int dia_dev, int mes_dev, int ano_dev) {
        int numeroDias = dateDiff(dia, mes, ano, dia_dev, mes_dev, ano_dev);
        return totalPagar(numeroDias);
    }

    private static int totalPagar(int numeroDias) {
        if(numeroDias == 0)
            return 70;
        return numeroDias * 70;
    }

    private static int dateDiff(int dia, int mes, int ano, int dia_dev, int mes_dev, int ano_dev) {
        int totalDiarias = 0;
        if (dataPosterior(dia, mes, ano, dia_dev, mes_dev, ano_dev)) {
            totalDiarias = calculaDiasDiferenca(dia, mes, ano, dia_dev, mes_dev, ano_dev);
        }
        return totalDiarias;
    }

    private static int calculaDiasDiferenca(int dia, int mes, int ano, int dia_dev, int mes_dev, int ano_dev) {
        int totalDias = 0;
        if((ano_dev - ano) > 0){
            totalDias += (ano_dev - ano) * 365;
            if((ano_dev - ano)/4 > 0)
                totalDias += (ano_dev - ano)/4;
            else{
                for(int i = ano; i <= ano_dev; i++){
                    if(bissexto(i))
                        totalDias += 1;
                }
            }
        }
        if(mes_dev > mes){
            for(int i = mes; i < mes_dev; i++){
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    totalDias += 31;
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    totalDias += 30;
                }else if(i == 2){
                    if(bissexto(ano)){
                        totalDias += 29;
                    }else{
                        totalDias += 28;
                    }
                }
            }
        }
        if(dia_dev > dia){
            totalDias += dia_dev - dia;
        }
        return totalDias;
    }

    private static boolean dataPosterior(int dia, int mes, int ano, int dia_dev, int mes_dev, int ano_dev) {
        boolean retorno = false;
        if (ano_dev > ano) {
            retorno = true;
        } else if (ano_dev == ano) {
            if (mes_dev > mes) {
                retorno = true;
            } else if (mes_dev == mes) {
                if (dia_dev > dia)
                    retorno = true;
            }
        }
        return retorno;
    }


    private static boolean dataValida(int dia, int mes, int ano) {
        boolean dataValida = false;
        if (anoValido(ano) && mesValido(mes)) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia <= 31)
                    dataValida = true;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia <= 30)
                    dataValida = true;
            } else if (mes == 2) {
                if (bissexto(ano))
                    if (dia <= 29)
                        dataValida = true;
                    else if (dia <= 28)
                        dataValida = true;
            }
        }
        return dataValida;
    }

    private static boolean bissexto(int ano) {
        if ((ano % 400 == 0) || ano % 4 == 0 && ano % 100 != 0)
            return true;
        else
            return false;
    }

    private static boolean mesValido(int mes) {
        if (mes >= 1 && mes <= 12)
            return true;
        return false;
    }

    private static boolean anoValido(int ano) {
        if (ano >= 0)
            return true;
        return false;
    }
}
