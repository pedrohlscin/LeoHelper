import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        System.out.println("Informe o valor de A");
        a = in.nextDouble();
        System.out.println("Informe o valor de B");
        b = in.nextDouble();
        System.out.println("Informe o valor de C");
        c = in.nextDouble();
        System.out.println("O valor de delta é: " + delta(a,b,c));
    }

    private static double delta(double a, double b, double c) {
        return (b * b) - (4 * (a * c));
    }
}
