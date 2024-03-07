//exercicio com teclado dentro do switch case
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número");
        int option = sc.nextInt();

        switch (option){
            case 0:
                System.out.println("Comprar item");
                break;
            case 1:
                System.out.println("Solicitar valor do produto ou serviço");
                break;
            case 2:
                System.out.println("Falar com um atendente");
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}
