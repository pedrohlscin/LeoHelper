import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor para sabermos se ele é primo:");
        number = in.nextInt();
        System.out.println(isPrime(number));
    }

    private static boolean isPrime(int number) {
        int div = 1;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0)
                div++;
        }
        return (div == 1);
    }
}
