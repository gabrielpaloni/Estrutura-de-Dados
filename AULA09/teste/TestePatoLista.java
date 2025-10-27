package EDD.AULA09.teste;

import EDD.AULA09.entidade.Pato;

import java.util.ArrayList;
import java.util.List;

public class TestePatoLista {
    public static void main(String[] args) {
        List <Pato> patos  = new ArrayList<>();

        patos.add(new Pato("Ana", 3));
        patos.add(new Pato("Beto", 2));
        patos.add(new Pato("Carlos", 1));

        for (Pato p : patos){
            p.getIdade();
        }
        patos.get(0);

    }
}
