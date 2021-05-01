package com.iasminwinx;
import java.util.*;

public class City {
    private String Nome_cidade;
    private String Estado;
    public City(String nome_cidade,String estado) {
        Nome_cidade = nome_cidade;
        Estado = estado;
    }

    public City() {
        this.Nome_cidade = "Sem Nome";
        this.Estado = "Sem Nome";
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getNome_cidade() {
        return Nome_cidade;
    }

    public void setNome_cidade(String nome_cidade) {
        Nome_cidade = nome_cidade;
    }

    @Override
    public String toString() {
        return "City{" +
                "Nome_cidade='" + Nome_cidade + '\'' +
                ", Estado='" + Estado + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        return Nome_cidade.equals(city.Nome_cidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome_cidade );
    }

    public int compareTo(String anotherString) {
        return Nome_cidade.compareTo(anotherString);
    }
}
