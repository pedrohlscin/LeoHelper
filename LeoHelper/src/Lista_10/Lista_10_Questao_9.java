package Lista_10;

import java.util.Scanner;

public class Lista_10_Questao_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        while (continua) {
            System.out.println("Informe seu salário: ");
            double salario = sc.nextDouble();
            while (salario < 880) {
                System.out.println("Salário deve ser maior que 880!");
                salario = sc.nextDouble();
            }
            if (salario <= 1500) {
                System.out.println("O funcionário terá aumento de R$ " + (salario * 0.2) + " e passará a receber R$ " + salario + (salario * 0.2));
            } else if (salario <= 2500) {
                System.out.println("O funcionário terá aumento de R$ " + (salario * 0.15) + " e passará a receber R$ " + salario + (salario * 0.15));
            } else if (salario < 4000) {
                System.out.println("O funcionário terá aumento de R$ " + (salario * 0.1) + " e passará a receber R$ " + salario + (salario * 0.1));
            } else {
                System.out.println("O funcionário terá aumento de R$ " + (salario * 0.05) + " e passará a receber R$ " + salario + (salario * 0.05));
            }
            System.out.println("S para avaliar outro funcionario N para encerrar");
            char input = sc.next().charAt(0);
            while (input != 'S' && input != 'N') {
                System.out.println("S para avaliar outro funcionario N para encerrar");
                input = sc.next().charAt(0);
            }
        }
    }
}
