import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        System.out.println("Informe o valor de A");
        a = in.nextDouble();
        System.out.println("Informe o valor de B");
        b = in.nextDouble();
        System.out.println("Informe o valor de C");
        c = in.nextDouble();
        if(igualZero(a)){
            System.out.println("Não se trata de uma equação do segundo grau!");
        }else{
            double del = delta(a,b,c);
            if(del < 0){
                System.out.println("Não existem raízes reais!");
            }else{
                double x1 = ((-b) + Math.sqrt(del))/(double)2*a;
                double x2 = (double)((-b) - Math.sqrt(del))/(double)2*a;
                System.out.println("As raízes são x1= " +x1 + " x2= " +x2);
            }
        }
    }

    private static double delta(double a, double b, double c) {
        return (b * b) - (4 * (a * c));
    }

    private static boolean igualZero(double entrada) {
        return (entrada == 0);
    }
}
