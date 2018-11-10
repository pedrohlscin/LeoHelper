package Lista_15;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r1, r2, r3;
        System.out.println("Informe o valor do segmento de reta 1:");
        r1 = in.nextInt();
        while (r1 <= 0) {
            System.out.println("O valor do segmento de reta r1 deve ser maior que zero:");
            r1 = in.nextInt();
        }
        System.out.println("Informe o valor do segmento de reta 2:");
        r2 = in.nextInt();
        while (r2 <= 0) {
            System.out.println("O valor do segmento de reta r2 deve ser maior que zero:");
            r2 = in.nextInt();
        }
        System.out.println("Informe o valor do segmento de reta 3:");
        r3 = in.nextInt();
        while (r3 <= 0) {
            System.out.println("O valor do segmento de reta r3 deve ser maior que zero:");
            r3 = in.nextInt();
        }
        boolean triangulo = ehTriangulo(r1, r2, r3);
        if(triangulo){
            System.out.print("É um triangulo!");
            int tipoTriangulo = formaTriangulo(r1,r2,r3);
            if(tipoTriangulo == 1)
                System.out.println(" Do tipo escaleno!");
            else if(tipoTriangulo == 2)
                System.out.println(" Do tipo isósceles!");
            else
                System.out.println(" Do tipo equilátero!");
        }else{
            System.out.println("Não é um triangulo!");
        }
    }

    private static int formaTriangulo(int r1, int r2, int r3) {
        int retorno = 0;
        if(r1 != r2 && r2 != r3 && r1 != r3)
            retorno = 1;
        if((r1 == r2 && r1 != r3) || (r1 == r3 && r1 != r2) || (r2 == r3 && r2 != r1))
            retorno = 2;
        if(r1 == r2 && r2 == r3)
            retorno = 3;
        return retorno;
    }

    private static boolean ehTriangulo(int r1, int r2, int r3) {
        boolean retorno = false;
        if ((r1 < (r2 + r3)) && (r2 < (r1 + r3)) && r3 < (r1 + r2)) {
            retorno = true;
        }
        return retorno;
    }
}
