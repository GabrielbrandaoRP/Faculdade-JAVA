package src;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.println("Digite a sua idade:");
        p.idade = sc.nextInt();

        System.out.println("Antiga" + " " + p.idade);
        p.niver();

        System.out.println("Atual" + " " + p.idade);
    }
}
