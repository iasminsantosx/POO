package com.iasminwinx;

public class Calculadora {
    private Double Memória;

    public Calculadora() {
        setMemória(null);
    }

    public Double getMemória() {
        return Memória;
    }

    public void setMemória(Double memória) {
        Memória = memória;
    }

    public Double somar(Double n1, Double n2){
        Double soma = n1+n2;
        setMemória(soma);
        return getMemória();
    }

    public Double subtrair(Double n1, Double n2){
        Double subtração = n1-n2;
        setMemória(subtração);
        return getMemória();
    }
    public Double multiplicar(Double n1, Double n2){
        Double multiplicação = n1*n2;
        setMemória(multiplicação);
        return getMemória();
    }
    public Double dividir(Double n1, Double n2){
        Double divisão = n1/n2;
        setMemória(divisão);
        return getMemória();
    }
}
