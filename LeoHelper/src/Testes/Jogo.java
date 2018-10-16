package Testes;

import java.security.SecureRandom;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        int a = 1;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int nivel_dificuldade = 0;
            System.out.println("Informe o nível de dificuldade");
            System.out.println("1 - Fácil");
            System.out.println("2 - Médio");
            System.out.println("3 - Difícil");
            nivel_dificuldade = sc.nextInt();
            while(nivel_dificuldade < 1 || nivel_dificuldade > 3){
                System.out.println("Informe o nível entre uma das opções abaixo:");
                System.out.println("1 - Fácil");
                System.out.println("2 - Médio");
                System.out.println("3 - Difícil");
                nivel_dificuldade = sc.nextInt();
            }
            int senha = 0;
            SecureRandom random = new SecureRandom();
            senha = random.nextInt(101);
            while(senha == 0){
                senha = random.nextInt(101);
            }
            int numero_max_tentativas = 0;
            if(nivel_dificuldade == 1){
                numero_max_tentativas = 10;
            }else if(nivel_dificuldade == 2){
                numero_max_tentativas = 8;
            }else{
                numero_max_tentativas = 5;
            }
            int chute = 0;
            System.out.println("Agora tente acertar o número secreto:");
            chute = sc.nextInt();
            int tentativa = 1;


            int limite_superior = 100, limite_inferior=0;
            while(chute != senha  && tentativa <= numero_max_tentativas) {
                tentativa++;
                if(tentativa == numero_max_tentativas){
                    System.out.println("Infelizmente, você não consegui acertar a senha. Tente novamente mais tarde!");
                    break;
                }
                if (chute > senha) {
                    limite_superior = chute;
                } else {
                    limite_inferior = chute;
                }
                System.out.println("Tente outra vez. Informe um valor entre: " + limite_inferior + " e: " + limite_superior);
                chute = sc.nextInt();
                if(chute == senha+1 || chute == senha-1){
                    System.out.println("Você está QUENTE!");
                }
                while(chute < limite_inferior || chute > limite_superior){
                    System.out.println("Tente outra vez. Informe um valor entre: " + limite_inferior + " e: " + limite_superior);
                    chute = sc.nextInt();
                }
            }
            if(chute == senha){
                System.out.println("Parabéns! Você acertou em " + tentativa + " tentativas.");
            }
            System.out.println("Você desejar jogar uma nova partida?");
            System.out.println("1 - Sim\n2 - Não");
            int desejo = sc.nextInt();
            while(desejo != 1 && desejo != 2){
                System.out.println("Informe um valor entre 1 e 2!");
                System.out.println("1 - Sim\n2 - Não");
                desejo = sc.nextInt();
            }
            if(desejo == 2){
                break;
            }
        }
    }
}
