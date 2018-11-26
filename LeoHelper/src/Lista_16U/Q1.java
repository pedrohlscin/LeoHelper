import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor:");
        double entrada = in.nextDouble();
        maiorIgualZero(entrada);
    }

    private static void maiorIgualZero(double entrada) {
        System.out.println(entrada >= 0);
    }
}
