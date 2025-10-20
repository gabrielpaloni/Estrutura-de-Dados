package EDD.AULA08.ConjuntoArvoreBinaria.implementacao;
import EDD.AULA08.ConjuntoArvoreBinaria.interfaces.Conjunto;

public class ArvoreBinaria implements Conjunto {
    int tamanho = 0;
    TreeNode raiz = null;

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public void add(int e) {
        if (raiz == null) {
            raiz = new TreeNode(e);
            tamanho++;
            return;
        }
        if (e < raiz.valor) {
            if (raiz.esquerda == null) {
                raiz.esquerda = new TreeNode(e);
                tamanho++;
                return;
            }
            addNode(e, raiz.esquerda);
        }
        if (raiz.direita == null) {
            raiz.direita = new TreeNode(e);
            tamanho++;
            return;
        }
        addNode(e, raiz.direita);
        }

    private void addNode(int e, TreeNode subArvore){
        if (subArvore.valor == e){return;}
        if(e < subArvore.valor){
            if(subArvore.esquerda == null){
                subArvore.esquerda = new TreeNode(e);
                return;
            }
            addNode(e, subArvore.esquerda);
        }
        if(e > subArvore.valor){
            if(subArvore.direita == null){
                subArvore.direita = new TreeNode(e);
                return;
            }
            addNode(e, subArvore.direita);
        }
    }

    @Override
    public boolean contains(int e) {
    if(raiz == null) return  false;
        if (raiz.valor == e){return true;}
        if(e < raiz.valor){
            if(raiz.esquerda == null){
                return false;
            }
            return containsNode(e, raiz.esquerda);
        }
        else //if(e > raiz.valor){
            if(raiz.direita == null){
                return false;
            }
            return containsNode(e, raiz.direita);
        }

    private static boolean containsNode(int e, TreeNode subArvore){
        if (subArvore.valor == e){return true;}
        if(e < subArvore.valor){
            if(subArvore.esquerda == null){
                return false;
            }
           return containsNode(e, subArvore.esquerda);
        }
        else //if(e > subArvore.valor){
            if(subArvore.direita == null){
                return false;
            }
            return containsNode(e, subArvore.direita);
        }
    }
