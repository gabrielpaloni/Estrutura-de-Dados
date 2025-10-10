package EDD.AULA07.implementacao;
import EDD.AULA07.interfaces.Lista;
import EDD.AULA07.estruturas.Node;

import java.util.Iterator;

public class ListaLigada implements Lista {

    int tamanho = 0;
    Node primeiro;
    Node ultimo;

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public int get(int index) {
        return getNode(index).elemento;
    }

    @Override
    public void set(int index, int element) {
        getNode(index).elemento = element;
    }

    @Override
    public void delete(int index) {

        if(index==0){
            primeiro = primeiro.next;
            tamanho--;
            return;
        }
        if(index == tamanho -1){
            ultimo = getNode(index -1);
            ultimo.next = null;
            tamanho--;
            return;
        }

        Node n = getNode(index - 1);
        n.next = n.next.next;
        tamanho--;
    }

    private Node getNode(int index){

        if(index>=tamanho)
            throw new IndexOutOfBoundsException("Indice "+ index+" maior que o tamanho da lista "+tamanho);

        Node atual = primeiro;
        int atualIndex = 0;

        while(atualIndex<index){
            atual = atual.next;
            atualIndex++;
        }
        return atual;
    }

    @Override
    public void pushUltimo(int element) {
        Node novoNode = new Node(element);

        if (isEmpty()) {
            primeiro = ultimo = novoNode;
            tamanho++;
            return;
        }

        ultimo.next = novoNode;
        ultimo = novoNode;
        tamanho++;
    }

    @Override
    public void pushPrimeiro(int element) {
        Node novoNode = new Node(element);

        if (isEmpty()) {
            primeiro = ultimo = novoNode;
            tamanho++;
            return;
        }

        novoNode.next = primeiro;
        primeiro = novoNode;
        tamanho++;
    }

    @Override
    public Iterator<Integer> iterator() {
        return  new IteradorListaLigada();
    }

    @Override
    public String toString() {
        String res = "";
        res += "Size: " + tamanho + "\n";

        for(int e: this)
            res += e + ", ";

        Node atual = primeiro;
        while (atual != null) {
            res += atual + ", ";
            atual = atual.next;
        }
        return res;
    }

    class IteradorListaLigada implements Iterator<Integer>{
        Node atual = primeiro;

        @Override
        public boolean hasNext() {
            return atual !=null;
        }

        @Override
        public Integer next() {
            int res = atual.elemento;
            atual = atual.next;
            return res;
        }
    }
}
