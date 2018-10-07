package Lista_10;

import java.util.Scanner;

public class Lista_10_Questao_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        while (continua){
            System.out.println("Informe o valor que você deseja investir:");
            double valor = sc.nextDouble();
            while(valor < 0){
                System.out.println("O valor deverá ser maior que 0!");
                valor = sc.nextDouble();
            }
            if(valor < 1000 && valor >= 100){
                System.out.println("Você pode investir na poupança!");
                System.out.println("Seu rendimento será: " + valor * 0.5);
            }else if(valor < 2500){
                System.out.println("Você pode investir na poupança e nos fundos de renda fixa!");
                System.out.println("Seu rendimento na poupança será: " + valor * 0.05);
                System.out.println("Seu rendimento no fundo de renda fixa será: " + valor * 0.1);
            }else{
                System.out.println("Você pode investir na poupança, nos fundos de renda fixa e CDBs !");
                System.out.println("Seu rendimento na poupança será: " + valor * 0.05);
                System.out.println("Seu rendimento no fundo de renda fixa será: " + valor * 0.1);
                System.out.println("Seu rendimento nos CDBs será: " + valor * 0.15);
            }
            System.out.println("S para avaliar outro cliente N para encerrar");
            char input = sc.next().charAt(0);
            while(input != 'S' && input != 'N'){
                System.out.println("S para avaliar outro cliente N para encerrar");
                input = sc.next().charAt(0);
            }
        }
    }
}
