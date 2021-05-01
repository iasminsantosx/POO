package br.edu.ifpb;

public class funcionário {
    private int matrícula;
    private String nome;
    private int idade;
    private double saláriobase;

    public funcionário() {
        this(0,"--sem nome --",0,500.50);
    }

    public funcionário(int matrícula, String nome, int idade, double saláriobase) {
        this.matrícula = matrícula;
        this.nome = nome;
        this.idade = idade;
        this.saláriobase = saláriobase;
    }

    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }

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

    public double getSaláriobase() {
        return saláriobase;
    }

    public void setSaláriobase(double saláriobase) {
        this.saláriobase = saláriobase;
    }

    @Override
    public String toString() {
        return "matrícula=" + matrícula +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", saláriobase=" + saláriobase;
    }

}
