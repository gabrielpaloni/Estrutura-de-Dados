package EDD.AULA03.interfaces;

public interface Pilha {
    // Estrutura do tipo LIFO
    boolean isEmpty();
    int size();
    void push(int e);
    int pop();
    int peek();
}
