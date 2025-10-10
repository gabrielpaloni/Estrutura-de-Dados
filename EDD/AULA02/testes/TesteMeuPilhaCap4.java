package EDD.AULA02.testes;
import EDD.AULA02.implementacoes.MeuPilhaCap4;

public class TesteMeuPilhaCap4 {
    public static void main(String[] args) {
        MeuPilhaCap4 pilha = new MeuPilhaCap4();

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
    }
}
