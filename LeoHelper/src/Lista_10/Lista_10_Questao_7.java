package Lista_10;

import java.util.Scanner;

public class Lista_10_Questao_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        while(input != '#'){
            if(input >= 30 && input <= 39){
                System.out.println("Foi digitado um numero!");
            }else if(input >= 65 && input <= 90){
                System.out.println("Foi digitado uma letra maiuscula!");
            }else if(input >= 97 && input <= 122){
                System.out.println("Foi digitado uma letra minuscula!");
            }else{
                System.out.println("Foi digitado um caracter especial!");
            }
            input = sc.next().charAt(0);
        }
    }
}
