package com.iasminwinx;

public class Teste {
    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        Livro l1 = new Livro("Guerra dos Tronos","George RR Martin",123);
        Livro l2 = new Livro("Orgulho e Preconceito","Jane Austin",124);
        Livro l3 = new Livro("Harry Potter","JK",125);

        livros.AdicionarLivro(l1);
        livros.AdicionarLivro(l2);
        livros.AdicionarLivro(l3);
        livros.AdicionarLivro(l1);

        livros.listar_livros();

        livros.pesquisandolivroporcod(123);
        livros.pesquisandolivroporcod(156);

        livros.RemoverLivro(123);
        livros.RemoverLivro(156);
    }
}
