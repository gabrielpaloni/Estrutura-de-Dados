package EDD.AULA09.pilha;

public class Node<T> {
    public T elemento;
    public Node<T> next;

    public Node(T elemento){
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "Node{" +
                "elemento=" + elemento +
                ", next=" + next +
                '}';
    }
}
