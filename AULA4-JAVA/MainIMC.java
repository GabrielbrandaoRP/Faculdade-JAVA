import java.util.Scanner;

public class MainIMC {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PessoaIMC p = new PessoaIMC();

        System.out.println("PESO");
        p.setPeso(sc.nextDouble());
        System.out.println("ALTURA");
        p.setAltura(sc.nextDouble());
        p.calcula_imc();
        System.out.println("IMC:"+ p.getIMC());
    }
}
