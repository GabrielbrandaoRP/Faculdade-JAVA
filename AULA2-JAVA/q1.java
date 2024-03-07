import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = sc2.nextInt();

        System.out.println(name + " " + idade);
        System.out.println("Deseja fazer um novo cadastro?");



    }
}
