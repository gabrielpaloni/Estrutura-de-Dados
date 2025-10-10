package EDD.AULA01;

import java.util.Set;
import java.util.TreeSet;

public class TestSetTree {
    public static void main(String[] args) {

        Set<Integer> conjunto = new TreeSet<>();

        System.out.println(conjunto.size());

        conjunto.add(5);
        conjunto.add(3);
        conjunto.add(7);
        conjunto.add(3);
        conjunto.add(3);
        conjunto.add(5);
        conjunto.add(10);
        conjunto.add(0);

        System.out.println("Imprimindo o tamanho da conjunto:");
        System.out.println(conjunto.size());

        System.out.println("Imprimindo a lista");
        for (int e : conjunto) {
            System.out.println(e);
        }

    }
}
