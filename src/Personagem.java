public class Personagem {

    String nome;
    int energia;

    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    public void energiaMudar(int energia) {
        this.energia += energia;
    }
}
