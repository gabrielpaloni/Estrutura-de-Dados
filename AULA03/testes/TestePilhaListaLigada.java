package EDD.AULA03.testes;
import EDD.AULA03.interfaces.Pilha;
import EDD.AULA03.implementacoes.PilhaListaLigada;

public class TestePilhaListaLigada {

    public static void main(String[] args) {
        Pilha p = new PilhaListaLigada();

        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);

        System.out.println("Is empty: " + p.isEmpty());

        System.out.println("-------------------------------------------------");

        System.out.println("tamanho: " + p.size());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.peek());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size());

        System.out.println("-------------------------------------------------");

        System.out.println("Push");
        p.push(5);
        p.push(6);
        p.push(7);
        p.push(8);
        System.out.println("tamanho: " + p.size());

        System.out.println("-------------------------------------------------");

        System.out.println("pop: " + p.pop());
        System.out.println("pop: " + p.pop());
        System.out.println("pop: " + p.pop());

        System.out.println("-------------------------------------------------");

        System.out.println("tamanho: " + p.size());

        System.out.println("Is empty: " + p.isEmpty());
        System.out.println("-------------------------------------------------");

        System.out.println("pop: " + p.pop());
        System.out.println("tamanho: " + p.size());
        System.out.println("Is empty: " + p.isEmpty());
        System.out.println("-------------------------------------------------");

    }

}
