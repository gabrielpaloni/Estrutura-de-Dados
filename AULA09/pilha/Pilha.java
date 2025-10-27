package EDD.AULA09.pilha;

public interface Pilha <T>{
    boolean isEmpty();
    int size();

    void push(T e);
    T pop();
}
