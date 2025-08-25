package EDD.AULA01.bag;

import java.util.Iterator;

public class MyBag implements Bag{

        int tamanho = 0;
        int [] elementos = new int[4];

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public void add(int e) {
        if (tamanho  >= 4) return ;

        elementos[tamanho] = e;
        tamanho++;
    }
    @Override
    public String toString(){
        String res = "[ ";

        int i = 0;
        for (int e: elementos) {
            if (i == tamanho) break;
            res += e + ", ";
            i++;
        }

        res += " ]";
        return res;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyBagIterator();
    }

    class MyBagIterator implements Iterator<Integer>{

        int i = 0;

        public boolean hasNext() {
            if (i < tamanho) return true;
            return false;
        }

        public Integer next() {
            int res = elementos[i];
            i ++;
            return res;
        }
    }
}
