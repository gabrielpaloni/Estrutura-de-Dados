package EDD.AULA02.implementacoes;

import EDD.AULA02.interfaces.*;

public class PilhaListaLigada implements Pilha {

    private Node topo = null;
    int tamanho=0;

    @Override
    public boolean isEmpty() {
        return tamanho==0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public void push(int e) {
        Node antigoTopo = topo;
        topo = new Node(e);
        topo.next = antigoTopo;

        tamanho++;
    }

    @Override
    public int pop() {
        int elemento = topo.element;
        topo = topo.next;

        tamanho--;

        return elemento;
    }

    @Override
    public int peek() {
        return topo.element;
    }
}