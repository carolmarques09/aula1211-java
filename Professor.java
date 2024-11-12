package model;

public class Professor extends Pessoa implements FolhaPagamento {
    private String nome;
    private int idade;
    private double matricula;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void responsabilidade() {
        System.out.println("Ensinar");
    }

    public void calcSalario() {
    }

    @Override
    public void calcularSalario() {
    }
}
