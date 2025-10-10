package EDD.AULA04.testes;
import EDD.AULA04.interfaces.Fila;
import EDD.AULA04.implementacao.FilaListaLigada;

public class TestFilaListaLigada {
    public static void main(String[] args) {
        Fila fila = new FilaListaLigada();

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
