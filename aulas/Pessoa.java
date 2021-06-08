package aulas;

// Cria uma classe publica
public class Pessoa implements Comparable<Pessoa>{
// Adiciona os atributos, que nesse caso são privados
    private String nome;
    private int idade;
// Cria o método que irá acessar os atributos privados ou não
    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }
//Cria os métodos getters and setters (Com o botão direito é mais rápido
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
        }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
//Implementa o método toString para sobrescrever o Objeto String e retornar uma representação textual do Objeto
    @Override
    public String toString(){
        return nome + " - "+ idade+" anos.";
    }
    @Override
    public int compareTo(Pessoa o) {
        return this.getIdade() - o.getIdade(); // Retorna esta idade pelo objeto de comparação
      //  return this.getNome() - o.getNome(); // Retorna ordem alfabética
    }
}
