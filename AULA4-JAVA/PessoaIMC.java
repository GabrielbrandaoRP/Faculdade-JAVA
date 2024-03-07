public class PessoaIMC {
    private double imc, peso, altura;

    public void setPeso(double peso) {
        this.peso = peso;

    }
    public double getPeso(){
        return peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;

    }
    public double getAltura(){
        return altura;
    }
    public void getIMC(double imc) {
        this.imc = imc;

    }
    public double getIMC(){
        return imc;
    }


    public void calcula_imc(){
        imc = peso / (altura * altura);
    }
}
