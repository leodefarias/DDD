public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("leo", 18);

        // Usando getters para acessar os valores
        System.out.println("Pessoa 1: " + pessoa1.getNome() + ", " + pessoa1.getIdade() + " anos.");
        System.out.println("Pessoa 2: " + pessoa2.getNome() + ", " + pessoa2.getIdade() + " anos.");
    }
}
