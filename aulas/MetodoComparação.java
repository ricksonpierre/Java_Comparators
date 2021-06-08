package aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

public class MetodoComparação {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Rickson", 31));
        pessoas.add(new Pessoa("Ivinny", 26));
        pessoas.add(new Pessoa("Mauricio", 57));
        pessoas.add(new Pessoa("Mariana", 44));
        System.out.println(pessoas);
        // Ordenação utilizando a função lambda
 //       pessoas.sort((first,second)-> first.getIdade() - second.getIdade());


        // Ordenação utilizando a interface Comparator
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));
        System.out.println(pessoas);
        // Ordenação invertida utilizando a interface Comparator + reversed
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade).reversed());
        System.out.println(pessoas);
        // Ordenação utilizando a interface Collections
        Collections.sort(pessoas);
        System.out.println(pessoas);
    }

}
