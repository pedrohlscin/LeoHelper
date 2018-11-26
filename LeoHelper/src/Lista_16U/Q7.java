import java.util.concurrent.ThreadLocalRandom;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("O valor sorteado foi: " + jogarDado());
    }

    private static double jogarDado() {
        return ThreadLocalRandom.current().nextInt(0,7) % 7;
    }
}
