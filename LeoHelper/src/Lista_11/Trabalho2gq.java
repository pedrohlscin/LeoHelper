package Lista_11;
import java.security.SecureRandom;
import java.util.Scanner;
/**
 *
 * @author Leonardo
 */
public class Trabalho2gq{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n1, chances = 0, senha, senhaAtual;
        SecureRandom random = new SecureRandom();
        int numero = random.nextInt(99)+1;
        System.out.println("Escolha o nível de dificuldade: 1, 2 ou 3");
        n1 = in.nextInt();
        switch (n1) {
            case 1:
                while (chances<10){        
                    chances++;
                }       break;
            case 2:
                while (chances<8){
                    chances++;
                }       break;
            default:
                while (chances<5){
                    chances++; 
                }       break;
        }
       System.out.println("Tente descobrir a senha");
       senha = in.nextInt();
       while (numero<senha){
       System.out.println ("Tente outra vez. Informe um valor entre 0 e " + senha);
       senhaAtual = senha;    
       while (numero>senha){
           
       }
           System.out.println ("Tente outra vez. Informe um valor entre " + senhaAtual + " e " + senha);
           senhaAtual = senha;
           chances++;     
           if(senha==numero-1 || senha==numero+1){
           System.out.println ("Você está QUENTE!");    
           }
           while (chances<1){
               if(senha==numero){
               System.out.println ("Você acertou a senha, parabêns!");
               } else {
               System.out.println ("Infelizmente, você não conseuiu acertar a senha. Tente novamente mais tarde!");        
                       }
               }
           }
       }
       }
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Leonardo
 */

    

