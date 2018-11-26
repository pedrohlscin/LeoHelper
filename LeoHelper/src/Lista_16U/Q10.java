import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor:");
        int valor = in.nextInt();
        while(valor <= 0){
            System.out.println("Informe um valor maior que zero:");
            valor = in.nextInt();
        }
        for(int i = 2; i < valor; i++){
            if(isPrime(i))
                System.out.println(i + " É primo!");
        }
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
