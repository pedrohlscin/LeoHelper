/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_11;
import java.util.Scanner;
/**
 *
 * @author Leonardo
 */
public class idade5_11 {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int x, n, s=0;
    String resp;
    do {
    System.out.println("Informe a idade");
    x = in.nextInt();
    } while (x<0 || x>120);
    System.out.println("idade ivalida, informe novamente");
    n = in.nextInt();
    s += n;
    System.out.println("Quer continuar? [S/N] ");
    resp = in.next();
     while(resp.equals("S")){
    System.out.println ("A soma de todos os valores é " + s);     
     }
        
    }
    
    }

