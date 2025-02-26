public class Pessoa {
    private String nome;
    private int idade;

    // Construtor padrão
    public Pessoa() {
        this.nome = "leonardo";
        this.idade = 0;
    }

    // Construtor com parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getter para acessar os atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Métodos setter, caso você queira alterar os valores depois
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
