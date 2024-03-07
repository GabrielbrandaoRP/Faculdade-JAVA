package src;

public class Calculadora {
    int n1,n2,total;

    public void somar(){
        total = n1 + n2;
        System.out.println(total);
    }
    public void subtrair(){
        total = n1 - n2;
        System.out.println(total);
    }
    public void dividir(){
        total = n1 / n2;
        System.out.println(total);
    }

    public void multiplicar(){
        total = n1 * n2;
        System.out.println(total);
    }


}
