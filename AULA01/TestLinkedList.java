package EDD.AULA01;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {

        List<Integer> lista = new LinkedList<Integer>();

        System.out.println(lista.size());

        lista.add(5);
        lista.add(3);
        lista.add(7);
        lista.add(3);
        lista.add(3);
        lista.add(5);
        lista.add(10);
        lista.add(0);

        System.out.println("Imprimindo o tamanho da lista:");
        System.out.println(lista.size());

        System.out.println("Imprimindo a lista:");
        for(int i = 0; i < lista.size(); i++) {
            int e = lista.get(i);
            System.out.println(e);
        }
    }
}
