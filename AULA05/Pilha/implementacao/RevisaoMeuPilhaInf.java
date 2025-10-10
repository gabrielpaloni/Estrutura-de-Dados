package EDD.AULA05.Pilha.implementacao;
import EDD.AULA05.Pilha.interfaces.Pilha;

public class RevisaoMeuPilhaInf implements Pilha {
    int capacidade = 1;
    int tamanho = 0;

    int[] elementos = new int[capacidade];

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public void push(int e) {
        if(tamanho == capacidade){
            mudarCapacidade(2 * capacidade);
        }
        elementos[tamanho] = e;
        tamanho++;
    }

    @Override
    public int pop() {
        if(tamanho < capacidade/2){
            mudarCapacidade(capacidade/2);
        }
        int resposta = elementos[tamanho -1];
        tamanho--;

        return resposta;
    }

    @Override
    public int peek() {
        return elementos[tamanho -1];
    }

    private void mudarCapacidade(int novaCapacidade){
        int[] novosElementos = new int[novaCapacidade];
        for(int i = 0; i < tamanho; i++){
            novosElementos[i] = elementos[i];
        }
        capacidade = novaCapacidade;
        elementos = novosElementos;
    }
}
