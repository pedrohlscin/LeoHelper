import java.util.concurrent.ThreadLocalRandom;

public class Q8 {
    public static void main(String[] args) {
        int[] cont = new int[7];
        for(int i = 0; i < 1000000; i++){
            cont[(int)jogarDado()] += 1;
        }
        for(int i = 0; i < 6; i++){
            System.out.println("A quantidade de vezes que " + (i+1) + " foi sorteado é: :" + cont[i]);
        }
    }
    private static double jogarDado() {
        return ThreadLocalRandom.current().nextInt(0,6);
    }
}
