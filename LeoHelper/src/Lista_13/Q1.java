package Lista_13;

import java.util.Scanner;

public class Q1 {

    static double cubo(double lado){
        return lado * lado * lado;
    }

    static double paralelepipedo(double altura, double largura, double comprimento){
        return largura * altura * comprimento;
    }

    static double esfera(double raio){
        return Math.PI * (raio * raio);
    }

    static double cilindro(double altura, double raio){
        return Math.PI * (raio * raio) * altura;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Informe a opção desejada:");
            System.out.println("1 - para area do cubo");
            System.out.println("2 - para area do paralelepipedo");
            System.out.println("3 - para area da esfera");
            System.out.println("4 - para area do cilindro");
            System.out.println("5 - para sair");
            int operacao = in.nextInt();
            if(operacao == 1){
                System.out.println("Informe o valor do lado:");
                int lado = in.nextInt();
                System.out.println("O valor da área do cubo é: " + cubo(lado));
            }else if(operacao == 2){
                System.out.println("Informe o valor da altura, da largura e do comprimento:");
                int altura = in.nextInt();
                int largura = in.nextInt();
                int comprimento = in.nextInt();
                System.out.println("O valor da área do paralelepipedo é: " + paralelepipedo(altura, largura, comprimento));
            }else if(operacao == 3){
                System.out.println("Informe o valor do raio:");
                int raio = in.nextInt();
                System.out.println("O valor da área da esfera é: " + esfera(raio));
            }else if(operacao == 4){
                System.out.println("Informe o valor do raio e da altura:");
                int raio = in.nextInt();
                int altura = in.nextInt();
                System.out.println("O valor da área do cilindro é: " + cilindro(raio, altura));
            }else{
                break;
            }
        }
    }
}
