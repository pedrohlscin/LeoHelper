package Lista_15;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Tecle 0 para sair, 1 para calcular uma data válida!");
            int input = in.nextInt();
            if(input == 0)
                break;
            int dia, mes, ano;
            System.out.println("Informe o dia");
            dia = in.nextInt();
            System.out.println("Informe o mês");
            mes = in.nextInt();
            System.out.println("Informe o ano");
            ano = in.nextInt();

            if (dataValida(dia, mes, ano))
                System.out.println("Data válida");
            else
                System.out.println("Data inválida");
        }
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
                if(bissexto(ano))
                    if(dia <= 29)
                        dataValida = true;
                    else if(dia <= 28)
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
