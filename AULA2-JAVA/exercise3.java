import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Caso escolha 1: Comprar blusa, Caso escolha 2: Solicitar valor do produto ou serviço");
            int x=sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("ótima escolha");
                    break;
                case 2:
                    System.out.println(" O valor da blusa é R$45,00");
                    break;
            }
            System.out.println("Para ver novamente, digite 0");
            r = sc.nextInt();
            }while(r==0);
    }
}
