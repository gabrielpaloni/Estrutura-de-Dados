package EDD.AULA08.teste;
import EDD.AULA08.implementacao.*;
import EDD.AULA08.interfaces.*;
import EDD.AULA08.implementacao.ArvoreBinaria;
import EDD.AULA08.interfaces.Conjunto;

public class TesteArvoreBinaria  {
    public static void main(String[] args) {
        Conjunto c = new ArvoreBinaria();

        c.add(10);
        c.add(5);
        c.add(15);
        c.add(3);
        c.add(7);
        c.add(8);
        c.add(6);
        c.add(4);
        c.add(2);
        c.add(1);
        c.add(17);
        c.add(13);

        System.out.println("Tamanho: ");
        System.out.println(c.size());

        c.add(4);
        c.add(2);
        c.add(1);
        c.add(17);
        c.add(13);

        System.out.println("Tamanho: ");
        System.out.println(c.size());

        System.out.println("Contains " + 10 + "");
        System.out.println(c.contains(10));

        System.out.println("Contains " + 15 + "");
        System.out.println(c.contains(15));

        System.out.println("Contains " + 5 + "");
        System.out.println(c.contains(5));

        System.out.println("Contains " + 6 + "");
        System.out.println(c.contains(6));

        System.out.println("Contains " + 14 + "");
        System.out.println(c.contains(14));
    }
}
