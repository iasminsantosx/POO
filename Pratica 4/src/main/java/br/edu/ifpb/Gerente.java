package br.edu.ifpb;

public class Gerente extends funcionário {
    private double comissão;

    public Gerente() {
        super();
        setComissão(10);
    }

    public Gerente(int matrícula, String nome, int idade, double saláriobase, double comissão) {
        super(matrícula, nome, idade, saláriobase);
        setComissão(comissão);
    }

    public double getComissão() {
        return comissão;
    }

    public void setComissão(double comissão) {
        this.comissão = comissão;
    }

    public double getSalário(){
        return getSaláriobase() + (comissão*2);
    }

    @Override
    public String toString() {
        return super.toString()+ " Salário ="+getSalário();
    }
}
