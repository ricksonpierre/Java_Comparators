package aulas;

import java.util.Comparator;

public class ComparatorExemplo implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p2.getIdade() - p1.getIdade();
    }

}
