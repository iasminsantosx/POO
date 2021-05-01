package br.edu.ifpb;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class UniversidadeTest
{
    @Test
    public void testCadastroFuncionárioDeveFuncionar()
    {
        // Dado que...
        Universidade u = new Universidade();

        // Quando....
        professor p1 = new professor(467, "ana",25, 1200.25, 20 );
        Gerente g1 = new Gerente(332, "pedro", 40,3000.50, 500.99 );
        boolean resultadoProf = u.adicionarFuncionário( p1 );
        boolean resultadoGer = u.adicionarFuncionário( g1 );

        // Então...
        // p1 e g1 foi cadastrado com sucesso
        Assert.assertTrue( resultadoProf );
        Assert.assertTrue( resultadoGer );
    }

    @Test
    public void testCadastroFuncionárioNãoDeveFuncionar()
    {
        // Dado que...
        Universidade u = new Universidade();

        // Quando....
        professor p1 =
                new professor(467, "ana",25,
                        1200, 20 );
        professor cloneP1 =
                new professor(467, "ana",25,
                        1200, 20 );

        professor pNull = null;

        boolean resultadoProf = u.adicionarFuncionário( p1 );
        boolean resultadoClone = u.adicionarFuncionário( p1 );
        boolean resultadoPNull = u.adicionarFuncionário( pNull );

        // Então...
        Assert.assertTrue( resultadoProf );
        Assert.assertFalse( resultadoClone );
        Assert.assertFalse( resultadoPNull );
    }
    @Test
    public void testBuscarFuncionárioDeveFuncionar(){
        Universidade u = new Universidade();
        professor p1 =
                new professor(467, "ana",25,
                        1200, 20 );


    }
}