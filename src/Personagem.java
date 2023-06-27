import java.util.ArrayList;

public class Personagem {
    String nome;
    int energia;

    ArrayList<String> historico = new ArrayList<>();

    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.addEnergia(energia);
    }

    public void addEnergia(int energia) {
        this.energia = this.energia + energia;
        historico.add("O personagem " + this.nome + " || Energia: " + this.energia);

    }

    public void historico() {
        for (String mString : this.historico) {
            System.out.println(mString);
        }
    }
}