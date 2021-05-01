package com.iasmin;

public class EntradaInvalidaException extends RuntimeException{
    public EntradaInvalidaException( String mensagem){
        super(mensagem);
    }
}
