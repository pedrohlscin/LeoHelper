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
public class letras9_11 {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
int n, i, j;
        System.out.println("Informe o valor de n");
        n=in.nextInt();
        while (n<=0 || n>26){
        System.out.println("Número invalido digite um outro numero");
        n=in.nextInt();
        }
        for (i=1;i<=n;i=i+1){
            for (j=1; j<=i; j=j+1){
                System.out.print("a"
                        + "b"
                        + "c");
            }
            System.out.println("");
    }
    }
    }

