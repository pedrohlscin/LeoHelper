package Lista_13;

import java.util.Scanner;

public class Q2 {

    static int coeficiente_do_salario(char turno){
        if(turno == 'M')
            return 10;
        else if(turno == 'V')
            return 15;
        else return 20;
    }

    static double salario_liquido(double salario, double imposto, double auxilio){
        return salario - imposto + auxilio;
    }

    static double salario_bruto(double valor_salario_base, double numero_horas_trabalhadas, int valor_coeficiente){
        return valor_salario_base + (numero_horas_trabalhadas * valor_coeficiente);
    }

    static int imposto_sobre_salario(char categoria, double valor_salario_bruto){
        if(categoria == 'O'){
            if(valor_salario_bruto >= 300)
                return 5;
            else
                return 3;
        }else{
            if(valor_salario_bruto >= 400)
                return 6;
            else
                return 4;
        }
    }

    static int classificacao(double salario){
        if(salario < 500)
            return 1;
        else if(salario < 1000)
            return 2;
        else
            return 3;
    }

    static int gratificacao(double numero_horas_trabalhadas, char turno_de_trabalho){
        if(turno_de_trabalho == 'N' && numero_horas_trabalhadas > 80)
            return 50;
        else
            return 30;
    }

    static double auxilio_alimentacao(char categoria_funcionario, int coeficiente, double salario_bruto){
        if(categoria_funcionario == 'O' || coeficiente <= 25)
            return (salario_bruto / (double)3);
        else
            return (salario_bruto/(double)2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Digite 1 para sair, 0 para continuar");
            int opcao = in.nextInt();
            while(opcao != 1 && opcao != 0){
                System.out.println("Digite 1 para sair, 0 para continuar");
                opcao = in.nextInt();
            }
            if(opcao == 1)
                return;
            double salario_base;
            char turno;
            char categoria;
            double numero_horas_trabalhadas;
            System.out.println("Informe o salário base");
            salario_base = in.nextDouble();
            while(salario_base < 0){
                System.out.println("O salário base deve ser maior que 0!");
                salario_base = in.nextDouble();
            }
            System.out.println("Informe o turno");
            turno = in.next().charAt(0);
            while(turno != 'M' && turno != 'V' && turno != 'N'){
                System.out.println("O turno deve ser N para noturno, M para matutino e V para vespertino!");
                turno = in.next().charAt(0);
            }
            System.out.println("Informe a categoria");
            categoria = in.next().charAt(0);
            while(categoria != 'O' && categoria != 'G'){
                System.out.println("A categoria deve ser O para operário e G para gerente!");
                categoria = in.next().charAt(0);
            }
            System.out.println("Informe a quantidade de horas trabalhadas");
            numero_horas_trabalhadas = in.nextDouble();
            while(numero_horas_trabalhadas < 0){
                System.out.println("O numero de horas trabalhadas deve ser maior que zero!");
                numero_horas_trabalhadas = in.nextDouble();
            }
            int coeficiente = coeficiente_do_salario(turno);
            System.out.println("O coeficiente do valor de trabalho é: " + coeficiente);
            double salario_bruto = salario_bruto(salario_base, numero_horas_trabalhadas, coeficiente);
            System.out.println("O salário bruto é: " + salario_bruto);
            int imposto_sobre_salario = imposto_sobre_salario(categoria, salario_bruto);
            System.out.println("O imposto sobre o salário é: " + imposto_sobre_salario);
            int gratificacao = gratificacao(numero_horas_trabalhadas, turno);
            System.out.println("A gratificação devida é: " + gratificacao);
            double auxilio_alimentacao = auxilio_alimentacao(categoria, coeficiente, salario_bruto);
            System.out.println("o auxilio alimentação é: " + auxilio_alimentacao);
            double salario_liquido = salario_liquido(salario_bruto, 100, auxilio_alimentacao);
            System.out.println("O salário liquido é: " + salario_liquido);
            System.out.println("A classificação do salário do funcionário é: " + classificacao(salario_liquido));
            System.out.println("1 - Significa mal remunerado\n2 - Significa normal\n3 - Significa bem remunerado!");
        }
    }
}
