package Lista_10;

import java.util.Scanner;

public class Lista_10_Questao_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int laco = 50;
        double total_altura_mulheres = 0, total_altura_homens = 0;
        double maior_alt = 0, menor_alt = 3;
        char sexo_m_alt=' ', sex_menor_alt=' ';
        while(laco > 0){
            System.out.println("Informe o sexo");
            char sexo = sc.next().charAt(0);
            while(sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f'){
                System.out.println("Sexo deve ser M,m,F ou f");
                sexo = sc.next().charAt(0);
            }
            System.out.println("Informe a altura");
            double altura = sc.nextDouble();
            while(altura < 0.5 || altura > 2){
                System.out.println("Altura deve ser entre 0.5m e 2m.");
                altura = sc.nextDouble();
            }
            if(sexo == 'F' || sexo == 'f'){
                total_altura_mulheres += altura;
            }else{
                total_altura_homens += altura;
            }
            if(altura > maior_alt){
                maior_alt = altura;
                sexo_m_alt = sexo;
            }
            if(altura < menor_alt){
                menor_alt = altura;
                sex_menor_alt = sexo;
            }
            laco--;
        }
        System.out.println("A altura média das mulheres é: " + total_altura_mulheres/50.);
        System.out.println("A altura média dos homens é: " + total_altura_homens/50.);

        System.out.print("A maior altura é " + maior_alt + " e é do sexo " + sexo_m_alt);
        System.out.print("A menor altura é " + menor_alt + " e é do sexo " + sex_menor_alt);
    }
}
