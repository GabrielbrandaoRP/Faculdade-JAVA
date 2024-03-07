import  java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno a = new Aluno();

        System.out.println("Digite o nome do aluno");
        a.getNome(sc.next());

    }
}
