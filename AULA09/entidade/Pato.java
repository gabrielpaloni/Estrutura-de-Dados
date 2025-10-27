package EDD.AULA09.entidade;

import java.util.Objects;

public class Pato implements Comparable<Pato>{
    private String nome;
    private int idade;

    public Pato(String nome, int idade){
        super();
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pato pato = (Pato) o;
        return Objects.equals(nome, pato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "Pato [nome =" + nome + ", idade = "+ idade + "]";
    }

    @Override
    public int compareTo(Pato o) {
        return 0;
    }
}
