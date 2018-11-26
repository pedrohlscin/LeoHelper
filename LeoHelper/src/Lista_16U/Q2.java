import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor:");
        double entrada = in.nextDouble();
        igualZero(entrada);
    }

    private static void igualZero(double entrada) {
        System.out.println(entrada == 0);
    }
}
