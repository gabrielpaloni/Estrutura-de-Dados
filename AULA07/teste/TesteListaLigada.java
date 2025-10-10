package EDD.AULA07.teste;

import EDD.AULA07.implementacao.ListaLigada;
import EDD.AULA07.interfaces.Lista;

public class TesteListaLigada {

    public static void main(String[] args) {
        Lista listaLigada = new ListaLigada();
        System.out.println("\nTestando Lista Ligada:");
        testaLista(listaLigada);

    }

    public static void testaLista(Lista lista) {

        System.out.println("\nImprimindo tamanho da lista:");
        System.out.println(lista.size());

        System.out.println("\nAdicionando elementos na lista pushUltimo:");
        lista.pushUltimo(1);
        System.out.println("\nAdicionando elementos na lista pushUltimo:");
        lista.pushUltimo(2);
        System.out.println("\nAdicionando elementos na lista pushUltimo:");
        lista.pushUltimo(3);
        System.out.println("\nAdicionando elementos na lista pushUltimo:");
        lista.pushUltimo(4);
        System.out.println("\nAdicionando elementos na lista pushUltimo:");
        lista.pushUltimo(5);
        System.out.println("\nAdicionando elementos na lista pushPrimeiro:");
        lista.pushPrimeiro(-1);

        System.out.println("\nImprimindo tamanho da lista:");
        System.out.println(lista.size());

        System.out.println("\nIterando na lista:");
        for(int e: lista)
            System.out.println(e);

        System.out.println("\nApagando segunda posicao:");
        lista.delete(1);

        System.out.println("\nIterando na lista:");
        for(int e: lista)
            System.out.println(e);

        System.out.println("\nOlhando segunda posicao:");
        System.out.println(lista.get(1));

    }
}
