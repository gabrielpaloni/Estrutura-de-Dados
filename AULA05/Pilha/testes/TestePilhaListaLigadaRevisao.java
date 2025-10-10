package EDD.AULA05.Pilha.testes;

import EDD.AULA05.Pilha.implementacao.RevisaoPilhaListaLigada;
import EDD.AULA05.Pilha.interfaces.Pilha;

public class TestePilhaListaLigadaRevisao {

    public static void main(String[] args) {
        Pilha p = new RevisaoPilhaListaLigada();

        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);

        System.out.println("Is empty: " + p.isEmpty());

        System.out.println("-------------------------------------------------");

        System.out.println("tamanho: " + p.size());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.peek());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size());

        System.out.println("-------------------------------------------------");

        System.out.println("Push");
        p.push(5);
        p.push(6);
        p.push(7);
        p.push(8);
        System.out.println("tamanho: " + p.size());

        System.out.println("-------------------------------------------------");

        System.out.println("pop: " + p.pop());
        System.out.println("pop: " + p.pop());
        System.out.println("pop: " + p.pop());

        System.out.println("-------------------------------------------------");

        System.out.println("tamanho: " + p.size());

        System.out.println("Is empty: " + p.isEmpty());
        System.out.println("-------------------------------------------------");

        System.out.println("pop: " + p.pop());
        System.out.println("tamanho: " + p.size());
        System.out.println("Is empty: " + p.isEmpty());
        System.out.println("-------------------------------------------------");

    }

}
