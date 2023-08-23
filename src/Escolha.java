public class Escolha {
    private String texto;
    private String proximo;

    public Escolha(String texto, String proximo) {
        this.texto = texto;
        this.proximo = proximo;
    }
    public String getTexto(){
        return this.texto;
    }
    public String getProximo() {
        return proximo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public void setProximo(String proximo) {
        this.proximo = proximo;
    }

}