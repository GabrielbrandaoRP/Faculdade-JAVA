package src;
import java.util.Scanner;
public class CalculadoraMain {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("1 - para somar" + " " + "2 - para subtrair" + " " + "3 - para dividir" + " " + "4 - Para multiplicar");
        option = sc.nextInt();

        switch (option) {
            case 0 -> {
                System.out.println("Número 1:");
                c.n1 = sc.nextInt();
                System.out.println("Numero 2:");
                c.n2 = sc.nextInt();
                c.somar();
            }
            case 1 -> c.subtrair();
            case 2 -> c.dividir();
            case 3 -> c.multiplicar();
            default -> System.out.println("Invalido");
        }

    }
}
