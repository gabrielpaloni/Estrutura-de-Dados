package EDD.AULA05.Fila.implementacao;

public class Node {
    public int elemento;
    public Node prox = null;

    public Node(int aElemento)  {
        this.elemento = aElemento;
    }

    public String toString() {
        return "" + elemento;
    }
}
