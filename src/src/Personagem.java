public class Personagem {

    private String nome;
    private int energia;

    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }
    public int getEnergia() {
        return energia;
    }
    public void energiaMudar(int energia) {
        this.energia += energia;
        System.out.println("\n\nSua energia foi alterada com " + energia + " XPS"
        + "\nE agora você tem " + this.energia + " XPS\n\n");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEnergia(int energia) {
        if (energia<0){
            System.out.println("Energia negativa!!!");
        }
        else {
        this.energia = energia;
    }
}

}
