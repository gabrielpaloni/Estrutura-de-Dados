package EDD.AULA09.teste;

import EDD.AULA09.entidade.Pato;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestePatoConjunto {
    public static void main(String[] args) {

        Pato p1 = new Pato("Test", 0);
        Pato p2 = new Pato("Test", 0);

        String s1 = "Ana";
        String s2 = "Ana";

        System.out.println(s1.equals(s2));

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        Set<Pato> conjunto = new HashSet<>();

        conjunto.add(new Pato("Ana", 3));
        conjunto.add(new Pato("Carlos", 1));
        conjunto.add(new Pato("Beto", 2));
        conjunto.add(new Pato("Carlos", 1));
        conjunto.add(new Pato("Beto", 3));
        conjunto.add(new Pato("Beto", 4));

        for(var e: conjunto){
            System.out.println(e);
        }


    }
}
