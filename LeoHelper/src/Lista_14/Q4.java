package Lista_14;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Entre com os coeficientes a,b e c (nesta ordem) da equação ax^2+bx+c");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        while(a < 0){
            System.out.println("O valor de a deve ser positivo!");
            System.out.println("Entre com os coeficientes a,b e c (nesta ordem) da equação ax^2+bx+c");
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
        }
        calculaRaizes(a,b,c);
    }

    private static void calculaRaizes(int a, int b, int c) {
        double delta = calculaDelta(a, b, c);
        if(delta != -1.){
            double raizDelta = Math.sqrt(delta);
            double x1 = ((b*-1) + raizDelta)/(2*a);
            double x2 = ((b*-1) - raizDelta)/(2*a);
            System.out.println("As raizes são: " + x1 + " e " + x2);
        }else{
            System.out.println("Não existe raiz!");
        }
    }

    private static double calculaDelta(int a, int b, int c) {
        double delta = b * b - (4*a*c);
        if(delta >= 0)
            return delta;
        return -1.;
    }
}
