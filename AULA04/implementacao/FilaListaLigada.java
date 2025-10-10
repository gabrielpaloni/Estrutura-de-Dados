package EDD.AULA04.implementacao;
import EDD.AULA04.interfaces.Fila;

public class FilaListaLigada implements Fila {

    private Node primeiro = null;
    private int tamanho = 0;
    private Node ultimo = null;

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public void push(int e) {
        Node novoUltimo = new Node(e);
        if(isEmpty()){
            primeiro = novoUltimo;
            ultimo = novoUltimo;
            tamanho++;
            return;
        }
        ultimo .prox = novoUltimo;
        ultimo = novoUltimo;
        tamanho++;
    }

    @Override
    public int pop() {
        int resultado = primeiro.elemento;
        primeiro = primeiro.prox;
        tamanho--;

        if(isEmpty()){
            ultimo= null;
        }

        return resultado;
    }

    @Override
    public int peek() {
        return primeiro.elemento;
    }

    public String toString() {
        String res = "Fila: \n";
        res += "Tamanho: " + tamanho + "\n";
        res += "is empty? -> " + isEmpty() + "\n";
        Node actual = primeiro;
        while(actual!= null){
            res += actual.elemento;

            if(actual.prox != null){
                res += " -> ";
            }
            actual = actual.prox;
        }
        return res + "\n";
    }
}
