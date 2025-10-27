package EDD.AULA09.teste;

import EDD.AULA09.entidade.Pato;
import EDD.AULA09.pilha.PilhaListaLigada;

public class TestePilhaPato {
    public static void main(String[] args) {
        PilhaListaLigada patos = new PilhaListaLigada();

        patos.push(new Pato("Ana", 3));
        patos.push(new Pato("Beto", 2));
        patos.push(new Pato("Carlos", 1));

        System.out.println(patos.pop());
        System.out.println(patos.pop());
        System.out.println(patos.pop());
    }
}
