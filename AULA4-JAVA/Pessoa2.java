public class Pessoa2 {

    protected String nome;
    protected double idade;

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected void aniversario (){
        idade++;
    }
}
