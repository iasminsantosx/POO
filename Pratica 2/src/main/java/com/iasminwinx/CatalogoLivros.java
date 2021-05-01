package com.iasminwinx;
import java.util.*;

public class CatalogoLivros {
    private ArrayList<Livro> lista_livros;

    public CatalogoLivros() {
        this.lista_livros = new ArrayList<>();
    }

    public ArrayList<Livro> getLista_livros() {
        return lista_livros;
    }

    public boolean AdicionarLivro(Livro l){
        if(!lista_livros.contains(l)){
            lista_livros.add(l);
            System.out.println("Livro adicionado com sucesso");
            return true;
        }
        else{
            System.out.println("Livro já encontrado no catalogo!");
            return false;
        }
    }

    public boolean RemoverLivro(int codigo){
        for(Livro l : lista_livros){
            if(l.getCodigo()==codigo){
                lista_livros.remove(l);
                System.out.println("Livro removido com sucesso");
                return true;
            }
        }
        System.out.println("Livro não encontrado na lista, então não foi removido");
        return false;
    }

    public boolean pesquisandolivroporcod(int codigo){
        for(Livro l: lista_livros){
            if(l.getCodigo()==codigo){
                System.out.println("O código é referente ao livro:"+l.getNome());
                return true;
            }
        }
        System.out.println("Livro não encontrado");
        return false;
        }

    public void listar_livros(){
        for(Livro l: lista_livros){
            System.out.println(l.getNome());
        }
    }
}

