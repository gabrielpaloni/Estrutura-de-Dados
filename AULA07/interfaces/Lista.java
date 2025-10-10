package EDD.AULA07.interfaces;

public interface Lista  extends Iterable<Integer> {
    boolean isEmpty();
    int size();

    int get(int index);
    void set(int index, int element);

    void delete(int index);

    void pushUltimo(int element);
    void pushPrimeiro(int element);


}
