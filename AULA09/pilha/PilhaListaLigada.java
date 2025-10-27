package EDD.AULA09.pilha;

public class PilhaListaLigada<T> implements  Pilha<T>{
    int tamanho = 0;
    Node<T> topo = null;

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public void push(T e) {
        Node<T> novoNode = new Node<T>(e);
        if(topo == null){
            topo = novoNode;
            tamanho++;
            return;
        }
        novoNode.next = topo;
        topo = novoNode;
        tamanho++;
    }

    @Override
    public T pop() {
        T res = topo.elemento;
        topo = topo.next;
        return res;
    }
}
