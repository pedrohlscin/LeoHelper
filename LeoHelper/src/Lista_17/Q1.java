package Lista_17;

import java.util.Scanner;

public class Q1 {
    //1 - letra a: A função em questão calcula de forma interativa a soma de 0 até um determinado
    // número, exemplo, caso eu informe o valor 5, ele vai retornar 5 + X(4), onde X(4) =
    // 4 + X(3), e X(3) = 3 + X(2), X(2) = 2 + X(1), X(1) = 1 + X(0) e X(0) = 0; Ou seja
    // X(5) = 5+4+3+2+1+0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero positivo: ");
        int entrada = in.nextInt();
        while(entrada < 1) {
            System.out.println("Informe um numero positivo: ");
            entrada = in.nextInt();
        }
        System.out.println("A soma dos valores é: " + somaValoresInterativo(entrada));
    }

//    Inicio do método da questão 1 letra b:
    private static int somaValoresInterativo(int entrada) {
        int soma = 0;
        while(entrada != 0)
            soma += entrada--;
        return soma;
    }
//    Fim do método da letra b

//    Questão 1 - c:
//    A implementação não recursiva é mais eficiente pois sempre que uma função é chamada
//    recursivamente, o programa precisa suspender a execução atual, salvar informações
//    adicionais (overhead) para que quando a chamada aninhada for terminada o programa
//    poder saber onde voltar para continuar a execução, enquanto que a função interativa
//    não possui esse overhead de suspensão e variaveis extras, ou seja, economiza tempo e
//    memória.

}
