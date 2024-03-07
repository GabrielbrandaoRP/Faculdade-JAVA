import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Seja bem vindo ao Mangabeira Pet Center." +
                    "Escolha uma ação para seguir" +
                    " 1:Consultar valores de serviços " +
                    "2: Realizar um pedido" +
                    "3: Ver unidades proximas");

            int x=sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("" +
                            "Banho e tosa: R$50,00" +
                            "Aplicação de injetáveis: R$15,00" +
                            "Consulta veterinária R$120,00" +
                            "exame de sangue R$90,00");
                    break;
                case 2:
                    System.out.println("empty");
                    break;
                case 3:
                    System.out.println("Unidade 1: Mangabeira" +
                            "Unidade 2: Altiplano" +
                            "Unidade 3: Bancários" +
                            "Unidade 4: Bessa");
                    break;
            }
            System.out.println("Para ver novamente, digite 0");
            r = sc.nextInt();
        }while(r==0);
    }
}
