package br.edu.ifpb;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private List<funcionário> Lista = new ArrayList();
    private String endereço;

    public boolean adicionarFuncionário( funcionário f) {
        if( f == null) return false;
        for (int i = 0; i < Lista.size(); i++) {
             if(Lista.get(i).getMatrícula()== f.getMatrícula()) return false;


        }
        return Lista.add(f);
    }


}
