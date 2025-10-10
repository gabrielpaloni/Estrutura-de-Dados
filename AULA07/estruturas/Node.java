package EDD.AULA07.estruturas;

public class Node {

    public int elemento;
    public Node next = null;

    public Node(int elemento) {
        this.elemento = elemento;
        this.next = null;
    }

    @Override
    public String toString() {
        return "" + elemento;
    }
}
