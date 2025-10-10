package EDD.AULA05.Fila.testes;
import EDD.AULA05.Fila.interfaces.Fila;
import EDD.AULA05.Fila.implementacao.RevisaoFilaListaLigada;

public class TesteFilaListaLigadaRevisao {
    public static void main(String[] args) {
        Fila fila = new RevisaoFilaListaLigada();

        System.out.println(fila);
        System.out.println("--------");

        System.out.println("pushes");
        fila.push(1);
        fila.push(2);
        fila.push(3);

        System.out.println(fila);

        System.out.println("--------");

        System.out.println("pops");
        System.out.println(fila.pop());
        System.out.println(fila.pop());

        System.out.println(fila);

        System.out.println("--------");

        System.out.println("pushes");
        fila.push(4);
        fila.push(5);
        fila.push(6);

        System.out.println("--------");

        System.out.println("peeks");
        System.out.println(fila.peek());

        System.out.println("--------");

        System.out.println("pops");
        System.out.println(fila.pop());
        System.out.println(fila.pop());
        System.out.println(fila.pop());
        System.out.println(fila.pop());


        System.out.println("--------");

        System.out.println(fila);

    }
}

