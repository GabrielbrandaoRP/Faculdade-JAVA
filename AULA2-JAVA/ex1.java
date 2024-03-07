public class ex1 {
    public static void main(String[] args) {

        int x=1;
        int repetir = 0;
        do {
            System.out.println("Caso escolha...");
            switch (x){
                case 0:
                    System.out.println("Opção 0 escolhida");
                    break;
                case 1:
                    System.out.println("Opção 1 escolhida");
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("Para repetir, digite 0");
        }while (repetir ==0);

    }
}
//exemplo de switch case
