package Lista_14;

import java.util.Scanner;

public class Q1 {

    public static int horasEmMinutos(int hora, int minutos){
        return hora * 60 + minutos;
    }

    public static void minutosEmHoras(int minutos){
        System.out.println("O tempo informado em minutos é: " + minutos/60 + " horas e " + minutos%60 + " minutos!");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int opcao_escolhida = 0;
            System.out.println("Você pode converter de horas e minutos para apenas minutos, ou de minutos para horas e minutos");
            System.out.println("Escolha qual das opções, 1 ou 2");
            System.out.println("Para sair tecle 0");
            opcao_escolhida = in.nextInt();
            if (opcao_escolhida == 0)
                return;
            while (opcao_escolhida != 1 && opcao_escolhida != 2) {
                System.out.println("Você pode converter de horas e minutos para apenas minutos, ou de minutos para horas e minutos");
                System.out.println("Escolha qual das opções, 1 ou 2");
                opcao_escolhida = in.nextInt();
            }
            if (opcao_escolhida == 1) {
                System.out.print("Informe o numero de horas: ");
                int hora = in.nextInt();
                System.out.print("Informe o numero de minutos: ");
                int minutos = in.nextInt();
                System.out.println("O tempo informado em minutos é: " + horasEmMinutos(hora, minutos));
            } else {
                System.out.print("Informe o numero de minutos: ");
                int minutos = in.nextInt();
                minutosEmHoras(minutos);
            }
        }
    }
}
