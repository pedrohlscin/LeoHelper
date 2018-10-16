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
public class eleicao7_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int cc=1, x = 0;
        while (cc<=4){
            System.out.println("Candidatos" + cc);
            cc++;
            switch (x) {
                case 1:
                    System.out.println();
                    for (x=1;x<=6;x=x+1){
                        System.out.println(x);
                    }       break;
                case 2:
                    System.out.println();
                    for (x=2;x<=6;x=x+1){
                        System.out.println(x);
                    }       break;
                case 3:
                    System.out.println();
                    for (x=3;x<=6;x=x+1){
                        System.out.println(x);
                    }       break;
                case 4:
                    System.out.println();
                    for (x=4;x<=6;x=x+1){
                        System.out.println(x);
                    }       break;
                case 5:
                    System.out.println();
                    for (x=5;x<=6;x=x+1){
                        System.out.println(x);
                    }       break;
                case 6:
                    System.out.println();
                    for (x=3;x<=6;x=x+1){
                        System.out.println(x);
                    }       break;
            }
        }
    }
}