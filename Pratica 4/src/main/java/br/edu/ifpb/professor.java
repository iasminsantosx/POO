package br.edu.ifpb;

public class professor extends funcionário {
    private int numhoras;

    public professor() {
        super();
        setNumhoras(8);
    }

    public professor(int matrícula, String nome, int idade, double saláriobase, int numhoras) {


        super(matrícula, nome, idade, saláriobase);
        this.numhoras = numhoras;
    }

    public int getNumhoras() {
        return numhoras;
    }

    public void setNumhoras(int numhoras) {
        this.numhoras = numhoras;
    }

    public  double getsalário(){
        return getSaláriobase() + (numhoras*2);
    }

    public int getnumhoras(){
        return  numhoras;
    }

    @Override
    public String toString() {
        return super.toString()+" Salário ="+getsalário();
    }
}
