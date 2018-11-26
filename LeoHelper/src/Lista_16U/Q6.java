import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            printOpcoes();
            int opcao = in.nextInt();
            if (opcao == 7) {
                break;
            }else{
                System.out.println("informe o valor em metros que deseja converter:");
                double metros = in.nextDouble();
                System.out.println("O valor convertido para a unidade desejada é: " + getConvertido(opcao,metros));
            }
        }
        in.close();
    }

    private static double getConvertido(int opcao, double metros) {
        double value = 0;
        switch (opcao){
            case 1:
                value = toKm(metros);
                break;
            case 2:
                value = toHm(metros);
                break;
            case 3:
                value = toDec(metros);
                break;
            case 4:
                value = toDc(metros);
                break;
            case 5:
                value = toCm(metros);
                break;
            case 6:
                value = toMm(metros);
                break;
        }
        return value;
    }

    private static double toKm(double metros) {
        return (double)metros / 1000;
    }

    private static double toHm(double metros) {
        return (double)metros / 100;
    }

    private static double toDec(double metros) {
        return (double)metros / 10;
    }

    private static double toDc(double metros) {
        return (double)metros * 10;
    }

    private static double toCm(double metros) {
        return (double)metros * 100;
    }

    private static double toMm(double metros) {
        return (double)metros * 1000;
    }


    private static void printOpcoes() {
        System.out.println("\tMenu para seleção de opções:");
        System.out.println("1 - para converter para quilometros.");
        System.out.println("2 - para converter para hectometros.");
        System.out.println("3 - para converter para decametro.");
        System.out.println("4 - para converter para decimetros.");
        System.out.println("5 - para converter para centimetros.");
        System.out.println("6 - para converter para milimetros.");
        System.out.println("7 - para sair.");
    }
}
