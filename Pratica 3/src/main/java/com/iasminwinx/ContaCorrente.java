package com.iasminwinx;
import java.lang.*;

public class ContaCorrente {
    private String usuario;
    private int id;
    private double saldo;

    public ContaCorrente() {
        setUsuario("NONE");
        setId(00);
        setSaldo(00.00);
    }

    public ContaCorrente(String usuario, int id, Double saldo) {
        this.usuario = usuario;
        this.id = id;
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean deposito( double valor){
        if (valor>=00.00){
            double saldoatual = getSaldo();
            double saldo_com_deposito = saldoatual + valor;
            setSaldo(saldo_com_deposito);
            System.out.println("Valor depositado com sucesso");
            return true;
        }
        System.out.println("Valor não depositado");
        return false;


    }

    public boolean saque(double valor){
        if(valor<=getSaldo()){
            double saldoatual = getSaldo() - valor;
            setSaldo(saldoatual);
            DescontaCPMF(valor);
            System.out.println("Saque realizado com sucesso e o Valor do CPMF foi descontado");
            return true;
        }
        System.out.println("Saque não realizado! Saldo insuficiente");
        return false;
    }

    public String extrato(){

        return ("Nome do titular:" + getUsuario() +"O saldo atual da conta é:"+getSaldo());
    }

    public Double CalculaCPMF(double valor){
        return (valor*0.01);
    }

    public Double DescontaCPMF(double valor){
        return (getSaldo()-(valor+CalculaCPMF(valor)));
    }


}
