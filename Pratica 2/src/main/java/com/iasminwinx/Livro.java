package com.iasminwinx;
import java.util.*;
import java.lang.*;

public class Livro {
    private String nome;
    private String autor;
    private int codigo;

    public Livro(String nome, String autor, int codigo) {
        this.nome = nome;
        this.autor = autor;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + "\n" +
                ", autor='" + autor + "\n" +
                ", codigo=" + codigo +
                '}';
    }
}
