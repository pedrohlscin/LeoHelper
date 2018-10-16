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
public class tabela3_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x;
        System.out.println("informe o valor número");
        x = in.nextInt();
        while (x<1 || x>10){
        System.out.println ("O valor é inválido, informe outro valor");
        }
        switch (x) {
            case 1:
                System.out.println();
                for (x=1;x<=10;x=x+1){
                    System.out.println(x);
                }       break;
            case 2:
                System.out.println();
                for (x=2;x<=20;x=x+2){
                    System.out.println(x);
                }       break;
            case 3:
                System.out.println();
                for (x=3;x<=30;x=x+3){
                    System.out.println(x);
                }       break;
            case 4:
                System.out.println();
                for (x=4;x<=40;x=x+4){
                    System.out.println(x);
                }       break;
            case 5:
                System.out.println();
                for (x=5;x<=50;x=x+5){
                    System.out.println(x);
                }       break;
            case 6:
                System.out.println();
                for (x=3;x<=30;x=x+3){
                    System.out.println(x);
                }       break;
            case 7:
                System.out.println();
                for (x=7;x<=70;x=x+7){
                    System.out.println(x);
                }       break;
            case 8:
                System.out.println();
                for (x=8;x<=80;x=x+8){
                    System.out.println(x);
                }       break;
            case 9:
                System.out.println();
                for (x=9;x<=90;x=x+9){
                    System.out.println(x);
                }       break;
            default:
                System.out.println();
                for (x=10;x<=10;x=x+10){
                    System.out.println(x); 
                }       break;
        }
        }
}
