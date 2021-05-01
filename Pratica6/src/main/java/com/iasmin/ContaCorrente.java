package com.iasmin;

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
        if (saldo>=0){ this.saldo = saldo;}
        else{ throw new QuantiaNegativaException("Valor negativo não é aceito!");}
        }

        public String deposito( double valor) throws QuantiaNegativaException, EntradaInvalidaException{
            if (valor>=00.00){
                double saldoatual = getSaldo();
                double saldo_com_deposito = saldoatual + valor;
                setSaldo(saldo_com_deposito);
                return "Valor depositado com sucesso";
            }
            else if (valor<0){
                throw new QuantiaNegativaException("Valor negativo não aceito!");
            }
            else{
                throw new EntradaInvalidaException("Valor não númerico");
            }


        }

        public String saque(double valor) throws SaldoInsuficienteException,EntradaInvalidaException{
            if(valor<=getSaldo()){
                double saldoatual = getSaldo() - valor;
                setSaldo(saldoatual);
                DescontaCPMF(valor);
                return "Saque realizado com sucesso e o Valor do CPMF foi descontado";

            }
            else if (valor>getSaldo()){
                throw  new SaldoInsuficienteException("Saldo insuficiente!");
            }
            else{
                throw new EntradaInvalidaException("Não foi inserido um valor válido");
            }

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


