<<<<<<< HEAD
=======
import java.util.ArrayList;

>>>>>>> f6a88c02215cedce1d283b78769c315338630342
public class Personagem {
    String nome;
    int energia;

<<<<<<< HEAD
    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    public void energiaMudar(int energia) {
        this.energia += energia;
    }

}
=======
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
>>>>>>> f6a88c02215cedce1d283b78769c315338630342
