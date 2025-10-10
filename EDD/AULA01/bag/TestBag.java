package EDD.AULA01.bag;

public class TestBag {
    public static void main(String[] args) {

        Bag bag = new MyBag();

        System.out.println("Imprimindo o tamanho do bag: ");
        System.out.println(bag.size());

        System.out.println("Adicionando um elemento ao bag: ");
        bag.add(5);

        System.out.println("Imprimindo o tamanho do bag apos adicionar um elemento: ");
        System.out.println(bag.size());

        System.out.println("Adicionando vários elementos ao bag: ");
        bag.add(10);
        bag.add(20);
        bag.add(30);
        bag.add(40);
        bag.add(50);
        bag.add(60);

        System.out.println("Imprimindo o tamanho do bag apos adicionar vários elementos: ");
        System.out.println(bag.size());

        System.out.println("Imprimindo o Bag: ");
        System.out.println(bag);

        System.out.println("Iterando o Bag: ");
        for (int e : bag) {
            System.out.println(e);
        }

    }
}
