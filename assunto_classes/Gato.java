public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    public void fazerSom() {
        System.out.println(getNome() + " diz: Miau!");
    }
}