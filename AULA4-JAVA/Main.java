import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Digite sua idade");
        p.setIdade(sc.nextInt());
        System.out.println("Idade:" + p.getIdade());
    }
}
