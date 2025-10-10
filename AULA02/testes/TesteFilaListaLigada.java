package EDD.AULA02.testes;

import EDD.AULA02.implementacoes.FilaListaLigada;
import EDD.AULA02.interfaces.*;

public class TesteFilaListaLigada {

    public static void main(String[] args) {
        Pilha p = new FilaListaLigada();

        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);

        System.out.println("tamanho: " + p.size());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.peek());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size());

    }

}
