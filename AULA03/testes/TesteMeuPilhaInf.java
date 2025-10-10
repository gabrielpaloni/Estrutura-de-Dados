package EDD.AULA03.testes;
import EDD.AULA03.implementacoes.MeuPilhaInf;

public class TesteMeuPilhaInf {
    public static void main(String[] args) {
        MeuPilhaInf pilha = new MeuPilhaInf();

        System.out.println("size");
        System.out.println(pilha.size());

        System.out.println("is empty");
        System.out.println(pilha.isEmpty());

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        System.out.println("size");
        System.out.println(pilha.size());

        System.out.println("is empty");
        System.out.println(pilha.isEmpty());

        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());

        pilha.push(6);
        pilha.push(7);
        pilha.push(8);

        System.out.println("peek");
        System.out.println(pilha.peek());
        System.out.println(pilha.peek());
        System.out.println(pilha.peek());

        System.out.println("size");
        System.out.println(pilha.size());

        System.out.println("is empty");
        System.out.println(pilha.isEmpty());

        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());

        System.out.println("size");
        System.out.println(pilha.size());

        System.out.println("is empty");
        System.out.println(pilha.isEmpty());

        System.out.println("Pop");
        System.out.println(pilha.pop());

        System.out.println("size");
        System.out.println(pilha.size());

        System.out.println("is empty");
        System.out.println(pilha.isEmpty());

        System.out.println("push");
        pilha.push(9);
        pilha.push(10);
        pilha.push(11);

        System.out.println("pop");
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());

        System.out.println("Is empty");
        System.out.println(pilha.isEmpty());
    }
}
