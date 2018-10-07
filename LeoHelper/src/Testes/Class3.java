package Testes;

public class Class3 {
    int a = 1, b = 3;
    void m(){
        System.out.println(this.a+this.b);
        String a = "Pedro ";
        String b = "Henrique";
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Class3 classe = new Class3();
        classe.m();
    }
}
