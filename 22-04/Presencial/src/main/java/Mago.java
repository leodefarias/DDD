public class Mago extends Personagem{
    public Mago(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca com magia!");
    }
}
