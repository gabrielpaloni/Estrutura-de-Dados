package EDD.AULA09.teste;

import EDD.AULA09.entidade.Pato;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestePatoDict {
    public static void main(String[] args) {

        Map<String, Pato> patosByNome = new TreeMap<String, Pato>();

        List<Pato> patos = new ArrayList<>();

        patos.add(new Pato("Ana", 3));
        patos.add(new Pato("Beto", 2));
        patos.add(new Pato("Carlos", 1));
        patos.add(new Pato("Ana", 3));
        patos.add(new Pato("Carlos", 1));
        patos.add(new Pato("Beto", 2));
        patos.add(new Pato("Carlos", 1));
        patos.add(new Pato("Beto", 3));
        patos.add(new Pato("Beto", 4));

        for(var p: patos){
            patosByNome.put(p.getNome(), p);
        }

        for(String nome: patosByNome.keySet()){
            System.out.println(nome);
            Pato p = patosByNome.get(nome);
            System.out.println(p);
        }
    }

}
