import java.util.Scanner;
public class MainFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("Digite o valor da hora trabalhada: R$");
        f.setValorHora(sc.nextDouble());

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        f.setHorasTrabalhadas(sc.nextInt());

        f.calcularSalario();
        System.out.println("O valor da hora:" + f.getValorHora()+ "R$, trabalhando " + f.getHorasTrabalhadas()+ "horas");
    }
}
